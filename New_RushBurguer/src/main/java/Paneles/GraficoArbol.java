package Paneles;

import arbolbinariod.ArbolBinarioRushBurguer;
import arbolbinariod.Nodo;
import java.awt.Color; //Representa y manipula colores en aplicaciones graficas
import java.awt.Graphics; //Proprociona metodos para dibujar en componentes graficos lineas, cierculos
                           //En este caso el grafico es en el JPanel2 
import java.util.LinkedList; //Implemtamos una lista enlazada que organiza los elementos en forma de nodos enlazados
                            //Estructura datos lineal
import javax.swing.JOptionPane; //Muestra mensajes de informacion, adevertencia, error mediante caudros de dialogo

public class GraficoArbol extends javax.swing.JPanel {

     ArbolBinarioRushBurguer arbolito = new ArbolBinarioRushBurguer();
     //Creacion del objeto para realizar las operaciones en el arbol binario, insertar, recorrer, etc.
 
    public GraficoArbol() {
        initComponents();
        InitStyles();
    }

    private void InitStyles(){
        jLabel1.putClientProperty( "FlatLaf.styleClass", "large" );
        jLabel1.setForeground(Color.black);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txDato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Insertar Elemento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDatoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID productos:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Preorden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Inorden");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Postorden");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Existe dato");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Niveles");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(txDato, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try { ////Try donde se manejan las excepciones que ocurren durante la ejecucion del formulario
            int dato = Integer.parseInt(txDato.getText()); //Convertimos el dato ingresado a un numero entero mediante el txtdato.gettext()
            txDato.setText("");//Luego de obtener el dato, se bora el contenido del campo de texto para que se pueda
            //Ingresar otrodato sin tener que borrarlo manualmente
            arbolito.insertar(dato);//Se inserta el dato en el objeto arbolito
            paint(jPanel2.getGraphics());//Se llama al metodo paint para redibujar el arbol en el panel
        } catch (Exception e) {//Si ocurre alguna excepecion dentro del codigo try y se maneja dentro del bloque catch
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato"); //Si se produce algun error, se mostrara el cuadro con el mensaje error al insertar datos

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDatoActionPerformed
        try {//Try donde se manejan las excepciones que ocurren durante la ejecucion del fromulario
            int dato = Integer.parseInt(txDato.getText());//Convertimos el dato ingresado a un numero entero mediante el txtdato.gettext()
            txDato.setText("");//Luego de obtener el dato, se bora el contenido del campo de texto para que se pueda
            //Ingresar otrodato sin tener que borrarlo manualmente
            arbolito.insertar(dato); //Se inserta el dato en el objeto arbolito
            paint(jPanel2.getGraphics());//Se llama al metodo paint para redibujar el arbol en el panel
        } catch (Exception e) {//Si ocurre alguna excepecion dentro del codigo try y se maneja dentro del bloque catch
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato"); //Si se produce algun error, se mostrara el cuadro con el mensaje error al insertar datos
        }
    }//GEN-LAST:event_txDatoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LinkedList rec = new LinkedList();//Creacion de nueva instancia para almacenar el resultado del recorrido PREORDEN del arbol
        arbolito.preorden(arbolito.getRaiz(), rec); //LLamamos al metodo preorden del obejto. Se pasa la raiz del arbol como punto de partido
        //Luego se pasa a la lista REC para almacenar los nodos visitados durante el recorrido
        String cad = "Recorrido Preorden:\n"; //Se inicializa la cadena para construir el resultado del recorrido preorden
        for (Object rec1 : rec) { //Comenzamos con el bucle for que recorre cada elemento de la lista rec
            cad += rec1 + "  "; //Cada iteracion del bucle, se agrega el elemento actual de rec, seguido de dos espacios en la cadena
        }
        jTextArea1.setText(cad); //Se muestra el resultado del recorrido preorden en el text area
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        arbolito = null; //Borra el arbol binario existente
        arbolito= new ArbolBinarioRushBurguer(); //Se crea un nuevo objeto y se le asigna la variable arbolito
        //Creacion del nuevo arbol binario
        paint(jPanel2.getGraphics());//Se llama al metodo paint para redibujar el arbol en el panel JPANEL"
        jTextArea1.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LinkedList rec = new LinkedList();//Creamos nueva instancia
        arbolito.inorden(arbolito.getRaiz(), rec);//LLamamos al metodo inorden del arbolito, pasando la raiz del arbol como punto de partida del recorrido inorden
        String cad = "Recorrido Inorden:\n";//Se inicializa una cadena para construir el resultado
        for (Object rec1 : rec) {//Recorre cada elemento de la lista utilizando un bucle
            cad += rec1 + "  ";//y en cada iteracion se agrega un elemento actual de red seguido en la cadena
        }
        jTextArea1.setText(cad);//se establece el texto del componente por lo cula muestra el resultado
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LinkedList rec = new LinkedList();
        arbolito.postorden(arbolito.getRaiz(), rec);
        String cad = "Recorrido Postorden:\n"; //Mismo procedimiento con POSTORDEN
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {//comenzamos con try para manejar las excepciones
            int dato = Integer.parseInt(JOptionPane.showInputDialog(this,"Dato a buscar"));
            //Muestar cuadro solicictando al usuario que ingrese el dato a buscar
            //El datp ingresado se convierte en entero utilizando el Integerparseint y se almacena en la variable dato.
            JOptionPane.showMessageDialog(this,arbolito.existe(dato)? "Si Existe el Dato":"No Existe el dato");
            //Se llama al metodo existe dato del obejto arbolito para verificar si el dato ingresado existe
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,"Error al buscar el dato");
            //SI se produce alguna excepcion se mostrara un cuadro de confirmacion con el mensaje correspondiente
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LinkedList rec = new LinkedList();
        arbolito.porNivel(arbolito.getRaiz(), rec);
        String cad = "Recorrido Por Nivel:\n"; //Mismo procedimiento por NIVEL
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_jButton6ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txDato;
    // End of variables declaration//GEN-END:variables

    
private static final int DISTANCIA_ENTRE_NODOS = 100; // Distancia deseada entre los nodos
private static final int INCREMENTO_DISTANCIA = 20; // Incremento de distancia entre nodos por nivel

private void pintaArbol(Graphics g, Nodo n, int x, int y, int nivel) {
    if (n == null) return;

    // Calcula las posiciones X de los nodos hijos izquierdo y derecho
    int xIzquierdo = x - DISTANCIA_ENTRE_NODOS / nivel;
    int xDerecho = x + DISTANCIA_ENTRE_NODOS / nivel;
    
    // Llama recursivamente a pintaArbol con las nuevas posiciones X para los nodos hijos
    pintaArbol(g, n.getIzq(), xIzquierdo, y + DISTANCIA_ENTRE_NODOS, nivel + 1);
    pintaArbol(g, n.getDer(), xDerecho, y + DISTANCIA_ENTRE_NODOS, nivel + 1);

    // Dibuja el nodo actual
    g.setColor(Color.green);
    g.fillOval(x - 10, y - 20, 30, 30);
    g.setColor(Color.black);
    g.drawString(n.getDato() + "", x, y);
    
    // Dibuja las líneas que conectan el nodo actual con sus hijos
    g.setColor(Color.red); // Establece el color de las líneas en negro
    if (n.getIzq() != null) {
        g.drawLine(x, y, xIzquierdo, y + DISTANCIA_ENTRE_NODOS);
    }
    if (n.getDer() != null) {
        g.drawLine(x, y, xDerecho, y + DISTANCIA_ENTRE_NODOS);
    }
}

@Override
public void paint(Graphics g) {
    jPanel2.revalidate(); //llama para validar y actualizar el panel jPanel2 y sus componentes secundarios antes de volver a dibujar el árbol.
    super.paint(g);//realizar el dibujo de los componentes secundarios del panel. Esto garantiza que los componentes secundarios se dibujen correctamente antes de dibujar el árbol.
    
    int X = jPanel2.getWidth() / 2; //Calcula la posición horizontal X donde se dibujará el árbol en el panel. 
                                    //Divide el ancho del panel (jPanel2.getWidth()) por 2 para obtener el punto medio horizontal del panel.
    int Y = getHeight() / 12; //Calcula la posición vertical Y donde se dibujará el árbol en el panel. 
                                //Divide la altura del panel (getHeight()) por 12 para obtener una posición vertical adecuada para el dibujo del árbol.
    
    pintaArbol(g, arbolito.getRaiz(), X, Y, 1);
    //lama al método pintaArbol para dibujar el árbol en el panel. Se pasa el contexto gráfico (g), la raíz del árbol (arbolito.getRaiz()),
    //las coordenadas X e Y calculadas, y un nivel inicial de 1 para el dibujo del árbol.
}



}
