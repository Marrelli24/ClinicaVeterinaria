package Vistas;

import Entidades.Medicamento;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ListarCobros extends javax.swing.JInternalFrame {

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

    public ListarCobros() {
        initComponents();
        wallpaper();
        armarCabecera();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPagos = new javax.swing.ButtonGroup();
        jrbArancelado = new javax.swing.JRadioButton();
        jrbNoArancelado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        JFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        bgPagos.add(jrbArancelado);
        jrbArancelado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jrbArancelado.setText("Arancelado");
        jrbArancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAranceladoActionPerformed(evt);
            }
        });

        bgPagos.add(jrbNoArancelado);
        jrbNoArancelado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jrbNoArancelado.setText("No arancelado");
        jrbNoArancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoAranceladoActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Cobros");

        bgPagos.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton1.setText("Todos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbArancelado)
                        .addGap(18, 18, 18)
                        .addComponent(jrbNoArancelado)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbNoArancelado)
                            .addComponent(jrbArancelado)
                            .addComponent(jRadioButton1)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbAranceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAranceladoActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jrbAranceladoActionPerformed

    private void jrbNoAranceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoAranceladoActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jrbNoAranceladoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       llenarTabla();
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondo;
    private javax.swing.ButtonGroup bgPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbArancelado;
    private javax.swing.JRadioButton jrbNoArancelado;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables

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

    public void armarCabecera() {
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        modelo.addColumn("IDV");
        modelo.addColumn("Cliente");
        modelo.addColumn("Mascota");
        modelo.addColumn("Fecha de Visita");
        modelo.addColumn("Detalle");
        modelo.addColumn("Tratamiento");
        modelo.addColumn("Precio");

        jtLista.setModel(modelo);
        jtLista.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        jtLista.getColumnModel().getColumn(0).setPreferredWidth(30);    
        jtLista.getColumnModel().getColumn(1).setPreferredWidth(140);
        jtLista.getColumnModel().getColumn(2).setPreferredWidth(80);
        jtLista.getColumnModel().getColumn(3).setPreferredWidth(80);
        jtLista.getColumnModel().getColumn(5).setPreferredWidth(60);
    }

    public void llenarTabla() {
        borraFilas();
        if (jrbArancelado.isSelected()) {
            for (Visita visita : Menu.visitaData.listarVisita()) {
                if (visita.isPago()) {
                    forRepetido(visita);
                }
            }
        } else if (jrbNoArancelado.isSelected()) {
            for (Visita visita : Menu.visitaData.listarVisita()) {
                if (!visita.isPago()) {
                    forRepetido(visita);
                }
            }
        } else {
            for (Visita visita : Menu.visitaData.listarVisita()) {
                forRepetido(visita);
            }
        }
    }

    public void forRepetido(Visita visita) {
        modelo.addRow(new Object[]{visita.getIdVisita(),
            visita.getMascota().getCliente().getApellido() + " " + visita.getMascota().getCliente().getNombre(),
            visita.getMascota().getAlias(),
            visita.getFechaVisita(),
            visita.getDetalle(),
            visita.getTratamiento().getTipoDeTratamiento(),
            precioTotal(visita.getTratamiento())});

    }

    private void borraFilas() {
        int f = jtLista.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    public double precioTotal(Tratamiento tratamiento) {
        double precioM = 0;
        for (Medicamento Medicamneto : tratamiento.getMedicamento()) {
            precioM = precioM + Medicamneto.getPrecio();
        }
        double precioTotal = tratamiento.getPrecio() + precioM;
        return precioTotal;
    }
}
