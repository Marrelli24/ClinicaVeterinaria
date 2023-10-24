package Vistas;

import Entidades.Tratamiento;
import javax.swing.JDesktopPane;
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
    
    public ListarTratamiento(JDesktopPane escritorio) {
        initComponents();
        armarCabecera();
        cargarTabla();
        this.escritorio = escritorio;
    }
    public ListarTratamiento() {
        initComponents();
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

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(JBEditTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(JBEditTratamiento)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
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

   
   private void cargarTabla(){
       for(Tratamiento trat : Menu.tratamientoData.listarTratamiento()){
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
   
   private void seleccion(){
       try{
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
        
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Debes seleccionar un tratamiento primero");
       }
       
       
   }
}
