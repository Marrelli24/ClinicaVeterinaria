package Vistas;

import Entidades.Medicamento;
import Entidades.Tratamiento;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
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
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public GestionTratamiento(JDesktopPane escritorio) {
        initComponents();
        wallpaper();
        this.escritorio = escritorio;
    }

    public GestionTratamiento(Tratamiento trat, JDesktopPane escritorio) {
        initComponents();
        wallpaper();
        this.save = trat;
        this.escritorio = escritorio;
        guardarId(trat);

        //double precioFinal = trat.getMedicamento().getPrecio() + trat.getPrecio();
        JTDescripcionTratamiento.setText(trat.getDescripcion());
        JTPrecioTratamiento.setText(String.format("%.2f", trat.getPrecio()));
        JTTituloTratamiento.setText(trat.getTipoDeTratamiento());
        // JLPrecioMed.setText(String.format("%.2f", trat.getMedicamento().getPrecio()));
        //JLPrecioTotal.setText(String.format("%.2f", precioFinal));
        calculoTotal();

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
        JBReset = new javax.swing.JButton();
        JFondo = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Tratamientos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de tratamiento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descripcion:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Medicamento:");

        JBAddTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/tratamiento1.png"))); // NOI18N
        JBAddTratamiento.setText("Nuevo");
        JBAddTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBAddTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAddTratamientoActionPerformed(evt);
            }
        });

        JBEditTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/disk.png"))); // NOI18N
        JBEditTratamiento.setText("Guardar");
        JBEditTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBEditTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditTratamientoActionPerformed(evt);
            }
        });

        JBExitTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        JBExitTratamiento.setText("Salir");
        JBExitTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JBExitTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExitTratamientoActionPerformed(evt);
            }
        });

        JTPrecioTratamiento.setToolTipText("Utiliza un punto \".\"");
        JTPrecioTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPrecioTratamientoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTPrecioTratamientoKeyTyped(evt);
            }
        });

        JBAddMedicina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/anadir1.png"))); // NOI18N
        JBAddMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAddMedicinaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio med:");

        JLPrecioMed.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio final:");

        JLPrecioTotal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        JBListaMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/lista-de-verificacion1.png"))); // NOI18N
        JBListaMed.setText("Lista");
        JBListaMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListaMedActionPerformed(evt);
            }
        });

        JBReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/menos1.png"))); // NOI18N
        JBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JTTituloTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTPrecioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(JBAddMedicina)
                                .addGap(18, 18, 18)
                                .addComponent(JBReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBListaMed))
                            .addComponent(JTDescripcionTratamiento)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLPrecioMed, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBAddTratamiento)
                        .addGap(70, 70, 70)
                        .addComponent(JBEditTratamiento)
                        .addGap(65, 65, 65)
                        .addComponent(JBExitTratamiento)
                        .addGap(117, 117, 117)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTTituloTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(JTPrecioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JTDescripcionTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAddMedicina)
                    .addComponent(JBReset)
                    .addComponent(JBListaMed))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLPrecioMed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(JLPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBExitTratamiento)
                    .addComponent(JBEditTratamiento)
                    .addComponent(JBAddTratamiento))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExitTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExitTratamientoActionPerformed
        dispose();
    }//GEN-LAST:event_JBExitTratamientoActionPerformed

    private void JBEditTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditTratamientoActionPerformed
        edit();
        limpiar();
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
        listaMedicamento();
    }//GEN-LAST:event_JBListaMedActionPerformed

    private void JBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResetActionPerformed
        int indice = jComboBox1.getSelectedIndex();

        if (indice >= 0) {
            String mItem = jComboBox1.getSelectedItem().toString();
            String[] mId = mItem.split(","); // Divide el texto en subcadenas basadas en la coma
            String idToRemove = mId[0].trim();

            int response = JOptionPane.showConfirmDialog(null, "Confirme para eliminar: " + jComboBox1.getSelectedItem().toString(), "Aviso!", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                listaID.remove(idToRemove);
                comboMedicamentos();
                calculoTotal();
            }
        }


    }//GEN-LAST:event_JBResetActionPerformed

    private void JTPrecioTratamientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPrecioTratamientoKeyReleased
        calculoTotal();
    }//GEN-LAST:event_JTPrecioTratamientoKeyReleased

    private void JBAddTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAddTratamientoActionPerformed
        limpiar();
    }//GEN-LAST:event_JBAddTratamientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAddMedicina;
    private javax.swing.JButton JBAddTratamiento;
    private javax.swing.JButton JBEditTratamiento;
    private javax.swing.JButton JBExitTratamiento;
    private javax.swing.JButton JBListaMed;
    private javax.swing.JButton JBReset;
    private javax.swing.JLabel JFondo;
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
    // End of variables declaration//GEN-END:variables

    private void edit() {
        ArrayList<Medicamento> medi = new ArrayList<>();
        try {
            if (save != null) {

                save.setDescripcion(JTDescripcionTratamiento.getText());
                save.setPrecio(Double.parseDouble(JTPrecioTratamiento.getText()));
                save.setTipoDeTratamiento(JTTituloTratamiento.getText());
                for (String parte : listaID) {
                    int id = Integer.parseInt(parte);
                    medi.add(Menu.medicamentoData.buscarMedicamento(id));
                }
                save.setMedicamento(medi);
                Menu.tratamientoData.editarTratamiento(save);

            } else {

                Tratamiento t = new Tratamiento();
                t.setDescripcion(JTDescripcionTratamiento.getText());
                t.setPrecio(Double.parseDouble(JTPrecioTratamiento.getText()));
                t.setTipoDeTratamiento(JTTituloTratamiento.getText());
                for (String parte : listaID) {
                    int id = Integer.parseInt(parte);
                    medi.add(Menu.medicamentoData.buscarMedicamento(id));
                }
                t.setMedicamento(medi);
                Menu.tratamientoData.guardarTratamiento(t);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void comboMedicamentos() {
        try {
            jComboBox1.removeAllItems();
            //VAriable para el precio medicamento JLPrecioMed
            for (String parte : listaID) {
                int id = Integer.parseInt(parte);
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
        model.addColumn("Nombre");
        model.addColumn("Precio");

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
                int filaSeleccionada = table.getSelectedRow();

                if (filaSeleccionada >= 0) {
                    int id = (int) table.getValueAt(filaSeleccionada, 0);

                    if (!listaID.contains(id + "")) {
                        listaID.add(id + "");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya hay un medicamento del mismo tipo");
                    }

                    frame.setVisible(false);
                    comboMedicamentos();
                    calculoTotal();

                }
            }
        });
        frame.setVisible(true);

    }

    public void calculoTotal() {
        try {
            double totalM = 0;
            double total = 0;

            for (String parte : listaID) {
                int id = Integer.parseInt(parte);
                totalM = totalM + Menu.medicamentoData.buscarMedicamento(id).getPrecio();
            }
            if (!JTPrecioTratamiento.getText().isEmpty()) {
                total = Double.parseDouble(JTPrecioTratamiento.getText()) + totalM;
                JLPrecioTotal.setText("$" + total);
            }
            JLPrecioMed.setText("$" + totalM);

        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    public void guardarId(Tratamiento trat) {
        for (Medicamento m : trat.getMedicamento()) {
            listaID.add(m.getId() + "");
        }
        comboMedicamentos();
    }

    public void limpiar() {

        try {
            jComboBox1.removeAllItems();
            JTDescripcionTratamiento.setText("");
            JTPrecioTratamiento.setText("");
            JTTituloTratamiento.setText("");
            JLPrecioTotal.setText("");
            JLPrecioMed.setText("");

        } catch (Exception e) {
            System.out.println(e);
        }

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
