package Vistas;

import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ListarVisitas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public ListarVisitas() {
        initComponents();
        wallpaper();
        armarCabecera();
        cargarComboTratamiento();
        cargarVisitas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbListaMascotas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbTratamiento = new javax.swing.JComboBox<>();
        jlCliente = new javax.swing.JLabel();
        jbListaClientes = new javax.swing.JButton();
        JFondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Dni del Cliente:");

        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jLabel2.setText("Mascota:");

        jcbListaMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaMascotasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Lista de Visitas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtLista);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Tratamiento:");

        jcbTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTratamientoActionPerformed(evt);
            }
        });

        jlCliente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbListaClientes.setText("Clientes");
        jbListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jbListaClientes)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(171, 171, 171)
                                    .addComponent(jbSalir))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(210, 210, 210)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbListaClientes))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jbSalir)
                .addGap(8, 8, 8))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyPressed
        jtDni.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscarDni();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscarDni();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscarDni();
            }
        });
    }//GEN-LAST:event_jtDniKeyPressed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbListaMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMascotasActionPerformed
        cargarVisitas();
    }//GEN-LAST:event_jcbListaMascotasActionPerformed

    private void jcbTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTratamientoActionPerformed
        cargarVisitas();
    }//GEN-LAST:event_jcbTratamientoActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jbListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaClientesActionPerformed
        listaClientes();
    }//GEN-LAST:event_jbListaClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbListaClientes;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbListaMascotas;
    private javax.swing.JComboBox<String> jcbTratamiento;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        modelo.addColumn("ID Visita");
        modelo.addColumn("ID Mascota");
        modelo.addColumn("Alias");
        modelo.addColumn("Fecha de Visita");
        modelo.addColumn("Detalle");
        modelo.addColumn("Peso");
        modelo.addColumn("Tratamiento");
        jtLista.setModel(modelo);
        jtLista.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        jtLista.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtLista.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jtLista.getColumnModel().getColumn(1).setPreferredWidth(40);
        jtLista.getColumnModel().getColumn(2).setPreferredWidth(40);
        jtLista.getColumnModel().getColumn(5).setPreferredWidth(30);
    }

    public void cargarVisitas() {
        borraFilas();
        int idMascota = 0;
        int idTratamiento = 0;
        boolean nulo = true;
        // Obtiene el id de mascota y el id del tratamiento

        if (jcbListaMascotas.getItemCount() > 0 && jcbListaMascotas.getSelectedIndex() != 0) {
            String[] comboBoxM = jcbListaMascotas.getSelectedItem().toString().split(",");
            idMascota = Integer.parseInt(comboBoxM[0].trim());
        }
        if (jcbTratamiento.getItemCount() > 0 && jcbTratamiento.getSelectedIndex() != 0) {
            String[] comboBoxT = jcbTratamiento.getSelectedItem().toString().split(",");
            idTratamiento = Integer.parseInt(comboBoxT[0].trim());
        }
        if (!jtDni.getText().isEmpty()) {
            if (Menu.clienteData.buscarClientePorDni(Integer.parseInt(jtDni.getText())) == null) {
                nulo = true;
            } else {
                nulo = false;
            }
        }
        // Busca segun la opciones seleccionada y completadas para llenar la tabla

        if (jtDni.getText().isEmpty() && jcbTratamiento.getSelectedIndex() == 0 || nulo && jcbTratamiento.getSelectedIndex() == 0) {
            // Caso 1: DNI vacío y Tratamiento no seleccionado            
            for (Visita visita : Menu.visitaData.listarVisita()) {
                forRepetido(visita);
            }
        } else if (jcbListaMascotas.getSelectedIndex() == 0 && jcbTratamiento.getSelectedIndex() == 0) {
            // Caso 2: Lista Mascotas y Tratamiento no seleccionados
            for (Visita visita : Menu.visitaData.buscarVisitaPorCliente(Menu.clienteData.buscarClientePorDni(Integer.parseInt(jtDni.getText())).getIdCliente())) {
                forRepetido(visita);
            }
        } else if (jcbListaMascotas.getSelectedIndex() == 0 && jcbTratamiento.getSelectedIndex() != 0) {
            // Caso 3: Lista de Mascotas seleccionada, Tratamiento no seleccionado
            for (Visita visita : Menu.visitaData.buscarVisitaPorCliente(Menu.clienteData.buscarClientePorDni(Integer.parseInt(jtDni.getText())).getIdCliente())) {
                if (visita.getTratamiento().getIdTratamiento() == idTratamiento) {
                    forRepetido(visita);
                }
            }
        } else if (jcbListaMascotas.getSelectedIndex() != -1 && jcbTratamiento.getSelectedIndex() == 0) {
            // Caso 3: Lista de Mascotas seleccionada, Tratamiento no seleccionado
            for (Visita visita : Menu.visitaData.buscarVisitaPorMascota(idMascota)) {
                forRepetido(visita);
            }
        } else if (jcbListaMascotas.getSelectedIndex() != -1 && jcbTratamiento.getSelectedIndex() != 0) {
            // Caso 4: Lista de Mascotas seleccionada y Tratamiento seleccionado
            for (Visita visita : Menu.visitaData.buscarVisitaPorMascota(idMascota)) {
                if (visita.getTratamiento().getIdTratamiento() == idTratamiento) {
                    forRepetido(visita);
                }
            }
        } else if (jcbTratamiento.getSelectedIndex() > 0) {
            // Caso 5: Tratamiento seleccionado, otras opciones no seleccionadas         
            for (Visita visita : Menu.visitaData.buscarVisitaPorTratamiento(idTratamiento)) {
                forRepetido(visita);
            }
        }

    }

    private void buscarDni() {
        if (!jtDni.getText().isEmpty()) {
            jcbListaMascotas.removeAllItems();
            jlCliente.setText("CLIENTE NO ENCONTRADO");
            labelCliente();
            Cliente cliente = new Cliente();
            cliente = Menu.clienteData.buscarClientePorDni(Integer.parseInt(jtDni.getText()));
            if (cliente != null) {
                jlCliente.setText(cliente.getApellido() + " " + cliente.getNombre());
                jcbListaMascotas.addItem("TODAS");
                for (Mascota mascota : Menu.mascotaData.buscarMascotaPorCliente(cliente.getIdCliente())) {
                    jcbListaMascotas.addItem(mascota.getIdMascota() + ", " + mascota.getAlias());
                }
                cargarVisitas();
            }
        }
    }

    public void cargarComboTratamiento() {
        jcbTratamiento.addItem("TODOS");
        for (Tratamiento tratamiento : Menu.tratamientoData.listarTratamiento()) {
            jcbTratamiento.addItem(tratamiento.getIdTratamiento() + ", " + tratamiento.getTipoDeTratamiento());
        }
    }

    public void forRepetido(Visita visita) {
        modelo.addRow(new Object[]{visita.getIdVisita(),
            visita.getMascota().getIdMascota(),
            visita.getMascota().getAlias(),
            visita.getFechaVisita(),
            visita.getDetalle(),
            visita.getPeso(),
            visita.getTratamiento().getTipoDeTratamiento()});
    }

    private void borraFilas() {
        int f = jtLista.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void labelCliente() {
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Comprobar si el texto es igual a "CLIENTE NO ENCONTRADO"
                if ("CLIENTE NO ENCONTRADO".equals(jlCliente.getText())) {
                    jlCliente.setText(""); // Borrar el texto del JLabel
                } else {
                    // Detener el temporizador
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        // Iniciar el temporizador
        timer.setRepeats(false); // Para que solo se ejecute una vez
        timer.start();
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
        model.addColumn("Apellido");
        model.addColumn("Nombre");
        model.addColumn("DNI");
        model.addColumn("Nombre Alternativo");

        JTable table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);

        for (Cliente cliente : Menu.clienteData.listarClientes()) {
            model.addRow(new Object[]{cliente.getIdCliente(),
                cliente.getApellido(),
                cliente.getNombre(),
                cliente.getDni(),
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
                            jtDni.setText(cliente.getDni() + "");
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

    public void wallpaper() {
        ImageIcon wallpaper = new ImageIcon("src/IMG/L.png");
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
