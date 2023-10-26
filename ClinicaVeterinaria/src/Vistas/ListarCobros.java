package Vistas;

import Entidades.Factura;
import Entidades.Medicamento;
import Entidades.Tratamiento;
import Entidades.Visita;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ListarCobros extends javax.swing.JInternalFrame {

    private JDesktopPane escritorio;
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

    public ListarCobros(JDesktopPane escritorio) {
        initComponents();
        wallpaper();
        armarCabecera();
        llenarTabla();
        this.escritorio = escritorio;
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
        jbGenerarPdf = new javax.swing.JButton();

        bgPagos.add(jrbArancelado);
        jrbArancelado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jrbArancelado.setText("Arancelado");
        jrbArancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAranceladoActionPerformed(evt);
            }
        });

        bgPagos.add(jrbNoArancelado);
        jrbNoArancelado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Lista de cobros");

        bgPagos.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton1.setText("Todos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jbGenerarPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/archivo-pdf1.png"))); // NOI18N
        jbGenerarPdf.setText("Generar PDF");
        jbGenerarPdf.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbGenerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jRadioButton1)
                                .addGap(36, 36, 36)
                                .addComponent(jrbArancelado)))
                        .addGap(16, 16, 16)
                        .addComponent(jrbNoArancelado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGenerarPdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jrbArancelado)
                    .addComponent(jrbNoArancelado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGenerarPdf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 441, Short.MAX_VALUE)
                    .addComponent(JFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jbGenerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarPdfActionPerformed
        select();
    }//GEN-LAST:event_jbGenerarPdfActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondo;
    private javax.swing.ButtonGroup bgPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGenerarPdf;
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

    public void borraFilas() {
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

    public void select() {
        Factura factura = new Factura();
        if (jtLista.getSelectedRow() > -1) {
            int fila = jtLista.getSelectedRow();
            int idVisita = Integer.parseInt(jtLista.getValueAt(fila, 0).toString());
            factura = Menu.facturaData.buscarFacturaPorIDVisita(idVisita);
            Pdf pdf = new Pdf(factura);
            escritorio.repaint();
            pdf.setVisible(true);
            escritorio.add(pdf);
            escritorio.moveToFront(pdf);
        }
    }
//    public void generarPDF() {
//        Factura factura = new Factura();
//        if (jtLista.getSelectedRow() > -1) {
//            int fila = jtLista.getSelectedRow();
//            int idVisita = Integer.parseInt(jtLista.getValueAt(fila, 0).toString());
//            factura = Menu.facturaData.buscarFacturaPorIDVisita(idVisita);
//
//            String codigoFactura = String.format("%0" + 11 + "d", factura.getNroFactura());
//
//            Document document = new Document();
//
//            try {
//                PdfWriter.getInstance(document, new FileOutputStream("Factura " + codigoFactura + ".pdf"));
//                document.open();
//
//                // Agregar los datos de facturación al PDF.
//                document.add(new Paragraph("Factura"));
//                document.add(new Paragraph("Cliente: " + factura.getVisita().getMascota().getCliente().getApellido() + " " + factura.getVisita().getMascota().getCliente().getNombre()));
//                document.add(new Paragraph("Dirección: " + factura.getVisita().getMascota().getCliente().getDireccion()));
//
//                // Agregar detalles de productos y precios.
//                for (Medicamento medicamento : factura.getVisita().getTratamiento().getMedicamento()) {
//                    document.add(new Paragraph("Medicamento: " + medicamento.getNombre()));
//                    document.add(new Paragraph("Precio: " + medicamento.getPrecio()));
//                }
//
//                document.add(new Paragraph("Tratamiento: " + factura.getVisita().getTratamiento().getTipoDeTratamiento()));
//                document.add(new Paragraph("Precio: " + factura.getVisita().getTratamiento().getPrecio()));
//
//                // Calcular el total y agregarlo al PDF.               
//                document.add(new Paragraph("Total: " + precioTotal(factura.getVisita().getTratamiento())));
//
//                document.close();
//                JOptionPane.showMessageDialog(null, "El documento PDF de la factura ha sido generado con éxito.");
//            } catch (DocumentException | FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    } 
}
