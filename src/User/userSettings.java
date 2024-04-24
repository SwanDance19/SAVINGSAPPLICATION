/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package User;

import config.Session;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import loginForm.login;

/**
 *
 * @author vin
 */
public class userSettings extends javax.swing.JFrame {

    /** Creates new form userSettings */
    public userSettings() {
        initComponents();
        Icon x = userimage.getIcon();
        ImageIcon icon = (ImageIcon)x;
        Image image = icon.getImage().getScaledInstance(userimage.getWidth(),userimage.getHeight(),Image.SCALE_SMOOTH);
        userimage.setIcon(new ImageIcon(image));
        
        Icon y = back.getIcon();
        ImageIcon Icon = (ImageIcon)y;
        Image i = Icon.getImage().getScaledInstance(back.getWidth(),back.getHeight(),Image.SCALE_SMOOTH);
        back.setIcon(new ImageIcon(image));
    }
    
     Color navcolor = new Color(255,153,0);
    Color hovercolor = new Color(255,204,153);


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsAndPrivacy2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        settingsAndPrivacy = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userimage = new javax.swing.JLabel();
        account_fname = new javax.swing.JLabel();
        account_lname = new javax.swing.JLabel();
        displayAndAccessibility = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        helpAndSupport = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        giveFeedback = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        settingsAndPrivacy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsAndPrivacy2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsAndPrivacy2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout settingsAndPrivacy2Layout = new javax.swing.GroupLayout(settingsAndPrivacy2);
        settingsAndPrivacy2.setLayout(settingsAndPrivacy2Layout);
        settingsAndPrivacy2Layout.setHorizontalGroup(
            settingsAndPrivacy2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        settingsAndPrivacy2Layout.setVerticalGroup(
            settingsAndPrivacy2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        settingsAndPrivacy.setBackground(new java.awt.Color(255, 153, 0));
        settingsAndPrivacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsAndPrivacyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsAndPrivacyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsAndPrivacyMouseExited(evt);
            }
        });

        jLabel2.setText("Settings & privacy");

        javax.swing.GroupLayout settingsAndPrivacyLayout = new javax.swing.GroupLayout(settingsAndPrivacy);
        settingsAndPrivacy.setLayout(settingsAndPrivacyLayout);
        settingsAndPrivacyLayout.setHorizontalGroup(
            settingsAndPrivacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsAndPrivacyLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsAndPrivacyLayout.setVerticalGroup(
            settingsAndPrivacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsAndPrivacyLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        userimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.jpg"))); // NOI18N
        userimage.setText("jLabel1");

        account_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        account_fname.setText("First Name");

        account_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        account_lname.setText("Last Name");

        displayAndAccessibility.setBackground(new java.awt.Color(255, 153, 0));
        displayAndAccessibility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayAndAccessibilityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayAndAccessibilityMouseExited(evt);
            }
        });

        jLabel4.setText("Display & accessibility");

        javax.swing.GroupLayout displayAndAccessibilityLayout = new javax.swing.GroupLayout(displayAndAccessibility);
        displayAndAccessibility.setLayout(displayAndAccessibilityLayout);
        displayAndAccessibilityLayout.setHorizontalGroup(
            displayAndAccessibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAndAccessibilityLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayAndAccessibilityLayout.setVerticalGroup(
            displayAndAccessibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAndAccessibilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        helpAndSupport.setBackground(new java.awt.Color(255, 153, 0));
        helpAndSupport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpAndSupportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpAndSupportMouseExited(evt);
            }
        });

        jLabel3.setText("Help & support");

        javax.swing.GroupLayout helpAndSupportLayout = new javax.swing.GroupLayout(helpAndSupport);
        helpAndSupport.setLayout(helpAndSupportLayout);
        helpAndSupportLayout.setHorizontalGroup(
            helpAndSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpAndSupportLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        helpAndSupportLayout.setVerticalGroup(
            helpAndSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpAndSupportLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        logOut.setBackground(new java.awt.Color(255, 153, 0));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });

        jLabel6.setText("Log out");

        javax.swing.GroupLayout logOutLayout = new javax.swing.GroupLayout(logOut);
        logOut.setLayout(logOutLayout);
        logOutLayout.setHorizontalGroup(
            logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logOutLayout.setVerticalGroup(
            logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        giveFeedback.setBackground(new java.awt.Color(255, 153, 0));
        giveFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                giveFeedbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                giveFeedbackMouseExited(evt);
            }
        });

        jLabel5.setText("Give feedback");

        javax.swing.GroupLayout giveFeedbackLayout = new javax.swing.GroupLayout(giveFeedback);
        giveFeedback.setLayout(giveFeedbackLayout);
        giveFeedbackLayout.setHorizontalGroup(
            giveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giveFeedbackLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        giveFeedbackLayout.setVerticalGroup(
            giveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, giveFeedbackLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backArrow.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayAndAccessibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helpAndSupport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(giveFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingsAndPrivacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userimage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(account_fname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(account_lname)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userimage, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(settingsAndPrivacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(helpAndSupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayAndAccessibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(giveFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void settingsAndPrivacyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsAndPrivacyMouseEntered
       settingsAndPrivacy.setBackground(hovercolor);
    }//GEN-LAST:event_settingsAndPrivacyMouseEntered

    private void settingsAndPrivacyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsAndPrivacyMouseExited
       settingsAndPrivacy.setBackground(navcolor);
    }//GEN-LAST:event_settingsAndPrivacyMouseExited

    private void displayAndAccessibilityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayAndAccessibilityMouseEntered
        displayAndAccessibility.setBackground(hovercolor);
    }//GEN-LAST:event_displayAndAccessibilityMouseEntered

    private void displayAndAccessibilityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayAndAccessibilityMouseExited
        displayAndAccessibility.setBackground(navcolor);
    }//GEN-LAST:event_displayAndAccessibilityMouseExited

    private void settingsAndPrivacy2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsAndPrivacy2MouseEntered
        
    }//GEN-LAST:event_settingsAndPrivacy2MouseEntered

    private void settingsAndPrivacy2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsAndPrivacy2MouseExited
        
    }//GEN-LAST:event_settingsAndPrivacy2MouseExited

    private void helpAndSupportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpAndSupportMouseEntered
        helpAndSupport.setBackground(hovercolor);
    }//GEN-LAST:event_helpAndSupportMouseEntered

    private void helpAndSupportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpAndSupportMouseExited
        helpAndSupport.setBackground(navcolor);
    }//GEN-LAST:event_helpAndSupportMouseExited

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setBackground(hovercolor);
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setBackground(navcolor);
    }//GEN-LAST:event_logOutMouseExited

    private void giveFeedbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giveFeedbackMouseEntered
        giveFeedback.setBackground(hovercolor);
    }//GEN-LAST:event_giveFeedbackMouseEntered

    private void giveFeedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giveFeedbackMouseExited
        giveFeedback.setBackground(navcolor);
    }//GEN-LAST:event_giveFeedbackMouseExited

    private void settingsAndPrivacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsAndPrivacyMouseClicked
        changePassword cp = new changePassword();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_settingsAndPrivacyMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     Session session = Session.getInstance();
            if(session.getUid()== 0){
                JOptionPane.showMessageDialog(null,"No Account, Login First!");
                login l = new login();
                l.setVisible(true);
                this.dispose();
            }else{
                account_fname.setText(""+session.getFname());
                account_lname.setText(""+session.getLname());
            }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account_fname;
    private javax.swing.JLabel account_lname;
    private javax.swing.JLabel back;
    private javax.swing.JPanel displayAndAccessibility;
    private javax.swing.JPanel giveFeedback;
    private javax.swing.JPanel helpAndSupport;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logOut;
    private javax.swing.JPanel settingsAndPrivacy;
    private javax.swing.JPanel settingsAndPrivacy2;
    private javax.swing.JPanel settingsAndPrivacy5;
    private javax.swing.JLabel userimage;
    // End of variables declaration//GEN-END:variables

}
