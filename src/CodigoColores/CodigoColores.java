package CodigoColores;

import Menu.Menu;
import Ohm.ComboBox;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class CodigoColores extends javax.swing.JFrame {

    public CodigoColores() {
        initComponents();
        setLocationRelativeTo(null);
        datosCombo(comboDatos1);       
        datosCombo(comboDatos2);
        datosCombo(comboDatos3);
        
        comboDatos4.addItem("Dorado");
        comboDatos4.addItem("Plata");
        comboDatos4.addItem("Ninguno");
        
        comboDatos1.setUI(ComboBox.createUI(comboDatos1));
        comboDatos2.setUI(ComboBox.createUI(comboDatos2));
        comboDatos3.setUI(ComboBox.createUI(comboDatos3));
        comboDatos4.setUI(ComboBox.createUI(comboDatos4));
        
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        comboDatos1 = new javax.swing.JComboBox<>();
        comboDatos2 = new javax.swing.JComboBox<>();
        comboDatos3 = new javax.swing.JComboBox<>();
        comboDatos4 = new javax.swing.JComboBox<>();
        color1 = new javax.swing.JLabel();
        color2 = new javax.swing.JLabel();
        color3 = new javax.swing.JLabel();
        color4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(45, 62, 80));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboDatos1.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos1.setBorder(null);
        comboDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDatos1ActionPerformed(evt);
            }
        });
        panelFondo.add(comboDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, -1));

        comboDatos2.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos2.setBorder(null);
        comboDatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDatos2ActionPerformed(evt);
            }
        });
        panelFondo.add(comboDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, -1));

        comboDatos3.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos3.setBorder(null);
        comboDatos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDatos3ActionPerformed(evt);
            }
        });
        panelFondo.add(comboDatos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 120, -1));

        comboDatos4.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos4.setBorder(null);
        comboDatos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDatos4ActionPerformed(evt);
            }
        });
        panelFondo.add(comboDatos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 120, -1));

        color1.setBackground(new java.awt.Color(255, 255, 255));
        color1.setForeground(new java.awt.Color(255, 255, 255));
        color1.setOpaque(true);
        panelFondo.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 91, 20, 107));

        color2.setBackground(new java.awt.Color(255, 255, 255));
        color2.setOpaque(true);
        panelFondo.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 91, 20, 107));

        color3.setBackground(new java.awt.Color(255, 255, 255));
        color3.setOpaque(true);
        panelFondo.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 91, 20, 107));

        color4.setBackground(new java.awt.Color(255, 255, 255));
        color4.setOpaque(true);
        panelFondo.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 91, 20, 106));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCalcular_1.png"))); // NOI18N
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setFocusPainted(false);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCalcular2.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCalcular2.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        panelFondo.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnMenu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnMenu2.png"))); // NOI18N
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnMenu2.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        panelFondo.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banda 1");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Banda 2");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Banda 3");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tolerancia");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelFondo.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 720, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Resistencia.png"))); // NOI18N
        panelFondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 590));

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
    
    public void datosCombo(JComboBox combo){
        combo.addItem("Negro");
        combo.addItem("Cafe");
        combo.addItem("Rojo");
        combo.addItem("Naranja");
        combo.addItem("Amarillo");
        combo.addItem("Verde");
        combo.addItem("Azul");
        combo.addItem("Morado");
        combo.addItem("Gris");
        combo.addItem("Blanco");
    }   
    
    String num1,num2,num3,num4;
    
    private Color negro    = new Color(43,43,43);
    private Color cafe     = new Color(153,110,59);
    private Color rojo     = new Color(255,116,116);
    private Color naranja  = new Color(255,109,82);
    private Color amarillo = new Color(255,227,99);
    private Color verde    = new Color(165,215,107);
    private Color azul     = new Color(31,193,222);
    private Color morado   = new Color(173,93,173);
    private Color gris     = new Color(203,203,202);
    private Color blanco   = new Color(255,255,255);
    private Color dorado   = new Color(242,199,0);
    private Color plata    = new Color(180,180,179);
    private Color ninguno  = new Color(255,209,149);
    
    private void comboDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDatos1ActionPerformed
        String colorD = comboDatos1.getSelectedItem().toString();
        
        switch(colorD){
            case "Negro":
                color1.setBackground(negro);
                num1 = "0";
            break;
            
            case "Cafe":
                color1.setBackground(cafe);
                num1 = "1";
            break;
            
            case "Rojo":
                color1.setBackground(rojo);
                num1 = "2";
            break;
            
            case "Naranja":
                color1.setBackground(naranja);
                num1 = "3";
            break;
            
            case "Amarillo":
                color1.setBackground(amarillo);
                num1 = "4";
            break;
            
            case "Verde":
                color1.setBackground(verde);
                num1 = "5";
            break;
            
            case "Azul":
                color1.setBackground(azul);
                num1 = "6";
            break;
            
            case "Morado":
                color1.setBackground(morado);
                num1 = "7";
            break;
            
            case "Gris":
                color1.setBackground(gris);
                num1 = "8";
            break;
            
            case "Blanco":
                color1.setBackground(blanco);
                num1 = "9";
            break;
        }
    }//GEN-LAST:event_comboDatos1ActionPerformed

    private void comboDatos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDatos2ActionPerformed
        String colorD = comboDatos2.getSelectedItem().toString();
         
        switch(colorD){
            case "Negro":
                color2.setBackground(negro);
                num2 = "0";
            break;
            
            case "Cafe":
                color2.setBackground(cafe);
                num2 = "1";
            break;
            
            case "Rojo":
                color2.setBackground(rojo);
                num2 = "2";
            break;
            
            case "Naranja":
                color2.setBackground(naranja);
                num2 = "3";
            break;
            
            case "Amarillo":
                color2.setBackground(amarillo);
                num2 = "4";
            break;
            
            case "Verde":
                color2.setBackground(verde);
                num2 = "5";
            break;
            
            case "Azul":
                color2.setBackground(azul);
                num2 = "6";
            break;
            
            case "Morado":
                color2.setBackground(morado);
                num2 = "7";
            break;
            
            case "Gris":
                color2.setBackground(gris);
                num2 = "8";
            break;
            
            case "Blanco":
                color2.setBackground(blanco);
                num2 = "9";
            break;
        }        
    }//GEN-LAST:event_comboDatos2ActionPerformed

    private void comboDatos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDatos3ActionPerformed
        String colorD = comboDatos3.getSelectedItem().toString();
         
        switch(colorD){
            case "Negro":
                color3.setBackground(negro);
                num3 = "";
            break;
            
            case "Cafe":
                color3.setBackground(cafe);
                num3 = "0";
            break;
            
            case "Rojo":
                color3.setBackground(rojo);
                num3 = "00";
            break;
            
            case "Naranja":
                color3.setBackground(naranja);
                num3 = "000";
            break;
            
            case "Amarillo":
                color3.setBackground(amarillo);
                num3 = "0000";
            break;
            
            case "Verde":
                color3.setBackground(verde);
                num3 = "00000";
            break;
            
            case "Azul":
                color3.setBackground(azul);
                num3 = "000000";
            break;
            
            case "Morado":
                color3.setBackground(morado);
                num3 = "0000000";
            break;
            
            case "Gris":
                color3.setBackground(gris);
                num3 = "00000000";
            break;
            
            case "Blanco":
                color3.setBackground(blanco);
                num3 = "000000000";
            break;
        }
    }//GEN-LAST:event_comboDatos3ActionPerformed

    private void comboDatos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDatos4ActionPerformed
        String colorD = comboDatos4.getSelectedItem().toString();
        
        switch(colorD){
            case "Dorado":
                color4.setBackground(dorado);
                num4 = "5%";
            break;
            
            case "Plata":
                color4.setBackground(plata);
                num4 = "10%";
            break;
            
            case "Ninguno":
                color4.setBackground(ninguno);
                num4 = "20%";
            break;
        }
    }//GEN-LAST:event_comboDatos4ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        txtResultado.setText("Valor de la resistencia es de: " + num1 + num2 + num3 + " ohms " + num4);
        //System.out.println(num1+num2+num3);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CodigoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodigoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodigoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodigoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodigoColores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel color1;
    private javax.swing.JLabel color2;
    private javax.swing.JLabel color3;
    private javax.swing.JLabel color4;
    private javax.swing.JComboBox<String> comboDatos1;
    private javax.swing.JComboBox<String> comboDatos2;
    private javax.swing.JComboBox<String> comboDatos3;
    private javax.swing.JComboBox<String> comboDatos4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
