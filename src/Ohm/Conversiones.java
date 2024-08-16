package Ohm;

import javax.swing.JOptionPane;

public class Conversiones extends javax.swing.JPanel {

    public Conversiones() {
        initComponents();
        comboDatos3.addItem("Tensión");
        comboDatos3.addItem("Corriente");
        comboDatos3.addItem("Resistencia");
        comboDatos1.setUI(ComboBox.createUI(comboDatos1));
        comboDatos2.setUI(ComboBox.createUI(comboDatos2));
        comboDatos3.setUI(ComboBox.createUI(comboDatos3));
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDatos = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboDatos1 = new javax.swing.JComboBox<>();
        comboDatos2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboDatos3 = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(45, 62, 80));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDatos.setBackground(new java.awt.Color(255, 255, 255));
        txtDatos.setForeground(new java.awt.Color(0, 0, 0));
        txtDatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDatos.setBorder(null);
        txtDatos.setCaretColor(new java.awt.Color(102, 102, 102));
        txtDatos.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtDatos.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtDatos.setSelectionColor(new java.awt.Color(83, 124, 164));
        txtDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDatosKeyTyped(evt);
            }
        });
        add(txtDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 170, 20));

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setForeground(new java.awt.Color(0, 0, 0));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setBorder(null);
        txtResultado.setCaretColor(new java.awt.Color(102, 102, 102));
        txtResultado.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtResultado.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtResultado.setSelectionColor(new java.awt.Color(83, 124, 164));
        add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 170, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("=");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        comboDatos1.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos1.setBorder(null);
        add(comboDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 170, -1));

        comboDatos2.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos2.setBorder(null);
        add(comboDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 170, -1));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncalcular.png"))); // NOI18N
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setFocusPainted(false);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncalcularHover.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncalcularHover.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categoría de unidades de medida");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        comboDatos3.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos3.setBorder(null);
        comboDatos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDatos3ActionPerformed(evt);
            }
        });
        add(comboDatos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 120, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Conversion2.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 590));
    }// </editor-fold>//GEN-END:initComponents
       
    private void comboDatos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDatos3ActionPerformed
        
        String op = comboDatos3.getSelectedItem().toString();
        
        switch(op){
            case "Tensión":
                comboDatos1.removeAllItems();
                comboDatos2.removeAllItems();
                comboDatos1.addItem("kilovoltio (kV)");
                comboDatos1.addItem("milívoltio (mV)");                
                comboDatos2.addItem("voltio (V)");                
                txtResultado.setText("");
            break;
            
            case "Corriente":
                comboDatos1.removeAllItems();
                comboDatos2.removeAllItems();
                comboDatos1.addItem("kiloamperio (kA)");
                comboDatos1.addItem("milíamperio (mA)");
                comboDatos2.addItem("Amperio (A)");
                txtResultado.setText("");
            break;
            
            case "Resistencia":
                comboDatos1.removeAllItems();
                comboDatos2.removeAllItems();
                comboDatos1.addItem("kiloohmio (kΩ)");
                comboDatos1.addItem("milíohmio (mΩ)");
                comboDatos1.addItem("ohmio (Ω)");
                
                comboDatos2.addItem("ohmio (Ω)");
                comboDatos2.addItem("kiloohmio (kΩ)");
                comboDatos2.addItem("milíohmio (mΩ)");                
                txtResultado.setText("");
            break;            
        }
    }//GEN-LAST:event_comboDatos3ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtDatos.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");
        }else{        
            double num1 = Double.parseDouble(txtDatos.getText());
            double k = 0.001;
            double m = 1000;
            double l = 1000000;
            double respuesta = 0;
            
            String op  = comboDatos1.getSelectedItem().toString();
            String op2 = comboDatos2.getSelectedItem().toString();

            if (op.equalsIgnoreCase("kilovoltio (kV)")){
                respuesta = num1 / k;               
            }
            
            if (op.equalsIgnoreCase("milívoltio (mV)")){
                respuesta = num1 / m;
            }           

            if (op.equalsIgnoreCase("kiloamperio (kA)")){
                respuesta = num1 / k;
            }

            if (op.equalsIgnoreCase("milíamperio (mA)")){
                respuesta = num1 / m;
            }            

            //RESISTENCIA
            if (op.equalsIgnoreCase("kiloohmio (kΩ)") && op2.equalsIgnoreCase("ohmio (Ω)")){
                respuesta = num1 / k;
            }
            
            if (op.equalsIgnoreCase("kiloohmio (kΩ)") && op2.equalsIgnoreCase("kiloohmio (kΩ)")){
                respuesta = num1 / 1;
            }
            
            if (op.equalsIgnoreCase("kiloohmio (kΩ)") && op2.equalsIgnoreCase("milíohmio (mΩ)")){
                respuesta = num1 * l;
            }   
            //MILIOHMIOS
            if (op.equalsIgnoreCase("milíohmio (mΩ)") && op2.equalsIgnoreCase("ohmio (Ω)")){
                respuesta = num1 / m;
            } 
            
            if (op.equalsIgnoreCase("milíohmio (mΩ)") && op2.equalsIgnoreCase("kiloohmio (kΩ)")){
                respuesta = num1 * 0.000001;
            }       
            
            if (op.equalsIgnoreCase("milíohmio (mΩ)") && op2.equalsIgnoreCase("milíohmio (mΩ)")){
                respuesta = num1 / 1;
            }
                
            //OHMIOS
            if (op.equalsIgnoreCase("ohmio (Ω)") && op2.equalsIgnoreCase("ohmio (Ω)")){
                respuesta = num1 / 1;
            }  

            if (op.equalsIgnoreCase("ohmio (Ω)") && op2.equalsIgnoreCase("kiloohmio (kΩ)")){
                respuesta = num1 * k;
            }
            
            if (op.equalsIgnoreCase("ohmio (Ω)") && op2.equalsIgnoreCase("milíohmio (mΩ)")){
                respuesta = num1 * m;
            }  
            
            txtResultado.setText(""+respuesta);
        }             
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.' && evt.getKeyChar()!='-'){
            evt.consume();
        }
        if (evt.getKeyChar()=='.' && txtDatos.getText().contains(".")){
            evt.consume();
        }

        if (evt.getKeyChar()=='-' && txtDatos.getText().contains("-")){
            evt.consume();
        }         
    }//GEN-LAST:event_txtDatosKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> comboDatos1;
    private javax.swing.JComboBox<String> comboDatos2;
    private javax.swing.JComboBox<String> comboDatos3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

}
