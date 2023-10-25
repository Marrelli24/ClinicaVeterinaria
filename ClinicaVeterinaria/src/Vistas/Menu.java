package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.FacturaData;
import AccesoADatos.MascotaData;
import AccesoADatos.MedicamentoData;
import AccesoADatos.TratamientoData;
import AccesoADatos.VisitaData;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public static ClienteData clienteData;
    public static MascotaData mascotaData;
    public static TratamientoData tratamientoData;
    public static VisitaData visitaData;
    public static MedicamentoData medicamentoData;
    public static FacturaData facturaData;

    public Menu() {
        initComponents();
        this.clienteData = new ClienteData();
        this.mascotaData = new MascotaData();
        this.tratamientoData = new TratamientoData();
        this.visitaData = new VisitaData();
        this.medicamentoData = new MedicamentoData();
        this.facturaData = new FacturaData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon("src/IMG/testing.png"); Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMIGestCliente = new javax.swing.JMenuItem();
        JMIListCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMIGestMascota = new javax.swing.JMenuItem();
        JMIListMascota = new javax.swing.JMenuItem();
        JMenuTratamiento = new javax.swing.JMenu();
        JMIGestTratamiento = new javax.swing.JMenuItem();
        JMIListTratamiento = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JMIGestVisita = new javax.swing.JMenuItem();
        JMIListVisita = new javax.swing.JMenuItem();
        JMIListaCobros = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JMIAboutUs = new javax.swing.JMenuItem();
        JMIManual = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(933, 700));

        escritorio.setPreferredSize(new java.awt.Dimension(933, 700));

        escritorio.setLayer(jLabelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(409, 35));

        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        JMIGestCliente.setText("Gestion de Clientes");
        JMIGestCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestClienteActionPerformed(evt);
            }
        });
        jMenu1.add(JMIGestCliente);

        JMIListCliente.setText("Listado de Clientes");
        JMIListCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListClienteActionPerformed(evt);
            }
        });
        jMenu1.add(JMIListCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mascotas");
        jMenu2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        JMIGestMascota.setText("Gestion de Mascotas");
        JMIGestMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestMascotaActionPerformed(evt);
            }
        });
        jMenu2.add(JMIGestMascota);

        JMIListMascota.setText("Listado de Mascotas");
        JMIListMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListMascotaActionPerformed(evt);
            }
        });
        jMenu2.add(JMIListMascota);

        jMenuBar1.add(jMenu2);

        JMenuTratamiento.setText("Tratamientos");
        JMenuTratamiento.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        JMIGestTratamiento.setText("Gestion de Tratamientos");
        JMIGestTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestTratamientoActionPerformed(evt);
            }
        });
        JMenuTratamiento.add(JMIGestTratamiento);

        JMIListTratamiento.setText("Lista de Tratamientos");
        JMIListTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListTratamientoActionPerformed(evt);
            }
        });
        JMenuTratamiento.add(JMIListTratamiento);

        jMenuBar1.add(JMenuTratamiento);

        jMenu4.setText("Visita");
        jMenu4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        JMIGestVisita.setText("Gestion de Visitas");
        JMIGestVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestVisitaActionPerformed(evt);
            }
        });
        jMenu4.add(JMIGestVisita);

        JMIListVisita.setText("Listar Visitas");
        JMIListVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListVisitaActionPerformed(evt);
            }
        });
        jMenu4.add(JMIListVisita);

        JMIListaCobros.setText("Listar Cobros");
        JMIListaCobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListaCobrosActionPerformed(evt);
            }
        });
        jMenu4.add(JMIListaCobros);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");
        jMenu3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        JMIAboutUs.setText("Sobre nosotros");
        JMIAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(JMIAboutUs);

        JMIManual.setText("Manual de usuario");
        JMIManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIManualActionPerformed(evt);
            }
        });
        jMenu3.add(JMIManual);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIGestClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestClienteActionPerformed
        GestionCliente gest = new GestionCliente();
        generarVentana(gest);
    }//GEN-LAST:event_JMIGestClienteActionPerformed

    private void JMIListClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListClienteActionPerformed
        ListarClientes list = new ListarClientes();
        generarVentana(list);
    }//GEN-LAST:event_JMIListClienteActionPerformed

    private void JMIGestMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestMascotaActionPerformed
        GestionMascota gest = new GestionMascota(escritorio);
        generarVentana(gest);
    }//GEN-LAST:event_JMIGestMascotaActionPerformed

    private void JMIGestTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestTratamientoActionPerformed
        GestionTratamiento gest = new GestionTratamiento(escritorio);
        generarVentana(gest);
    }//GEN-LAST:event_JMIGestTratamientoActionPerformed

    private void JMIAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAboutUsActionPerformed
        AboutUs ab = new AboutUs();
        generarVentana(ab);
    }//GEN-LAST:event_JMIAboutUsActionPerformed

    private void JMIListMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListMascotaActionPerformed
        ListarMascotas list = new ListarMascotas();
        generarVentana(list);
    }//GEN-LAST:event_JMIListMascotaActionPerformed

    private void JMIListTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListTratamientoActionPerformed
        ListarTratamiento list = new ListarTratamiento(escritorio);
        generarVentana(list);
    }//GEN-LAST:event_JMIListTratamientoActionPerformed

    private void JMIGestVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestVisitaActionPerformed
        GestionVisitas gest = new GestionVisitas(escritorio);
        generarVentana(gest);
    }//GEN-LAST:event_JMIGestVisitaActionPerformed

    private void JMIListVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListVisitaActionPerformed
        ListarVisitas list = new ListarVisitas();
        generarVentana(list);
    }//GEN-LAST:event_JMIListVisitaActionPerformed

    private void JMIManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIManualActionPerformed
        Help help = new Help();
        generarVentana(help);
    }//GEN-LAST:event_JMIManualActionPerformed

    private void JMIListaCobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListaCobrosActionPerformed
        ListarCobros list = new ListarCobros();
        generarVentana(list);

    }//GEN-LAST:event_JMIListaCobrosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMIAboutUs;
    private javax.swing.JMenuItem JMIGestCliente;
    private javax.swing.JMenuItem JMIGestMascota;
    private javax.swing.JMenuItem JMIGestTratamiento;
    private javax.swing.JMenuItem JMIGestVisita;
    private javax.swing.JMenuItem JMIListCliente;
    private javax.swing.JMenuItem JMIListMascota;
    private javax.swing.JMenuItem JMIListTratamiento;
    private javax.swing.JMenuItem JMIListVisita;
    private javax.swing.JMenuItem JMIListaCobros;
    private javax.swing.JMenuItem JMIManual;
    private javax.swing.JMenu JMenuTratamiento;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    public void generarVentana(JInternalFrame panel) {
        escritorio.removeAll();
        escritorio.repaint();
        panel.setVisible(true);
        escritorio.add(panel);
        escritorio.moveToFront(panel);
    }
}
