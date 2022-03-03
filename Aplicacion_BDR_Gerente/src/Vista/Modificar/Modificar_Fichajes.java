
package Vista.Modificar;

import Vista.Modificar.Panel_Modificar;
import Modelo.Columnas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Modificar_Fichajes extends javax.swing.JDialog {

    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas

    private Controlador.Conexion cr = new Controlador.Conexion();//me creo el objecto del controlador
    
    public Modificar_Fichajes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        rellenarcolumnas();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_columnas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_Valor = new javax.swing.JTextField();
        boton_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Columnas a modificar");

        combo_columnas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione el ID del Fichaje");

        text_ID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Valor:");

        text_Valor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ValorActionPerformed(evt);
            }
        });

        boton_modificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton_modificar.setText("Modificar");
        boton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_ID)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_columnas, text_ID});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_IDActionPerformed

    private void text_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ValorActionPerformed

    private void boton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarActionPerformed
        if(text_Valor.getText().isEmpty() || text_ID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error, ingrese valores para modificar");
        }else{
            Columnas c1 = (Columnas)combo_columnas.getSelectedItem();//cero un objeto para ver el tipo de valor que contiene la columna elejida
            if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){//si el tipo es varchar le pongo comillas simples al valor deseado
                //escribo la sentencia que luego meto en el textfield para modificar
                String sentencia = "UPDATE FICHAJES SET " +combo_columnas.getSelectedItem() +" = '" +text_Valor.getText() + "' WHERE IDFICHAJE = " +text_ID.getText() ;
                Panel_Modificar.text_Consulta.setText(sentencia);
                dispose();
            }
            if(c1.getTipo().equalsIgnoreCase("NUMBER")){
                String sentencia = "UPDATE FICHAJES SET " +combo_columnas.getSelectedItem() +" = " +text_Valor.getText() + " WHERE IDFICHAJE = " +text_ID.getText() ;
                Panel_Modificar.text_Consulta.setText(sentencia);
                dispose();
            }

            if(c1.getTipo().equalsIgnoreCase("DATE")){
                String sentencia = "UPDATE FICHAJES SET " +combo_columnas.getSelectedItem() +" = TO_DATE('" +text_Valor.getText() + "', 'dd/MM/yyyy') WHERE IDFICHAJE = " +text_ID.getText() ;
                Panel_Modificar.text_Consulta.setText(sentencia);
                dispose();
            }

        }
    }//GEN-LAST:event_boton_modificarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificar_Fichajes dialog = new Modificar_Fichajes(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField text_ID;
    private javax.swing.JTextField text_Valor;
    // End of variables declaration//GEN-END:variables
    private void rellenarcolumnas() {
           try {
            //relleno las columnas de la tabla empleados con este metodo, llamando al controlador
            combo_columnas.removeAllItems();//remuevo todos los items de choice_columnas, para que no se me acumulen

            //Relleno el array datosColumnas con el metodo que esta en la clase controladora
            datosColumnas = cr.getColumnas("FICHAJES");
            //recorro el array datosColumnas y voy poiendo cada una de las columnas
            for(int i = 0;i<datosColumnas.size();i++){
                combo_columnas.addItem(datosColumnas.get(i));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error, consulta no valida");
        }
    }

}
