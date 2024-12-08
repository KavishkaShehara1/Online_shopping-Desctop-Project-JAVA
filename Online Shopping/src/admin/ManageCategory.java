package admin;

import dao.CategoryDao;
import dao.Statistics;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.WHITE;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageCategory extends javax.swing.JFrame {

    Statistics statistics = new Statistics();
    CategoryDao cat = new CategoryDao();
    Color primaryColor = new Color(42, 58, 73);

    Color textPrimaryColor = new Color(102, 120, 138);
    int xx, xy;
    Color notEdit = new Color(204, 204, 204);
    DefaultTableModel model;
    int rowIndex;

    Color mouseEnterColor = new Color(255, 0, 0);
    Color mouseExitColor = new Color(0, 0, 0);

    public ManageCategory() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
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

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 88, 510, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 51, 263, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 290, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 30));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 140, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

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
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 30));

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

        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 360));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 56, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        jTextField2.setBackground(notEdit);
        jTextField2.setText(String.valueOf(cat.getMaxRow()));
        categoryTable();
        setLocation(450, 180);
    }

    private void categoryTable() {
        cat.getCategoriesValue(jTable1, "");
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(BLACK);
        jTable1.setBackground(WHITE);
        jTable1.setSelectionBackground(LIGHT_GRAY);
    }

    private void clear() {
        jTextField1.setText("");
        jTextField2.setText(String.valueOf(cat.getMaxRow()));
        jTextField3.setText("");
        jTextField4.setText("");
        jTable1.clearSelection();
        statistics.admin();
    }

    private boolean isEmpty() {
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Category name is required", "Warning", 2);
            return false;
        }
        if (jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Description is required", "Warning", 2);
            return false;
        }
        return true;
    }

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        AdminDashboard.jPanel7.setBackground(primaryColor);
        AdminDashboard.jLabel8.setForeground(textPrimaryColor);
        AdminDashboard.jLabel9.setVisible(true);
        AdminDashboard.jLabel10.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField2.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField3.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField4.setText(model.getValueAt(rowIndex, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Category ID", "Category Name", "Description"}));
        cat.getCategoriesValue(jTable1, jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a category");
        } else {
            int id = Integer.parseInt(jTextField2.getText());
            if (cat.isIDExist(id)) {
                cat.delete(id);
                jTable1.setModel(new DefaultTableModel(null, new Object[]{"Category ID", "Category Name", "Description"}));
                cat.getCategoriesValue(jTable1, "");
            } else {
                JOptionPane.showMessageDialog(this, "Category doesn't exists", "Warning", 2);
            }
        }

    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (isEmpty()) {
            int id = Integer.parseInt(jTextField2.getText());
            String cname = jTextField3.getText();
            String desc = jTextField4.getText();
            if (!cat.isIDExist(id)) {
                if (!cat.isCategoryNameExist(cname)) {
                    cat.insert(id, cname, desc);
                    jTable1.setModel(new DefaultTableModel(null, new Object[]{"Category ID", "Category Name", "Description"}));
                    cat.getCategoriesValue(jTable1, "");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(this, "Category name already exists", "Warning", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Category id already exists", "Warning", 2);
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

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (isEmpty()) {
            int id = Integer.parseInt(jTextField2.getText());
            if (cat.isIDExist(id)) {
                if (!check()) {
                    String cname = jTextField3.getText();
                    String desc = jTextField4.getText();
                    cat.update(id, cname, desc);
                    jTable1.setModel(new DefaultTableModel(null, new Object[]{"Category ID", "Category Name", "Description"}));
                    cat.getCategoriesValue(jTable1, "");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Category id doesn't exists", "Warning", 2);
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
        btnUpdate.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnUpdateMouseExited

    private boolean check() {
        String newcategory = jTextField3.getText();
        String oldCategory = model.getValueAt(rowIndex, 1).toString();

        if (newcategory.equals(oldCategory)) {
            return false;
        } else {
            if (!newcategory.equals(oldCategory)) {
                boolean x = cat.isCategoryNameExist(newcategory);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This category name already exists", "Warning", 2);
                }
                return x;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
