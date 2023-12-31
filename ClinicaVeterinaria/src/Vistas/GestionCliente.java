package Vistas;

import AccesoADatos.ClienteData;
import Entidades.Cliente;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GestionCliente extends javax.swing.JInternalFrame {

    private ClienteData clienteD = new ClienteData();
    private Cliente cliente = new Cliente();
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public GestionCliente() {
        initComponents();
        wallpaper();
        desactivarCampos();
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
        jBBajaAlta = new javax.swing.JButton();
        JFondo = new javax.swing.JLabel();
        jpEstado = new javax.swing.JPanel();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Gestion cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono.:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Direccion:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Tel. contacto:");

        JTDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTDNIKeyTyped(evt);
            }
        });

        JTNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTNombreClienteKeyTyped(evt);
            }
        });

        JTApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTApellidoClienteKeyTyped(evt);
            }
        });

        JTTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTTelefonoClienteKeyTyped(evt);
            }
        });

        JTContactoAltCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTContactoAltClienteKeyTyped(evt);
            }
        });

        JTNumAltCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTNumAltClienteKeyTyped(evt);
            }
        });

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

        jBBajaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/download.png"))); // NOI18N
        jBBajaAlta.setText("Baja");
        jBBajaAlta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBBajaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaAltaActionPerformed(evt);
            }
        });

        JFondo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jrbEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbEstado)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jrbEstado)
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Contacto de emergencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBNuevoCliente)
                        .addGap(82, 82, 82)
                        .addComponent(JBSaveCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBajaAlta)
                        .addGap(65, 65, 65)
                        .addComponent(JBExitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTContactoAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTNumAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JTDNI)
                                                    .addComponent(JTNombreCliente))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(JBBuscarClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel4))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(17, 17, 17)))
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(JBBuscarClienteDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JTApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTContactoAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNumAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNuevoCliente)
                    .addComponent(JBSaveCliente)
                    .addComponent(jBBajaAlta)
                    .addComponent(JBExitCliente))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
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
                activarCampos();
                JTApellidoCliente.setText(cliente.getApellido());
                JTNombreCliente.setText(cliente.getNombre());
                JTTelefonoCliente.setText(String.valueOf(cliente.getTelefono()));
                JTDireccionCliente.setText(cliente.getDireccion());
                JTContactoAltCliente.setText(cliente.getNombreAlterno());
                JTNumAltCliente.setText(String.valueOf(cliente.getContactoAlter()));
                jrbEstado.setSelected(cliente.isEstado());
                botonIcon(jrbEstado.isSelected());
                jBBajaAlta.setEnabled(true);
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
        botonIcon(true);
        jBBajaAlta.setEnabled(false);
    }//GEN-LAST:event_JBNuevoClienteActionPerformed

    private void jBBajaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaAltaActionPerformed
        if (!JTDNI.getText().isEmpty()) {
            int dni = Integer.parseInt(JTDNI.getText());
            Cliente cliente = new Cliente();
            cliente = Menu.clienteData.buscarClientePorDni(dni);
            if (cliente != null) {
                int id = cliente.getIdCliente();
                int response;
                if (jrbEstado.isSelected()) {
                    response = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de baja al alumno?", "Dar de baja", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        Menu.clienteData.baja(id);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo dar de baja al alumno");
                    }
                } else {
                    response = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de alta al alumno?", "Dar de Alta", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        Menu.clienteData.reActivarAlumno(id);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo dar de alta al alumno");
                    }
                }
                limpiarCampos();
                desactivarCampos();
            }
        }
    }//GEN-LAST:event_jBBajaAltaActionPerformed

    private void JBSaveClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaveClienteActionPerformed
        try {
            int dni = Integer.parseInt(JTDNI.getText());
            Cliente match = clienteD.buscarClientePorDni(dni);

            if (match == null) {

                String nombre = JTNombreCliente.getText();
                String apellido = JTApellidoCliente.getText();
                int tel = Integer.parseInt(JTTelefonoCliente.getText());
                String direccion = JTDireccionCliente.getText();
                String contacto = JTContactoAltCliente.getText();
                int telContacto = Integer.parseInt(JTNumAltCliente.getText());

                Cliente c = new Cliente(dni, nombre, apellido, tel, direccion, contacto, telContacto, true);
                clienteD.guardarCliente(c);
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay un cliente con este DNI!");
                int response = JOptionPane.showConfirmDialog(null, "Desea editar el cliente?", "ATENCION!", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    match.setDni(dni);
                    match.setNombre(JTNombreCliente.getText());
                    match.setApellido(JTApellidoCliente.getText());
                    match.setTelefono(Integer.parseInt(JTTelefonoCliente.getText()));
                    match.setDireccion(JTDireccionCliente.getText());
                    match.setNombreAlterno(JTContactoAltCliente.getText());
                    match.setContactoAlter(Integer.parseInt(JTNumAltCliente.getText()));
                    match.setEstado(jrbEstado.isSelected());
                    clienteD.editarCliente(match);
                }
            }

            limpiarCampos();
            desactivarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la introduccion de datos");
        }
    }//GEN-LAST:event_JBSaveClienteActionPerformed

    private void JTDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTDNIKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTDNIKeyTyped

    private void JTNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNombreClienteKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_JTNombreClienteKeyTyped

    private void JTNumAltClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNumAltClienteKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTNumAltClienteKeyTyped

    private void JTApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTApellidoClienteKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_JTApellidoClienteKeyTyped

    private void JTContactoAltClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTContactoAltClienteKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_JTContactoAltClienteKeyTyped

    private void JTTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTTelefonoClienteKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_JTTelefonoClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarClienteDNI;
    private javax.swing.JButton JBExitCliente;
    private javax.swing.JButton JBNuevoCliente;
    private javax.swing.JButton JBSaveCliente;
    private javax.swing.JLabel JFondo;
    private javax.swing.JTextField JTApellidoCliente;
    private javax.swing.JTextField JTContactoAltCliente;
    private javax.swing.JTextField JTDNI;
    private javax.swing.JTextField JTDireccionCliente;
    private javax.swing.JTextField JTNombreCliente;
    private javax.swing.JTextField JTNumAltCliente;
    private javax.swing.JTextField JTTelefonoCliente;
    private javax.swing.JButton jBBajaAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JRadioButton jrbEstado;
    // End of variables declaration//GEN-END:variables

    public void activarCampos() {
        JTApellidoCliente.setEnabled(true);
        JTNombreCliente.setEnabled(true);
        JTTelefonoCliente.setEnabled(true);
        JTDireccionCliente.setEnabled(true);
        JTContactoAltCliente.setEnabled(true);
        JTNumAltCliente.setEnabled(true);
        JBSaveCliente.setEnabled(true);
        jpEstado.setVisible(true);
        jrbEstado.setSelected(true);
    }

    public void desactivarCampos() {
        JTApellidoCliente.setEnabled(false);
        JTNombreCliente.setEnabled(false);
        JTTelefonoCliente.setEnabled(false);
        JTDireccionCliente.setEnabled(false);
        JTContactoAltCliente.setEnabled(false);
        JTNumAltCliente.setEnabled(false);
        JBSaveCliente.setEnabled(false);
        jBBajaAlta.setEnabled(false);
        jrbEstado.setEnabled(false);
        jrbEstado.setSelected(false);
        jpEstado.setVisible(false);
    }

    public void limpiarCampos() {
        JTDNI.setText("");
        JTApellidoCliente.setText("");
        JTNombreCliente.setText("");
        JTTelefonoCliente.setText("");
        JTDireccionCliente.setText("");
        JTContactoAltCliente.setText("");
        JTNumAltCliente.setText("");
        jrbEstado.setText("");
        jpEstado.setBackground(UIManager.getColor("Panel.background"));
    }

    public void wallpaper() {
        ImageIcon wallpaper = new ImageIcon("src/IMG/G.png");
        Icon i = new ImageIcon(wallpaper.getImage().getScaledInstance(
                this.getWidth(),
                this.getHeight(),
                Image.SCALE_DEFAULT));
        JFondo.setIcon(i);
        JFondo.setVerticalAlignment(JLabel.CENTER);
        JFondo.setHorizontalAlignment(JLabel.CENTER);
        JFondo.setVerticalTextPosition(JLabel.CENTER);
        JFondo.setHorizontalTextPosition(JLabel.CENTER);
    }

    private void botonIcon(boolean estado) {
        if (estado) {
            jBBajaAlta.setIcon(new ImageIcon(getClass().getResource("/Img/download.png")));
            jBBajaAlta.setText("Baja");
            jrbEstado.setText("Activo");
            jpEstado.setBackground(Color.GREEN);
        } else {
            jBBajaAlta.setIcon(new ImageIcon(getClass().getResource("/Img/active.png")));
            jBBajaAlta.setText("Alta");
            jrbEstado.setText("Inactivo");
            jpEstado.setBackground(Color.RED);
        }
    }

    public void eliminar() {
        try {
            int dni = Integer.parseInt(JTDNI.getText());
            Cliente c = clienteD.buscarClientePorDni(dni);
            int response = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar al cliente " + c.getApellido() + " " + c.getNombre() + "?", "Eliminar cliente", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                clienteD.eliminarCliente(c.getIdCliente());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener los datos");
        }

        limpiarCampos();
        desactivarCampos();
    }
}
