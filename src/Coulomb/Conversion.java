package Coulomb;

import Ohm.ComboBox; //creo puntero para poder instanciar una clase del paquete ohm.
import javax.swing.JOptionPane;

public class Conversion extends javax.swing.JPanel {
  
    public Conversion() {
        initComponents();
        comboDatos.addItem("MiliCoulomb");
        comboDatos.addItem("MicroCoulomb");
        comboDatos.addItem("NanoCoulomb");
        comboDatos.addItem("PicoCoulomb");
        comboDatos.setUI(ComboBox.createUI(comboDatos));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDatos = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboDatos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(45, 62, 80));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDatos.setBackground(new java.awt.Color(255, 255, 255));
        txtDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        comboDatos.setForeground(new java.awt.Color(0, 0, 0));
        comboDatos.setBorder(null);
        add(comboDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Coulomb");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

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

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Conversion.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtDatos.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");
        }else{
            double num1 = Double.parseDouble(txtDatos.getText());
            double respuesta = 0;
            double mc = 1000;
            double micro = 1000000;
            double nc = 1000000000;
            double pc = 0.000000000001;
            
            String op = comboDatos.getSelectedItem().toString();
            
            if (op.equalsIgnoreCase("MiliCoulomb")){
                respuesta = num1 / mc;
            }

            if (op.equalsIgnoreCase("MicroCoulomb")){
                respuesta = num1 / micro;
            }

            if (op.equalsIgnoreCase("NanoCoulomb")){
                respuesta = num1 / nc;
            }

            if (op.equalsIgnoreCase("PicoCoulomb")){
                respuesta = num1 * pc;
            }
            
            txtResultado.setText(""+respuesta);
            txtDatos.setText("");
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
    private javax.swing.JComboBox<String> comboDatos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
