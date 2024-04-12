package MainMenu;


import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import Paneles.*;




public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        InitStyles();
        InitContent();
        
    }

    private void InitStyles(){
        txtmsg.putClientProperty( "FlatLaf.style", "font: bold $h2.regular.font" );
        txtmsg.setForeground(Color.black);
        txtName.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
        txtName.setForeground(Color.white);
        
    }
    
    private void InitContent(){
        ShowJPanel(new Users());
        
    }
    
    public static void ShowJPanel(JPanel fpedi ){

        fpedi.setSize(874, 540);
        fpedi.setLocation(0,0);
        
        content.removeAll();
        content.add(fpedi, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PanelBlack = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        IconRushBurguer = new javax.swing.JLabel();
        btnColas = new javax.swing.JButton();
        btnPilas = new javax.swing.JButton();
        btnListEn = new javax.swing.JButton();
        btnTreeBin = new javax.swing.JButton();
        btnHash = new javax.swing.JButton();
        btnGrafo = new javax.swing.JButton();
        btnCat = new javax.swing.JButton();
        PanelOrag = new javax.swing.JPanel();
        txtmsg = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        PanelBlack.setBackground(new java.awt.Color(0, 0, 0));

        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Rush Burguer");

        btnUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        IconRushBurguer.setForeground(new java.awt.Color(255, 255, 255));
        IconRushBurguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoRushBurger.jpg"))); // NOI18N
        IconRushBurguer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IconRushBurguer.setPreferredSize(new java.awt.Dimension(80, 80));

        btnColas.setBackground(new java.awt.Color(102, 102, 102));
        btnColas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnColas.setForeground(new java.awt.Color(255, 255, 255));
        btnColas.setText("Colas");
        btnColas.setBorder(null);
        btnColas.setBorderPainted(false);
        btnColas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColasActionPerformed(evt);
            }
        });

        btnPilas.setBackground(new java.awt.Color(102, 102, 102));
        btnPilas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPilas.setForeground(new java.awt.Color(255, 255, 255));
        btnPilas.setText("Pilas");
        btnPilas.setBorder(null);
        btnPilas.setBorderPainted(false);
        btnPilas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilasActionPerformed(evt);
            }
        });

        btnListEn.setBackground(new java.awt.Color(102, 102, 102));
        btnListEn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListEn.setForeground(new java.awt.Color(255, 255, 255));
        btnListEn.setText("Lista Enlazada");
        btnListEn.setBorder(null);
        btnListEn.setBorderPainted(false);
        btnListEn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListEnActionPerformed(evt);
            }
        });

        btnTreeBin.setBackground(new java.awt.Color(102, 102, 102));
        btnTreeBin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTreeBin.setForeground(new java.awt.Color(255, 255, 255));
        btnTreeBin.setText("Arbol Binario");
        btnTreeBin.setBorder(null);
        btnTreeBin.setBorderPainted(false);
        btnTreeBin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTreeBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreeBinActionPerformed(evt);
            }
        });

        btnHash.setBackground(new java.awt.Color(102, 102, 102));
        btnHash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHash.setForeground(new java.awt.Color(255, 255, 255));
        btnHash.setText("Tabla Hash");
        btnHash.setBorder(null);
        btnHash.setBorderPainted(false);
        btnHash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashActionPerformed(evt);
            }
        });

        btnGrafo.setBackground(new java.awt.Color(102, 102, 102));
        btnGrafo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGrafo.setForeground(new java.awt.Color(255, 255, 255));
        btnGrafo.setText("Grafo");
        btnGrafo.setBorder(null);
        btnGrafo.setBorderPainted(false);
        btnGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafoActionPerformed(evt);
            }
        });

        btnCat.setBackground(new java.awt.Color(102, 102, 102));
        btnCat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCat.setForeground(new java.awt.Color(255, 255, 255));
        btnCat.setText("CAT");
        btnCat.setBorder(null);
        btnCat.setBorderPainted(false);
        btnCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBlackLayout = new javax.swing.GroupLayout(PanelBlack);
        PanelBlack.setLayout(PanelBlackLayout);
        PanelBlackLayout.setHorizontalGroup(
            PanelBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlackLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(IconRushBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(btnColas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPilas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListEn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTreeBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBlackLayout.setVerticalGroup(
            PanelBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBlackLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(IconRushBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPilas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListEn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTreeBin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHash, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelOrag.setBackground(new java.awt.Color(255, 204, 153));

        txtmsg.setText("Cadena de comida rápida Rush Burguer");

        javax.swing.GroupLayout PanelOragLayout = new javax.swing.GroupLayout(PanelOrag);
        PanelOrag.setLayout(PanelOragLayout);
        PanelOragLayout.setHorizontalGroup(
            PanelOragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOragLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOragLayout.setVerticalGroup(
            PanelOragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOragLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        content.setMinimumSize(new java.awt.Dimension(874, 540));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelOrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelOrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnColasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColasActionPerformed
        ShowJPanel(new Fpedidoss());
    }//GEN-LAST:event_btnColasActionPerformed

    private void btnPilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilasActionPerformed
        ShowJPanel(new Fpilas());
    }//GEN-LAST:event_btnPilasActionPerformed

    private void btnListEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListEnActionPerformed
        ShowJPanel(new ListaEnlazadaconBD());
    }//GEN-LAST:event_btnListEnActionPerformed

    private void btnTreeBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreeBinActionPerformed
        ShowJPanel(new GraficoArbol());
    }//GEN-LAST:event_btnTreeBinActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        ShowJPanel(new Users());
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashActionPerformed
        ShowJPanel(new TH_BD(100));
    }//GEN-LAST:event_btnHashActionPerformed

    private void btnGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafoActionPerformed
        ShowJPanel(new Grafo());
    }//GEN-LAST:event_btnGrafoActionPerformed

    private void btnCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatActionPerformed
        ShowJPanel(new CAT());
    }//GEN-LAST:event_btnCatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel IconRushBurguer;
    private javax.swing.JPanel PanelBlack;
    private javax.swing.JPanel PanelOrag;
    private javax.swing.JButton btnCat;
    private javax.swing.JButton btnColas;
    private javax.swing.JButton btnGrafo;
    private javax.swing.JButton btnHash;
    private javax.swing.JButton btnListEn;
    private javax.swing.JButton btnPilas;
    private javax.swing.JButton btnTreeBin;
    private javax.swing.JButton btnUsuarios;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtmsg;
    // End of variables declaration//GEN-END:variables
}
