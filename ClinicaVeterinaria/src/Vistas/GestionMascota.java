package Vistas;

import AccesoADatos.Conexion;
import Entidades.Cliente;
import Entidades.Mascota;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionMascota extends javax.swing.JInternalFrame {

    DefaultComboBoxModel<Mascota> modelo = new DefaultComboBoxModel<>();

    public GestionMascota() {
        initComponents();
        activarCampos();
        desactivarCampos();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGrupo = new javax.swing.ButtonGroup();
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
        jBnevaMascota = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Gestión Mascota");

        jLabel2.setText("DNI del cliente");

        jLnombreYapellido.setText("   ");

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

        jBnevaMascota.setText("Nueva mascota");
        jBnevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnevaMascotaActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");

        jTpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpesoActionPerformed(evt);
            }
        });

        bGrupo.add(jRBmacho);
        jRBmacho.setText("Macho");
        jRBmacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmachoActionPerformed(evt);
            }
        });

        bGrupo.add(jRBhembra);
        jRBhembra.setText("Hembra");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBnuevoCliente.setText("Nuevo Cliente");

        jLabel10.setText("Peso:");

        jLabel3.setText("Fecha de nacimiento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBbuscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBnevaMascota)
                                .addGap(47, 47, 47)
                                .addComponent(jBguardar)
                                .addGap(50, 50, 50)
                                .addComponent(jBeliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbListaMascotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLnombreYapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTraza, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTalias)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jTcolorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTpesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBsalir)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBnuevoCliente)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(26, 26, 26)
                                        .addComponent(jRBmacho)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBhembra)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jBnuevoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLnombreYapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jcbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jTalias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBmacho)
                            .addComponent(jRBhembra))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTcolorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTespecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jTraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTpesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnevaMascota)
                            .addComponent(jBguardar)
                            .addComponent(jBeliminar)
                            .addComponent(jBsalir))
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnevaMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnevaMascotaActionPerformed

    private void jRBmachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmachoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBmachoActionPerformed

    private void jTpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesoActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        if (jTdni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío");
        } else {
            buscarDni();
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jcbListaMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMascotasActionPerformed
        if (jcbListaMascotas.getSelectedIndex() != 0) {
            cargarDatos();
        }
    }//GEN-LAST:event_jcbListaMascotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupo;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnevaMascota;
    private javax.swing.JButton jBnuevoCliente;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDCfechaNacimiento;
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
                jLnombreYapellido.setText("Dueño: " + cliente.getNombre() + " " + cliente.getApellido());
                if (cliente != null) {
                    cargarCombo();
                    for (Mascota mascota : Menu.mascotaData.buscarMascotaPorCliente(cliente.getIdCliente())) {
                        jcbListaMascotas.addItem(mascota.getIdMascota() + ", " + mascota.getAlias());
                    }
                    activarCampos();
                }
            } else {
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
            
            jTalias.setText(mascota.getAlias());
            jTespecie.setText(mascota.getEspecie());
            jTcolorPelo.setText(mascota.getColorPelo());
            jTraza.setText(mascota.getRaza());
            jTpeso.setText(mascota.getPesoActual() + "");
            jTpesoPromedio.setText(mascota.getPesoPromedio() + "");
            jDCfechaNacimiento.setDate(Date.from(mascota.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            //CAMBIAR A MACHO Y HEMBRA
            bGrupo.clearSelection();
            if (mascota.getSexo().equalsIgnoreCase("masculino")){
                jRBmacho.setSelected(true);
            }else{
                jRBhembra.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("No");
        }}

    

    public void listaClientes() {
        JFrame frame = new JFrame("Lista de Clientes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        jTalias.setText("");
        jTespecie.setText("");
        jTraza.setText("");
        jTpeso.setText("");
        jTpesoPromedio.setText("");
        jTcolorPelo.setText("");
        jDCfechaNacimiento.setDate(null);
        jRBmacho.setSelected(false);
        jRBmacho.setText("");
        jRBhembra.setSelected(false);
        jRBhembra.setText("");

        //jpEstado.setBackground(UIManager.getColor("Panel.background"));
    }

    private void activarCampos() {

        jcbListaMascotas.setEnabled(true);
        jTalias.setEnabled(true);
        jTespecie.setEnabled(true);
        jTraza.setEnabled(true);
        jTcolorPelo.setEnabled(true);
        jDCfechaNacimiento.setEnabled(true);
        jRBmacho.setEnabled(true);
        jRBhembra.setEnabled(true);
    }

    public void cargarCombo() {
        jcbListaMascotas.addItem("NUEVA MASCOTA");
    }
}
