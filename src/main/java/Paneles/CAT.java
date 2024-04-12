package Paneles;

import DAO.CategoriaDAO;
import DAO.ProductoDAO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Ordenamiento.Busqueda.Ordenamiento;
import modelo.Categoria;
import modelo.Producto;

public class CAT extends javax.swing.JPanel {
    DefaultTableModel x = new DefaultTableModel();
    //Instancias de clases DAO para interactuar con la base de datos
    CategoriaDAO cd = new CategoriaDAO();

    public CAT() {
        initComponents();
        mostrarCabecera();
         llenaCombo();
         initStyles();
    }

    //metodo para mostrar la cabecera de la tabla de productos
    public void mostrarCabecera() {
        x.addColumn("id_producto");
        x.addColumn("Nombre");
        x.addColumn("Precio");
        tblDatos.setModel(x);
    }
    
    private void initStyles(){
        jLabel1.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
        jLabel1.setForeground(Color.black);
    }
    
    void llenaCombo() {
        cbxCategoria.removeAllItems();
        for (Categoria c : cd.listarTodo()) {
            cbxCategoria.addItem(c.getDescripcion());
        }
    }

     //Metodo para mostrar los productos en la tabla, filtrados por categoria
    public void mostrar(int n) {
        x.setRowCount(0);
        ProductoDAO pd = new ProductoDAO();
        Producto p = new Producto();
        ArrayList<Producto> pc = new ArrayList<>();

        pc = pd.listarTodoFiltro(n);

        for (int i = 0; i < pc.size(); i++) {
            Object[] data = {pc.get(i).getId_producto(), pc.get(i).getDescripcion(), pc.get(i).getPrecio()};
            x.addRow(data);

        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnOrdCat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        tblDatos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblDatos.setRowHeight(40);
        jScrollPane1.setViewportView(tblDatos);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        btnOrdCat.setText("Ordenar Categorias");
        btnOrdCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdCatActionPerformed(evt);
            }
        });

        jLabel1.setText("GESTION DE PRODUCTOS");

        jButton3.setText("Buscar producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdCat, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnOrdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
         int indice = cbxCategoria.getSelectedIndex();

       
        if (indice != -1) {
            mostrar(indice + 1); 
        }
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void btnOrdCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdCatActionPerformed
        // TODO add your handling code here:
        ArrayList<String> categoriasList = new ArrayList<>();
        for (int i = 0; i < cbxCategoria.getItemCount(); i++) {
            categoriasList.add(cbxCategoria.getItemAt(i));
        }

        // Convierte las categorías a un array de Strings
        String[] categoriasArray = categoriasList.toArray(new String[0]);

        // Utiliza el método de ordenamiento de la clase Ordenamiento
        Ordenamiento.ordenarBurbuja(categoriasArray);

        // Actualiza el combo box con las categorías ordenadas
        cbxCategoria.removeAllItems();
        for (String categoria : categoriasArray) {
            cbxCategoria.addItem(categoria);
        }

        // Muestra los productos de la categoría seleccionada después de ordenar
        int indice = cbxCategoria.getSelectedIndex();
        if (indice != -1) {
            mostrar(indice + 1);
        }

    }//GEN-LAST:event_btnOrdCatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Obtener el nombre buscado del usuario (puedes usar un cuadro de diálogo)
        String nombreBuscado = JOptionPane.showInputDialog(this, "Ingrese el nombre del producto:");

        // Validar si se ingresó un nombre
        if (nombreBuscado != null && !nombreBuscado.isEmpty()) {
            // Llamar a la clase ProductoDAO para realizar la búsqueda
            ProductoDAO productoDAO = new ProductoDAO();

            // Llamar al método de búsqueda binaria
            boolean encontrado = productoDAO.buscarProductoPorNombre(nombreBuscado);

            // Mostrar el resultado
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Producto encontrado: " + nombreBuscado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado: " + nombreBuscado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Si el usuario no ingresó un nombre
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de producto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdCat;
    public javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
