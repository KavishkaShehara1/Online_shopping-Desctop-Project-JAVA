package user;

import dao.ProductDao;
import dao.PurchaseDao;
import dao.Statistics;
import dao.UserDao;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.WHITE;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JFrame {

    Statistics statistics = new Statistics();
    UserDao user = new UserDao();
    PurchaseDao purchaseDao = new PurchaseDao();
    ProductDao productDao = new ProductDao();
    int xx, xy;
    private int qty = 0;
    private double price = 0.0;
    private double total = 0.0;
    private int pId;
    DefaultTableModel model;
    int rowIndex;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    Date date = new Date();

    Color mouseEnterColor = new Color(255, 0, 0);
    Color mouseExitColor = new Color(0, 0, 0);

    public Purchase() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnClear = new javax.swing.JLabel();
        btnPrint = new javax.swing.JLabel();
        btnParchase = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "Product ID", "Product Name", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 539, 240));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 539, 220));

        btnAdd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setText("Add");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 30));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 335, 30));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 0, 20, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 30));

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 30));

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
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 140, 30));

        btnPrint.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrint.setText("Print");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 140, 30));

        btnParchase.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnParchase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnParchase.setText("Purchase");
        btnParchase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnParchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnParchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParchaseMouseExited(evt);
            }
        });
        jPanel1.add(btnParchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 30));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextField4.setText("0");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 290, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchase ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 390));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search Product");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 119, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total: 0.0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/9.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

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
        jTextField2.setText(String.valueOf(purchaseDao.getMaxRow()));
        productsTable();
        purchaseTable();
        pId = purchaseDao.getMaxRow();
        setLocation(450, 110);
    }

    private void productsTable() {
        productDao.getProductsValue(jTable1, "");
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(BLACK);
        jTable1.setBackground(WHITE);
        jTable1.setSelectionBackground(LIGHT_GRAY);
    }

    private void purchaseTable() {
        model = (DefaultTableModel) jTable2.getModel();
        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.setGridColor(BLACK);
        jTable2.setBackground(WHITE);
        jTable2.setSelectionBackground(LIGHT_GRAY);
    }

    private void clear() {
        jTextField2.setText(String.valueOf(purchaseDao.getMaxRow()));
        jTextField3.setText("");
        jTextField4.setText("0");
        jTextField1.setText("");
        jTable2.clearSelection();
        price = 0.0;
        qty = 0;
    }

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setDefault();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jTextField3.setText(model.getValueAt(rowIndex, 1).toString());
        String s1 = model.getValueAt(rowIndex, 3).toString();
        String s2 = model.getValueAt(rowIndex, 4).toString();
        qty = Integer.parseInt(s1);
        price = Double.parseDouble(s2);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Product ID", "Product Name", "Category Name", "Quantity", "Price"}));
        productDao.getProductsValue(jTable1, jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a product", "Warning", 2);
        } else if (jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product quantity is required", "Warning", 2);
        } else {
            model = (DefaultTableModel) jTable1.getModel();
            int proId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
            if (!isProductExist(proId)) {
                if (!(qty <= 0)) {
                    int newQty = Integer.parseInt(jTextField4.getText());
                    if (newQty != 0) {
                        if (!(newQty > qty)) {
                            String pname = jTextField3.getText();
                            String t = String.format("%.2f", price * (double) newQty);
                            Object[] data = {pId, proId, pname, newQty, price, t};
                            model = (DefaultTableModel) jTable2.getModel();
                            model.addRow(data);
                            total += price * (double) newQty;
                            jLabel5.setText(String.format("Total: " + "%.2f", total));
                            pId++;
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(this, "Not enough stock", "Warning", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please increase the product quantity", "Warning", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Stock is empty", "Warning", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Product already purchased", "Warning", 2);
            }
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnParchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParchaseMouseClicked
        model = (DefaultTableModel) jTable2.getModel();
        if (model.getRowCount() > 0) {
            String[] value = new String[5];
            String email = UserDashboard.userEmail.getText();
            value = purchaseDao.getUserValue(email);
            int uid = Integer.parseInt(value[0]);
            String uname = value[1];
            String uphone = value[2];
            String address = value[3] + ", " + value[4];
            String purchaseDate = df.format(date);
            for (int i = 0; i < model.getRowCount(); i++) {
                int id = Integer.parseInt(model.getValueAt(i, 0).toString());
                int pid = Integer.parseInt(model.getValueAt(i, 1).toString());
                String pName = model.getValueAt(i, 2).toString();
                int q = Integer.parseInt(model.getValueAt(i, 3).toString());
                double pri = Double.parseDouble(model.getValueAt(i, 4).toString());
                double tot = Double.parseDouble(model.getValueAt(i, 5).toString());
                purchaseDao.insert(id, uid, uname, uphone, pid, pName, q, pri, tot, purchaseDate, address, null, null, "Pending");
                int newQuantity = purchaseDao.getQty(pid) - q;
                purchaseDao.qtyUpdate(pid, newQuantity);
            }
            statistics.user(user.getUserId(email));
            JOptionPane.showMessageDialog(this, "Successfully purchased");
            setDefault();

        } else {
            JOptionPane.showMessageDialog(this, "You haven't purchased any product", "Warning", 2);
        }
    }//GEN-LAST:event_btnParchaseMouseClicked

    private void btnParchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParchaseMouseEntered
        btnParchase.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnParchaseMouseEntered

    private void btnParchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParchaseMouseExited
        btnParchase.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnParchaseMouseExited

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
          try {
            String email = UserDashboard.userEmail.getText();
            MessageFormat header = new MessageFormat("Receipt-->   " + "Email " + email + "   " + "Total:" + total);
            MessageFormat footer = new MessageFormat("Page{0, number,integer}");
            jTable2.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
       btnPrint.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
       btnPrint.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
           clear();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(mouseEnterColor);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(mouseExitColor);
    }//GEN-LAST:event_btnClearMouseExited

    private boolean isProductExist(int proId) {
        model = (DefaultTableModel) jTable2.getModel();
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                int newProId = Integer.parseInt(model.getValueAt(i, 1).toString());
                if (newProId == proId) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setDefault() {
        setVisible(false);
        UserDashboard.jLabel9.setVisible(true);
        UserDashboard.jLabel10.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnParchase;
    private javax.swing.JLabel btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
