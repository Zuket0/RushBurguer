package Paneles;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import ListaEnlazada.ListaEnlazadaBD;
import DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import ListaEnlazada.NodoBD;
import java.awt.Color;


public class ListaEnlazadaconBD extends javax.swing.JPanel {
    private UsuarioDAO usuarioDAO = new UsuarioDAO(); // Instancia de UsuarioDAO
    private ListaEnlazadaBD listaEnlazada = new ListaEnlazadaBD();

    public ListaEnlazadaconBD() {
        initComponents();
        usuarioDAO = new UsuarioDAO();
        listaEnlazada = new ListaEnlazadaBD();
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
        jLabel6.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel6.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnIngInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        btnInInicio = new javax.swing.JButton();
        btnInEntre = new javax.swing.JButton();
        btnInFinal = new javax.swing.JButton();
        btnRecorrer = new javax.swing.JButton();
        btnEliIn = new javax.swing.JButton();
        btnEliFinal = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(874, 540));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnIngInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngInfo.setText("Ingresar info de la base de datos");
        btnIngInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngInfoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID :");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Login:");

        jLabel4.setText("Correo:");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar nombre");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnInInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInInicio.setText("Insertar Inicio");
        btnInInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInInicioActionPerformed(evt);
            }
        });

        btnInEntre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInEntre.setText("Insertar entre");
        btnInEntre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInEntreActionPerformed(evt);
            }
        });

        btnInFinal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInFinal.setText("Insertar final");
        btnInFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInFinalActionPerformed(evt);
            }
        });

        btnRecorrer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRecorrer.setText("Recorrer");
        btnRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerActionPerformed(evt);
            }
        });

        btnEliIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliIn.setText("Eliminar inicio");
        btnEliIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliInActionPerformed(evt);
            }
        });

        btnEliFinal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliFinal.setText("Eliminar final");
        btnEliFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliFinalActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre: ");

        txtDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Limpiar Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16))))
                            .addComponent(btnIngInfo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDato))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnInFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInEntre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRecorrer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnIngInfo)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnRecorrer))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInInicio)
                            .addComponent(btnEliIn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInEntre)
                            .addComponent(btnEliFinal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInFinal)
                            .addComponent(btnLimpiar))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngInfoActionPerformed
        // Llama al método listarTodo de UsuarioDAO para obtener todos los usuarios de la base de datos
        ArrayList<Usuario> usuarios = usuarioDAO.listarTodo();

        // Limpia el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        // Llena la tabla con los usuarios obtenidos
        for (Usuario usuario : usuarios) {
            Object[] fila = {usuario.getIdUsuario(), usuario.getNombreCompleto(), usuario.getPassword()};
            modelo.addRow(fila);
        }

    }//GEN-LAST:event_btnIngInfoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Obtén los datos ingresados en los campos de texto
        String nombre = jTextField2.getText();
        String login = jTextField3.getText();
        String correo = jTextField4.getText();
        String password = jTextField6.getText(); // Obtener la contraseña desde el nuevo campo de texto

        // Crea un nuevo objeto Usuario con los datos ingresados
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreCompleto(nombre);
        nuevoUsuario.setLogin(login);
        nuevoUsuario.setPassword(password); // Establecer la contraseña
        nuevoUsuario.setCorreo(correo);

        // Llama al método insertar de UsuarioDAO para agregar el nuevo usuario a la base de datos
        usuarioDAO.insertar(nuevoUsuario);

        // Limpia los campos de texto después de agregar el usuario
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText(""); // Limpiar el campo de contraseña
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Obtener el nombre ingresado en el JTextField
        String nombre = txtDato.getText();

        // Verificar si el nombre está en la base de datos
        // Si el nombre no está en la base de datos, mostrar una advertencia y salir del método
        if (!usuarioDAO.existeNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "El nombre no está en la base de datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Buscar el nombre en la lista enlazada
        NodoBD nodoEncontrado = listaEnlazada.buscar(nombre);

        if (nodoEncontrado != null) {
            // Si se encuentra el nombre en la lista, mostrar su información en el JTextArea
            jTextArea1.setText("""
                               Nombre encontrado en la lista enlazada:
                               Nombre: """ + nodoEncontrado.getNombre());
        } else {
            // Si el nombre no se encuentra en la lista, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "El nombre no está en la lista enlazada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInInicioActionPerformed
        // Obtener el nombre ingresado en el JTextField
        String nombre = txtDato.getText();

        // Verificar si el nombre está en la base de datos
        // Si el nombre no está en la base de datos, mostrar una advertencia y salir del método
        if (!usuarioDAO.existeNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "El nombre no está en la base de datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        usuarioDAO = new UsuarioDAO();
        listaEnlazada = new ListaEnlazadaBD();

        // Insertar el nombre al inicio de la lista enlazada
        listaEnlazada.insertarInicio(nombre);

        // Actualizar el contenido del JTextArea con los nombres en la lista enlazada
        jTextArea1.setText(listaEnlazada.recorrerNodos());

        // Limpiar el JTextField después de la inserción
        txtDato.setText("");
    }//GEN-LAST:event_btnInInicioActionPerformed

    private void btnInEntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInEntreActionPerformed
        // Obtener el nombre ingresado en el JTextField
        String nombre = txtDato.getText();

        // Verificar si el nombre está en la base de datos
        // Si el nombre no está en la base de datos, mostrar una advertencia y salir del método
        if (!usuarioDAO.existeNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "El nombre no está en la base de datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Solicitar al usuario el nombre después del cual desea insertar el nuevo nombre
        String nombreDespuesDe = JOptionPane.showInputDialog(this, "Ingrese el nombre antes del cual desea insertar el nuevo nombre:");

        // Obtener la posición del nombre después del cual se desea insertar el nuevo nombre
        int posicion = listaEnlazada.obtenerPosicion(nombreDespuesDe);

        // Si la posición es -1, significa que el nombre después del cual se desea insertar no se encontró en la lista
        // Mostrar un mensaje de advertencia y salir del método
        if (posicion == -1) {
            JOptionPane.showMessageDialog(this, "El nombre después del cual desea insertar el nuevo nombre no se encontró en la lista.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Insertar el nuevo nombre después de la posición obtenida
        listaEnlazada.insertarEnPosicion(nombre, posicion + 1);

        // Actualizar el contenido del JTextArea con los nombres en la lista enlazada
        jTextArea1.setText(listaEnlazada.recorrerNodos());

        // Limpiar el JTextField después de la inserción
        txtDato.setText("");
    }//GEN-LAST:event_btnInEntreActionPerformed

    private void btnInFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInFinalActionPerformed
        // Obtener el nombre ingresado en el JTextField
        String nombre = txtDato.getText();

        // Verificar si el nombre está en la base de datos
        // Si el nombre no está en la base de datos, mostrar una advertencia y salir del método
        if (!usuarioDAO.existeNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "El nombre no está en la base de datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Insertar el nombre al final de la lista enlazada
        listaEnlazada.insertarFin(nombre);

        // Actualizar el contenido del JTextArea con los nombres en la lista enlazada
        jTextArea1.setText(listaEnlazada.recorrerNodos());

        // Limpiar el JTextField después de la inserción
        txtDato.setText("");
    }//GEN-LAST:event_btnInFinalActionPerformed

    private void btnRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerActionPerformed
        // Verificar si la lista está vacía
        if (listaEnlazada.getInicio() == null) {
            jTextArea1.setText("La lista está vacía.");
            return;
        }

        // Recorrer la lista y construir una cadena con los nombres de los nodos
        StringBuilder resultado = new StringBuilder();
        NodoBD actual = listaEnlazada.getInicio();
        while (actual != null) {
            resultado.append(actual.getNombre()).append(" --> ");
            actual = actual.getSig();
        }

        // Mostrar la cadena en el JTextArea
        jTextArea1.setText(resultado.toString());
    }//GEN-LAST:event_btnRecorrerActionPerformed

    private void btnEliInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliInActionPerformed
        // Verificar si la lista está vacía
        if (listaEnlazada.getInicio() == null) {
            JOptionPane.showMessageDialog(this, "La lista está vacía.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Eliminar el nodo al inicio de la lista enlazada
        listaEnlazada.eliminarInicio();

        // Actualizar el contenido del JTextArea con los nombres en la lista enlazada
    }//GEN-LAST:event_btnEliInActionPerformed

    private void btnEliFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliFinalActionPerformed
        // Verificar si la lista está vacía
        if (listaEnlazada.getInicio() == null) {
            return; // No hay nada que eliminar
        }

        // Llamar al método para eliminar el último nodo
        listaEnlazada.eliminarFinal();

        // Actualizar el contenido del JTextArea con los nombres en la lista enlazada
    }//GEN-LAST:event_btnEliFinalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtén el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        // Limpia el modelo de la tabla
        modelo.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliFinal;
    private javax.swing.JButton btnEliIn;
    private javax.swing.JButton btnInEntre;
    private javax.swing.JButton btnInFinal;
    private javax.swing.JButton btnInInicio;
    private javax.swing.JButton btnIngInfo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRecorrer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
