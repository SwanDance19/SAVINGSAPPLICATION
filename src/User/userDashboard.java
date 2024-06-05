
package User;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class userDashboard extends javax.swing.JFrame {


    public userDashboard() {
        initComponents();
       
    }
    
    Color navcolor = new Color(255,153,0);
    Color hovercolor = new Color(255,204,153);
    Color navcolor1 = new Color(153,102,0);
    
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        account_fname = new javax.swing.JLabel();
        account_lname = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ckbox = new javax.swing.JCheckBox();
        bal = new javax.swing.JTextField();
        depPanel = new javax.swing.JPanel();
        depo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        widPanel = new javax.swing.JPanel();
        with = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tranPanel = new javax.swing.JPanel();
        trans = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Logout");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 90, 50));

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\logout-icon.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 50, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Hello !!");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\save2.png")); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jPanel8.setBackground(new java.awt.Color(204, 102, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        account_fname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_fname.setText("First Name");
        jPanel8.add(account_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 34));

        account_lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_lname.setText("Last Name");
        jPanel8.add(account_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 34));

        user.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\my-account-5.png")); // NOI18N
        jPanel8.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 90));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 430));

        jPanel4.setLayout(null);
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("AVAILABLE BALANCE");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("₱");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 20, 20));

        ckbox.setBackground(new java.awt.Color(255, 255, 255));
        ckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbox.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\schoolmanagement\\src\\images\\icons8-eye-24.png")); // NOI18N
        ckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxActionPerformed(evt);
            }
        });
        jPanel9.add(ckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 20));

        bal.setBackground(new java.awt.Color(240, 240, 240));
        bal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bal.setText("0.00");
        bal.setBorder(null);
        bal.setName(""); // NOI18N
        bal.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bal, org.jdesktop.beansbinding.ELProperty.create("disabled"), bal, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balActionPerformed(evt);
            }
        });
        jPanel9.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 20));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 570, 60));

        depPanel.setBackground(new java.awt.Color(255, 153, 0));
        depPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        depPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depPanelMouseExited(evt);
            }
        });

        depo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SAVINGSAPPLICATION\\src\\images\\deposit.png")); // NOI18N
        depo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depoMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Deposit");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout depPanelLayout = new javax.swing.GroupLayout(depPanel);
        depPanel.setLayout(depPanelLayout);
        depPanelLayout.setHorizontalGroup(
            depPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(37, 37, 37))
            .addGroup(depPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(depo)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        depPanelLayout.setVerticalGroup(
            depPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(depPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, 140));

        maPanel.setBackground(new java.awt.Color(255, 153, 0));
        maPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        maPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maPanelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("My Account");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        acc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\my-account-5.png")); // NOI18N
        acc.setText("jLabel9");
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accMouseExited(evt);
            }
        });

        javax.swing.GroupLayout maPanelLayout = new javax.swing.GroupLayout(maPanel);
        maPanel.setLayout(maPanelLayout);
        maPanelLayout.setHorizontalGroup(
            maPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(maPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        maPanelLayout.setVerticalGroup(
            maPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(maPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        widPanel.setBackground(new java.awt.Color(255, 153, 0));
        widPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        widPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                widPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                widPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                widPanelMouseExited(evt);
            }
        });

        with.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SAVINGSAPPLICATION\\src\\images\\withdraw.png")); // NOI18N
        with.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Withdraw");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout widPanelLayout = new javax.swing.GroupLayout(widPanel);
        widPanel.setLayout(widPanelLayout);
        widPanelLayout.setHorizontalGroup(
            widPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, widPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(widPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(with)
                    .addGroup(widPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(21, 21, 21))
        );
        widPanelLayout.setVerticalGroup(
            widPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(widPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(with, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(widPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 150, 140));

        tranPanel.setBackground(new java.awt.Color(255, 153, 0));
        tranPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tranPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tranPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tranPanelMouseExited(evt);
            }
        });

        trans.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SAVINGSAPPLICATION\\src\\images\\transhis.png")); // NOI18N
        trans.setText("jLabel9");
        trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Transactions");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout tranPanelLayout = new javax.swing.GroupLayout(tranPanel);
        tranPanel.setLayout(tranPanelLayout);
        tranPanelLayout.setHorizontalGroup(
            tranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tranPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        tranPanelLayout.setVerticalGroup(
            tranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(tranPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, -1));

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

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            Session session = Session.getInstance();
            
            account_fname.setText(""+session.getFname());
            account_lname.setText(""+session.getLname());
            displayData();
    }//GEN-LAST:event_formWindowActivated

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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked


    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            deposit dep = new deposit();
      dep.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
            withdraw wit = new withdraw();
       wit.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      transaction trans = new transaction();
        trans.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            accountDetails ad = new accountDetails();
      ad.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JFrame frame = new JFrame("Logout");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Logout", "Logout",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void ckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxActionPerformed
double originalBalance = 0; 

try {
    dbConnector dbc = new dbConnector();
    ResultSet rs = dbc.getData("SELECT balance FROM tbl_user WHERE user_id = " + Session.getInstance().getUid());
    if (rs.next()) {
        originalBalance = rs.getDouble("balance"); 
        if (ckbox.isSelected()) {
            int asterisksCount = String.valueOf(originalBalance).length();
            StringBuilder asterisks = new StringBuilder();
            for (int i = -1; i < asterisksCount; i++) {
                asterisks.append('*');
            }
            bal.setText(asterisks.toString());
        } else {
            bal.setText(String.format("%.2f", originalBalance)); // Corrected line to format the original balance
        }
    } else {
        System.out.println("No balance data found for the current user.");
    }
    rs.close(); 
} catch (SQLException ex) {
    System.out.println("Error retrieving balance: " + ex.getMessage());
}
    
    }//GEN-LAST:event_ckboxActionPerformed

    private void balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balActionPerformed

    private void depoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depoMouseEntered
        depPanel.setBackground(hovercolor);
    }//GEN-LAST:event_depoMouseEntered

    private void depPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depPanelMouseEntered
        depPanel.setBackground(hovercolor);
    }//GEN-LAST:event_depPanelMouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        depPanel.setBackground(hovercolor);        
    }//GEN-LAST:event_jLabel6MouseEntered

    private void depPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depPanelMouseExited
        depPanel.setBackground(navcolor);
    }//GEN-LAST:event_depPanelMouseExited

    private void depoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depoMouseExited
       depPanel.setBackground(navcolor);
    }//GEN-LAST:event_depoMouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        depPanel.setBackground(navcolor);
    }//GEN-LAST:event_jLabel6MouseExited

    private void widPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widPanelMouseEntered
       widPanel.setBackground(hovercolor);  
    }//GEN-LAST:event_widPanelMouseEntered

    private void withMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withMouseEntered
        widPanel.setBackground(hovercolor);
    }//GEN-LAST:event_withMouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
      widPanel.setBackground(hovercolor);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void widPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widPanelMouseExited
        widPanel.setBackground(navcolor);
    }//GEN-LAST:event_widPanelMouseExited

    private void withMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withMouseExited
        widPanel.setBackground(navcolor);
    }//GEN-LAST:event_withMouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        widPanel.setBackground(navcolor);
    }//GEN-LAST:event_jLabel8MouseExited

    private void tranPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranPanelMouseEntered
       tranPanel.setBackground(hovercolor);
    }//GEN-LAST:event_tranPanelMouseEntered

    private void transMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transMouseEntered
    tranPanel.setBackground(hovercolor);
    }//GEN-LAST:event_transMouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
    tranPanel.setBackground(hovercolor);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void tranPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranPanelMouseExited
      tranPanel.setBackground(navcolor);
    }//GEN-LAST:event_tranPanelMouseExited

    private void transMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transMouseExited
        tranPanel.setBackground(navcolor);
    }//GEN-LAST:event_transMouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
           tranPanel.setBackground(navcolor);
    }//GEN-LAST:event_jLabel7MouseExited

    private void maPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maPanelMouseExited
         maPanel.setBackground(navcolor);
    }//GEN-LAST:event_maPanelMouseExited

    private void accMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseExited
                 maPanel.setBackground(navcolor);

    }//GEN-LAST:event_accMouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
              maPanel.setBackground(navcolor);

    }//GEN-LAST:event_jLabel3MouseExited

    private void maPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maPanelMouseEntered
       maPanel.setBackground(hovercolor);
    }//GEN-LAST:event_maPanelMouseEntered

    private void accMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseEntered
       maPanel.setBackground(hovercolor);
    }//GEN-LAST:event_accMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
             maPanel.setBackground(hovercolor);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void depPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depPanelMouseClicked
           deposit dep = new deposit();
      dep.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_depPanelMouseClicked

    private void widPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widPanelMouseClicked
          withdraw wit = new withdraw();
       wit.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_widPanelMouseClicked

    private void tranPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranPanelMouseClicked
         transaction trans = new transaction();
        trans.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tranPanelMouseClicked

    private void maPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maPanelMouseClicked
       accountDetails ad = new accountDetails();
      ad.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_maPanelMouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel3.setBackground(hovercolor);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
              jPanel3.setBackground(navcolor1);

    }//GEN-LAST:event_jLabel1MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
         jPanel3.setBackground(hovercolor);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(navcolor1);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        JFrame frame = new JFrame("Logout");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Logout", "Logout",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jPanel3MouseClicked


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
    private javax.swing.JTextField bal;
    private javax.swing.JCheckBox ckbox;
    private javax.swing.JPanel depPanel;
    private javax.swing.JLabel depo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel maPanel;
    private javax.swing.JPanel tranPanel;
    private javax.swing.JLabel trans;
    private javax.swing.JLabel user;
    private javax.swing.JPanel widPanel;
    private javax.swing.JLabel with;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
