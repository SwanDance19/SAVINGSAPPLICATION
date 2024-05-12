/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        deposit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("DEPOSIT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Available Balance:  ₱");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Amount:              ₱");

        bal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        jPanel5.setBackground(new java.awt.Color(153, 102, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        deposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deposit.setText("Deposit");
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
        });
        jPanel5.add(deposit);
        deposit.setBounds(20, 10, 68, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session session = Session.getInstance();
        displayData();
    }//GEN-LAST:event_formWindowActivated

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        userDashboard us = new userDashboard();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked

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

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
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
    }//GEN-LAST:event_jPanel5MouseClicked
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
    private javax.swing.JTextField amount;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel deposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}