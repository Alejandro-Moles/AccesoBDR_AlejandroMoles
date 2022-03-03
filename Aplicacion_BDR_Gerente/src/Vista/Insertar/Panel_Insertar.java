
package Vista.Insertar;

import Vista.Insertar.Insertar_Nominas;
import Vista.Insertar.Insertar_Festivos;
import Vista.Insertar.Insertar_Empleados;
import Modelo.Columnas;
import java.awt.Frame;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Panel_Insertar extends javax.swing.JPanel {

    private Connection conexion;
    private Controlador.Conexion cr = new Controlador.Conexion();
    private Controlador.OperacionesBD crI = new Controlador.OperacionesBD();
    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas
    
    
    public Panel_Insertar() {
        initComponents();
        
        conexion = cr.establecer_conexion();
        if(conexion == null){
            //si no se puede conectar a la base de datos muestra un mensaje de error
            JOptionPane.showMessageDialog(text_Consulta, "Error, conexion no realizada");
        }else{
            //se añaden al choice las tablas en las que se podran insertar los datos
            nombre_Tablas.add("");
            nombre_Tablas.add("EMPLEADOS");
            nombre_Tablas.add("NOMINAS");
            nombre_Tablas.add("FESTIVOS");
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_Tablas = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        boton_Ejecutar = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        text_Consulta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        nombre_Tablas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nombre_Tablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombre_TablasItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Tablas Disponibles:");

        boton_Ejecutar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_Ejecutar.setText("EJECUTAR");
        boton_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EjecutarActionPerformed(evt);
            }
        });

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        text_Consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        text_Consulta.setFocusable(false);
        text_Consulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_ConsultaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ConsultaFocusLost(evt);
            }
        });
        text_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ConsultaActionPerformed(evt);
            }
        });
        scrollPane1.add(text_Consulta);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("INSERTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(nombre_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(boton_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(boton_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_TablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombre_TablasItemStateChanged
        
        //cuando de cambia el item que se esta seleccionando en el choice
        
        if(nombre_Tablas.getSelectedItem() == "NOMINAS"){//si se ha seleccionado nominas se abre una ventana para insertar en nominas
            Insertar_Nominas JD1 = new Insertar_Nominas(null, true);
            JD1.setVisible(true);
        }else if (nombre_Tablas.getSelectedItem() == "EMPLEADOS"){//si se ha seleccionado empleados se abre una ventana para insertar en empleados
            Insertar_Empleados JD2 = new Insertar_Empleados(null, true);
            JD2.setVisible(true);
        } else if (nombre_Tablas.getSelectedItem() == "FESTIVOS"){//si se ha seleccionado festivos se abre una ventana para insertar en festivos
            Insertar_Festivos JD3 = new Insertar_Festivos(null, true);
            JD3.setVisible(true);
        }
        
        
    }//GEN-LAST:event_nombre_TablasItemStateChanged

    private void text_ConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusGained
      
        
    }//GEN-LAST:event_text_ConsultaFocusGained

    private void text_ConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusLost
        
    }//GEN-LAST:event_text_ConsultaFocusLost

    private void boton_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EjecutarActionPerformed
        //llama a un metodo del controlador para insertar los datos en la base de datos
        int result = crI.realizarOperacion(text_Consulta.getText());
        //muestra los respectivos mensajes de exito o de error, depende de lo que devuelva el metodo
        if(result == 0){
            JOptionPane.showMessageDialog(text_Consulta, "Registro insertado correctamente");
        }else{
            JOptionPane.showMessageDialog(text_Consulta, "Error, no se ha podido realizar el insert");
        }
    }//GEN-LAST:event_boton_EjecutarActionPerformed

    private void text_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Ejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static java.awt.Choice nombre_Tablas;
    private java.awt.ScrollPane scrollPane1;
    protected static javax.swing.JTextField text_Consulta;
    // End of variables declaration//GEN-END:variables
}
