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
        jLabel64 = new javax.swing.JLabel();
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

        jPanel46.setBackground(new java.awt.Color(204, 102, 0));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel64.setText("WITHDRAW");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addContainerGap())
        );

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setText("Available Balance:  ₱");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setText("Amount:              ₱");

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
                .addGap(198, 198, 198)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bal15, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(amount15, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
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
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount10;
    private javax.swing.JTextField amount11;
    private javax.swing.JTextField amount12;
    private javax.swing.JTextField amount13;
    private javax.swing.JTextField amount14;
    private javax.swing.JTextField amount15;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField amount3;
    private javax.swing.JTextField amount4;
    private javax.swing.JTextField amount5;
    private javax.swing.JTextField amount6;
    private javax.swing.JTextField amount7;
    private javax.swing.JTextField amount8;
    private javax.swing.JTextField amount9;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back10;
    private javax.swing.JLabel back11;
    private javax.swing.JLabel back12;
    private javax.swing.JLabel back13;
    private javax.swing.JLabel back14;
    private javax.swing.JLabel back15;
    private javax.swing.JLabel back2;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel back4;
    private javax.swing.JLabel back5;
    private javax.swing.JLabel back6;
    private javax.swing.JLabel back7;
    private javax.swing.JLabel back8;
    private javax.swing.JLabel back9;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel bal1;
    private javax.swing.JLabel bal10;
    private javax.swing.JLabel bal11;
    private javax.swing.JLabel bal12;
    private javax.swing.JLabel bal13;
    private javax.swing.JLabel bal14;
    private javax.swing.JLabel bal15;
    private javax.swing.JLabel bal2;
    private javax.swing.JLabel bal3;
    private javax.swing.JLabel bal4;
    private javax.swing.JLabel bal5;
    private javax.swing.JLabel bal6;
    private javax.swing.JLabel bal7;
    private javax.swing.JLabel bal8;
    private javax.swing.JLabel bal9;
    private javax.swing.JLabel deposit;
    private javax.swing.JLabel deposit1;
    private javax.swing.JLabel deposit10;
    private javax.swing.JLabel deposit11;
    private javax.swing.JLabel deposit12;
    private javax.swing.JLabel deposit13;
    private javax.swing.JLabel deposit14;
    private javax.swing.JLabel deposit2;
    private javax.swing.JLabel deposit3;
    private javax.swing.JLabel deposit4;
    private javax.swing.JLabel deposit5;
    private javax.swing.JLabel deposit6;
    private javax.swing.JLabel deposit7;
    private javax.swing.JLabel deposit8;
    private javax.swing.JLabel deposit9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel withdraw;
    // End of variables declaration//GEN-END:variables
}
