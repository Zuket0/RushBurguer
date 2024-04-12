package Paneles;

import Colas.NodoPedidos;
import Colas.Pedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import DAO.ProductoDAO;
import Pilas.PilaPedidos;
import java.awt.Color;
import javax.swing.JOptionPane;
import metodos.Ordenamiento.Busqueda.MergeSort;
import metodos.Ordenamiento.Busqueda.ShellSort;


public class Fpilas extends javax.swing.JPanel {
     private ProductoDAO productoDAO = new ProductoDAO();
    private PilaPedidos pila = new PilaPedidos();
    private DefaultTableModel x;

    public Fpilas() {
        initComponents();
        x = (DefaultTableModel) jTable1.getModel();
        InitStyles();
        
    }
    
    private void InitStyles(){
        txtPr.putClientProperty( "FlatLaf.styleClass", "large" );
        txtPr.setForeground(Color.black);
        txtIngr.putClientProperty( "FlatLaf.styleClass", "large" );
        txtIngr.setForeground(Color.black);
    }
    

    private void actualizarAreaTexto() {
       // Limpiar el área de texto
    txtarea.setText("");
    // Obtener todos los elementos de la pila y mostrarlos en el área de texto
    NodoPedidos actual = pila.getTope();
    while (actual != null) {
        Pedido pedido = actual.getDato();
        txtarea.insert(pedido.toString(), 0); // Insertar el nuevo elemento al principio del TextArea
        actual = actual.getSig();
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPr = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnpush = new javax.swing.JButton();
        btnpop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMostrarInfo = new javax.swing.JButton();
        txtIngr = new javax.swing.JLabel();
        btnOrdPro = new javax.swing.JButton();
        btnOrdPre = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(874, 540));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(874, 540));

        txtPr.setText("Productos: ");

        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btnpush.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnpush.setText("Agregar pila");
        btnpush.setBorderPainted(false);
        btnpush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpushActionPerformed(evt);
            }
        });

        btnpop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnpop.setText("Quitar");
        btnpop.setBorderPainted(false);
        btnpop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpopActionPerformed(evt);
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
        jScrollPane2.setViewportView(jTable1);

        btnMostrarInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarInfo.setText("Mostrar Menu");
        btnMostrarInfo.setBorderPainted(false);
        btnMostrarInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoActionPerformed(evt);
            }
        });

        txtIngr.setText("*Ingrese correctamente su pedido");

        btnOrdPro.setText("Ordenar por producto");
        btnOrdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdProActionPerformed(evt);
            }
        });

        btnOrdPre.setText("Ordenar por precios");
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
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnpush)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnpop, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnOrdPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrdPre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPr)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrarInfo)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtIngr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))))
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIngr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnpush, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdPre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                .addGap(20, 20, 20))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed

    }//GEN-LAST:event_txtproductoActionPerformed

    private void btnpushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpushActionPerformed
        // Obtener el nombre del producto ingresado en el TextField
        String nombreProducto = txtproducto.getText();
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
            pila.push(pedido);
            // Limpiar el campo de texto después de encolar el producto
            txtproducto.setText("");
            txtarea.append(pedido.toString()); // Mostrar el pedido en el TextArea
        } else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado");
        }
    }//GEN-LAST:event_btnpushActionPerformed

    private void btnpopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpopActionPerformed
        // Sacar el producto superior de la pila
        Pedido pedido = pila.pop();
        if (pedido != null) {
            // Actualizar el área de texto para mostrar el estado actual de la pila
            actualizarAreaTexto();
        } else {
            JOptionPane.showMessageDialog(this, "La pila está vacía");
        }
    }//GEN-LAST:event_btnpopActionPerformed

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
    private javax.swing.JButton btnMostrarInfo;
    private javax.swing.JButton btnOrdPre;
    private javax.swing.JButton btnOrdPro;
    private javax.swing.JButton btnpop;
    private javax.swing.JButton btnpush;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtIngr;
    private javax.swing.JLabel txtPr;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}
