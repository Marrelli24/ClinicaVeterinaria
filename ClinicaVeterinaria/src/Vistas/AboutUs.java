package Vistas;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AboutUs extends javax.swing.JInternalFrame {


    public AboutUs() {
        initComponents();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        ImageIcon fondo = new ImageIcon("src/img/tu/ULP.png");
        super.paintComponent(g);
        Image img = fondo.getImage();
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    
    
    
    
    

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LinkEze = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LinkJon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LinkEma = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GitEma = new javax.swing.JLabel();
        GitJon = new javax.swing.JLabel();
        GitEze = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setClosable(true);
        setTitle("Sobre Nosotros");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("Sobre nosotros");

        LinkEze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/linkedin 1 (1).png"))); // NOI18N
        LinkEze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LinkEze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkEzeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ezequiel Marrelli");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jonatan Ballestero");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LinkJon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/linkedin 1 (1).png"))); // NOI18N
        LinkJon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LinkJon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkJonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Emanuel Schönfeld");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LinkEma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/linkedin 1 (1).png"))); // NOI18N
        LinkEma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LinkEma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkEmaMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/giphy.gif"))); // NOI18N

        GitEma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/signo-de-github 1 (1).png"))); // NOI18N
        GitEma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GitEma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GitEmaMouseClicked(evt);
            }
        });

        GitJon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/signo-de-github 1 (1).png"))); // NOI18N
        GitJon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GitJon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GitJonMouseClicked(evt);
            }
        });

        GitEze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/signo-de-github 1 (1).png"))); // NOI18N
        GitEze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GitEze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GitEzeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LinkEze)
                        .addGap(157, 157, 157))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(GitEze)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LinkEma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GitEma))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LinkJon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GitJon)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GitJon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LinkJon, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GitEma)
                                .addGap(31, 31, 31)
                                .addComponent(GitEze))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LinkEma)
                                .addGap(33, 33, 33)
                                .addComponent(LinkEze)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LinkEzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkEzeMouseClicked
        addUrl("https://www.linkedin.com/in/ezequiel-nicolas-marrelli-a67941292/");
    }//GEN-LAST:event_LinkEzeMouseClicked

    private void LinkEmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkEmaMouseClicked
        addUrl("https://www.linkedin.com/in/emanuel-schonfeld/");
    }//GEN-LAST:event_LinkEmaMouseClicked

    private void LinkJonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkJonMouseClicked
        addUrl("https://www.linkedin.com/in/jonballes/");
    }//GEN-LAST:event_LinkJonMouseClicked

    private void GitEmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GitEmaMouseClicked
        addUrl("https://github.com/Ema-Schonfeld");
    }//GEN-LAST:event_GitEmaMouseClicked

    private void GitJonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GitJonMouseClicked
        addUrl("https://github.com/JonBalles");
    }//GEN-LAST:event_GitJonMouseClicked

    private void GitEzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GitEzeMouseClicked
        addUrl("https://github.com/Marrelli24");
    }//GEN-LAST:event_GitEzeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GitEma;
    private javax.swing.JLabel GitEze;
    private javax.swing.JLabel GitJon;
    private javax.swing.JLabel LinkEma;
    private javax.swing.JLabel LinkEze;
    private javax.swing.JLabel LinkJon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


private void addUrl(String url){
          try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI(url));
                }
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
}

}
