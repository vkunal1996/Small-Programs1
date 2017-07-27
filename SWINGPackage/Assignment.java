/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollbarcolorchanger;

import java.awt.Color;

/**
 *
 * @author scarletspeedster
 */
public class Assignment extends javax.swing.JFrame {

    /**
     * Creates new form Assignment
     */
    public Assignment() {
        initComponents();
        red.setMinimum(1);
        red.setMaximum(265);
        blue.setMinimum(1);
        blue.setMaximum(265);
        green.setMinimum(1);
        green.setMaximum(265);
        jPanel1.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RED = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        green = new javax.swing.JScrollBar();
        red = new javax.swing.JScrollBar();
        blue = new javax.swing.JScrollBar();
        p2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RED.setText("RED");
        jPanel1.add(RED, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("BLUE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setText("GREEN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, -1));
        jPanel1.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, -1));
        jPanel1.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, -1));

        green.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        green.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                greenAdjustmentValueChanged(evt);
            }
        });
        jPanel1.add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 130, -1));

        red.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        red.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                redAdjustmentValueChanged(evt);
            }
        });
        jPanel1.add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 130, -1));

        blue.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        blue.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                blueAdjustmentValueChanged(evt);
            }
        });
        jPanel1.add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 130, -1));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Apply");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Remove");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_redAdjustmentValueChanged
        // TODO add your handling code here:
        tf1.setText(String.valueOf(red.getValue()));
        p2.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }//GEN-LAST:event_redAdjustmentValueChanged

    private void blueAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_blueAdjustmentValueChanged
        // TODO add your handling code here:
        tf2.setText(String.valueOf(red.getValue()));
        p2.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }//GEN-LAST:event_blueAdjustmentValueChanged

    private void greenAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_greenAdjustmentValueChanged
        // TODO add your handling code here:
        tf3.setText(String.valueOf(red.getValue()));
        p2.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }//GEN-LAST:event_greenAdjustmentValueChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RED;
    private javax.swing.JScrollBar blue;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollBar green;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel p2;
    private javax.swing.JScrollBar red;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
