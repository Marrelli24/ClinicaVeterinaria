package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import AccesoADatos.TratamientoData;
import AccesoADatos.VisitaData;
import java.util.Locale;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public static ClienteData clienteData;
    public static MascotaData mascotaData;
    public static TratamientoData tratamientoData;
    public static VisitaData visitaData;

    public Menu() {
        initComponents();
        this.clienteData = new ClienteData();
        this.mascotaData = new MascotaData();
        this.tratamientoData = new TratamientoData();
        this.visitaData = new VisitaData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
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
        jMenu3 = new javax.swing.JMenu();
        JMIAboutUs = new javax.swing.JMenuItem();
        JMIManual = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(900, 700));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jMenu1.setText("Clientes");

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

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");

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
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        GestionMascota gest = new GestionMascota();
        generarVentana(gest);
    }//GEN-LAST:event_JMIGestMascotaActionPerformed

    private void JMIGestTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestTratamientoActionPerformed
        GestionTratamiento gest = new GestionTratamiento();
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
        ListarTratamiento list = new ListarTratamiento();
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
    private javax.swing.JMenuItem JMIManual;
    private javax.swing.JMenu JMenuTratamiento;
    private javax.swing.JDesktopPane escritorio;
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
