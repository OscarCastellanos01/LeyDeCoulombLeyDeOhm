package Menu;

import CodigoColores.CodigoColores;
import Coulomb.Coulomb;
import Ohm.Ohm;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        bntCoulomb = new javax.swing.JButton();
        bntOhm = new javax.swing.JButton();
        bntColor = new javax.swing.JButton();
        bntSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 62, 80));
        setResizable(false);

        pFondo.setBackground(new java.awt.Color(45, 62, 80));
        pFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntCoulomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B1.png"))); // NOI18N
        bntCoulomb.setBorder(null);
        bntCoulomb.setBorderPainted(false);
        bntCoulomb.setContentAreaFilled(false);
        bntCoulomb.setFocusPainted(false);
        bntCoulomb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B1Hover.png"))); // NOI18N
        bntCoulomb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B1Hover.png"))); // NOI18N
        bntCoulomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCoulombActionPerformed(evt);
            }
        });
        pFondo.add(bntCoulomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 128, -1, 100));

        bntOhm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B2.png"))); // NOI18N
        bntOhm.setBorder(null);
        bntOhm.setBorderPainted(false);
        bntOhm.setContentAreaFilled(false);
        bntOhm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntOhm.setFocusPainted(false);
        bntOhm.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B2Hover.png"))); // NOI18N
        bntOhm.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B2Hover.png"))); // NOI18N
        bntOhm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOhmActionPerformed(evt);
            }
        });
        pFondo.add(bntOhm, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 232, -1, 100));

        bntColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B3.png"))); // NOI18N
        bntColor.setBorder(null);
        bntColor.setBorderPainted(false);
        bntColor.setContentAreaFilled(false);
        bntColor.setFocusPainted(false);
        bntColor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B3Hover.png"))); // NOI18N
        bntColor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B3Hover.png"))); // NOI18N
        bntColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntColorActionPerformed(evt);
            }
        });
        pFondo.add(bntColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 338, -1, -1));

        bntSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B4.png"))); // NOI18N
        bntSalir.setBorder(null);
        bntSalir.setBorderPainted(false);
        bntSalir.setContentAreaFilled(false);
        bntSalir.setFocusPainted(false);
        bntSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B4Hover.png"))); // NOI18N
        bntSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B4Hover.png"))); // NOI18N
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });
        pFondo.add(bntSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 440, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.png"))); // NOI18N
        pFondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Para cambiar de pantalla
    private void bntCoulombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCoulombActionPerformed
        Coulomb C = new Coulomb();
        C.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_bntCoulombActionPerformed

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntSalirActionPerformed

    private void bntOhmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOhmActionPerformed
        Ohm O = new Ohm();
        O.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntOhmActionPerformed

    private void bntColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntColorActionPerformed
        CodigoColores c = new CodigoColores();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntColorActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton bntColor;
    private javax.swing.JButton bntCoulomb;
    private javax.swing.JButton bntOhm;
    private javax.swing.JButton bntSalir;
    private javax.swing.JPanel pFondo;
    // End of variables declaration//GEN-END:variables
}
