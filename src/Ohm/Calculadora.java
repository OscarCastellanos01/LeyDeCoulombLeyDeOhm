package Ohm;

import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JPanel {

    public Calculadora() {
        initComponents();
        combo.addItem("Voltaje (V)");
        combo.addItem("Corriente (A)");
        combo.addItem("Resistencia (Ω)");
        combo.setUI(ComboBox.createUI(combo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorriente = new javax.swing.JLabel();
        txtResistencia = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        txtF = new javax.swing.JTextField();
        txtF2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        txtResultado = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(45, 62, 80));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorriente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCorriente.setForeground(new java.awt.Color(255, 255, 255));
        txtCorriente.setText("Corriente");
        add(txtCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 115, -1, -1));

        txtResistencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtResistencia.setForeground(new java.awt.Color(255, 255, 255));
        txtResistencia.setText("Resistencia");
        add(txtResistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 165, -1, -1));

        Resultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Resultado.setForeground(new java.awt.Color(255, 255, 255));
        Resultado.setText("Resultado");
        add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        txtF.setBackground(new java.awt.Color(255, 255, 255));
        txtF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtF.setForeground(new java.awt.Color(0, 0, 0));
        txtF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF.setBorder(null);
        txtF.setCaretColor(new java.awt.Color(102, 102, 102));
        txtF.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtF.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtF.setSelectionColor(new java.awt.Color(83, 124, 164));
        txtF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFKeyTyped(evt);
            }
        });
        add(txtF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 140, 20));

        txtF2.setBackground(new java.awt.Color(255, 255, 255));
        txtF2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtF2.setForeground(new java.awt.Color(0, 0, 0));
        txtF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF2.setBorder(null);
        txtF2.setCaretColor(new java.awt.Color(102, 102, 102));
        txtF2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtF2.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtF2.setSelectionColor(new java.awt.Color(83, 124, 164));
        txtF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtF2KeyTyped(evt);
            }
        });
        add(txtF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 140, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Que desea calcular?");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        combo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        combo.setForeground(new java.awt.Color(0, 0, 0));
        combo.setBorder(null);
        combo.setFocusable(false);
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 170, 25));
        combo.getAccessibleContext().setAccessibleDescription("");

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
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 130, 30));

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 280, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculadora.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtF.getText().isEmpty() || txtF2.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");
        }else{
            double num1 = Double.parseDouble(txtF.getText());
            double num2 = Double.parseDouble(txtF2.getText());
            double respuesta = 0;
            String valor,medida;
            valor  = "";
            medida = "";

            String op = combo.getSelectedItem().toString();

            if (op.equalsIgnoreCase("voltaje (V)")){
                respuesta = num1 * num2;
                valor  = "Su voltaje es de ";
                medida = "V";
            }

            if (op.equalsIgnoreCase("corriente (A)")){
                respuesta = num1 / num2;
                valor  = "Su corriente es de ";
                medida = "A";
            }

            if (op.equalsIgnoreCase("resistencia (Ω)")){
                respuesta = num1 / num2;
                valor  = "Su resistencia es de ";
                medida = "Ω";
            }

            txtResultado.setText(valor + (double)Math.round(respuesta*100d)/100 + " " + medida);
            txtF.setText("");
            txtF2.setText("");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String op = combo.getSelectedItem().toString();

        if (op.equalsIgnoreCase("voltaje (V)")){
            txtCorriente.setText("Corriente");
            txtResistencia.setText("Resistencia");
            txtResultado.setText("");
        }

        if (op.equalsIgnoreCase("corriente (A)")){
            txtCorriente.setText("Voltaje");
            txtResistencia.setText("Resistencia");
            txtResultado.setText("");           
        }

        if (op.equalsIgnoreCase("resistencia (Ω)")){
            txtCorriente.setText("Voltaje");
            txtResistencia.setText("Corriente");
            txtResultado.setText("");
        }        
    }//GEN-LAST:event_comboActionPerformed

    private void txtFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.' && evt.getKeyChar()!='-'){
            evt.consume();
        }
        if (evt.getKeyChar()=='.' && txtF.getText().contains(".")){
            evt.consume();
        }
        
        if (evt.getKeyChar()=='-' && txtF.getText().contains("-")){
            evt.consume();
        }        
    }//GEN-LAST:event_txtFKeyTyped

    private void txtF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtF2KeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.' && evt.getKeyChar()!='-'){
            evt.consume();
        }
        if (evt.getKeyChar()=='.' && txtF2.getText().contains(".")){
            evt.consume();
        }
        
        if (evt.getKeyChar()=='-' && txtF2.getText().contains("-")){
            evt.consume();
        } 
    }//GEN-LAST:event_txtF2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtCorriente;
    private javax.swing.JTextField txtF;
    private javax.swing.JTextField txtF2;
    private javax.swing.JLabel txtResistencia;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
