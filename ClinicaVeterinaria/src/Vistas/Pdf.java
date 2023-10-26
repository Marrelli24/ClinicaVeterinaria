package Vistas;

import Entidades.Factura;
import Entidades.Medicamento;
import Entidades.Tratamiento;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pdf extends javax.swing.JInternalFrame implements Printable {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    public Pdf() {
        initComponents();
    }

    public Pdf(Factura factura) {
        initComponents();
        llenar(factura);
        wallpaper();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPDF = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlLOGO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        nroFactura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlCliente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        medicamentoentry = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jlItem = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jbImprimir = new javax.swing.JButton();

        jpPDF.setBackground(new java.awt.Color(255, 255, 255));
        jpPDF.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Veterinaria");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Av. Universitaria s/n");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Cel: 02664452000");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("La Punta, San Luis");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("NRO. FACTURA");

        nroFactura.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Cliente:");

        jlCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Direccion:");

        jlDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Fecha:");

        jlFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Condicion:");

        jLabel14.setText("Efectivo");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setText("Sub Total");

        subTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel16.setText("Iva 21%");

        iva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel18.setText("Total");

        total.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        medicamentoentry.setBackground(new java.awt.Color(255, 255, 255));
        medicamentoentry.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout medicamentoentryLayout = new javax.swing.GroupLayout(medicamentoentry);
        medicamentoentry.setLayout(medicamentoentryLayout);
        medicamentoentryLayout.setHorizontalGroup(
            medicamentoentryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
        );
        medicamentoentryLayout.setVerticalGroup(
            medicamentoentryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medicamentoentryLayout.createSequentialGroup()
                .addGap(0, 176, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jlItem.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlItem.setText("Item");

        jlDescripcion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlDescripcion.setText("Descripcion");

        jlPrecio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlPrecio.setText("Precio");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpPDFLayout = new javax.swing.GroupLayout(jpPDF);
        jpPDF.setLayout(jpPDFLayout);
        jpPDFLayout.setHorizontalGroup(
            jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(jpPDFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlItem)
                .addGap(150, 150, 150)
                .addComponent(jlDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlPrecio)
                .addGap(36, 36, 36))
            .addComponent(medicamentoentry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPDFLayout.createSequentialGroup()
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPDFLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4)
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)))
                        .addGap(73, 73, 73)
                        .addComponent(jlLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPDFLayout.createSequentialGroup()
                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpPDFLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpPDFLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 94, Short.MAX_VALUE))
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpPDFLayout.createSequentialGroup()
                                    .addComponent(nroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPDFLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPDFLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpPDFLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpPDFLayout.createSequentialGroup()
                                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPDFLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jpPDFLayout.setVerticalGroup(
            jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPDFLayout.createSequentialGroup()
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPDFLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jpPDFLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPDFLayout.createSequentialGroup()
                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpPDFLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11))))
                    .addGroup(jpPDFLayout.createSequentialGroup()
                        .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlItem)
                    .addComponent(jlDescripcion)
                    .addComponent(jlPrecio))
                .addGap(1, 1, 1)
                .addComponent(medicamentoentry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jpPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jlLOGO.getAccessibleContext().setAccessibleDescription("");

        jbImprimir.setText("Imprimir");
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbImprimir)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbImprimir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        try {
            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setPrintable(this);

            boolean top = pj.printDialog();

            if (top) {
                pj.print();
            }

        } catch (PrinterException pe) {
            JOptionPane.showMessageDialog(null, "Error de Impresion" + pe + JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iva;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlItem;
    private javax.swing.JLabel jlLOGO;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JPanel jpPDF;
    private javax.swing.JPanel medicamentoentry;
    private javax.swing.JLabel nroFactura;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pageFor, int index) throws PrinterException {

        if (index > 0) {
            return NO_SUCH_PAGE;

        }
        Graphics2D g = (Graphics2D) graf;
        g.translate(pageFor.getImageableX(), pageFor.getImageableY());
        g.scale(0.7, 0.7);

        jpPDF.printAll(graf);

        return PAGE_EXISTS;

    }

    public void llenar(Factura factura) {
        nroFactura.setText(factura.getNroFactura() + "");
        jlCliente.setText(factura.getVisita().getMascota().getCliente().getApellido() + " " + factura.getVisita().getMascota().getCliente().getNombre());
        jlDireccion.setText(factura.getVisita().getMascota().getCliente().getDireccion());
        jlFecha.setText(factura.getVisita().getFechaVisita().toString());
        precioTotal(factura.getVisita().getTratamiento());

    }

    public void precioTotal(Tratamiento tratamiento) {
        double precioM = 0;
        int i = 1;
        int j = 0;
        for (Medicamento medicamento : tratamiento.getMedicamento()) {
            System.out.println(jlPrecio.getHeight()+"");
            JLabel item = new JLabel(i + "");
            medicamentoentry.add(item);
            item.setBounds(jlItem.getX() + 15, jlItem.getY() + jlItem.getHeight()+j, item.getPreferredSize().width, item.getPreferredSize().height);

            JLabel medic = new JLabel(medicamento.getNombre());
            medicamentoentry.add(medic);
            medic.setBounds(jlDescripcion.getX() + 185, jlDescripcion.getY() + jlDescripcion.getHeight()+j, medic.getPreferredSize().width, medic.getPreferredSize().height);

            JLabel precio = new JLabel("$ " + medicamento.getPrecio());
            medicamentoentry.add(precio);
            precio.setBounds(jlPrecio.getX() + 405, jlPrecio.getY() + jlPrecio.getHeight()+j, precio.getPreferredSize().width, precio.getPreferredSize().height);

            precioM = precioM + medicamento.getPrecio();
            j=j+20;
            i++;
        }

        double precioTotal = tratamiento.getPrecio() + precioM;
        subTotal.setText("$ " + precioTotal);
        double ivad = (precioTotal * 0.21);
        iva.setText("$ " + ivad);
        total.setText("$ " +(ivad + precioTotal));
    }
         public void wallpaper() {
        ImageIcon wallpaper = new ImageIcon("src/IMG/LOGO.png");
        Icon i = new ImageIcon(wallpaper.getImage().getScaledInstance(
                this.getWidth(),
                this.getHeight(),
                Image.SCALE_DEFAULT));
        jlLOGO.setIcon(i);
        jlLOGO.setVerticalAlignment(JLabel.CENTER);
        jlLOGO.setHorizontalAlignment(JLabel.CENTER);
        jlLOGO.setVerticalTextPosition(JLabel.CENTER);
        jlLOGO.setHorizontalTextPosition(JLabel.CENTER);
    }
}
