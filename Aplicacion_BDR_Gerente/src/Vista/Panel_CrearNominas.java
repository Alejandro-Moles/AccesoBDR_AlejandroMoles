
package Vista;

import static Controlador.Conexion.conexion;
import Modelo.Columnas;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_CrearNominas extends javax.swing.JPanel {
    
    private Controlador.OperacionesBD crO = new Controlador.OperacionesBD();
    private Controlador.Conexion cr = new Controlador.Conexion();
    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas
  
    public Panel_CrearNominas() {
        initComponents();
        rellenartablas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton_ejecutar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_anio = new javax.swing.JFormattedTextField();
        text_mes = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Creacion de Nominas:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Inserte la fecha para generar las Nominas :");
        jLabel2.setToolTipText("");

        boton_ejecutar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_ejecutar.setText("Generar");
        boton_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ejecutarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mes:");

        tabla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ANIO", "MES", "DNI", "SUELDOH", "SUELDOHE"
            }
        ));
        tabla.setEnabled(false);
        jScrollPane1.setViewportView(tabla);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Nominas Existentes:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText(" (YYYY)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(" (MM)");

        text_anio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        text_anio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_anioActionPerformed(evt);
            }
        });

        text_mes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        text_mes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(text_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //metodo que se activa al pulsar el boton ejecutar
    private void boton_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ejecutarActionPerformed
        if(text_anio.getText().isEmpty() || text_mes.getText().isEmpty()){
            //si no se ha escrito ninguna cosa en los textfield de anio y mes
            JOptionPane.showMessageDialog(null, "Error, no ha seleccionado ninguna fecha");
            
        }else{
            try {
                int anio = Integer.parseInt(text_anio.getText());
                int mes = Integer.parseInt(text_mes.getText());
                //lamo a un metodo de la clase controladora el cual me devuelve un entero
                int comprobacion = crO.ejecutarprocedimiento(anio, mes);
                
                //si es cero el entero me muestra un mensaje de exito y me rellena la tabla con los datos de las nominas
                if(comprobacion == 0){
                    JOptionPane.showMessageDialog(null, "Nominas generadas");
                    //me llena las tablas con las nominas existentes
                    rellenartablas();
                    
                }else if(comprobacion == 1){
                    JOptionPane.showMessageDialog(null, "Error, Nominas no generadas");
                }else if(comprobacion == 2){
                    JOptionPane.showMessageDialog(null, "Error, la fecha que ha introducido no se considera una fecha");
                }
            } catch (ParseException ex) {
                
            }
        }
    
    }//GEN-LAST:event_boton_ejecutarActionPerformed

    private void text_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_anioActionPerformed

    
    public void rellenartablas(){
        try {
            datosColumnas = cr.getColumnas("NOMINAS");
            tabla.removeAll();
            DefaultTableModel modelo = new DefaultTableModel();//me creo un DefaultTableModel
            tabla.setModel(modelo);
            ArrayList<String> nombreColumnas = new ArrayList<>();//me creo un array de String
            
            Statement sta = conexion.createStatement();//Me creo un Statement, al cual asigno la conexion
            ResultSet rs = sta.executeQuery("SELECT * FROM NOMINAS");//utilizo el metodo executeQuery() para ejecutar la senetencia sql, que es la que hay en el textField, text_Orden
            ResultSetMetaData rsmd = rs.getMetaData();
            
            for(int i = 1; i<=rsmd.getColumnCount();i++){
                nombreColumnas.add(rsmd.getColumnName(i));
            }
            
            for(int i = 0; i<nombreColumnas.size();i++){
                modelo.addColumn(new String(nombreColumnas.get(i)));    
            }
            
            while(rs.next()){
                Object[] NuevaFila = new Object[datosColumnas.size()];//me creo un nuevo Object[] y le asigno como tamaño, las dimensiones del array datosColumnas
                for(int i = 0; i<nombreColumnas.size();i++){
                    //Añado en el objecto NuevaFila, el objecto que he leido utilizando el metodo getObject
                    NuevaFila[i] = rs.getObject(i + 1); // se tiene que poner el +1 ya que estas cogiendo los datos del resultSet, y dentro de el no se puede empezar desde el indice 0, el primero es el 1
                }
                modelo.addRow(NuevaFila);//añado a la tabla la fila, pasandole el objeto NuevaFila
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se han podido generar las nominas");
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error en el formato que ha escrito en el año/mes");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JFormattedTextField text_anio;
    private javax.swing.JFormattedTextField text_mes;
    // End of variables declaration//GEN-END:variables
}
