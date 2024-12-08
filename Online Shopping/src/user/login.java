package user;

import admin.AdminDashboard;
import connection.MyConnection;
import dao.Statistics;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import supplier.SupplierDashboard;

public class login extends javax.swing.JFrame {

    private ButtonGroup bg = new ButtonGroup();
    int xx, xy;
    Statistics statistics = new Statistics();
    
    Color mouseEnterColor = new Color(255, 0, 0);
    Color mouseExitColor = new Color(153,153,153);


    public login() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 20, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LogIn");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 103, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 326, 30));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 326, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 46, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 30, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 30, 30));

        jRadioButton1.setBackground(new java.awt.Color(0, 204, 255));
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("User");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 60, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 204, 255));
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Supplier");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(0, 204, 255));
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Admin");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 290, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Don't have an account?");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sign up");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 60, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Forgot password?");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 170));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SHOPPING");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ONLINE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 61, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg_1.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        jRadioButton1.setSelected(true);
    }

    private boolean isEmpty() {
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is required", "Warning", 2);
            return false;
        }
        if (!jTextField1.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email address", "Warning", 2);
            return false;
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password address is required", "Warning", 2);
            return false;
        }

        return true;
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isEmpty()) {
            String email = jTextField1.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            if (jRadioButton1.isSelected()) {
                try {
                    Connection con = MyConnection.getConnection();
                    PreparedStatement ps;
                    ps = con.prepareStatement("select * from user where uemail =? and upassword =?");
                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        UserDashboard ud = new UserDashboard();
                        ud.setVisible(true);
                        ud.pack();
                        UserDashboard.userEmail.setText(email);
                        statistics.user(rs.getInt(1));
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect email or password", "Login Failed", 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jRadioButton2.isSelected()) {
                try {
                    Connection con = MyConnection.getConnection();
                    PreparedStatement ps;
                    ps = con.prepareStatement("select * from supplier where semail =? and spassword =?");
                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        SupplierDashboard sd = new SupplierDashboard();
                        sd.setVisible(true);
                        sd.pack();
                        SupplierDashboard.supplierEmail.setText(email);
                        statistics.supplier(rs.getString(2));
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect email or password", "Login Failed", 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Connection con = MyConnection.getConnection();
                    PreparedStatement ps;
                    ps = con.prepareStatement("select * from admin where email =? and password =?");
                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        AdminDashboard ad = new AdminDashboard();
                        ad.setVisible(true);
                        ad.pack();
                        AdminDashboard.adminEmail.setText(email);
                        statistics.admin();
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect email or password", "Login Failed", 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new ForgotPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel10.setVisible(false);
        jLabel11.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jPasswordField1.setEchoChar('*');
        jLabel10.setVisible(true);
        jLabel11.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(mouseExitColor);
    }//GEN-LAST:event_jButton1MouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
