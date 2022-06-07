/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.tda.cola.ControllerTickect;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public Principal() {
        initComponents();
    }
    ControllerTickect colaCuentas = new ControllerTickect(); 
    ControllerTickect colaTarjetas = new ControllerTickect(); 
    ControllerTickect colaPrestamos = new ControllerTickect(); 
    int longitud1 = 0, longitud2 = 0, longitud3 = 0;
    int boleto1 = 20, boleto2 = 20, boleto3  = 20;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCuentas = new javax.swing.JButton();
        bntPrestamos = new javax.swing.JButton();
        bntTarjetas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTarjetas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrestamos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCuentas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("OFICINAS DEL BANCO");
        jLabel1.setToolTipText("");

        jLabel2.setText("APERTURA DE CUENTAS");

        jLabel3.setText("TARJETAS CREDITO/DEBITO");

        jLabel4.setText("PRESTAMOS");

        btnCuentas.setText("GENERAR TICKECT");
        btnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasActionPerformed(evt);
            }
        });

        bntPrestamos.setText("GENERAR TICKECT");
        bntPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPrestamosActionPerformed(evt);
            }
        });

        bntTarjetas.setText("GENERAR TICKECT");
        bntTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTarjetasActionPerformed(evt);
            }
        });

        txtTarjetas.setEditable(false);
        txtTarjetas.setColumns(20);
        txtTarjetas.setRows(5);
        jScrollPane1.setViewportView(txtTarjetas);

        txtPrestamos.setEditable(false);
        txtPrestamos.setColumns(20);
        txtPrestamos.setRows(5);
        jScrollPane2.setViewportView(txtPrestamos);

        txtCuentas.setEditable(false);
        txtCuentas.setColumns(20);
        txtCuentas.setRows(5);
        jScrollPane3.setViewportView(txtCuentas);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("NÚMERO DE BOLETOS DISPONIBLES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCuentas)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(bntTarjetas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntPrestamos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(288, 288, 288))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuentas)
                    .addComponent(bntTarjetas)
                    .addComponent(bntPrestamos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasActionPerformed
        if (longitud1 < 20) {
            colaCuentas.guardar("Boleto "+longitud1);
            longitud1++;
            boleto1 =  boleto1 - 1;
        txtCuentas.setText(String.valueOf(boleto1));
            JOptionPane.showMessageDialog(null, "OFICINA CUENTAS\nBoleto Nro "+longitud1+" generado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Sin boletos disponibles");
        }
    }//GEN-LAST:event_btnCuentasActionPerformed

    private void bntTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTarjetasActionPerformed
        if (longitud2 < 20) {
            colaTarjetas.guardar("Boleto "+longitud2);
            longitud2++;
            boleto2 =  boleto2 - 1;
        txtTarjetas.setText(String.valueOf(boleto2));
            JOptionPane.showMessageDialog(null, "OFICINA TARJETAS\nBoleto Nro "+longitud2+" generado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Sin boletos disponibles");
        }
    }//GEN-LAST:event_bntTarjetasActionPerformed

    private void bntPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrestamosActionPerformed
        if (longitud3 < 20) {
            colaPrestamos.guardar("Boleto "+longitud3);
            longitud3++;
            boleto3 =  boleto3 - 1;
        txtPrestamos.setText(String.valueOf(boleto3));
            JOptionPane.showMessageDialog(null, "OFICINA PRESTAMOS\nBoleto Nro "+longitud3+" generado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Sin boletos disponibles");
        }
    }//GEN-LAST:event_bntPrestamosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPrestamos;
    private javax.swing.JButton bntTarjetas;
    private javax.swing.JButton btnCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtCuentas;
    private javax.swing.JTextArea txtPrestamos;
    private javax.swing.JTextArea txtTarjetas;
    // End of variables declaration//GEN-END:variables
}