package Ohm;

import Menu.Menu;
import javax.swing.ImageIcon;

public class Ohm extends javax.swing.JFrame {

    public Ohm() {
        initComponents();
        setLocationRelativeTo(null);
        Conceptos c = new Conceptos();
        c.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(c);
        panelP.validate();
        panelP.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        btnConceptos = new javax.swing.JButton();
        btnFormulas = new javax.swing.JButton();
        btnConversiones = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        panelP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(45, 62, 80));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConceptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1Press.png"))); // NOI18N
        btnConceptos.setBorder(null);
        btnConceptos.setBorderPainted(false);
        btnConceptos.setContentAreaFilled(false);
        btnConceptos.setFocusPainted(false);
        btnConceptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConceptosActionPerformed(evt);
            }
        });
        panelFondo.add(btnConceptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        btnFormulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2Released.png"))); // NOI18N
        btnFormulas.setBorder(null);
        btnFormulas.setBorderPainted(false);
        btnFormulas.setContentAreaFilled(false);
        btnFormulas.setFocusPainted(false);
        btnFormulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormulasActionPerformed(evt);
            }
        });
        panelFondo.add(btnFormulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 10, -1, -1));

        btnConversiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3Released.png"))); // NOI18N
        btnConversiones.setBorder(null);
        btnConversiones.setBorderPainted(false);
        btnConversiones.setContentAreaFilled(false);
        btnConversiones.setFocusPainted(false);
        btnConversiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionesActionPerformed(evt);
            }
        });
        panelFondo.add(btnConversiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 10, -1, -1));

        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn4Released.png"))); // NOI18N
        btnCalculadora.setBorder(null);
        btnCalculadora.setBorderPainted(false);
        btnCalculadora.setContentAreaFilled(false);
        btnCalculadora.setFocusPainted(false);
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });
        panelFondo.add(btnCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 10, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5Released.png"))); // NOI18N
        btnMenu.setToolTipText("");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setFocusPainted(false);
        btnMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5Press.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        panelFondo.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 10, -1, -1));

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        panelFondo.add(panelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1040, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormulasActionPerformed
        imagenes("/Imagenes/btn1Released.png","/Imagenes/btn2Press.png","/Imagenes/btn3Released.png","/Imagenes/btn4Released.png");
        
        Formulas f = new Formulas();
        f.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(f);
        panelP.revalidate();
        panelP.repaint();
    }//GEN-LAST:event_btnFormulasActionPerformed

    private void btnConversionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversionesActionPerformed
        imagenes("/Imagenes/btn1Released.png","/Imagenes/btn2Released.png","/Imagenes/btn3Press.png","/Imagenes/btn4Released.png");
        
        Conversiones con = new Conversiones();
        con.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(con);
        panelP.revalidate();
        panelP.repaint();
    }//GEN-LAST:event_btnConversionesActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        imagenes("/Imagenes/btn1Released.png","/Imagenes/btn2Released.png","/Imagenes/btn3Released.png","/Imagenes/btn4Press.png");
        
        Calculadora cal = new Calculadora();
        cal.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(cal);
        panelP.validate();
        panelP.repaint();
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnConceptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConceptosActionPerformed
        imagenes("/Imagenes/btn1Press.png","/Imagenes/btn2Released.png","/Imagenes/btn3Released.png","/Imagenes/btn4Released.png");
        
        Conceptos c = new Conceptos();
        c.setSize(1040,590);

        panelP.removeAll();
        panelP.add(c);
        panelP.revalidate();
        panelP.repaint();
    }//GEN-LAST:event_btnConceptosActionPerformed
    
    public void imagenes(String img1, String img2,String img3,String img4){
        btnConceptos.setIcon(new ImageIcon(getClass().getResource(img1)));
        btnFormulas.setIcon(new ImageIcon(getClass().getResource(img2)));
        btnConversiones.setIcon(new ImageIcon(getClass().getResource(img3)));
        btnCalculadora.setIcon(new ImageIcon(getClass().getResource(img4)));               
    }
    
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
            java.util.logging.Logger.getLogger(Ohm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ohm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ohm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ohm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ohm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnConceptos;
    private javax.swing.JButton btnConversiones;
    private javax.swing.JButton btnFormulas;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelP;
    // End of variables declaration//GEN-END:variables
}
