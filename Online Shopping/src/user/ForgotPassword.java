package user;

import dao.ForgotPasswordDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ForgotPassword extends javax.swing.JFrame {

    ForgotPasswordDao fg = new ForgotPasswordDao();
    int xx,xy;
    Color notEdit = new Color(204, 204, 204);
    Color edit = new Color(255,255,255);
    
    Color mouseEnterColor = new Color(255, 0, 0);
    Color mouseExitColor = new Color(0,0,0);
    
    public ForgotPassword() {
        initComponents();
        init();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnBack = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 230, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 30));

        btnBack.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnBackAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, 30));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 330, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter your Email Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

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
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 140, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Security Question");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

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
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 30, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 330, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 420));

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

    private void init(){
        jTextField1.setBackground(notEdit);
        jTextField5.setBackground(notEdit);
        jPasswordField1.setBackground(notEdit);
        jTextField1.setEditable(false);
        jTextField5.setEditable(false);
        jPasswordField1.setEditable(false);
        btnSave.setEnabled(false);
    }
    
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
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

    private boolean isEmpty(){
        if (jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Security answer is required", "warning", 2);
            return false;
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter new password", "Warning", 2);
            return false;
        }
        return true;
    }
    
    private boolean emailValidaton(){
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email address", "Warning", 2);
            return false;
        }
        if (!jTextField3.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email address", "Warning", 2);
            return false;
        }
        return true;
    }
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       if(emailValidaton()){
           if(fg.isEmailExist(jTextField3.getText())){
               jTextField3.setBackground(notEdit);
               jTextField3.setEditable(false);
               jTextField5.setBackground(edit);
               jTextField5.setEditable(true);
               jPasswordField1.setBackground(edit);
               jPasswordField1.setEditable(true);
               btnSave.setEnabled(true);
           }
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
                if(isEmpty()){
            String email = jTextField3.getText();
            String ans = jTextField5.getText();
            if(fg.getAns(email, ans)){
                String pass = String.valueOf(jPasswordField1.getPassword());
                fg.setPassword(email, pass);
                new login().setVisible(true);
                this.dispose();                
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
             new login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnBackAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
