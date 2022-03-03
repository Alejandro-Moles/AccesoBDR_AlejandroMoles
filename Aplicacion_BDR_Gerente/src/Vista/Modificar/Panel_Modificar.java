
package Vista.Modificar;

import Vista.Modificar.Modificar_Empleados;
import Modelo.Columnas;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Panel_Modificar extends javax.swing.JPanel {

    private Connection conexion;
    private Controlador.Conexion cr = new Controlador.Conexion();
    private Controlador.OperacionesBD crI = new Controlador.OperacionesBD();
    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas
    
    public Panel_Modificar() {
        initComponents();
        nombre_Tablas.add("");
        nombre_Tablas.add("EMPLEADOS");
        nombre_Tablas.add("NOMINAS");
        nombre_Tablas.add("FICHAJES");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre_Tablas = new java.awt.Choice();
        boton_Ejecutar = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        text_Consulta = new javax.swing.JTextField();
        text = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Tablas Disponibles:");

        nombre_Tablas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nombre_Tablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombre_TablasItemStateChanged(evt);
            }
        });

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

        text.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        text.setText("MODIFICAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(scrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(boton_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_TablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombre_TablasItemStateChanged

        //cuando de cambia el item que se esta seleccionando en el choice

        if(nombre_Tablas.getSelectedItem() == "NOMINAS"){//si se ha seleccionado nominas se abre una ventana para insertar en nominas
            Modificar_Nominas JD1 = new Modificar_Nominas(null, true);
            JD1.setVisible(true);
        }else if (nombre_Tablas.getSelectedItem() == "EMPLEADOS"){//si se ha seleccionado empleados se abre una ventana para insertar en empleados
            Modificar_Empleados JD2 = new Modificar_Empleados(null, true);
            JD2.setVisible(true);
        } else if (nombre_Tablas.getSelectedItem() == "FICHAJES"){//si se ha seleccionado festivos se abre una ventana para insertar en festivos
            Modificar_Fichajes JD3 = new Modificar_Fichajes(null, true);
            JD3.setVisible(true);
        }

    }//GEN-LAST:event_nombre_TablasItemStateChanged

    private void text_ConsultaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusGained

    }//GEN-LAST:event_text_ConsultaFocusGained

    private void text_ConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ConsultaFocusLost

    }//GEN-LAST:event_text_ConsultaFocusLost

    private void text_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ConsultaActionPerformed

    private void boton_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EjecutarActionPerformed
        //llama a un metodo del controlador para insertar los datos en la base de datos
        int result = crI.realizarOperacion(text_Consulta.getText());
        //muestra los respectivos mensajes de exito o de error, depende de lo que devuelva el metodo
        if(result == 0){
            JOptionPane.showMessageDialog(text_Consulta, "Registro actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(text_Consulta, "Error, no se ha podido realizar el update");
        }
    }//GEN-LAST:event_boton_EjecutarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Ejecutar;
    private javax.swing.JLabel jLabel1;
    public static java.awt.Choice nombre_Tablas;
    private java.awt.ScrollPane scrollPane1;
    protected static javax.swing.JLabel text;
    protected static javax.swing.JTextField text_Consulta;
    // End of variables declaration//GEN-END:variables
}
