
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Khian
 */
public class POS extends javax.swing.JFrame {

    /**
     * Creates new form POS
     */
    public POS() {
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

        jPBg = new javax.swing.JPanel();
        jPanel12oz = new javax.swing.JPanel();
        jbtnVie12 = new javax.swing.JButton();
        jbtnPL12 = new javax.swing.JButton();
        jbtnClas12 = new javax.swing.JButton();
        jbtnCa12 = new javax.swing.JButton();
        jbtnVa12 = new javax.swing.JButton();
        jbtnHa12 = new javax.swing.JButton();
        jbtnAm12 = new javax.swing.JButton();
        jbtnCL12 = new javax.swing.JButton();
        jbtnCM12 = new javax.swing.JButton();
        jbtnSCL12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel16oz = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnVie16 = new javax.swing.JButton();
        jbtnPL16 = new javax.swing.JButton();
        jbtnCa16 = new javax.swing.JButton();
        jbtnClas16 = new javax.swing.JButton();
        jbtnCL16 = new javax.swing.JButton();
        jbtnSCL16 = new javax.swing.JButton();
        jbtnAm16 = new javax.swing.JButton();
        jbtnHa16 = new javax.swing.JButton();
        jbtnVa16 = new javax.swing.JButton();
        jbtnCM16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnPayment = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtAD = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jtxtVat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBg.setBackground(new java.awt.Color(0, 0, 0));
        jPBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12oz.setBackground(new java.awt.Color(127, 135, 178));
        jPanel12oz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnVie12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnVie12.setText("VIETNAMESE");
        jbtnVie12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVie12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnVie12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 190, 70));

        jbtnPL12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnPL12.setText("PLAIN BLACK");
        jbtnPL12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPL12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnPL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 70));

        jbtnClas12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnClas12.setText("CLASSIC");
        jbtnClas12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClas12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnClas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 70));

        jbtnCa12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnCa12.setText("CARAMEL");
        jbtnCa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCa12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnCa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 190, 70));

        jbtnVa12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnVa12.setText("VANILLA");
        jbtnVa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVa12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnVa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 70));

        jbtnHa12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnHa12.setText("HAZELNUT");
        jbtnHa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHa12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnHa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, 70));

        jbtnAm12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnAm12.setText("AMERICANO");
        jbtnAm12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAm12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnAm12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 190, 70));

        jbtnCL12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnCL12.setText("CAFE LATTE");
        jbtnCL12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCL12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnCL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 190, 70));

        jbtnCM12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnCM12.setText("C. MACCHIATO");
        jbtnCM12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCM12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnCM12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 190, 70));

        jbtnSCL12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnSCL12.setText("S.C. LATTE");
        jbtnSCL12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSCL12ActionPerformed(evt);
            }
        });
        jPanel12oz.add(jbtnSCL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 190, 70));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("12oz HOT");
        jPanel12oz.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 220, 50));

        jPBg.add(jPanel12oz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 420, 500));

        jPanel16oz.setBackground(new java.awt.Color(127, 135, 178));
        jPanel16oz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("16oz ICED");
        jPanel16oz.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 220, 50));

        jbtnVie16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnVie16.setText("VIETNAMESE");
        jbtnVie16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVie16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnVie16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 190, 70));

        jbtnPL16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnPL16.setText("PLAIN BLACK");
        jbtnPL16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPL16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnPL16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 70));

        jbtnCa16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnCa16.setText("CARAMEL");
        jbtnCa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCa16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnCa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 190, 70));

        jbtnClas16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnClas16.setText("CLASSIC");
        jbtnClas16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClas16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnClas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 70));

        jbtnCL16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnCL16.setText("CAFE LATTE");
        jbtnCL16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCL16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnCL16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 190, 70));

        jbtnSCL16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnSCL16.setText("S.C. LATTE");
        jbtnSCL16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSCL16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnSCL16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 190, 70));

        jbtnAm16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnAm16.setText("AMERICANO");
        jbtnAm16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAm16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnAm16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 190, 70));

        jbtnHa16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnHa16.setText("HAZELNUT");
        jbtnHa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHa16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnHa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, 70));

        jbtnVa16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnVa16.setText("VANILLA");
        jbtnVa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVa16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnVa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 70));

        jbtnCM16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnCM16.setText("C. MACCHIATO");
        jbtnCM16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCM16ActionPerformed(evt);
            }
        });
        jPanel16oz.add(jbtnCM16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 190, 70));

        jPBg.add(jPanel16oz, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 420, 500));

        jPanel1.setBackground(new java.awt.Color(230, 133, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnExit.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnExit.setText("EXIT");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, 46));

        jbtnPayment.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnPayment.setText("PAYMENT");
        jbtnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 150, 46));

        jbtnRemove.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnRemove.setText("REMOVE");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 46));

        jbtnClear.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jbtnClear.setText("CLEAR");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 46));

        jPBg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 720, 80));

        jPanel2.setBackground(new java.awt.Color(242, 230, 177));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("AMOUNT DUE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 50));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("TOTAL");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 50));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("VAT");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 50));

        jtxtAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtADActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 40));

        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, 40));

        jtxtVat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVatActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 40));

        jPBg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 410, 240));

        jPanel3.setBackground(new java.awt.Color(131, 178, 208));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 40));

        jPBg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 350, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QTY", "ITEM", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPBg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 10, 410, -1));

        getContentPane().add(jPBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void ItemCost() {
        double sum = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        jtxtTotal.setText(Double.toString(sum));
        double mTotal = Double.parseDouble(jtxtTotal.getText());

        double cVat = (mTotal * 1.12) - mTotal;
        String iVatTotal = String.format("₱ %.2f", cVat);
        jtxtVat.setText(iVatTotal);

        String iTotal = String.format("₱ %.2f", mTotal);
        jtxtTotal.setText(iTotal);

        String iAD = String.format("₱ %.2f", mTotal + cVat);
        jtxtAD.setText(iAD);
    }
    private void jbtnPL12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPL12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 49.11;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Plain Black 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnPL12ActionPerformed

    private void jbtnVie12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVie12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 58.04;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Vietnamese 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnVie12ActionPerformed

    private void jbtnAm12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAm12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 89.29;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Americano 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnAm12ActionPerformed

    private void jbtnCM12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCM12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 107.14;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Caramel Macchiato 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCM12ActionPerformed

    private void jbtnPL16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPL16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 53.57;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Plain Black 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnPL16ActionPerformed

    private void jbtnVie16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVie16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 62.5;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Vietnamese 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnVie16ActionPerformed

    private void jbtnAm16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAm16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 98.21;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Americano 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnAm16ActionPerformed

    private void jbtnCM16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCM16ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 116.07;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Caramel Macchiato 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCM16ActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if ( RemoveItem >= 0)
        {
            model.removeRow(RemoveItem);
        }
         ItemCost();
    }//GEN-LAST:event_jbtnRemoveActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtTotal.setText("");
        jtxtVat.setText("");
        jtxtAD.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jtxtADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtADActionPerformed

    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalActionPerformed

    private void jtxtVatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtVatActionPerformed

    private void jbtnClas12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClas12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 66.96;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Classic 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnClas12ActionPerformed

    private void jbtnCa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCa12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 75.89;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Caramel 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCa12ActionPerformed

    private void jbtnVa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVa12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 75.89;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Vanilla 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnVa12ActionPerformed

    private void jbtnHa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHa12ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 75.89;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Hazelnut 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnHa12ActionPerformed

    private void jbtnCL12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCL12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 107.14;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Cafe Latte 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCL12ActionPerformed

    private void jbtnSCL12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSCL12ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 107.14;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Salted Caramel Latte 12oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnSCL12ActionPerformed

    private void jbtnClas16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClas16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 80.36;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Classic 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnClas16ActionPerformed

    private void jbtnCa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCa16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 89.29;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Caramel 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCa16ActionPerformed

    private void jbtnVa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVa16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 89.29;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Vanilla 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnVa16ActionPerformed

    private void jbtnHa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHa16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 89.28;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Hazelnut 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnHa16ActionPerformed

    private void jbtnCL16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCL16ActionPerformed
        // TODO add your handling code here:

        double PriceOfItem = 116.07;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Cafe Latte 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnCL16ActionPerformed

    private void jbtnSCL16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSCL16ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 116.07;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Salted Caramel Latte 16oz", PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jbtnSCL16ActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm If you want to exit" , "Point os Sales", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaymentActionPerformed
        // TODO add your handling code here:
        String pay =jtxtAD.getText();
        new payment(pay).setVisible(true);
    }//GEN-LAST:event_jbtnPaymentActionPerformed

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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPBg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12oz;
    private javax.swing.JPanel jPanel16oz;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAm12;
    private javax.swing.JButton jbtnAm16;
    private javax.swing.JButton jbtnCL12;
    private javax.swing.JButton jbtnCL16;
    private javax.swing.JButton jbtnCM12;
    private javax.swing.JButton jbtnCM16;
    private javax.swing.JButton jbtnCa12;
    private javax.swing.JButton jbtnCa16;
    private javax.swing.JButton jbtnClas12;
    private javax.swing.JButton jbtnClas16;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnHa12;
    private javax.swing.JButton jbtnHa16;
    private javax.swing.JButton jbtnPL12;
    private javax.swing.JButton jbtnPL16;
    private javax.swing.JButton jbtnPayment;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnSCL12;
    private javax.swing.JButton jbtnSCL16;
    private javax.swing.JButton jbtnVa12;
    private javax.swing.JButton jbtnVa16;
    private javax.swing.JButton jbtnVie12;
    private javax.swing.JButton jbtnVie16;
    public static javax.swing.JTextField jtxtAD;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtVat;
    // End of variables declaration//GEN-END:variables
}
