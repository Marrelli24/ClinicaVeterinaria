package Vistas;

import Entidades.Cliente;
import Entidades.Mascota;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionMascota extends javax.swing.JInternalFrame {

    private JDesktopPane escritorio;
    DefaultComboBoxModel<Mascota> modelo = new DefaultComboBoxModel<>();
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public GestionMascota() {
        initComponents();
        wallpaper();
        activarCampos();
        desactivarCampos();
        cargarCombo();
        limpiar();
    }

    public GestionMascota(JDesktopPane escritorio) {
        initComponents();
        wallpaper();
        activarCampos();
        desactivarCampos();
        cargarCombo();
        limpiar();
        this.escritorio = escritorio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGrupo = new javax.swing.ButtonGroup();
        JFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLnombreYapellido = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jcbListaMascotas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jBnuevaMascota = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jTalias = new javax.swing.JTextField();
        jTraza = new javax.swing.JTextField();
        jTcolorPelo = new javax.swing.JTextField();
        jTespecie = new javax.swing.JTextField();
        jTpeso = new javax.swing.JTextField();
        jRBmacho = new javax.swing.JRadioButton();
        jRBhembra = new javax.swing.JRadioButton();
        jBbuscar = new javax.swing.JButton();
        jBnuevoCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTpesoPromedio = new javax.swing.JTextField();
        jDCfechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLidMascota = new javax.swing.JLabel();
        jBlistarClientes = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Gestión Mascota");

        jLabel2.setText("DNI del cliente");

        jLnombreYapellido.setText("   ");

        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });

        jcbListaMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaMascotasActionPerformed(evt);
            }
        });

        jLabel4.setText("Alias:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Raza:");

        jLabel7.setText("Especie:");

        jLabel8.setText("Color:");

        jLabel9.setText("Peso promedio:");

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBnuevaMascota.setText("Nueva mascota");
        jBnuevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevaMascotaActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        bGrupo.add(jRBmacho);
        jRBmacho.setText("Macho");

        bGrupo.add(jRBhembra);
        jRBhembra.setText("Hembra");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBnuevoCliente.setText("Nuevo Cliente");
        jBnuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Peso:");

        jLabel3.setText("Fecha de nacimiento:");

        jLabel11.setText("ID:");

        jBlistarClientes.setText("Listar Cliente");
        jBlistarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlistarClientesActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLnombreYapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jTalias, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLidMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(jRBmacho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBhembra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbListaMascotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jBlistarClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jBnuevoCliente))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jBsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBnuevaMascota))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTraza, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTcolorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBguardar)
                                .addGap(39, 39, 39)
                                .addComponent(jBeliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTespecie, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(jTpesoPromedio))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar)
                    .addComponent(jBnuevoCliente)
                    .addComponent(jBlistarClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnombreYapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTalias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jRBmacho)
                        .addComponent(jRBhembra))
                    .addComponent(jLidMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTcolorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3))
                    .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jTespecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTpesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevaMascota)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir)
                    .addComponent(jBLimpiar))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevaMascotaActionPerformed
        resetearCampos();

    }//GEN-LAST:event_jBnuevaMascotaActionPerformed

    //BOTÓN SALIR
    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    //BOTÓN BUSCAR
    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        buscarDni();
    }//GEN-LAST:event_jBbuscarActionPerformed

    //LISTA DE MASCOTAS --> CARGAR DATOS
    private void jcbListaMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMascotasActionPerformed
        if (jcbListaMascotas.getSelectedIndex() != 0) {
            cargarDatos();
        }
    }//GEN-LAST:event_jcbListaMascotasActionPerformed

    //BOTÓN GUARDAR
    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        jTalias.setText(validar(jTalias.getText()));
        jTcolorPelo.setText(validar(jTcolorPelo.getText()));
        jTraza.setText(validar(jTraza.getText()));
        jTespecie.setText(validar(jTespecie.getText()));

        if (jTalias.getText().isEmpty() || jTcolorPelo.getText().isEmpty() || jDCfechaNacimiento.toString().isEmpty() || jTraza.getText().isEmpty() || jTespecie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
        } else {
            try {
                String alias = jTalias.getText();
                String colorPelo = jTcolorPelo.getText();
                String raza = jTraza.getText();
                String especie = jTespecie.getText();
                String sexo;
                double peso = Double.parseDouble(jTpeso.getText());
                double pesoPromedio = Double.parseDouble(jTpesoPromedio.getText());
                LocalDate fechaNac = jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                if (jRBmacho.isSelected()) {
                    sexo = "macho";
                } else {
                    sexo = "Hembra";
                }
                Cliente cliente = new Cliente();
                cliente = Menu.clienteData.buscarClientePorDni(Integer.parseInt(jTdni.getText()));
                Mascota mascota = new Mascota(alias, sexo, especie, raza, colorPelo, peso, pesoPromedio, fechaNac,cliente);
               
                if (jLidMascota.getText().isEmpty()) {
                    Menu.mascotaData.guardarMascota(mascota);
                } else if (!jLidMascota.getText().isEmpty()) {
                    int id = Integer.parseInt(jLidMascota.getText());
                    mascota.setIdMascota(id);
                    Menu.mascotaData.editarMascota(mascota);
                } else {
                    JOptionPane.showMessageDialog(null, "Error en la operación");
                }
                limpiar();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese los valores correctos en cada campo");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha correctamente");
            }
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if (!jTdni.getText().isEmpty()) {
            int dni = Integer.parseInt(jTdni.getText());
            int id = Integer.parseInt(jLidMascota.getText());
            int response;

            response = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar a la mascota?", "Eliminar", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                Menu.mascotaData.eliminarMascota(id);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar a la mascota");
            }

            resetearCampos();
            desactivarCampos();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBnuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoClienteActionPerformed
        GestionCliente gest = new GestionCliente();
        escritorio.repaint();
        gest.setVisible(true);
        gest.isFocusable();
        escritorio.add(gest);
        escritorio.moveToFront(gest);
    }//GEN-LAST:event_jBnuevoClienteActionPerformed

    private void jBlistarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlistarClientesActionPerformed
        listaClientes();
    }//GEN-LAST:event_jBlistarClientesActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTdniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondo;
    private javax.swing.ButtonGroup bGrupo;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlistarClientes;
    private javax.swing.JButton jBnuevaMascota;
    private javax.swing.JButton jBnuevoCliente;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDCfechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLidMascota;
    private javax.swing.JLabel jLnombreYapellido;
    private javax.swing.JRadioButton jRBhembra;
    private javax.swing.JRadioButton jRBmacho;
    private javax.swing.JTextField jTalias;
    private javax.swing.JTextField jTcolorPelo;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTespecie;
    private javax.swing.JTextField jTpeso;
    private javax.swing.JTextField jTpesoPromedio;
    private javax.swing.JTextField jTraza;
    private javax.swing.JComboBox<String> jcbListaMascotas;
    // End of variables declaration//GEN-END:variables

    private void buscarDni() {
        try {
            if (!jTdni.getText().isEmpty()) {
                jcbListaMascotas.removeAllItems();
                Cliente cliente = new Cliente();
                cliente = Menu.clienteData.buscarClientePorDni(Integer.parseInt(jTdni.getText()));
                if (cliente != null) {
                    jLnombreYapellido.setText("Dueño: " + cliente.getNombre() + " " + cliente.getApellido());
                    cargarCombo();
                    for (Mascota mascota : Menu.mascotaData.buscarMascotaPorCliente(cliente.getIdCliente())) {
                        jcbListaMascotas.addItem(mascota.getIdMascota() + ", " + mascota.getAlias());
                    }
                    activarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "El DNI no se encuentra en la base de datos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío");
                jcbListaMascotas.removeAllItems();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DNI no encontrado");
        }
    }

    private void cargarDatos() {
        try {
            String[] partesM = jcbListaMascotas.getSelectedItem().toString().split(",");
            int codigoM = Integer.parseInt(partesM[0]);
            Mascota mascota = new Mascota();
            mascota = Menu.mascotaData.buscarMascotaPorId(codigoM);

            jLidMascota.setText(mascota.getIdMascota() + "");
            jTalias.setText(mascota.getAlias());
            jTespecie.setText(mascota.getEspecie());
            jTcolorPelo.setText(mascota.getColorPelo());
            jTraza.setText(mascota.getRaza());
            jTpeso.setText(mascota.getPesoActual() + "");
            jTpesoPromedio.setText(mascota.getPesoPromedio() + "");
            jDCfechaNacimiento.setDate(Date.from(mascota.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            //CAMBIAR A MACHO Y HEMBRA
            bGrupo.clearSelection();
            if (mascota.getSexo().equalsIgnoreCase("macho")) {
                jRBmacho.setSelected(true);
            } else {
                jRBhembra.setSelected(true);
            }
        } catch (Exception e) {
        }
    }

    public void listaClientes() {
        JFrame frame = new JFrame("Lista de Clientes");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        model.addColumn("ID");
        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Nombre Alternativo");

        JTable table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);

        for (Cliente cliente : Menu.clienteData.listarClientes()) {
            model.addRow(new Object[]{cliente.getIdCliente(),
                cliente.getDni(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getNombreAlterno()});
        }

        frame.add(new JScrollPane(table));
        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    int idCliente = (int) table.getValueAt(filaSeleccionada, 0);
                    for (Cliente cliente : Menu.clienteData.listarClientes()) {
                        if (cliente.getIdCliente() == idCliente) {
                            jTdni.setText(cliente.getDni() + "");
                            buscarDni();
                            frame.setVisible(false);
                            break;
                        }
                    }
                }
            }
        });
        frame.setVisible(true);
    }

    private void desactivarCampos() {

        jBguardar.setEnabled(false);
        jBeliminar.setEnabled(false);
        jTalias.setEnabled(false);
        jTespecie.setEnabled(false);
        jTraza.setEnabled(false);
        jTpeso.setEnabled(false);
        jTcolorPelo.setEnabled(false);
        jTpesoPromedio.setEnabled(false);
        jDCfechaNacimiento.setEnabled(false);
        jRBmacho.setEnabled(false);
        jRBhembra.setEnabled(false);
    }

    private void resetearCampos() {
        jLidMascota.setText("");
        jTalias.setText("");
        jTespecie.setText("");
        jTraza.setText("");
        jTpeso.setText("0");
        jTpesoPromedio.setText("0");
        jTcolorPelo.setText("");
        jDCfechaNacimiento.setDate(null);
        jRBmacho.setSelected(true);
        jcbListaMascotas.setSelectedIndex(0);
    }

    public void limpiar() {
        resetearCampos();
        jcbListaMascotas.removeAllItems();
        jTdni.setText("");
        cargarCombo();
        desactivarCampos();
    }

    private void activarCampos() {

        jcbListaMascotas.setEnabled(true);
        jTalias.setEnabled(true);
        jTespecie.setEnabled(true);
        jTraza.setEnabled(true);
        jTcolorPelo.setEnabled(true);
        jDCfechaNacimiento.setEnabled(true);
        jDCfechaNacimiento.getDateEditor().setEnabled(false);
        jRBmacho.setEnabled(true);
        jRBhembra.setEnabled(true);
        jBguardar.setEnabled(true);
    }

    public void cargarCombo() {
        jcbListaMascotas.addItem("NUEVA MASCOTA");
    }

    public static String validar(String nombre) {
        String validado = "";
        String regex = "^[A-Za-z\\s]+$";

        if (Pattern.matches(regex, nombre)) {
            validado = nombre;
        }
        return validado;
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
}
