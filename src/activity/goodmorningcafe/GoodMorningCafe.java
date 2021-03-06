/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.goodmorningcafe;

import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Vezeveer
 */
public class GoodMorningCafe extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("#.##");
    double totalPay = 0.0;
    double coffee = 49.90;
    double tea = 59.90;
    double cream = 15.00;
    double sugar = 10;
    boolean bCream = false;
    boolean bSugar = false;
    String beverage;

    /**
     * Creates new form GoodMorningCafe
     */
    public GoodMorningCafe() {
        initComponents();

        ButtonGroup beverage = new ButtonGroup();
        beverage.add(rbCoffee);
        beverage.add(rbTea);

        rbCoffee.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpDialogBox = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        lblYouOrdered = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbCoffee = new javax.swing.JRadioButton();
        rbTea = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        chkbCream = new javax.swing.JCheckBox();
        chkbSugar = new javax.swing.JCheckBox();
        btnPlaceOrder = new javax.swing.JButton();
        tfTotalPay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taWelcomeArea = new javax.swing.JTextArea();

        lblYouOrdered.setText("You ordered:");

        jButton1.setText("Ok");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblYouOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblYouOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout dpDialogBoxLayout = new javax.swing.GroupLayout(dpDialogBox.getContentPane());
        dpDialogBox.getContentPane().setLayout(dpDialogBoxLayout);
        dpDialogBoxLayout.setHorizontalGroup(
            dpDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpDialogBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dpDialogBoxLayout.setVerticalGroup(
            dpDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpDialogBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.lightGray), "Good Morning Cafe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.lightGray), "Beverage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 0, 11))); // NOI18N

        rbCoffee.setText("Coffee ???49.90");
        rbCoffee.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbCoffeeItemStateChanged(evt);
            }
        });

        rbTea.setText("Tea ???59.90");
        rbTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTeaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCoffee)
                    .addComponent(rbTea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCoffee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTea)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.lightGray), "With", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 0, 11))); // NOI18N

        chkbCream.setText("Cream ???15");
        chkbCream.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkbCreamItemStateChanged(evt);
            }
        });

        chkbSugar.setText("Sugar ???10");
        chkbSugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkbSugarItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbCream)
                    .addComponent(chkbSugar))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkbCream)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkbSugar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnPlaceOrder.setText("Place Your Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        tfTotalPay.setText("???0.0");
        tfTotalPay.setDisabledTextColor(new java.awt.Color(51, 102, 255));
        tfTotalPay.setEnabled(false);

        jLabel1.setText("Please Pay:");

        taWelcomeArea.setColumns(20);
        taWelcomeArea.setRows(5);
        taWelcomeArea.setText("Good Morning!\nWelcome to Good Morning Cafe!\n\nYour Coffee will be served with:\nNo Cream\nNo Sugar");
        jScrollPane1.setViewportView(taWelcomeArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotalPay)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 29, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(tfTotalPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlaceOrder)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCoffeeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbCoffeeItemStateChanged
        totalPay = coffee;
        if (chkbCream.isSelected()) {
            totalPay += cream;
        }
        if (chkbSugar.isSelected()) {
            totalPay += sugar;
        }
        tfTotalPay.setText("???" + df.format(totalPay));

        beverage = "Coffee";
        printWelcomeMessage();
    }//GEN-LAST:event_rbCoffeeItemStateChanged

    private void rbTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTeaActionPerformed
        totalPay = tea;
        if (chkbCream.isSelected()) {
            totalPay += cream;
        }
        if (chkbSugar.isSelected()) {
            totalPay += sugar;
        }
        tfTotalPay.setText("???" + df.format(totalPay));

        beverage = "Tea";
        printWelcomeMessage();
    }//GEN-LAST:event_rbTeaActionPerformed

    private void chkbCreamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkbCreamItemStateChanged
        if (!chkbCream.isSelected()) {
            bCream = false;
            totalPay -= cream;
        } else {
            bCream = true;
            totalPay += cream;
        }
        tfTotalPay.setText("???" + df.format(totalPay));

        printWelcomeMessage();
    }//GEN-LAST:event_chkbCreamItemStateChanged

    private void chkbSugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkbSugarItemStateChanged
        if (!chkbSugar.isSelected()) {
            bSugar = false;
            totalPay -= sugar;
        } else {
            bSugar = true;
            totalPay += sugar;
        }
        tfTotalPay.setText("???" + df.format(totalPay));

        printWelcomeMessage();
    }//GEN-LAST:event_chkbSugarItemStateChanged

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        
        String completed = "You ordered:\n" + 
                beverage + (beverage.equals("Coffee")?" ???49.90":" ???59.90") + "\n" +
                (bCream ? "Cream ???"+cream:"No Cream") +"\n" +
                (bSugar ? "Sugar ???"+sugar:"No Sugar") +"\n\n" +
                "Total - ???"+df.format(totalPay);
        
        int option = JOptionPane.showConfirmDialog(this, completed, "", JOptionPane.YES_NO_OPTION);
        if(option == 0){
            JOptionPane.showConfirmDialog(this, "Thank you! Please come again.", "", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
            
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

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
            java.util.logging.Logger.getLogger(GoodMorningCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoodMorningCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoodMorningCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoodMorningCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoodMorningCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JCheckBox chkbCream;
    private javax.swing.JCheckBox chkbSugar;
    private javax.swing.JDialog dpDialogBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblYouOrdered;
    private javax.swing.JRadioButton rbCoffee;
    private javax.swing.JRadioButton rbTea;
    private javax.swing.JTextArea taWelcomeArea;
    private javax.swing.JTextField tfTotalPay;
    // End of variables declaration//GEN-END:variables

    private void printWelcomeMessage() {
        String cream, sugar;

        if (bCream) {
            cream = "Cream";
        } else {
            cream = "No Cream";
        }
        if (bSugar) {
            sugar = "Sugar";
        } else {
            sugar = "No Sugar";
        }
        

        taWelcomeArea.setText("Good Morning!\n"
                + "Welcome to Good Morning Cafe!\n"
                + "\n"
                + "Your " + beverage + " will be served with:\n"
                + cream + "\n"
                + sugar);
    }
}
