
package User;

import config.Session;
import config.dbConnector;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class userDashboard extends javax.swing.JFrame {


    public userDashboard() {
        initComponents();
        
        
        Icon x = user.getIcon();
        ImageIcon icon = (ImageIcon)x;
        Image image = icon.getImage().getScaledInstance(user.getWidth(),user.getHeight(),Image.SCALE_SMOOTH);
        user.setIcon(new ImageIcon(image));
        
        Icon c = trans.getIcon();
        ImageIcon ion = (ImageIcon)c;
        Image iage = ion.getImage().getScaledInstance(trans.getWidth(),trans.getHeight(),Image.SCALE_SMOOTH);
        trans.setIcon(new ImageIcon(iage));
        
        
        Icon z = depo.getIcon();
        ImageIcon ic = (ImageIcon)z;
        Image imag = ic.getImage().getScaledInstance(depo.getWidth(),depo.getHeight(),Image.SCALE_SMOOTH);
        depo.setIcon(new ImageIcon(imag)); 
        
        Icon v = with.getIcon();
        ImageIcon con = (ImageIcon)v;
        Image ima = con.getImage().getScaledInstance(with.getWidth(),with.getHeight(),Image.SCALE_SMOOTH);
        with.setIcon(new ImageIcon(ima));
        
        Icon b = with.getIcon();
        ImageIcon on = (ImageIcon)b;
        Image im = on.getImage().getScaledInstance(with.getWidth(),with.getHeight(),Image.SCALE_SMOOTH);
        with.setIcon(new ImageIcon(im));
        
        Icon n = acc.getIcon();
        ImageIcon o = (ImageIcon)n;
        Image i = o.getImage().getScaledInstance(acc.getWidth(),acc.getHeight(),Image.SCALE_SMOOTH);
        acc.setIcon(new ImageIcon(i));
            
        

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
        jPanel8 = new javax.swing.JPanel();
        account_fname = new javax.swing.JLabel();
        account_lname = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        trans = new javax.swing.JLabel();
        depo = new javax.swing.JLabel();
        with = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 102, 0));

        account_fname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_fname.setText("First Name");

        account_lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_lname.setText("Last Name");

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        user.setText("jLabel9");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(account_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(account_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(account_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(account_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 400));

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LOGOUT");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USER DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 806, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ACCOUNT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        jPanel4.setLayout(null);
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("AVAILABLE BALANCE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("₱");

        bal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bal.setText("0.00");
        bal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 520, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DEPOSIT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("WITHDRAW");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("TRANSACTIONS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        trans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transhis.png"))); // NOI18N
        trans.setText("jLabel9");
        trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transMouseClicked(evt);
            }
        });
        jPanel1.add(trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 110, 80));

        depo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deposit.png"))); // NOI18N
        depo.setText("jLabel9");
        depo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depoMouseClicked(evt);
            }
        });
        jPanel1.add(depo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 80));

        with.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdraw.png"))); // NOI18N
        with.setText("jLabel9");
        with.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withMouseClicked(evt);
            }
        });
        jPanel1.add(with, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 110, 80));

        acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        acc.setText("jLabel9");
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accMouseClicked(evt);
            }
        });
        jPanel1.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            Session session = Session.getInstance();
            
            account_fname.setText(""+session.getFname());
            account_lname.setText(""+session.getLname());
            displayData();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
           JFrame frame = new JFrame("Logout");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Logout", "Logout",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void balMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balMouseClicked

    }//GEN-LAST:event_balMouseClicked

    private void transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transMouseClicked
        transaction trans = new transaction();
        trans.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transMouseClicked

    private void withMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withMouseClicked
       withdraw wit = new withdraw();
       wit.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_withMouseClicked

    private void depoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depoMouseClicked
      deposit dep = new deposit();
      dep.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_depoMouseClicked

    private void accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseClicked
      accountDetails ad = new accountDetails();
      ad.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_accMouseClicked


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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc;
    private javax.swing.JLabel account_fname;
    private javax.swing.JLabel account_lname;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel depo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel trans;
    private javax.swing.JLabel user;
    private javax.swing.JLabel with;
    // End of variables declaration//GEN-END:variables
}
