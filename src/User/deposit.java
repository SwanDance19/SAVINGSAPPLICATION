/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import loginForm.login;

/**
 *
 * @author vin
 */
public class deposit extends javax.swing.JFrame {

    /**
     * Creates new form deposit
     */
    public deposit() {
        initComponents();
    }

    private void displayData() {
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT balance FROM tbl_user WHERE user_id = " + Session.getInstance().getUid());
            if (rs.next()) {
                double balance = rs.getDouble("balance");
                String formattedBalance = String.format("%.2f", balance);
                bal.setText(formattedBalance);
            } else {
                System.out.println("No balance data found for the current user.");
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error retrieving balance: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        deposit = new javax.swing.JPanel();
        dep = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 220, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Available Balance:  ₱");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 166, 201, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Amount:                   ₱");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 221, -1, -1));

        bal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, 40));
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 214, 220, 40));

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));
        jPanel4.setLayout(null);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel4.add(back);
        back.setBounds(30, 10, 50, 20);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 272, 100, 40));

        deposit.setBackground(new java.awt.Color(153, 102, 0));
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
        });
        deposit.setLayout(null);

        dep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dep.setText("Deposit");
        dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depMouseClicked(evt);
            }
        });
        deposit.add(dep);
        dep.setBounds(20, 10, 68, 20);

        jPanel1.add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 272, 108, 40));

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Deposit");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 10, 150, 44);

        uid.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uid.setText("ID");
        jPanel3.add(uid);
        uid.setBounds(230, 10, 50, 44);

        back1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inArrow.png"))); // NOI18N
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        jPanel3.add(back1);
        back1.setBounds(760, 20, 40, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/How-to-Deposit-Cash-at-an-Online-Only-Bank-Story.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 370, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session session = Session.getInstance();
        displayData();
        String amountText = amount.getText();
    }//GEN-LAST:event_formWindowActivated

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        userDashboard us = new userDashboard();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depMouseClicked

// Retrieve the amount entered by the user
        String amountText = amount.getText();

// Validate the amount
        if (amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the deposit amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Check if the amount is a valid number
        double depositAmount;
        try {
            depositAmount = Double.parseDouble(amountText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the deposit amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Perform the deposit operation
        performDeposit(depositAmount);
        int userId = Session.getInstance().getUid();

// Insert the deposit amount into dep_tbl
        dbConnector dbc = new dbConnector();
        if (dbc.insertData("INSERT INTO dep_tbl(user_id, deposit) VALUES (" + userId + ", " + depositAmount + ")")) {
            userDashboard ud = new userDashboard();
            ud.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Connection Error!", "Message", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_depMouseClicked

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        // Retrieve the amount entered by the user
        String amountText = amount.getText();

        // Validate the amount
        if (amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the deposit amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the amount is a valid number
        double depositAmount;
        try {
            depositAmount = Double.parseDouble(amountText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the deposit amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the deposit operation
        performDeposit(depositAmount);
    }//GEN-LAST:event_depositMouseClicked

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        userDashboard ud = new userDashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1MouseClicked
    private void performDeposit(double depositAmount) {
        try {
            // Get the current balance
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT balance FROM tbl_user WHERE user_id = " + Session.getInstance().getUid());
            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");

                // Update the balance by adding the deposit amount
                double newBalance = currentBalance + depositAmount;

                // Update the balance in the database
                dbc.updateData("UPDATE tbl_user SET balance = " + newBalance + " WHERE user_id = " + Session.getInstance().getUid());

                // Display the updated balance on the UI
                bal.setText(String.format("%.2f", newBalance));

                JOptionPane.showMessageDialog(this, "Deposit successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                userDashboard us = new userDashboard();
                us.setVisible(true);
                this.dispose();
            } else {
                System.out.println("No balance data found for the current user.");
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error retrieving balance: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error occurred while processing the deposit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField amount;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel dep;
    private javax.swing.JPanel deposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel uid;
    // End of variables declaration//GEN-END:variables
}
