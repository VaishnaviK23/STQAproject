/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author vuk ksc
 */
public class PaymentMethod extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String username;
    double triplength;

    /**
     * Creates new form BookRide
     */
    public PaymentMethod(String username) {
        this.username = username;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAmerican = new javax.swing.JButton();
        btnMcard = new javax.swing.JButton();
        btnPaypal = new javax.swing.JButton();
        btnPaytm = new javax.swing.JButton();
        btnDiscover = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVisa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.orange);
        setForeground(java.awt.Color.orange);

        jPanel3.setBackground(java.awt.Color.orange);

        btnAmerican.setForeground(java.awt.Color.white);
        btnAmerican.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/american-express-finance-logo-method-online-payment-icon1.png"))); // NOI18N
        btnAmerican.setFocusCycleRoot(true);
        btnAmerican.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmericanActionPerformed(evt);
            }
        });

        btnMcard.setForeground(java.awt.Color.white);
        btnMcard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mastercard.png"))); // NOI18N
        btnMcard.setFocusCycleRoot(true);
        btnMcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMcardActionPerformed(evt);
            }
        });

        btnPaypal.setForeground(java.awt.Color.white);
        btnPaypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/paypal.png"))); // NOI18N
        btnPaypal.setFocusCycleRoot(true);
        btnPaypal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaypalActionPerformed(evt);
            }
        });

        btnPaytm.setForeground(java.awt.Color.white);
        btnPaytm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Paytm.png"))); // NOI18N
        btnPaytm.setFocusCycleRoot(true);
        btnPaytm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaytmActionPerformed(evt);
            }
        });

        btnDiscover.setForeground(java.awt.Color.white);
        btnDiscover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/discover.jpeg"))); // NOI18N
        btnDiscover.setFocusCycleRoot(true);
        btnDiscover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscoverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Select Method of Payment:");

        btnVisa.setForeground(java.awt.Color.white);
        btnVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/visa 28.png"))); // NOI18N
        btnVisa.setFocusCycleRoot(true);
        btnVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDiscover, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPaypal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGap(175, 175, 175)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAmerican, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMcard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPaytm, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, 156))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(92, 92, 92)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMcard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPaytm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPaypal))
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDiscover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAmerican, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setForeground(java.awt.Color.white);
        jPanel1.setFocusCycleRoot(true);

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book A Ride!");

        btnHome.setBackground(java.awt.Color.black);
        btnHome.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnHome.setForeground(java.awt.Color.orange);
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnHome.setBorderPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnHistory.setBackground(java.awt.Color.black);
        btnHistory.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnHistory.setForeground(java.awt.Color.orange);
        btnHistory.setText("Ride History");
        btnHistory.setBorder(new javax.swing.border.MatteBorder(null));
        btnHistory.setBorderPainted(false);
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnProfile.setBackground(java.awt.Color.black);
        btnProfile.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnProfile.setForeground(java.awt.Color.orange);
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnProfile.setBorderPainted(false);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnLogout.setBackground(java.awt.Color.black);
        btnLogout.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnLogout.setForeground(java.awt.Color.orange);
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmericanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmericanActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "update transaction set payment_method = 'American Express' order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Invoice h = new Invoice(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAmericanActionPerformed

    private void btnMcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMcardActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "update transaction set payment_method = 'Mastercard' order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Invoice h = new Invoice(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMcardActionPerformed

    private void btnPaypalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaypalActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "update transaction set payment_method = 'Paypal' order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Invoice h = new Invoice(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPaypalActionPerformed

    private void btnPaytmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaytmActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "update transaction set payment_method = 'Paytm' order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Invoice h = new Invoice(username);
        h.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnPaytmActionPerformed

    private void btnDiscoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscoverActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "update transaction set payment_method = 'Discover Network' order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Invoice h = new Invoice(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDiscoverActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "delete from booking order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql2 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql2);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql3 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql3);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        HomeCustomer h = new HomeCustomer(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "delete from booking order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql2 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql2);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql3 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql3);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String sql = "select * from customer where login_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, this.username);
            rs = pst.executeQuery();

            if (rs.next()) {
                RideHistory h = new RideHistory(username);
                h.setVisible(true);
                this.dispose();
            } else {
                DriverHistory h = new DriverHistory(username);
                h.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "delete from booking order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql2 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql2);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql3 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql3);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String sql = "select * from customer where login_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, this.username);
            rs = pst.executeQuery();

            if (rs.next()) {
                CustomerProfile h = new CustomerProfile(username);
                h.setVisible(true);
                this.dispose();
            } else {
                EmployeeProfile h = new EmployeeProfile(username);
                h.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "delete from booking order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql2 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql2);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Sql3 = "delete from transaction order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql3);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        LoginPage h = new LoginPage();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql1 = "update transaction set payment_method = 'Visa Card' order by booking_id desc limit 1";
        try {
            pst = conn.prepareStatement(Sql1);
            int i = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Invoice h = new Invoice(username);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisaActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentMethod("admin").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmerican;
    private javax.swing.JButton btnDiscover;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMcard;
    private javax.swing.JButton btnPaypal;
    private javax.swing.JButton btnPaytm;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnVisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
