package admin;

import dao.Statistics;
import dao.SupplierDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddSupplier extends javax.swing.JFrame {

    Statistics statistics = new Statistics();
    SupplierDao supplier = new SupplierDao();
    int xx, xy;
    Color notEdit = new Color(204, 204, 204);

    Color mouseEnterColor = new Color(255, 0, 0);
    Color mouseExitColor = new Color(0, 0, 0);

    public AddSupplier() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        btnSave = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClear.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 140, 30));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 290, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 290, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 290, 30));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 30));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 290, 30));

        btnSave.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 140, 30));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 290, 30));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 290, 30));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 290, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Full Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address Line 1(State & Area)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("address Line 2(Country)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 20, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 290, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Supplier ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

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

    private void init() {
        jTextField1.setBackground(notEdit);
        jTextField1.setText(String.valueOf(supplier.getMaxRow()));
        setLocation(650, 200);
    }

    private void clear() {
        jTextField1.setText(String.valueOf(supplier.getMaxRow()));
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jPasswordField1.setText("");
        statistics.admin();
    }

    public boolean isEmpty() {
        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "warning", 2);
            return false;
        }
        if (jTextField8.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Full Name is required", "warning", 2);
            return false;
        }
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is required", "Warning", 2);
            return false;
        }
        if (!jTextField3.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email address", "Warning", 2);
            return false;
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password  is required", "Warning", 2);
            return false;
        }
        if (jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone Number is required", "warning", 2);
            return false;
        }
        if (jTextField4.getText().length() > 15) {
            JOptionPane.showMessageDialog(this, "Phone Number is to long", "warning", 2);
            return false;
        }
        if (jTextField4.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Phone Number is to short", "warning", 2);
            return false;
        }
        if (jTextField6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address line 1 is required", "warning", 2);
            return false;
        }
        if (jTextField7.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address line 2 is required", "warning", 2);
            return false;
        }
        return true;
    }

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        Color selectionColor = new Color(42, 58, 73);
        AdminDashboard.jPanel8.setBackground(selectionColor);
        Color textSelectioncolor = new Color(102, 120, 138);
        AdminDashboard.jLabel36.setForeground(textSelectioncolor);
        AdminDashboard.jLabel37.setVisible(true);
        AdminDashboard.jLabel38.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jPasswordField1.setEchoChar((char) 0);
        jLabel12.setVisible(false);
        jLabel13.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jPasswordField1.setEchoChar('*');
        jLabel12.setVisible(true);
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char input = evt.getKeyChar();
        if (!(input < '0' || input > '9') && input != '\b') {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Username doesn't contain any numbers!", "Warning", 2);
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (isEmpty()) {
            int id = Integer.parseInt(jTextField1.getText());
            String username = jTextField2.getText();
            String fullname = jTextField8.getText();
            String email = jTextField3.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            String phone = jTextField4.getText();
            String address1 = jTextField6.getText();
            String address2 = jTextField7.getText();
            if (!supplier.isUserNamexist(username)) {
                if (!supplier.isEmailExist(email)) {
                    if (!supplier.isPhoneExist(phone)) {
                        supplier.insert(id, fullname, username, email, password, phone, address1, address2);
                        clear();
                    } else {
                        JOptionPane.showMessageDialog(this, "This phone number already axists");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "This email already axists");
                }
            } else {
                JOptionPane.showMessageDialog(this, "This username already axists");
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        clear();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnClearMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
