package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnector {
    
    private Connection connect;
    
    public dbConnector() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/savings_application", "root", "");
        } catch(SQLException ex) {
            System.err.println("Can't connect to database: " + ex.getMessage());
            ex.printStackTrace(); // Print the full stack trace for debugging
        }
    }
     
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = connect.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch(SQLException ex) {
            // Log error or re-throw the exception
            throw ex;
        } finally {
            // Close resources in finally block
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
    public boolean insertData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            return true;
        } catch(SQLException ex) {
            System.err.println("Connection Error: " + ex.getMessage());
            ex.printStackTrace(); // Print the full stack trace for debugging
            return false;
        }
    }

    public void updateData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.executeUpdate();
            System.out.println("Updated Successfully!");
        } catch(SQLException ex) {
            System.err.println("Update Error: " + ex.getMessage());
            ex.printStackTrace(); // Print the full stack trace for debugging
        }
    }
       
    public Connection getConnection() {
        return connect;
    }
}
