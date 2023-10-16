package Vistas;

import AccesoADatos.ClienteData;
import Entidades.Cliente;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class GestionCliente extends javax.swing.JInternalFrame {

    private ClienteData clienteD = new ClienteData();
    private Cliente cliente = new Cliente();

    public GestionCliente() {
        initComponents();
        desactivarCampos();
        botonesOff();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTDNI = new javax.swing.JTextField();
        JTNombreCliente = new javax.swing.JTextField();
        JTApellidoCliente = new javax.swing.JTextField();
        JTDireccionCliente = new javax.swing.JTextField();
        JTTelefonoCliente = new javax.swing.JTextField();
        JTContactoAltCliente = new javax.swing.JTextField();
        JTNumAltCliente = new javax.swing.JTextField();
        JBBuscarClienteDNI = new javax.swing.JButton();
        JBSaveCliente = new javax.swing.JButton();
        JBExitCliente = new javax.swing.JButton();
        JBNuevoCliente = new javax.swing.JButton();
        JBEliminarCliente = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Tel:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Contacto alternativo");

        jLabel8.setText("Tel Contacto");

        JBBuscarClienteDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Lupa.png"))); // NOI18N
        JBBuscarClienteDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarClienteDNIActionPerformed(evt);
            }
        });

        JBSaveCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/disk.png"))); // NOI18N
        JBSaveCliente.setText("Guardar ");
        JBSaveCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBSaveCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaveClienteActionPerformed(evt);
            }
        });

        JBExitCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        JBExitCliente.setText("Salir ");
        JBExitCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBExitCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExitClienteActionPerformed(evt);
            }
        });

        JBNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add-user.png"))); // NOI18N
        JBNuevoCliente.setText("Nuevo ");
        JBNuevoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoClienteActionPerformed(evt);
            }
        });

        JBEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/trash.png"))); // NOI18N
        JBEliminarCliente.setText("Eliminar ");
        JBEliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(JTDireccionCliente))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(JTTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(JBBuscarClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JTApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTContactoAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(JBNuevoCliente))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(JBSaveCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBEliminarCliente)
                                        .addGap(72, 72, 72)
                                        .addComponent(JBExitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JTNumAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(179, 179, 179))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBBuscarClienteDNI)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(JTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTContactoAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTNumAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSaveCliente)
                    .addComponent(JBExitCliente)
                    .addComponent(JBNuevoCliente)
                    .addComponent(JBEliminarCliente))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExitClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExitClienteActionPerformed
        dispose();
    }//GEN-LAST:event_JBExitClienteActionPerformed
  
    private void JBBuscarClienteDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarClienteDNIActionPerformed
        try {
            int dni = Integer.parseInt(JTDNI.getText());
            cliente = clienteD.buscarClientePorDni(dni);
            
            if (cliente != null) {
                botonesOn();
                activarCampos();
                JTApellidoCliente.setText(cliente.getApellido());
                JTNombreCliente.setText(cliente.getNombre());
                JTTelefonoCliente.setText(String.valueOf(cliente.getTelefono()));
                JTDireccionCliente.setText(cliente.getDireccion());
                JTContactoAltCliente.setText(cliente.getNombreAlterno());
                JTNumAltCliente.setText(String.valueOf(cliente.getContactoAlter()));
            } else {
                JOptionPane.showMessageDialog(null, "No hay coincidencias con el dni ingresado\nIntente nuevamente");
                limpiarCampos();     
                desactivarCampos();
            }
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en la introduccion de datos");
        }

    }//GEN-LAST:event_JBBuscarClienteDNIActionPerformed

    private void JBNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoClienteActionPerformed
        limpiarCampos();
        activarCampos();
    }//GEN-LAST:event_JBNuevoClienteActionPerformed

    private void JBEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarClienteActionPerformed
            try {
                int dni = Integer.parseInt(JTDNI.getText());
                Cliente c = clienteD.buscarClientePorDni(dni);
                int response = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar al cliente "+ c.getApellido()+ " " +c.getNombre() + "?", "Eliminar cliente", JOptionPane.YES_NO_OPTION);
                
                if (response == JOptionPane.YES_OPTION) {
                clienteD.eliminarCliente(c.getIdCliente());
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error al obtener los datos");
            }
            
            limpiarCampos();
            desactivarCampos();
        
    }//GEN-LAST:event_JBEliminarClienteActionPerformed

    private void JBSaveClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaveClienteActionPerformed
        try{
            int dni = Integer.parseInt(JTDNI.getText());
            Cliente match = clienteD.buscarClientePorDni(dni);
           
            if(match == null){
            
                String nombre = JTNombreCliente.getText();
                String apellido = JTApellidoCliente.getText();
                int tel = Integer.parseInt(JTTelefonoCliente.getText());
                String direccion = JTDireccionCliente.getText();
                String contacto = JTContactoAltCliente.getText();
                int telContacto = Integer.parseInt(JTNumAltCliente.getText());

                Cliente c = new Cliente(dni, nombre, apellido, tel, direccion, contacto, telContacto);
                clienteD.guardarCliente(c);
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay un cliente con este DNI!");
                int response = JOptionPane.showConfirmDialog(null, "Desea editar el cliente?", "ATENCION!", JOptionPane.YES_NO_OPTION);
                
                if(response == JOptionPane.YES_OPTION){
                    match.setDni(dni);
                    match.setNombre(JTNombreCliente.getText());
                    match.setApellido(JTApellidoCliente.getText());
                    match.setTelefono(Integer.parseInt(JTTelefonoCliente.getText()));
                    match.setDireccion(JTDireccionCliente.getText());
                    match.setNombreAlterno(JTContactoAltCliente.getText());
                    match.setContactoAlter(Integer.parseInt(JTNumAltCliente.getText()));
               
                    clienteD.editarCliente(match);                
                }
            }
            
            limpiarCampos();
            desactivarCampos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la introduccion de datos");
        }
    }//GEN-LAST:event_JBSaveClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarClienteDNI;
    private javax.swing.JButton JBEliminarCliente;
    private javax.swing.JButton JBExitCliente;
    private javax.swing.JButton JBNuevoCliente;
    private javax.swing.JButton JBSaveCliente;
    private javax.swing.JTextField JTApellidoCliente;
    private javax.swing.JTextField JTContactoAltCliente;
    private javax.swing.JTextField JTDNI;
    private javax.swing.JTextField JTDireccionCliente;
    private javax.swing.JTextField JTNombreCliente;
    private javax.swing.JTextField JTNumAltCliente;
    private javax.swing.JTextField JTTelefonoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    public void activarCampos() {
        JTApellidoCliente.setEnabled(true);
        JTNombreCliente.setEnabled(true);
        JTTelefonoCliente.setEnabled(true);
        JTDireccionCliente.setEnabled(true);
        JTContactoAltCliente.setEnabled(true);
        JTNumAltCliente.setEnabled(true);
    }

    public void desactivarCampos() {
        JTApellidoCliente.setEnabled(false);
        JTNombreCliente.setEnabled(false);
        JTTelefonoCliente.setEnabled(false);
        JTDireccionCliente.setEnabled(false);
        JTContactoAltCliente.setEnabled(false);
        JTNumAltCliente.setEnabled(false);
    }

    public void limpiarCampos() {
        JTDNI.setText("");
        JTApellidoCliente.setText("");
        JTNombreCliente.setText("");
        JTTelefonoCliente.setText("");
        JTDireccionCliente.setText("");
        JTContactoAltCliente.setText("");
        JTNumAltCliente.setText("");
    }

    public void botonesOff() {
        JBSaveCliente.setVisible(false);
        JBEliminarCliente.setVisible(false);
    }

    public void botonesOn() {
        JBSaveCliente.setVisible(true);
        JBEliminarCliente.setVisible(true);
    }
}
