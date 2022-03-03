
package Vista;

import static Controlador.Conexion.conexion;
import Modelo.Columnas;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_ConsultarDatos extends javax.swing.JPanel {

    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas
    
    private Controlador.Conexion cr = new Controlador.Conexion();//me creo el objecto del controlador
    
    private String sentencia;
    
    public Panel_ConsultarDatos() {
        initComponents();
        
        text_Valor2.setVisible(false);
        lblValor2.setVisible(false);
         for(int i = 0;i<Controlador.Conexion.NombresTablas.size();i++){
            choice_Tabla.add(Controlador.Conexion.NombresTablas.get(i));
        } 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        choice_Tabla = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        choice_columnas = new javax.swing.JComboBox<>();
        choice_operador = new javax.swing.JComboBox<>();
        text_Valor = new javax.swing.JTextField();
        text_Valor2 = new javax.swing.JTextField();
        text_Orden = new javax.swing.JTextField();
        boton_ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tablas: ");

        choice_Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice_Tabla.setFocusable(false);
        choice_Tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        choice_Tabla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_TablaItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Columnas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Operador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Valor");

        lblValor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor2.setText("Valor 2");

        choice_columnas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        choice_columnas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_columnasItemStateChanged(evt);
            }
        });

        choice_operador.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        choice_operador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_operadorItemStateChanged(evt);
            }
        });

        text_Valor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ValorFocusLost(evt);
            }
        });

        text_Valor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Valor2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_Valor2FocusLost(evt);
            }
        });
        text_Valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Valor2ActionPerformed(evt);
            }
        });

        text_Orden.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        text_Orden.setFocusable(false);

        boton_ejecutar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_ejecutar.setText("Ejecutar");
        boton_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ejecutarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setEnabled(false);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(choice_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(choice_operador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(text_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, lblValor2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblValor2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choice_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, lblValor2});

    }// </editor-fold>//GEN-END:initComponents

    private void choice_TablaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_TablaItemStateChanged
        try {
            choice_columnas.removeAllItems();//remuevo todos los items de choice_columnas, para que no se me acumulen

            //Relleno el array datosColumnas con el metodo que esta en la clase controladora
            datosColumnas = cr.getColumnas(choice_Tabla.getSelectedItem());
            //recorro el array datosColumnas y voy poiendo cada una de las columnas
            for(int i = 0;i<datosColumnas.size();i++){
                choice_columnas.addItem(datosColumnas.get(i));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error, consulta no valida");
        }
    }//GEN-LAST:event_choice_TablaItemStateChanged

    private void choice_columnasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_columnasItemStateChanged
        choice_operador.removeAllItems();//limpia los items de choice_operador para que no se acumulen
        //si el choice_columnas esta vacio, entonces no realiza este if
        if(choice_columnas.getSelectedIndex() != -1){
            Columnas c1 = (Columnas)choice_columnas.getSelectedItem();//creo un objecto Columnas que cojo del choice_columnas

            //si el tipo de la columna es VARCHAR2 se me ponnen los siguientes opreadores en el choice_operador
            if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){
                choice_operador.addItem("LIKE");
                choice_operador.addItem("=");
            }
            //si el tipo de la columna es NUMBER se me ponnen los siguientes opreadores en el choice_operador
            if(c1.getTipo().equalsIgnoreCase("NUMBER")){
                choice_operador.addItem("<");
                choice_operador.addItem("=");
                choice_operador.addItem(">");
                choice_operador.addItem(">=");
                choice_operador.addItem("<=");
            }
            //si el tipo de la columna es DATE se me ponnen los siguientes opreadores en el choice_operador
            if(c1.getTipo().equalsIgnoreCase("DATE")){
                choice_operador.addItem("BETWEEN");
            }

        }
    }//GEN-LAST:event_choice_columnasItemStateChanged

    private void choice_operadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_operadorItemStateChanged
        //si choice_operador, esta seleccionando la opcion BETWEEN ejecuta esto
        if(choice_operador.getSelectedItem() == "BETWEEN"){
            //pone visible el label y el textfield de Valor2
            text_Valor2.setVisible(true);
            lblValor2.setVisible(true);
        }else{
            //si no esta selecionando la opcion BETWEEN, pone invisible el label y el tetxtField de Valor2
            text_Valor2.setVisible(false);
            lblValor2.setVisible(false);
        }
    }//GEN-LAST:event_choice_operadorItemStateChanged

    private void text_ValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ValorFocusLost
        Columnas c1 = (Columnas)choice_columnas.getSelectedItem();//crea un objecto Columnas al que se le asigna lo que hay en choice_columnas

        //si el tipo de la columna es NUMBER, se crea una sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("NUMBER")){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +text_Valor.getText();
        }
        //si el tipo de la columna es VARCHAR2, se crea otra sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'%"+text_Valor.getText()+"%'";
        }
        //si el tipo de la columna es NUMBER, se crea otra sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("DATE")){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'"+text_Valor.getText()+"' " +"AND" +" '" +text_Valor2.getText()+ "'";

        }
        //si esta vacio el campo de valor, se crea una sentencia select diferente
        if(text_Valor.getText().isEmpty()){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem();
        }
        text_Orden.setText(sentencia);//paso la sentencia que se ha creado al text_Orden
    }//GEN-LAST:event_text_ValorFocusLost

    private void text_Valor2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_Valor2FocusLost
        sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'"+text_Valor.getText()+"'" +"AND" +" '" +text_Valor2.getText()+ "'";
        text_Orden.setText(sentencia);
    }//GEN-LAST:event_text_Valor2FocusLost

    private void boton_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ejecutarActionPerformed
        tabla.removeAll();//borra toda la tabla
        try {
            DefaultTableModel modelo = new DefaultTableModel();//me creo un DefaultTableModel
            tabla.setModel(modelo);
            ArrayList<String> nombreColumnas = new ArrayList<>();//me creo un array de String

            Statement sta = conexion.createStatement();//Me creo un Statement, al cual asigno la conexion
            ResultSet rs = sta.executeQuery(text_Orden.getText());//utilizo el metodo executeQuery() para ejecutar la senetencia sql, que es la que hay en el textField, text_Orden
            ResultSetMetaData rsmd = rs.getMetaData();//creo un ResultSetMetaData y obtengo los metadatos del resultset

            //recorro el resulsetmetadata y añado en el arraylist <nombreColumnas> los nombres de las columnas
            for(int i = 1; i<=rsmd.getColumnCount();i++){
                nombreColumnas.add(rsmd.getColumnName(i));
            }

            //recorro el array nombreColumnas y voy metiendo en la tabla, los nombres de las columnas respectivamente
            for(int i = 0; i<nombreColumnas.size();i++){
                modelo.addColumn(new String(nombreColumnas.get(i)));
            }

            //recorro el result set con un while para obtener las filas de las tabla
            while(rs.next()){
                Object[] NuevaFila = new Object[datosColumnas.size()];//me creo un nuevo Object[] y le asigno como tamaño, las dimensiones del array datosColumnas
                for(int i = 0; i<nombreColumnas.size();i++){
                    //Añado en el objecto NuevaFila, el objecto que he leido utilizando el metodo getObject
                    NuevaFila[i] = rs.getObject(i + 1); // se tiene que poner el +1 ya que estas cogiendo los datos del resultSet, y dentro de el no se puede empezar desde el indice 0, el primero es el 1
                }
                modelo.addRow(NuevaFila);//añado a la tabla la fila, pasandole el objeto NuevaFila
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error, consulta no valida");
        }
    }//GEN-LAST:event_boton_ejecutarActionPerformed

    private void text_Valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Valor2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ejecutar;
    private java.awt.Choice choice_Tabla;
    private javax.swing.JComboBox<Columnas> choice_columnas;
    private javax.swing.JComboBox<String> choice_operador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField text_Orden;
    private javax.swing.JTextField text_Valor;
    private javax.swing.JTextField text_Valor2;
    // End of variables declaration//GEN-END:variables
}
