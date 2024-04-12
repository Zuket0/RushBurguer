package Paneles;

import Colas.ListaCola;
import Colas.NodoPedidos;
import Colas.Pedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import DAO.ProductoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import metodos.Ordenamiento.Busqueda.MergeSort;
import metodos.Ordenamiento.Busqueda.ShellSort;

    public class Fpedidoss extends javax.swing.JPanel {
    ListaCola cola = new ListaCola();
    private DefaultTableModel x;

    
    public Fpedidoss() {
        initComponents();
        x = (DefaultTableModel) jTable1.getModel();
        InitStyles();
    }
    
    
    
    private void InitStyles(){
        txtPedi.putClientProperty( "FlatLaf.styleClass", "large" );
        txtPedi.setForeground(Color.black);
        txtIngr.putClientProperty( "FlatLaf.styleClass", "large" );
        txtIngr.setForeground(Color.black);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMostrarInfo = new javax.swing.JButton();
        txtPedi = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnEnc = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        txtIngr = new javax.swing.JLabel();
        btnOrdPro = new javax.swing.JButton();
        btnOrdPre = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(874, 540));

        btnMostrarInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarInfo.setText("Mostrar Menu");
        btnMostrarInfo.setBorderPainted(false);
        btnMostrarInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoActionPerformed(evt);
            }
        });

        txtPedi.setText("Pedido: ");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Productos", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnEnc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnc.setText("Encolar");
        btnEnc.setBorderPainted(false);
        btnEnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncActionPerformed(evt);
            }
        });

        btnQuitar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setBorderPainted(false);
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        txtIngr.setText("*Ingrese correctamente su pedido");

        btnOrdPro.setText("Ordenar por producto");
        btnOrdPro.setBorderPainted(false);
        btnOrdPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdProActionPerformed(evt);
            }
        });

        btnOrdPre.setText("Ordenar por precios");
        btnOrdPre.setBorderPainted(false);
        btnOrdPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdPreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btnMostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOrdPre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOrdPro))))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtPedi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIngr)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnMostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIngr)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdPre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInfoActionPerformed
        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ProductoDAO productoDAO = new ProductoDAO();
        // Obtener los productos del DAO
        ArrayList<Producto> productos = productoDAO.listarTodo();

        // Iterar sobre la lista de productos y agregarlos a la tabla
        for (Producto producto : productos) {
            Object[] row = { producto.getDescripcion(), producto.getPrecio()};
            model.addRow(row);

            //cargarProductosEnTabla();
        }
    }//GEN-LAST:event_btnMostrarInfoActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void btnEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncActionPerformed
        // Obtener el nombre del producto ingresado en el TextField
        String nombreProducto = txtNom.getText();
        // Buscar el nombre del producto en la tabla jTable1
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        double precioProducto = -1; // Inicializamos el precio con un valor que indique que el producto no se encontró

        for (int i = 0; i < rowCount; i++) {
            String nombre = (String) model.getValueAt(i, 0); // Columna de nombres de productos en jTable1
            if (nombre.equals(nombreProducto)) {
                // Si se encuentra el producto, obtenemos su precio de la misma fila
                precioProducto = (double) model.getValueAt(i, 1); // Columna de precios de productos en jTable1
                break;
            }
        }
        if (precioProducto != -1) { // Si el producto se encuentra en la tabla
            Pedido pedido = new Pedido(nombreProducto, precioProducto);
            cola.encolar(pedido); // Asumiendo que tienes una instancia de ListaCola llamada "cola"
            // Limpiar el campo de texto después de encolar el producto
            txtNom.setText("");
            jTextArea1.append(pedido.toString()); // Mostrar el pedido en el TextArea
        } else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado");
        }

    }//GEN-LAST:event_btnEncActionPerformed

     // Método para actualizar el TextArea mostrando los elementos restantes de la cola
    private void actualizarTextArea() {
        jTextArea1.setText(""); // Limpiar el TextArea

        // Obtener todos los elementos de la cola y mostrarlos en el TextArea
        NodoPedidos actual = cola.getInicio();
        while (actual != null) {
            Pedido pedido = actual.getDato();
            jTextArea1.append(pedido.toString()); // Asumiendo que tienes un método toString() en tu clase Pedido para mostrar el pedido en forma de cadena
            actual = actual.getSig();
        }
    }
    
    
    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if (!cola.estaVacia()) { // Suponiendo que tienes un método en tu clase ListaCola para verificar si la cola está vacía
            // Desencolar el primer elemento
            cola.desencolar(); // Utilizamos el método desencolar() existente

            // Actualizar el TextArea para mostrar la cola actualizada
            actualizarTextArea(); // Llamar a un método para actualizar el TextArea

            // Aquí puedes hacer lo que necesites con el pedido desencolado, como mostrarlo en algún otro lugar o realizar alguna otra operación
        } else {
            JOptionPane.showMessageDialog(this, "La cola está vacía");
        }
        
         
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnOrdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdProActionPerformed
         // TODO add your handling code here:
       try {
        // Obtener la lista de nombres de productos y precios desde la tabla
        ArrayList<String> nombresProductos = new ArrayList<>();
        ArrayList<Double> preciosProductos = new ArrayList<>();

        for (int i = 0; i < x.getRowCount(); i++) {
            String nombre = x.getValueAt(i, 0).toString();
            double precio = Double.parseDouble(x.getValueAt(i, 1).toString());

            nombresProductos.add(nombre);
            preciosProductos.add(precio);
        }

        // Utilizar el algoritmo de ShellSort para ordenar alfabéticamente
        ShellSort.ordenarAlfabeticamente(nombresProductos);

        // Limpiar la tabla antes de mostrar nuevos productos
        x.setRowCount(0);

        // Mostrar los productos ordenados alfabéticamente junto con sus respectivos precios en la tabla
        for (int i = 0; i < nombresProductos.size(); i++) {
            String nombreProducto = nombresProductos.get(i);
            double precio = preciosProductos.get(i);

            Object[] data = {nombreProducto, precio};
            x.addRow(data);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al ordenar productos. Detalles: " + e.getMessage());
    }
    }//GEN-LAST:event_btnOrdProActionPerformed

     
    
    private void btnOrdPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdPreActionPerformed

        // Obtener la lista de productos originales con sus precios
        ArrayList<Producto> productosOriginales = obtenerProductosDesdeTabla();

        // Crear una copia de la lista de precios originales
        ArrayList<Double> preciosOriginales = new ArrayList<>();
        for (Producto producto : productosOriginales) {
            preciosOriginales.add(producto.getPrecio());
        }

        // Utilizar la clase MergeSort para ordenar los precios
        MergeSort.ordenarPreciosDescendente(preciosOriginales);

        // Limpiar la tabla antes de mostrar nuevos precios
        x.setRowCount(0);

        // Mostrar los precios ordenados junto con sus respectivos productos en la tabla
        for (Double precio : preciosOriginales) {
            for (Producto producto : productosOriginales) {
                if (producto.getPrecio() == precio) {
                    Object[] data = {producto.getDescripcion(), precio};
                    x.addRow(data);

                    // Eliminar el producto de la lista original para evitar repeticiones
                    productosOriginales.remove(producto);
                    break;  // Salir del bucle una vez que se ha encontrado el producto
                }
            }
        }
        }
    

        // Método para obtener la lista de productos desde la tabla actual
        private ArrayList<Producto> obtenerProductosDesdeTabla() {
            ArrayList<Producto> productos = new ArrayList<>();
            for (int i = 0; i < x.getRowCount(); i++) {
                String nombre = x.getValueAt(i, 0).toString();
                double precio = Double.parseDouble(x.getValueAt(i, 1).toString());

                Producto producto = new Producto();
                producto.setDescripcion(nombre);
                producto.setPrecio(precio);

                productos.add(producto);
            }
            return productos;
            
    }//GEN-LAST:event_btnOrdPreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnc;
    private javax.swing.JButton btnMostrarInfo;
    private javax.swing.JButton btnOrdPre;
    private javax.swing.JButton btnOrdPro;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtIngr;
    private javax.swing.JTextField txtNom;
    private javax.swing.JLabel txtPedi;
    // End of variables declaration//GEN-END:variables
}
