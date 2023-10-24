package Vistas;

import Entidades.Tratamiento;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarTratamiento extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private JDesktopPane escritorio;
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public ListarTratamiento(JDesktopPane escritorio) {
        initComponents();
        wallpaper();
        armarCabecera();
        cargarTabla();
        this.escritorio = escritorio;
    }

    public ListarTratamiento() {
        initComponents();
        wallpaper();
        armarCabecera();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTratamientos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        JBEditTratamiento = new javax.swing.JButton();
        JFondo = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Tratamientos");

        jTableTratamientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableTratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTratamientosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTratamientos);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JBEditTratamiento.setText("Editar");
        JBEditTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(JBEditTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(94, 94, 94))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEditTratamiento)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(JFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBEditTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditTratamientoActionPerformed
        seleccion();
    }//GEN-LAST:event_JBEditTratamientoActionPerformed

    private void jTableTratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTratamientosMouseClicked
        seleccion();
    }//GEN-LAST:event_jTableTratamientosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEditTratamiento;
    private javax.swing.JLabel JFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTratamientos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Tipo de tratamiento");
        modelo.addColumn("Precio");
        modelo.addColumn("Medicamento");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Activo");
        jTableTratamientos.setModel(modelo);
    }

    private void cargarTabla() {
        for (Tratamiento trat : Menu.tratamientoData.listarTratamiento()) {
            modelo.addRow(new Object[]{
                trat.getIdTratamiento(),
                trat.getTipoDeTratamiento(),
                trat.getPrecio(),
                trat.getMedicamento(),
                trat.getDescripcion(),
                trat.isActivo()
            });
        }
    }

    private void seleccion() {
        try {
            //Selecciono el tratamiento
            int filaSeleccionada = jTableTratamientos.getSelectedRow();
            int columnaId = 0;
            int idTratamiento = (int) jTableTratamientos.getValueAt(filaSeleccionada, columnaId);

            Tratamiento tratamiento = Menu.tratamientoData.buscarTratamiento(idTratamiento);

            //Genero la ventana de gestion pasandole el tratamiento
            GestionTratamiento trata = new GestionTratamiento(tratamiento, escritorio);
            escritorio.repaint();
            trata.setVisible(true);
            trata.isFocusable();
            escritorio.add(trata);
            escritorio.moveToFront(trata);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un tratamiento primero");
        }
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
