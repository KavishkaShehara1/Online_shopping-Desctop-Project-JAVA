package admin;

import dao.ProductDao;
import dao.Statistics;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.WHITE;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageProduct extends javax.swing.JFrame {

     Statistics statistics = new Statistics();
    ProductDao product = new ProductDao();
    Color selectionColor = new Color(42, 58, 73);
    Color textSelectioncolor = new Color(102, 120, 138);
    int xx, xy;
    Color notEdit = new Color(204, 204, 204);
    DefaultTableModel model;
    int rowIndex;
    String[] categories;
    
    Color mouseEnterColor = new Color(255, 0, 0);
    Color mouseExitColor = new Color(0, 0, 0);

    public ManageProduct() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Quantity", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 88, 514, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 51, 263, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 30));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

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
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 140, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 140, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 51, -1, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 290, 30));

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
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 140, 30));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

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
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 140, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 460));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 540));

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
        jTextField2.setBackground(notEdit);
        jTextField2.setText(String.valueOf(product.getMaxRow()));
        categories = new String[product.countCategories()];
        setCat();
        productTable();
        setLocation(450, 180);
    }

    private void setCat() {
        categories = product.getCat();
        for (String s : categories) {
            jComboBox1.addItem(s);
        }
    }

    private void clear() {
        jTextField1.setText("");
        jTextField2.setText(String.valueOf(product.getMaxRow()));
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextField4.setText("0");
        jTextField5.setText("0.0");
        jTable1.clearSelection();
        statistics.admin();
    }

    private void productTable() {
        product.getProductsValue(jTable1, "");
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(BLACK);
        jTable1.setBackground(WHITE);
        jTable1.setSelectionBackground(LIGHT_GRAY);
    }

    private boolean isEmpty() {
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product name is required", "Warning", 2);
            return false;
        }
        if (jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product price i required", "Warning", 2);
            return false;
        }
        if (Integer.parseInt(jTextField4.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Please, increase the product quantity", "Warning", 2);
            return false;
        }
        if (jTextField5.getText().equals("0.0") || jTextField5.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Product price is required", "Warning", 2);
            return false;
        }
        return true;
    }

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        AdminDashboard.jPanel8.setBackground(selectionColor);
        AdminDashboard.jLabel11.setForeground(textSelectioncolor);
        AdminDashboard.jLabel12.setVisible(true);
        AdminDashboard.jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageProduct.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category Name", "Quantity", "Price"}));
        product.getProductsValue(jTable1, jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField2.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField3.setText(model.getValueAt(rowIndex, 1).toString());

        String category = model.getValueAt(rowIndex, 2).toString();
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (jComboBox1.getItemAt(i).equals(category)) {
                jComboBox1.setSelectedIndex(i);
                break;
            }
        }
        jTextField4.setText(model.getValueAt(rowIndex, 3).toString());
        jTextField5.setText(model.getValueAt(rowIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (isEmpty()) {
            int id = Integer.parseInt(jTextField2.getText());
            String pname = jTextField3.getText();
            String cat = jComboBox1.getSelectedItem().toString();
            int qty = Integer.parseInt(jTextField4.getText());
            if (isNumeric(jTextField5.getText())) {
                double price = Double.parseDouble(jTextField5.getText());
                if (!product.isIDExist(id)) {
                    if (!product.isProCatExist(pname, cat)) {
                        product.insert(id, pname, cat, qty, price);
                        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category Name", "Quantity", "Price"}));
                        product.getProductsValue(jTable1, "");
                        clear();
                    } else {
                        JOptionPane.showMessageDialog(this, "Product and Category already exists", "Warning", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Product id already exists", "Warning", 2);
                }
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
               if (isEmpty()) {
            int id = Integer.parseInt(jTextField2.getText());
            String pname = jTextField3.getText();
            String cat = jComboBox1.getSelectedItem().toString();
            int qty = Integer.parseInt(jTextField4.getText());
            if (isNumeric(jTextField5.getText())) {
                double price = Double.parseDouble(jTextField5.getText());
                if (product.isIDExist(id)) {
                    if (!check()) {
                        product.update(id, pname, cat, qty, price);
                        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category Name", "Quantity", "Price"}));
                        product.getProductsValue(jTable1, "");
                        clear();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Product id already exists", "Warning", 2);
                }
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
         btnUpdate.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
                int id = Integer.parseInt(jTextField2.getText());
        if (product.isIDExist(id)) {
            product.delete(id);
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category Name", "Quantity", "Price"}));
            product.getProductsValue(jTable1, "");
            clear();
        } else {
            JOptionPane.showMessageDialog(this, "Product doesn't exists", "Warning", 2);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
         btnDelete.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
         clear();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnClearMouseExited

    private boolean check() {
        String newProduct = jTextField3.getText();
        String oldProduct = model.getValueAt(rowIndex, 1).toString();
        String newcategory = jComboBox1.getSelectedItem().toString();
        String oldCategory = model.getValueAt(rowIndex, 2).toString();

        if (newProduct.equals(oldProduct) && newcategory.equals(oldCategory)) {
            return false;
        } else {
            boolean x = product.isProCatExist(newProduct, newcategory);
            if (x) {
                JOptionPane.showMessageDialog(this, "Product name and Category already exist", "Warning", 2);
                return x;
            }
        }
        return false;
    }

    private boolean isNumeric(String s) {
        try {
            double d = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "" + ex + "\nNumeric value is required for the price field");
        }
        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
