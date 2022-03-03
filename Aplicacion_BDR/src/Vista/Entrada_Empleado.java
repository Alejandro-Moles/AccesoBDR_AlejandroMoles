
package Vista;
import Controlador.Conexion;
import Controlador.Fichajes;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Entrada_Empleado extends javax.swing.JFrame {

    private Controlador.Conexion cr = new Controlador.Conexion();
    private Connection conexion;
    private Reloj controlaHora = new Reloj(); // me creo un objecto de reloj 1
    private Reloj2 controlaHora2 = new Reloj2();//me creo un objeto de reloj 2
    private Fichajes crF = new Fichajes();
    private String Hora;
    
    public Entrada_Empleado() {
        conexion = cr.establecer_conexion();//establezco la conexion
        if(conexion == null){
            JOptionPane.showMessageDialog(rootPane, "Error de conexion, no se ha podido conectar");
            System.exit(0);
        }else{
           initComponents();
           this.setLocationRelativeTo(null);
           text_fecha.setText(Fecha());//llamo a un metodo para dacra la fecha actual y la pongo en un label
           controlaHora2.Iniciar();//inicio el reloj 2
 
        }
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_Dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        Cambio_Hora = new javax.swing.JButton();
        Cambio_Hora2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        text_fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Inserte DNI :");

        text_Dni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Dni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_DniFocusLost(evt);
            }
        });
        text_Dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_DniKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Hora actual: ");

        reloj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Cambio_Hora.setText("24H");
        Cambio_Hora.setActionCommand("24H");
        Cambio_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambio_HoraActionPerformed(evt);
            }
        });

        Cambio_Hora2.setText("12H");
        Cambio_Hora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambio_Hora2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha actual : ");

        text_fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(text_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cambio_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cambio_Hora2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cambio_Hora2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(reloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cambio_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Cambio_Hora2, reloj});

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

    private void text_DniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_DniKeyTyped
        char TeclaPresionada = evt.getKeyChar();
        
        String fecha = text_fecha.getText()+ " " + Hora;
        if(TeclaPresionada == KeyEvent.VK_ENTER){//hago que cuando se pulsa la tecla intro me ejecure lo siguiente 
            try {
                //llamo al controlador pasandole la fecha y el Dni que he introducido
                int mensaje =crF.insertarFichajes(text_Dni.getText(), fecha);
                //Me pone en pantalla mensajes de diferentes errores o de ejecuciones realizadas perfectamente
                if(mensaje == 0){
                    JOptionPane.showMessageDialog(rootPane, "Fichaje insertado correctamente");
                }else if(mensaje == 1){
                    JOptionPane.showMessageDialog(rootPane, "Fichaje modificado con exito");
                }else if(mensaje == 2){
                    JOptionPane.showMessageDialog(rootPane, "Error, fichaje no insertado");
                }
            } catch (ParseException ex) {
                Logger.getLogger(Entrada_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_text_DniKeyTyped

    private void text_DniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_DniFocusLost
        
        
    }//GEN-LAST:event_text_DniFocusLost

    private void Cambio_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambio_HoraActionPerformed
         controlaHora.Parar();//hago que el reloj pare
         controlaHora2.Iniciar();//inicio el otro reloj
        
    }//GEN-LAST:event_Cambio_HoraActionPerformed

    private void Cambio_Hora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambio_Hora2ActionPerformed
        controlaHora2.Parar();//hago que el reloj pare
        controlaHora.Iniciar();//inicio el otro reloj
    }//GEN-LAST:event_Cambio_Hora2ActionPerformed


    
    
    //Creo una clase que me saca la hora, minutos y segundos actuales gracias a  procesos con hilos. Luego recojo estos datos y los meto en un JLabel 
    //que ya tengo creado.
     public class Reloj extends javax.swing.JFrame implements Runnable{
         String horas , minutos, segundos, am;
         Thread hilo; // creo un hilo
         Calendar calendar;// creo una variable de tipo calendario
         
         public Reloj(){
             hilo=new Thread(this);
             
         }
         
        public void Iniciar(){
            hilo=new Thread(this);
            hilo.start();//inicio el hilo
        }
        @Override
        public void run() {
            Thread  ct = Thread.currentThread();//defino el hilo
            
            //recoorro el bucle
            while(ct ==hilo){
                //cada vez que se ejecute el bucle me calculara con este metodo la hora, minuto y segundo que es actualmente
                calcular();
                reloj.setText(horas + ":" + minutos + ":" + segundos + " " +am);//me coloca los datos en el JLabel
                
                try{
                    //hace que el proceso se duerma 1000 milisegundos, que es lo mismo que 1 segundo, por lo que el proceso solo se ejecuta cada segundo, haciendo que el bucle se ejecute cada segundo
                    Thread.sleep(1000);
                }catch(InterruptedException ex){}
            }
        }
        //metodo que me calcula la hora, minutos y segundos.
        public void calcular(){
            Calendar calendario = new GregorianCalendar();
            Date fechaHora = new Date();
            
            calendario.setTime(fechaHora);
            //compruebo si el la hora es AM o PM y lo meto en una variable am, el ?: es como un ifelse
            am = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
            
            //si am es PM entonces resta a la hora -12 para que no pase mas de las 12h, es decir si fuesen las una de la tarde se pondria en 1 PM  en vez de 13
            if(am.equals("PM")){
                int i = calendario.get(Calendar.HOUR_OF_DAY) -12;
                horas = i>9?"" +i:"0"+i;//si la hora es menor a 10, entonces le coloca un 0 delante, por ejemplo si fuesen las 5 PM colocaria un 05 PM
            }else{//si no es PM esntonces no resta ninguna hora, y se quedan tal cual estan
                
                //comprueba si la hora es menor a 10 y si lo es le pone el 0 delante
                horas = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
            }
            //comprueba si los minutos son menor a 10 y si lo es le pone el 0 delante
             minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
             //comprueba si los segundos son menor a 10 y si lo es le pone el 0 delante
             segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        }
        
        public void Parar(){
            hilo.stop();
            reloj.setText("");
        }
     }
     
     public class Reloj2 extends javax.swing.JFrame implements Runnable{
         String horas2 , minutos2, segundos2;
         Thread hilo2; // creo un hilo
         Calendar calendar2;// creo una variable de tipo calendario
         
         public Reloj2(){
             hilo2=new Thread(this);
             
         }
         
        public void Iniciar(){
            hilo2=new Thread(this);
            hilo2.start();//inicio el hilo
        }
        @Override
        public void run() {
            Thread  ct = Thread.currentThread();//defino el hilo
            
            //recoorro el bucle
            while(ct ==hilo2){
                //cada vez que se ejecute el bucle me calculara con este metodo la hora, minuto y segundo que es actualmente
                calcular();
                reloj.setText(horas2 + ":" + minutos2 + ":" + segundos2);//me coloca los datos en el JLabel
                Hora = horas2 + ":" + minutos2;
                try{
                    //hace que el proceso se duerma 1000 milisegundos, que es lo mismo que 1 segundo, por lo que el proceso solo se ejecuta cada segundo, haciendo que el bucle se ejecute cada segundo
                    Thread.sleep(1000);
                }catch(InterruptedException ex){}
            }
        }
        //metodo que me calcula la hora, minutos y segundos.
        public void calcular(){
            Calendar calendario = new GregorianCalendar();
            Date fechaHora = new Date();
            
            calendario.setTime(fechaHora);
            
            
            //si am es PM entonces resta a la hora -12 para que no pase mas de las 12h, es decir si fuesen las una de la tarde se pondria en 1 PM  en vez de 13
            //si no es PM esntonces no resta ninguna hora, y se quedan tal cual estan
                
                //comprueba si la hora es menor a 10 y si lo es le pone el 0 delante
                horas2 = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
            
            //comprueba si los minutos son menor a 10 y si lo es le pone el 0 delante
             minutos2 = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
             //comprueba si los segundos son menor a 10 y si lo es le pone el 0 delante
             segundos2 = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        }
        
        public void Parar(){
            hilo2.stop();
            reloj.setText("");
        }
     }
     
     
    public String Fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambio_Hora;
    private javax.swing.JButton Cambio_Hora2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel reloj;
    private javax.swing.JTextField text_Dni;
    private javax.swing.JLabel text_fecha;
    // End of variables declaration//GEN-END:variables
}
