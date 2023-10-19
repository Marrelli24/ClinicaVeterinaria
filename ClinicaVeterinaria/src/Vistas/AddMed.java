package Vistas;

import Entidades.Medicamento;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class AddMed extends javax.swing.JInternalFrame {


    public AddMed() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTNombreMed = new javax.swing.JTextField();
        JTPrecioMed = new javax.swing.JTextField();
        JBOk = new javax.swing.JButton();
        JBCancel = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Medicamento");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Precio:");

        JTPrecioMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTPrecioMedKeyTyped(evt);
            }
        });

        JBOk.setText("Guardar");
        JBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBOkActionPerformed(evt);
            }
        });

        JBCancel.setText("Salir");
        JBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JTPrecioMed))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTNombreMed, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(JBOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCancel)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTNombreMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTPrecioMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBOk)
                    .addComponent(JBCancel))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBOkActionPerformed
       try{
       String nombre = JTNombreMed.getText(); 
       double precio = Double.parseDouble(JTPrecioMed.getText());
       Medicamento m = new Medicamento(nombre, precio);
       Menu.medicamentoData.nuevoMedicamento(m);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Hubo un error en el ingreso de datos");
       }
    }//GEN-LAST:event_JBOkActionPerformed

    private void JBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelActionPerformed
        dispose();
    }//GEN-LAST:event_JBCancelActionPerformed

    private void JTPrecioMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPrecioMedKeyTyped
         if ((Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) && (evt.getKeyChar() != '.')) {
            evt.consume();
        }
        String regex = "^([^,]*,){0,1}(\\d{0,7}(\\.\\d{0,2})?){0,1}$"; //CHEQUEA QUE SOLO ESTE UNA COMA Y QUE ESTE LIMITADO EL NUMERO A INGRESAR POR 3numeros COMA Y 3 DECIMALES

        if (!(JTPrecioMed.getText() + evt.getKeyChar()).matches(regex)) {
            evt.consume();

        }
    }//GEN-LAST:event_JTPrecioMedKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancel;
    private javax.swing.JButton JBOk;
    private javax.swing.JTextField JTNombreMed;
    private javax.swing.JTextField JTPrecioMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
