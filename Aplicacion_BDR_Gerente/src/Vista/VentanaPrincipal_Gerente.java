
package Vista;

import Vista.Insertar.Panel_Insertar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class VentanaPrincipal_Gerente extends javax.swing.JFrame {
    
     Vista.Insertar.Panel_Insertar p1;
     Vista.Panel_Borrar p2;
     Vista.Modificar.Panel_Modificar p5;
     Vista.Panel_ConsultarDatos p3;
     Vista.Panel_CrearNominas p4;
    
    
    public VentanaPrincipal_Gerente() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Control de la Empresa");
        //crea el panel de Insertar y lo añade al JPanelTable
        p1 = new Vista.Insertar.Panel_Insertar();
        JPanelTable.addTab("Insertar Datos", p1);
        
        //crea el panel de Borrar y lo añade al JPanelTable
        p2 = new Vista.Panel_Borrar();
        JPanelTable.addTab("Borrar Datos", p2);
        
        //crea el panel de Modificar y lo añade al JPanelTable
        p5 = new Vista.Modificar.Panel_Modificar();
        JPanelTable.addTab("Modificar Datos", p5);
        
        //crea el panel de Consultar y lo añade al JPanelTable
        p3 = new Vista.Panel_ConsultarDatos();
        JPanelTable.addTab("Consultar Datos", p3);
        
        //crea el panel de Crear Nominas y lo añade al JPanelTable
        p4 = new Vista.Panel_CrearNominas();
        JPanelTable.addTab("Crear Nominas", p4);
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelTable = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JPanelTable.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         try {
             JOptionPane.showMessageDialog(rootPane, "Cerrando conexion");
             Controlador.Conexion.conexion.close();
         } catch (SQLException ex) {
           
         }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaPrincipal_Gerente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal_Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JPanelTable;
    // End of variables declaration//GEN-END:variables
}
