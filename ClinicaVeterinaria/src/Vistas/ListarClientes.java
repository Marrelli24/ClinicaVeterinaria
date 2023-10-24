package Vistas;

import Entidades.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class ListarClientes extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public ListarClientes() {
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
        jTableCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTFApellidoCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JFondo = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCliente);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        jTFApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFApellidoClienteKeyPressed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFApellidoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidoClienteKeyPressed
        jTFApellidoCliente.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscarApellido();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscarApellido();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscarApellido();
            }
        });
    }//GEN-LAST:event_jTFApellidoClienteKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellidoCliente;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dni");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Contacto");
        modelo.addColumn("Num contacto");
        jTableCliente.setModel(modelo);
    }

    private void borraFilas() {
        int f = jTableCliente.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarTabla() {
        for (Cliente cliente : Menu.clienteData.listarClientes()) {
            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getApellido(),
                cliente.getNombre(),
                cliente.getDni(),
                cliente.getTelefono(),
                cliente.getDireccion(),
                cliente.getNombreAlterno(),
                cliente.getContactoAlter()
            });
        }
    }

    private void buscarApellido() {
        if (!jTFApellidoCliente.getText().isEmpty()) {
            borraFilas();
            String apellido = jTFApellidoCliente.getText().toLowerCase();
            for (Cliente cliente : Menu.clienteData.listarClientes()) {
                if (cliente.getApellido().toLowerCase().startsWith(apellido)) {
                    modelo.addRow(new Object[]{
                        cliente.getIdCliente(),
                        cliente.getApellido(),
                        cliente.getNombre(),
                        cliente.getDni(),
                        cliente.getTelefono(),
                        cliente.getDireccion(),
                        cliente.getNombreAlterno(),
                        cliente.getContactoAlter()
                    });
                }
            }
        } else {
            borraFilas();
            cargarTabla();

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
