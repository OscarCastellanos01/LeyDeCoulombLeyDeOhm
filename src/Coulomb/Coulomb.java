package Coulomb;

import Menu.Menu;
import javax.swing.ImageIcon;

public class Coulomb extends javax.swing.JFrame {

    public Coulomb() {
        initComponents();
        setLocationRelativeTo(null);
        Conceptos c = new Conceptos();
        c.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(c);
        panelP.revalidate();
        panelP.repaint();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneFondo = new javax.swing.JPanel();
        btnC = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnCon = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        panelP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        paneFondo.setBackground(new java.awt.Color(45, 62, 80));
        paneFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1Press.png"))); // NOI18N
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setFocusPainted(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        paneFondo.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        btnF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2Released.png"))); // NOI18N
        btnF.setBorder(null);
        btnF.setBorderPainted(false);
        btnF.setContentAreaFilled(false);
        btnF.setFocusPainted(false);
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        paneFondo.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        btnCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3Released.png"))); // NOI18N
        btnCon.setBorder(null);
        btnCon.setBorderPainted(false);
        btnCon.setContentAreaFilled(false);
        btnCon.setFocusPainted(false);
        btnCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConActionPerformed(evt);
            }
        });
        paneFondo.add(btnCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5Released.png"))); // NOI18N
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
        paneFondo.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

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

        paneFondo.add(panelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1040, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        imagenes("/Imagenes/btn1Press.png","/Imagenes/btn2Released.png","/Imagenes/btn3Released.png","/Imagenes/btn5Released.png");
        
        Conceptos c = new Conceptos();
        c.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(c);
        panelP.revalidate();
        panelP.repaint();       
    }//GEN-LAST:event_btnCActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        imagenes("/Imagenes/btn1Released.png","/Imagenes/btn2Press.png","/Imagenes/btn3Released.png","/Imagenes/btn5Released.png");
                      
        Formulas f = new Formulas();
        f.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(f);
        panelP.validate();
        panelP.repaint();
    }//GEN-LAST:event_btnFActionPerformed

    private void btnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConActionPerformed
        imagenes("/Imagenes/btn1Released.png","/Imagenes/btn2Released.png","/Imagenes/btn3Press.png","/Imagenes/btn5Released.png");
        
        Conversion con = new Conversion();
        con.setSize(1040,590);
        
        panelP.removeAll();
        panelP.add(con);
        panelP.validate();
        panelP.repaint();
    }//GEN-LAST:event_btnConActionPerformed
       
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    public void imagenes(String dato1, String dato2, String dato3, String dato4){
        btnC.setIcon(new ImageIcon(getClass().getResource(dato1)));
        btnF.setIcon(new ImageIcon(getClass().getResource(dato2)));
        btnCon.setIcon(new ImageIcon(getClass().getResource(dato3)));
        btnMenu.setIcon(new ImageIcon(getClass().getResource(dato4)));  
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
            java.util.logging.Logger.getLogger(Coulomb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coulomb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coulomb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coulomb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coulomb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCon;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel paneFondo;
    private javax.swing.JPanel panelP;
    // End of variables declaration//GEN-END:variables
}
