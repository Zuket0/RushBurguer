package Paneles;

import DAO.UsuarioDAO;
import MainMenu.Dashboard;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import metodos.Ordenamiento.Busqueda.SelectionSort;
import metodos.Ordenamiento.Busqueda.BusquedaSecuencial;


public class Users extends javax.swing.JPanel {
    
    DefaultTableModel x = new DefaultTableModel();
 
    public Users() {
        initComponents();
        mostrarCabecera();
        mostrarTodo();
        initStyles();
    }

    private void initStyles(){
        txtSearch.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de usuario a buscar.");
    }
    
     //Metodo que muestra la cabecera de la tabla de usuario
    public void mostrarCabecera() {
        x.addColumn("ID");
        x.addColumn("Nombre");
        x.addColumn("Login");
        x.addColumn("Correo");
        tblDatos.setModel(x);
    }

    //metodo que actualiza la tabla de usuarios
    public void actualizartabla() {
        x.setRowCount(0);
        mostrarTodo();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Usuarios");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 153, 102));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Login", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        btnClear.setBackground(new java.awt.Color(255, 153, 102));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Borrar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 153, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(255, 153, 102));
        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ordenar por ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        try {
            int rowIndex = tblDatos.getSelectedRow();
            if (rowIndex != -1) {
                String login = tblDatos.getValueAt(rowIndex, 2).toString();

                UsuarioDAO usu = new UsuarioDAO();
                usu.eliminar(login);

                DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
                model.removeRow(rowIndex);
            } else {
                JOptionPane.showMessageDialog(Users.this, "Por favor, selecciona una fila para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Users.this, "Error al intentar eliminar el usuario. Detalles: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Dashboard.ShowJPanel(new UpUsers());
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String nombreBuscado = txtSearch.getText().trim();

    if (!nombreBuscado.isEmpty()) {
        // Obtener la lista de usuarios desde la base de datos
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ArrayList<Usuario> usuarios = usuarioDAO.listarTodo();

        // Convertir la lista de usuarios a un array de Usuario
        Usuario[] usuariosArray = usuarios.toArray(new Usuario[0]);

        // Realizar la búsqueda secuencial llamando al método estático de BusquedaSecuencial
        int indice = BusquedaSecuencial.buscarNombre(usuariosArray, nombreBuscado);
        
        if (indice != -1) {
            Usuario usuarioEncontrado = usuariosArray[indice];
            // Crear un nuevo modelo de tabla para almacenar los usuarios que coinciden con el nombre buscado
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Login");
        model.addColumn("Correo");

        // Filtrar y agregar solo los usuarios que coinciden con el nombre buscado al nuevo modelo de tabla
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreCompleto().equalsIgnoreCase(nombreBuscado)) {
                model.addRow(new Object[]{usuario.getIdUsuario(), usuario.getNombreCompleto(), usuario.getLogin(), usuario.getCorreo()});
            }
        }

        // Establecer el nuevo modelo de tabla en la tabla
        tblDatos.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "Nombre no encontrado en la tabla", "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        // Si no hay nada escrito en el TextField, se deben mostrar todos los usuarios nuevamente
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ArrayList<Usuario> usuarios = usuarioDAO.listarTodo();
        
        // Crear un nuevo modelo de tabla para todos los usuarios
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Login");
        model.addColumn("Correo");

        // Agregar todos los usuarios al modelo de tabla
        for (Usuario usuario : usuarios) {
            model.addRow(new Object[]{usuario.getIdUsuario(), usuario.getNombreCompleto(), usuario.getLogin(), usuario.getCorreo()});
        }

        // Establecer el nuevo modelo de tabla en la tabla
        tblDatos.setModel(model);
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
        int rowIndex = tblDatos.getSelectedRow();
        if (rowIndex != -1) {
            String loginSeleccionado = (String) tblDatos.getValueAt(rowIndex, 2);

            // Crear una instancia del panel de edición
            UpEdit panelEdit = new UpEdit();

            // Actualizar el panel con los datos del usuario seleccionado
            panelEdit.actualizar(loginSeleccionado);

            // Mostrar el panel de edición en el dashboard
            Dashboard.ShowJPanel(panelEdit);
        } else {
            JOptionPane.showMessageDialog(Users.this, "Por favor, selecciona una fila para actualizar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(Users.this, "Error al intentar actualizar el usuario. Detalles: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
  
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ordenarPorID();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ordenarPorID() {
         try {
            // Obtener los datos de la tabla
            ArrayList<Object[]> datosTabla = new ArrayList<>();
            for (int i = 0; i < x.getRowCount(); i++) {
                Object[] fila = new Object[x.getColumnCount()];
                for (int j = 0; j < x.getColumnCount(); j++) {
                    fila[j] = x.getValueAt(i, j);
                }
                datosTabla.add(fila);
            }

            // Obtener las IDs de la tabla
            ArrayList<Integer> idsUsuarios = new ArrayList<>();
            for (Object[] fila : datosTabla) {
                int id = Integer.parseInt(fila[0].toString());
                idsUsuarios.add(id);
            }

            // Utilizar el método de ordenamiento
            SelectionSort.selectionSort(idsUsuarios);

            // Limpiar la tabla antes de mostrar nuevas IDs ordenadas
            x.setRowCount(0);

            // Mostrar las filas ordenadas en la tabla
            for (Integer id : idsUsuarios) {
                // Buscar la fila correspondiente a la ID en la lista original
                for (Object[] fila : datosTabla) {
                    if (Integer.parseInt(fila[0].toString()) == id) {
                        // Agregar la fila a la tabla
                        x.addRow(fila);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Users.this, "Error al ordenar por ID. Detalles: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    //metodo que muestra la informacion de todos los usuarios en la tabla
    public void mostrarTodo() {
        UsuarioDAO usu = new UsuarioDAO();
        Usuario u = new Usuario();
        ArrayList<Usuario> vu = new ArrayList<>();

        vu = usu.listarTodo();
        for (int i = 0; i < vu.size(); i++) {
            Object[] data = {vu.get(i).getIdUsuario(), vu.get(i).getNombreCompleto(), vu.get(i).getLogin(),
                vu.get(i).getCorreo()};
            x.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
