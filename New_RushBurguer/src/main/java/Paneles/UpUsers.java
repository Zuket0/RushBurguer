package Paneles;

import DAO.UsuarioDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class UpUsers extends javax.swing.JPanel {


    public UpUsers() {
        initComponents();
        InitStyles();
    }

    private void InitStyles(){
        jLabel1.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel1.setForeground(Color.black);
        jLabel2.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel2.setForeground(Color.black);
        jLabel3.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel3.setForeground(Color.black);
        jLabel4.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel4.setForeground(Color.black);
        jLabel5.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel5.setForeground(Color.black);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom_Completo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnReg = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(874, 540));

        jLabel1.setText("Registrar  nuevo Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Login");

        jLabel4.setText("Password");

        jLabel5.setText("Correo");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        btnReg.setBackground(new java.awt.Color(255, 153, 102));
        btnReg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 255, 255));
        btnReg.setText("Registrar");
        btnReg.setBorderPainted(false);
        btnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom_Completo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 42, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel7)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNom_Completo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        try {
            //Verificacion de que todos los campos esten completos
            if (txtNom_Completo.getText().equals("") || txtCorreo.getText().equals("") || txtLogin.getText().equals("") || txtPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
            } else {
                //creacion de una instancia de Usuario y UsuarioDAO
                Usuario u = new Usuario();
                UsuarioDAO ud = new UsuarioDAO();

                //Establecimiento de los valores del nuevo usuario
                u.setNombreCompleto(txtNom_Completo.getText());
                u.setLogin(txtLogin.getText());
                u.setPassword(txtPassword.getText());
                u.setCorreo(txtCorreo.getText());

                //Insercion del nuevo usuario en la base de datos
                ud.insertar(u);
                //Mensaje de exito y cierre de la ventana de agregar
                JOptionPane.showMessageDialog(null, "Usuario insertado con éxito!!");

                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato. Asegúrate de ingresar datos válidos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el usuario. Detalles: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNom_Completo;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
