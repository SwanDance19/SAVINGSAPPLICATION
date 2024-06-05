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
        amount15 = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        back15 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        withdraw = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel48.setBackground(new java.awt.Color(255, 153, 0));

        jPanel46.setBackground(new java.awt.Color(153, 102, 0));
        jPanel46.setLayout(null);

        uid.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uid.setText("ID");
        jPanel46.add(uid);
        uid.setBounds(300, 10, 44, 44);

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
        back1.setBounds(500, 20, 40, 30);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setText("Available Balance:  ₱");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Amount:                   ₱");

        bal15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel47.setBackground(new java.awt.Color(153, 102, 0));
        jPanel47.setLayout(null);

        back15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back15.setText("Back");
        back15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back15MouseClicked(evt);
            }
        });
        jPanel47.add(back15);
        back15.setBounds(30, 10, 50, 20);

        jPanel49.setBackground(new java.awt.Color(153, 102, 0));
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
        withdraw.setBounds(20, 10, 100, 20);

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62))
                .addGap(18, 18, 18)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bal15, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(amount15, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bal15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(10, 10, 10)))
                .addGap(37, 37, 37)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(amount15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back15MouseClicked
        userDashboard us = new userDashboard();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back15MouseClicked

    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked

        
        // Retrieve the amount entered by the user
        String amountText = amount15.getText();

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
        
       dbConnector dbc = new dbConnector();
       if(dbc.insertData("INSERT INTO tbl_withdraw(withdraw)"
               + "VALUES('"+amount15.getText()+"')")){
                    
                    userDashboard ud = new userDashboard();
                    ud.setVisible(true);
                    this.dispose();
              }else {
                JOptionPane.showMessageDialog(null, "Connection Error!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_withdrawMouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
        // Retrieve the amount entered by the user
        String amountText = amount15.getText();

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
private void performWithdraw(double withdrawAmount) {
 try {
        // Get the current balance
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT balance FROM tbl_user WHERE user_id = " + Session.getInstance().getUid());
        if (rs.next()) {
            double currentBalance = rs.getDouble("balance");

            
            if (withdrawAmount > currentBalance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance for withdrawal.", "Error", JOptionPane.ERROR_MESSAGE);
                
            }

            
            double newBalance = currentBalance - withdrawAmount;

            
            dbc.updateData("UPDATE tbl_user SET balance = " + newBalance + " WHERE user_id = " + Session.getInstance().getUid());

            
            bal15.setText(String.format("%.2f", newBalance));

            JOptionPane.showMessageDialog(this, "Withdrawal successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            
            userDashboard us = new userDashboard();
            us.setVisible(true);
            this.dispose();
        } else {
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
    private javax.swing.JTextField amount15;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back15;
    private javax.swing.JLabel bal15;
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
