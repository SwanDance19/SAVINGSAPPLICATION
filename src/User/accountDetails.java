/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

public class accountDetails extends javax.swing.JFrame {

    public accountDetails() {
        initComponents();
    }
    
    Color navcolor = new Color(204,102,0);
    Color hovercolor = new Color(255,204,153);
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT user_id, user_fname, user_lname, user_email, user_name FROM tbl_user");
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors:"+ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        account_fname = new javax.swing.JLabel();
        account_lname = new javax.swing.JLabel();
        cpPanel = new javax.swing.JPanel();
        cp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        em = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("First name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Last name:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Email:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Account Information");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        uid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        uid.setText("ID");
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inArrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 95, -1, 90));

        account_fname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_fname.setText("First Name");
        jPanel5.add(account_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 191, -1, -1));

        account_lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_lname.setText("Last Name");
        jPanel5.add(account_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 231, -1, -1));

        cpPanel.setBackground(new java.awt.Color(204, 102, 0));
        cpPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpPanelMouseExited(evt);
            }
        });

        cp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp.setText("Change Password");
        cp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cpPanelLayout = new javax.swing.GroupLayout(cpPanel);
        cpPanel.setLayout(cpPanelLayout);
        cpPanelLayout.setHorizontalGroup(
            cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpPanelLayout.createSequentialGroup()
                .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cpPanelLayout.setVerticalGroup(
            cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(cpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 314, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my-account-5.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 110));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 380));

        fn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 250, 40));

        ln.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 240, 40));

        em.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
           Session session = Session.getInstance();
           
           uid.setText("ID :"+session.getUid());
           fn.setText(""+session.getFname());
           ln.setText(""+session.getLname());
           em.setText(""+session.getEmail());
           account_fname.setText(""+session.getFname());
           account_lname.setText(""+session.getLname());
    }//GEN-LAST:event_formWindowActivated

    private void cpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpMouseClicked
        changePassword cp = new changePassword();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cpMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        userDashboard ud = new userDashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void cpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpPanelMouseClicked
        changePassword cp = new changePassword();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cpPanelMouseClicked

    private void cpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpMouseEntered
       cpPanel.setBackground(hovercolor);
    }//GEN-LAST:event_cpMouseEntered

    private void cpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpMouseExited
        cpPanel.setBackground(navcolor);
    }//GEN-LAST:event_cpMouseExited

    private void cpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpPanelMouseExited
       cpPanel.setBackground(navcolor);
    }//GEN-LAST:event_cpPanelMouseExited

    private void cpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpPanelMouseEntered
       cpPanel.setBackground(hovercolor); 
    }//GEN-LAST:event_cpPanelMouseEntered
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
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account_fname;
    private javax.swing.JLabel account_lname;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cp;
    private javax.swing.JPanel cpPanel;
    private javax.swing.JLabel em;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel ln;
    private javax.swing.JLabel uid;
    private javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}
