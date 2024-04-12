package Paneles;

import DAO.UsuarioDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class UpEdit extends javax.swing.JPanel {
//Variables de instancia para almacenar la informacion del usuario
    int id;
    String nombre, login, contrasenia, correo;
    
    //Referencia a la ventana principal de gestion de usuario
    Users usu;

    public UpEdit() {
        initComponents();
        InitStyles();
    }
    
    public UpEdit(Users usu) {
        initComponents();
        this.usu = usu;
    }
    
    public UpEdit(String login) {
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
    
    public void actualizar(String loginSeleccionado) {
        // Obtener el usuario a editar utilizando el login
        UsuarioDAO usuDAO = new UsuarioDAO();
        Usuario usuario = usuDAO.listarUno(loginSeleccionado);

        // Establecer los valores de los campos de texto con la información del usuario
        txtNom_Completo.setText(usuario.getNombreCompleto());
        txtLogin.setText(usuario.getLogin());
        txtPassword.setText(usuario.getPassword());
        txtCorreo.setText(usuario.getCorreo());
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
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(874, 540));

        jLabel1.setText("Editar usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Login");

        jLabel4.setText("Password");

        jLabel5.setText("Correo");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        btnSave.setBackground(new java.awt.Color(255, 153, 102));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Guardar cambios");
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro.jpg"))); // NOI18N

        jLabel6.setText("ID");

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
                    .addComponent(txtNom_Completo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
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
                                .addGap(17, 17, 17)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       try {
        // Creación de instancia de UsuarioDAO para interactuar con la base de datos
        UsuarioDAO usuDAO = new UsuarioDAO();
        // Creación de instancia de Usuario con los nuevos valores
        Usuario u = new Usuario();

        u.setIdUsuario(Integer.parseInt(txtId.getText()));
        u.setNombreCompleto(txtNom_Completo.getText());
        u.setLogin(txtLogin.getText());
        u.setPassword(txtPassword.getText());
        u.setCorreo(txtCorreo.getText());

        // Actualización del usuario en la base de datos
        usuDAO.actualizar(u);

        // Actualización de la tabla en la ventana principal de gestión de usuarios
        if (usu != null) {
            usu.actualizartabla(); // Invocación del método actualizartabla() del panel Users
        }

        // Mostrar diálogo de confirmación
        JOptionPane.showMessageDialog(this, "Se han guardado correctamente los cambios.", "Cambios Guardados", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error de formato en el ID. Asegúrate de ingresar un número válido.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el usuario. Detalles: " + e.getMessage());
    }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNom_Completo;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
