package user;

import dao.Statistics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserDashboard extends javax.swing.JFrame {

    Statistics statistics = new Statistics();
    int xx, xy;

    public UserDashboard() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userEmail = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCat = new javax.swing.JLabel();
        jPro = new javax.swing.JLabel();
        jPur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(64, 194, 150));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping.png"))); // NOI18N
        jLabel1.setText("ONLINE SHOPPING");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel2.setText("Logout");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        userEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userEmail.setForeground(new java.awt.Color(255, 255, 255));
        userEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        userEmail.setText("user@gmail.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 643, Short.MAX_VALUE)
                .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(userEmail))
                    .addComponent(jLabel1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jPanel3.setBackground(new java.awt.Color(42, 53, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        jLabel4.setText(" DASHBOARD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 40));

        jPanel5.setBackground(new java.awt.Color(42, 53, 78));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 120, 138));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("My Account");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_dark.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_light.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 30));

        jPanel7.setBackground(new java.awt.Color(42, 53, 78));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 120, 138));
        jLabel8.setText("Purchase");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase_dark.png"))); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase_light.png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 30));

        jPanel8.setBackground(new java.awt.Color(42, 53, 78));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 120, 138));
        jLabel11.setText("Purchase Details");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchasedetails_dark.png"))); // NOI18N
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchasedetails_light.png"))); // NOI18N
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 660));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("My Statistics");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Total Categories:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Total Products:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Total Purchase:");

        jCat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCat.setForeground(new java.awt.Color(102, 102, 102));
        jCat.setText("0");

        jPro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPro.setForeground(new java.awt.Color(102, 102, 102));
        jPro.setText("0");

        jPur.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPur.setForeground(new java.awt.Color(102, 102, 102));
        jPur.setText("0.0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCat, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jPur, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 112, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jCat)
                    .addComponent(jPur))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jPro))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 780, -1));

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
        icons();
    }

    private void icons() {
        jLabel9.setVisible(true);
        jLabel10.setVisible(false);
        jLabel12.setVisible(true);
        jLabel13.setVisible(false);
        jLabel6.setVisible(true);
        jLabel7.setVisible(false);
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Do you want logout now?", "Logout", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jLabel9.setVisible(false);
        jLabel10.setVisible(true);
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
        purchase.pack();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jLabel12.setVisible(false);
        jLabel13.setVisible(true);
        PurchaseDetails purchaseDetails = new PurchaseDetails();
        purchaseDetails.setVisible(true);
        purchaseDetails.pack();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel6.setVisible(false);
        jLabel7.setVisible(true);
        UserAccount userAccount = new UserAccount();
        userAccount.setVisible(true);
        userAccount.pack();
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jCat;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPanel8;
    public static javax.swing.JLabel jPro;
    public static javax.swing.JLabel jPur;
    public static javax.swing.JLabel userEmail;
    // End of variables declaration//GEN-END:variables
}
