/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WithdrawPackage;

import User.userDashboard;
import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import loginForm.login;

/**
 *
 * @author vin
 */
public class withdraw extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    public withdraw() {
        initComponents();
    }
private void displayData() {
    try {
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT balance FROM tbl_user WHERE user_id = " + Session.getInstance().getUid());
        if (rs.next()) {
            double balance = rs.getDouble("balance");
            String formattedBalance = String.format("%.2f", balance); 
            bal15.setText(formattedBalance);
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

        jPanel48 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        uid = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        bal15 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        back15 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        withdraw = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel48.setBackground(new java.awt.Color(255, 153, 0));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(153, 102, 0));
        jPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel46.setLayout(null);

        uid.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uid.setText("ID");
        jPanel46.add(uid);
        uid.setBounds(260, 10, 44, 44);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel64.setText("Withdraw");
        jPanel46.add(jLabel64);
        jLabel64.setBounds(20, 10, 179, 44);

        back1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inArrow.png"))); // NOI18N
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        jPanel46.add(back1);
        back1.setBounds(730, 20, 40, 30);

        jPanel48.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 67));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setText("Available Balance:  ₱");
        jPanel48.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Amount:                   ₱");
        jPanel48.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 217, -1, -1));

        bal15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel48.add(bal15, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 130, 240, 40));

        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel48.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 207, 240, 40));

        jPanel47.setBackground(new java.awt.Color(153, 102, 0));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel47.setLayout(null);

        back15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back15.setText("Back");
        back15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back15MouseClicked(evt);
            }
        });
        jPanel47.add(back15);
        back15.setBounds(20, 10, 50, 20);

        jPanel48.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 80, 40));

        jPanel49.setBackground(new java.awt.Color(153, 102, 0));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
        });
        jPanel49.setLayout(null);

        withdraw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        withdraw.setText("Withdraw");
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });
        jPanel49.add(withdraw);
        withdraw.setBounds(10, 10, 90, 20);

        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dawatmoney.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel48.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 370, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked

        
        // Retrieve the amount entered by the user
        String amountText = amount.getText();

        // Validate the amount
        if (amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the withdraw amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }

        // Check if the amount is a valid number
        double withdrawAmount;
        try {
            withdrawAmount = Double.parseDouble(amountText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the withdraw amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

 
performWithdraw(withdrawAmount);
int userId = Session.getInstance().getUid();
 // Insert the deposit amount into dep_tbl
dbConnector dbc = new dbConnector();
if (dbc.insertData("INSERT INTO tbl_withdraw(w_id, withdraw) VALUES (" + userId + ", " + withdrawAmount + ")")) {
    userDashboard ud = new userDashboard();
    ud.setVisible(true);
    this.dispose();
} else {
    JOptionPane.showMessageDialog(null, "Connection Error!", "Message", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_withdrawMouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
        // Retrieve the amount entered by the user
        String amountText = amount.getText();

        // Validate the amount
        if (amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the deposit amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the amount is a valid number
        double withdrawAmount;
        try {
            withdrawAmount = Double.parseDouble(amountText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the deposit amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the deposit operation
        performWithdraw(withdrawAmount);
    }//GEN-LAST:event_jPanel49MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session session = Session.getInstance();
        displayData();
        
    }//GEN-LAST:event_formWindowActivated

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        userDashboard ud = new userDashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1MouseClicked

    private void back15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back15MouseClicked
        userDashboard us = new userDashboard();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back15MouseClicked
private void performWithdraw(double withdrawAmount) {
 try {
        // Get the current balance
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT balance FROM tbl_user WHERE user_id = " + Session.getInstance().getUid());
        if (rs.next()) {
            double currentBalance = rs.getDouble("balance");
            
            if (withdrawAmount > currentBalance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance for withdrawal.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }

            
            double newBalance = currentBalance - withdrawAmount;

            
            dbc.updateData("UPDATE tbl_user SET balance = " + newBalance + " WHERE user_id = " + Session.getInstance().getUid());

            
            bal15.setText(String.format("%.2f", newBalance));

            JOptionPane.showMessageDialog(this, "Withdrawal successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            
            userDashboard us = new userDashboard();
            us.setVisible(true);
            this.dispose();
        }else{ 
            System.out.println("No balance data found for the current user.");
        }
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Error retrieving balance: " + ex.getMessage());
        JOptionPane.showMessageDialog(this, "Error occurred while processing the withdrawal.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back15;
    private javax.swing.JLabel bal15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JLabel uid;
    private javax.swing.JLabel withdraw;
    // End of variables declaration//GEN-END:variables
}
