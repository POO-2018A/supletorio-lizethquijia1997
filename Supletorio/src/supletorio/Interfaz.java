package supletorio;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class Interfaz extends javax.swing.JFrame {
    
    
    int contadorProducto = 0; 
    String [][] empleados;
    DefaultTableModel modeloTablaEmpleado;
    ArrayList<Productos> listaEmpleados = new ArrayList(); //Mis empleados irán creciendo conforme se vayan registrando, y tendrán cada uno un nombre, un apellido y un cargo
    DefaultComboBoxModel modeloComboBoxEmpleados = new DefaultComboBoxModel(listaEmpleados.toArray());
        
    int contadorGerentes, contadorSecretarios, contadorVendedores, contadorChoferes = 0;
    String[][] registros;
    DefaultTableModel modeloTablaRegistro; 
    
   
    public Interfaz() {
        initComponents();
        
        //Esto... no le pares bola, solo es para añadir una imagen de fondo:
        
       
        
        //Empleados
        String[] titulosTablaEmpleados = new String[]{"Nombre","Precio","marca"};
        modeloTablaEmpleado = new DefaultTableModel(empleados, titulosTablaEmpleados);
        tableEmpleados.setModel(modeloTablaEmpleado);
        
        //Voy a trabajar en los cargos... Para que me vaya añadiendo los cargos al combobox de la pestaña empleados...
        
        //OJOOOOOOOO
        String[] listaCargos = new String[]{"computador","accesorio","componente"};//LQ asi añado informacion al COMBO BOX
        
        
        for(int i=0; i<listaCargos.length; i++){
             modeloComboBoxEmpleados.addElement(listaCargos[i]);
        }
              
        comboBoxCargo.setModel(modeloComboBoxEmpleados);
        
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accesorio = new javax.swing.JTabbedPane();
        panelEmpleado = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        comboBoxCargo = new javax.swing.JComboBox();
        labelCargo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();
        buttonRegistrarEmpleado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        panelRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegistro = new javax.swing.JTable();
        buttonRegistrar = new javax.swing.JButton();
        labelFondoRegistro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setText("Nombre:");
        panelEmpleado.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        labelApellido.setText("Precio");
        panelEmpleado.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        panelEmpleado.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, -1));
        panelEmpleado.add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));

        panelEmpleado.add(comboBoxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 117, 80, -1));

        labelCargo.setText("Tipo");
        panelEmpleado.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 120, -1, -1));

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableEmpleados);

        panelEmpleado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 276, 110));

        buttonRegistrarEmpleado.setText("Registrar");
        buttonRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarEmpleadoActionPerformed(evt);
            }
        });
        panelEmpleado.add(buttonRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 169, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelEmpleado.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -30, -1, -1));

        jLabel1.setText("Marca");
        panelEmpleado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        panelEmpleado.add(textMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        accesorio.addTab("Prodcuto", panelEmpleado);

        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableRegistro);

        panelRegistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 276, 110));

        buttonRegistrar.setText("Aceptar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        panelRegistro.add(buttonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 131, -1, -1));
        panelRegistro.add(labelFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 340));

        jLabel3.setText("jLabel3");
        panelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel4.setText("jLabel4");
        panelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel5.setText("jLabel5");
        panelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jTextField1.setText("jTextField1");
        panelRegistro.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jTextField2.setText("jTextField2");
        panelRegistro.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jTextField3.setText("jTextField3");
        panelRegistro.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        accesorio.addTab("computador", panelRegistro);
        accesorio.addTab("accesorio", jTabbedPane1);
        accesorio.addTab("componente", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(accesorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarEmpleadoActionPerformed
        
        String nombre = textNombre.getText();
        String precio = textPrecio.getText();
        String marca= textMarca.getText();
        
        //String marca = (String) comboBoxCargo.getSelectedItem(); 
        contadorProducto++;
        String contador = String.valueOf(contadorProducto);
        
        Productos a = new Productos(nombre, precio,marca); 
        
        //OJOOOOOOO
       modeloTablaEmpleado.addRow(new String[]{contador,nombre,precio,marca});
        
    }//GEN-LAST:event_buttonRegistrarEmpleadoActionPerformed

    
    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        //Cuando presiones el boton acptar ese filtro, pasa esto:
      
        //Antes que nada voy a empezar eliminando las filas que ya fueron filtradas con cada vez que se aplaste el boton
        
        
    }//GEN-LAST:event_buttonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane accesorio;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonRegistrarEmpleado;
    private javax.swing.JComboBox comboBoxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelFondoRegistro;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTable tableRegistro;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
