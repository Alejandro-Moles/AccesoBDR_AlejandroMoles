
package Vista;

import Modelo.Columnas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Panel_Borrar extends javax.swing.JPanel {

    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas
    
    private Controlador.Conexion cr = new Controlador.Conexion();//me creo el objecto del controlador
    
    private Controlador.OperacionesBD crI = new Controlador.OperacionesBD();
  
    public Panel_Borrar() throws SQLException {
        initComponents();
        nombreTablas.addItem("FICHAJES");
        nombreTablas.addItem("EMPLEADOS");
        
            choice_columnas.removeAllItems();//remuevo todos los items de choice_columnas, para que no se me acumulen
            //Relleno el array datosColumnas con el metodo que esta en la clase controladora
            datosColumnas = cr.getColumnas(nombreTablas.getSelectedItem());
            //recorro el array datosColumnas y voy poiendo cada una de las columnas 
            for(int i = 0;i<datosColumnas.size();i++){
                choice_columnas.addItem(datosColumnas.get(i));
            }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTablas = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        choice_columnas = new javax.swing.JComboBox<>();
        text_Orden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        choice_operador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        text_Valor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boton_borrar = new javax.swing.JButton();

        nombreTablas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nombreTablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombreTablasItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tablas Disponibles:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Columnas Disponibles");

        choice_columnas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        choice_columnas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_columnasItemStateChanged(evt);
            }
        });

        text_Orden.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Orden.setFocusable(false);
        text_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_OrdenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Sentencia: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Operadores");

        text_Valor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ValorFocusLost(evt);
            }
        });
        text_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ValorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Valor: ");

        boton_borrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_borrar.setText("Borrar");
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(choice_columnas, 0, 176, Short.MAX_VALUE)
                            .addComponent(nombreTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_Valor))
                        .addGap(18, 18, 18)
                        .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Valor)
                    .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_OrdenActionPerformed

    private void nombreTablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombreTablasItemStateChanged
        try {
            if(nombreTablas.getSelectedIndex() != -1){
            choice_columnas.removeAllItems();//remuevo todos los items de choice_columnas, para que no se me acumulen
            //Relleno el array datosColumnas con el metodo que esta en la clase controladora
            datosColumnas = cr.getColumnas(nombreTablas.getSelectedItem());
            //recorro el array datosColumnas y voy poiendo cada una de las columnas 
            for(int i = 0;i<datosColumnas.size();i++){
                choice_columnas.addItem(datosColumnas.get(i));
            }
           }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Error, consulta no valida");
        }
    }//GEN-LAST:event_nombreTablasItemStateChanged

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
                choice_operador.addItem("=");
        }
           
        }
    }//GEN-LAST:event_choice_columnasItemStateChanged

    private void text_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ValorActionPerformed

    private void text_ValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ValorFocusLost
               Columnas c1 = (Columnas)choice_columnas.getSelectedItem();//crea un objecto Columnas al que se le asigna lo que hay en choice_columnas
        String sentencia = null;
        //si el tipo de la columna es NUMBER, se crea una sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("NUMBER")){
            sentencia = "DELETE FROM " +nombreTablas.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +text_Valor.getText();
        }
        //si el tipo de la columna es VARCHAR2, se crea otra sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){
            sentencia = "DELETE FROM " +nombreTablas.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'"+text_Valor.getText()+"'";
        }
        //si el tipo de la columna es NUMBER, se crea otra sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("DATE")){
            sentencia = "DELETE FROM " +nombreTablas.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'"+text_Valor.getText()+"'";
            
        }
        //si esta vacio el campo de valor, se crea una sentencia select diferente
        if(text_Valor.getText().isEmpty()){
            sentencia = "DELETE FROM " +nombreTablas.getSelectedItem();
        }
        
        text_Orden.setText(sentencia);
    }//GEN-LAST:event_text_ValorFocusLost

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        int resultado = crI.realizarOperacion(text_Orden.getText());
        if(resultado == 0){
            JOptionPane.showMessageDialog(text_Orden, "Operacion de borrado realizada perfectamente");
        }else{
            JOptionPane.showMessageDialog(text_Orden, "Error, operacion no realizada");
        }
    }//GEN-LAST:event_boton_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JComboBox<Columnas> choice_columnas;
    private javax.swing.JComboBox<String> choice_operador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Choice nombreTablas;
    private javax.swing.JTextField text_Orden;
    private javax.swing.JTextField text_Valor;
    // End of variables declaration//GEN-END:variables
}
