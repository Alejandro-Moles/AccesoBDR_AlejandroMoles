
package Vista.Modificar;

import Modelo.Columnas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Modificar_Empleados extends javax.swing.JDialog {

    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas

    private Controlador.Conexion cr = new Controlador.Conexion();//me creo el objecto del controlador
    public Modificar_Empleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        rellenarcolumnas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combo_columnas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        text_Valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boton_modificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        text_DNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        combo_columnas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Columnas a modificar");

        text_Valor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ValorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Valor:");

        boton_modificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton_modificar.setText("Modificar");
        boton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione DNI del Empleado");

        text_DNI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_DNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_Valor))
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(combo_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_DNI))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_columnas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(text_DNI))
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ValorActionPerformed

    private void boton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarActionPerformed
        if(text_Valor.getText().isEmpty() || text_DNI.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error, ingrese valores para modificar");
        }else{
            Columnas c1 = (Columnas)combo_columnas.getSelectedItem();//cero un objeto para ver el tipo de valor que contiene la columna elejida
            if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){//si el tipo es varchar le pongo comillas simples al valor deseado
              //escribo la sentencia que luego meto en el textfield para modificar
              String sentencia = "UPDATE EMPLEADOS SET " +combo_columnas.getSelectedItem() +" = '" +text_Valor.getText() + "' WHERE DNI = '" +text_DNI.getText() +"'";
              Panel_Modificar.text_Consulta.setText(sentencia);
              dispose();
            }
             if(c1.getTipo().equalsIgnoreCase("NUMBER")){
              String sentencia = "UPDATE EMPLEADOS SET " +combo_columnas.getSelectedItem() +" = " +text_Valor.getText() + " WHERE DNI = '" +text_DNI.getText() +"'";
              Panel_Modificar.text_Consulta.setText(sentencia);
              dispose();
            }
            
        }
    }//GEN-LAST:event_boton_modificarActionPerformed

    private void text_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_DNIActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificar_Empleados dialog = new Modificar_Empleados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_modificar;
    private javax.swing.JComboBox<Columnas> combo_columnas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text_DNI;
    private javax.swing.JTextField text_Valor;
    // End of variables declaration//GEN-END:variables

    private void rellenarcolumnas() {
           try {
            //relleno las columnas de la tabla empleados con este metodo, llamando al controlador
            combo_columnas.removeAllItems();//remuevo todos los items de choice_columnas, para que no se me acumulen

            //Relleno el array datosColumnas con el metodo que esta en la clase controladora
            datosColumnas = cr.getColumnas("EMPLEADOS");
            //recorro el array datosColumnas y voy poiendo cada una de las columnas
            for(int i = 0;i<datosColumnas.size();i++){
                combo_columnas.addItem(datosColumnas.get(i));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error, consulta no valida");
        }
    }
}
