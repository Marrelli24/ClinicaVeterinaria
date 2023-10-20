package Vistas;

import Entidades.Medicamento;
import Entidades.Tratamiento;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionTratamiento extends javax.swing.JInternalFrame {

    Tratamiento save;
    private JDesktopPane escritorio;
    ArrayList<String> listaID = new ArrayList<>();

    public GestionTratamiento(JDesktopPane escritorio) {
        initComponents();
        this.escritorio = escritorio;
        //cargarCombo();
    }

    public GestionTratamiento(Tratamiento trat, JDesktopPane escritorio) {
        initComponents();
        this.save = trat;
        this.escritorio = escritorio;
        //cargarCombo();

        //Falta agregar medicina al comboBox
        double precioFinal = trat.getMedicamento().getPrecio() + trat.getPrecio();

        JTDescripcionTratamiento.setText(trat.getDescripcion());
        JTPrecioTratamiento.setText(String.format("%.2f", trat.getPrecio()));
        JTTituloTratamiento.setText(trat.getTipoDeTratamiento());
        JLPrecioMed.setText(String.format("%.2f", trat.getMedicamento().getPrecio()));
        JLPrecioTotal.setText(String.format("%.2f", precioFinal));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBAddTratamiento = new javax.swing.JButton();
        JBEditTratamiento = new javax.swing.JButton();
        JBExitTratamiento = new javax.swing.JButton();
        JTTituloTratamiento = new javax.swing.JTextField();
        JTPrecioTratamiento = new javax.swing.JTextField();
        JTDescripcionTratamiento = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        JBAddMedicina = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JLPrecioMed = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLPrecioTotal = new javax.swing.JLabel();
        JBListaMed = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JLABELLISTA = new javax.swing.JLabel();
        JBReset = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Tratamientos");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de tratamiento:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descripcion:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Medicamento:");

        JBAddTratamiento.setText("Nuevo");

        JBEditTratamiento.setText("Guardar");
        JBEditTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditTratamientoActionPerformed(evt);
            }
        });

        JBExitTratamiento.setText("Salir");
        JBExitTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExitTratamientoActionPerformed(evt);
            }
        });

        JTPrecioTratamiento.setToolTipText("Utiliza un punto \".\"");
        JTPrecioTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTPrecioTratamientoKeyTyped(evt);
            }
        });

        JBAddMedicina.setText("+");
        JBAddMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAddMedicinaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio med:");

        JLPrecioMed.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        JLPrecioMed.setText("$");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio final:");

        JLPrecioTotal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        JLPrecioTotal.setText("$");

        JBListaMed.setText("List");
        JBListaMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListaMedActionPerformed(evt);
            }
        });

        jLabel8.setText("Lista de medicamentos:");

        JLABELLISTA.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        JBReset.setText("Reset medicamentos");
        JBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTDescripcionTratamiento)
                            .addComponent(JTTituloTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTPrecioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBAddMedicina)
                                .addGap(18, 18, 18)
                                .addComponent(JBListaMed))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JLPrecioTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLPrecioMed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(JBAddTratamiento)
                                .addGap(18, 18, 18)
                                .addComponent(JBEditTratamiento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(JBReset)
                                .addGap(114, 114, 114)
                                .addComponent(JBExitTratamiento))
                            .addComponent(JLABELLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTTituloTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTPrecioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTDescripcionTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAddMedicina)
                    .addComponent(JBListaMed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPrecioMed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JLPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLABELLISTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBReset)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBAddTratamiento)
                        .addComponent(JBEditTratamiento)
                        .addComponent(JBExitTratamiento)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExitTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExitTratamientoActionPerformed
        dispose();
    }//GEN-LAST:event_JBExitTratamientoActionPerformed

    private void JBEditTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditTratamientoActionPerformed
        edit();
    }//GEN-LAST:event_JBEditTratamientoActionPerformed

    private void JTPrecioTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPrecioTratamientoKeyTyped
        if ((Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) && (evt.getKeyChar() != '.')) {
            evt.consume();
        }
        String regex = "^([^,]*,){0,1}(\\d{0,7}(\\.\\d{0,2})?){0,1}$"; //CHEQUEA QUE SOLO ESTE UNA COMA Y QUE ESTE LIMITADO EL NUMERO A INGRESAR POR 3numeros COMA Y 3 DECIMALES

        if (!(JTPrecioTratamiento.getText() + evt.getKeyChar()).matches(regex)) {
            evt.consume();

        }    }//GEN-LAST:event_JTPrecioTratamientoKeyTyped

    private void JBAddMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAddMedicinaActionPerformed
        AddMed add = new AddMed();

        add.setVisible(true);
        add.isFocusable();
        escritorio.repaint();
        escritorio.add(add);
        escritorio.moveToFront(add);

    }//GEN-LAST:event_JBAddMedicinaActionPerformed

    private void JBListaMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListaMedActionPerformed
        if (listaID.isEmpty()) {
            listaMedicamento();
        } else {
            listaMedicamento();
            comboMedicamentos();
        }

    }//GEN-LAST:event_JBListaMedActionPerformed

    private void JBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResetActionPerformed
        JLABELLISTA.setText("");
    }//GEN-LAST:event_JBResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAddMedicina;
    private javax.swing.JButton JBAddTratamiento;
    private javax.swing.JButton JBEditTratamiento;
    private javax.swing.JButton JBExitTratamiento;
    private javax.swing.JButton JBListaMed;
    private javax.swing.JButton JBReset;
    private javax.swing.JLabel JLABELLISTA;
    private javax.swing.JLabel JLPrecioMed;
    private javax.swing.JLabel JLPrecioTotal;
    private javax.swing.JTextField JTDescripcionTratamiento;
    private javax.swing.JTextField JTPrecioTratamiento;
    private javax.swing.JTextField JTTituloTratamiento;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private void edit() {
        try {
            if (save != null) {
                Tratamiento match = Menu.tratamientoData.buscarTratamiento(save.getIdTratamiento());
                match.setDescripcion(JTDescripcionTratamiento.getText());
                match.setPrecio(Double.parseDouble(JTPrecioTratamiento.getText()));
                match.setTipoDeTratamiento(JTTituloTratamiento.getText());
                match.setIdTratamiento(save.getIdTratamiento());
                Menu.tratamientoData.editarTratamiento(match);

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void comboMedicamentos() {
        try {
            System.out.println("tamanio lista: " + listaID.size());
            int tamanio = listaID.size() + 1;
            for (int i = 0; i < tamanio; i++) {
                String partes = listaID.get(i);
                System.out.println("partes: " + partes);
                int id = Integer.parseInt(partes);
                System.out.println("Este es medicamento " + Menu.medicamentoData.buscarMedicamento(id) + "");
                jComboBox1.addItem(Menu.medicamentoData.buscarMedicamento(id) + "");
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    public void cargarCombo() {
        for (Medicamento m : Menu.medicamentoData.listarMedicamento()) {
            jComboBox1.addItem(m.getNombre());
        }
    }

    public void listaMedicamento() {

        //Se crea la ventana
        JFrame frame = new JFrame("Lista de medicamentos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        //Configuraciones de tabla
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

        for (Medicamento m : Menu.medicamentoData.listarMedicamento()) {
            model.addRow(new Object[]{m.getId(),
                m.getNombre(),
                m.getPrecio(),});
        }

        frame.add(new JScrollPane(table));

        // Se agrega evento de click en el item de la fila seleccionada
        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                boolean repeat = false;

                int filaSeleccionada = table.getSelectedRow();

                if (filaSeleccionada >= 0) {
                    int id = (int) table.getValueAt(filaSeleccionada, 0);
                    for (Medicamento m : Menu.medicamentoData.listarMedicamento()) {
                        if (m.getId() == id) {
                            //SI la lista esta vacia, ingreso el primer id
                            if (listaID.isEmpty()) {
                                listaID.add(m.getId() + "");
                            } else {
                                // Si ingreso un medicamento repetido doy error
                                // Itera a través de las subcadenas y muestra los IDs
                                for (String parte : listaID) {
                                    int idM = Integer.parseInt(parte);

                                    if (m.getId() == idM) {
                                        repeat = true;
                                        JOptionPane.showMessageDialog(null, "Ya hay un medicamento del mismo tipo");
                                        break;
                                    }

                                }
                                //Si ingreso un medicamento que no esta repetido, lo agrego a mi lista
                                if (!repeat) {
                                    listaID.add(m.getId() + "");
                                }
                            }
                            frame.setVisible(false);
                            break;
                        }
                    }
                }
            }
        });
        frame.setVisible(true);
    }

}
