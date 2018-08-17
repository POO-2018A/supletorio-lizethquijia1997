package supletorio;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Interfaz extends javax.swing.JFrame {
    
    
    int contadorProducto = 0; 
    String [][] productos;
    
    DefaultTableModel modeloTablaEmpleado;
    ArrayList<Productos> listaEmpleados = new ArrayList(); 
    DefaultComboBoxModel modeloComboBoxEmpleados = new DefaultComboBoxModel(listaEmpleados.toArray());
        
    int contadorGerentes, contadorSecretarios, contadorVendedores, contadorChoferes = 0;
    String[][] registros;
    DefaultTableModel modeloTablaRegistro; 
    
    //computador
    String [][] computador;
    DefaultTableModel modeloTablaComputador;
    ArrayList<Computador> listaComputador = new ArrayList(); 
    DefaultComboBoxModel modeloComboBoxComputador = new DefaultComboBoxModel(listaComputador.toArray());
        
    int contadorComputadoras= 0;
    String[][] registrosComputador;
    DefaultTableModel modeloTablaRegistroComputador; 
    
    //accesorio
    String [][] accesorio;
    DefaultTableModel modeloTablaAccesorio;
    ArrayList<Accesorio> listaAccesorio = new ArrayList(); 
    DefaultComboBoxModel modeloComboBoxAccesorio = new DefaultComboBoxModel(listaAccesorio.toArray());
        
    int contadorAccesorio= 0;
    String[][] registrosAccesorio;
    DefaultTableModel modeloTablaRegistroAccesorio; 
    
    // componente
    
   String [][] componente;
    DefaultTableModel modeloTablaComponente;
    ArrayList<Componente> listaComponente = new ArrayList(); 
    DefaultComboBoxModel modeloComboBoxComponente = new DefaultComboBoxModel(listaComponente.toArray());
        
    int contadorComponente= 0;
    String[][] registrosComponente;
    DefaultTableModel modeloTablaRegistroComponente; 
    
    
    public Interfaz() {
        initComponents();
        
       
         pSupletorio.setSelectedIndex(0);
        
        String[] titulosTablaEmpleados = new String[]{"#","Nombre","Precio","marca"};
        modeloTablaEmpleado = new DefaultTableModel(productos, titulosTablaEmpleados);
           
        String[] listaCargos = new String[]{"computador","accesorio","componente"};//LQ asi añado informacion al COMBO BOX
        
        for(int i=0; i<listaCargos.length; i++){
             modeloComboBoxEmpleados.addElement(listaCargos[i]);
        }       
        cmbTipoProducto.setModel(modeloComboBoxEmpleados);
         
        //Computador
        
        String[] titulosTablaComputador = new String[]{"tipo","almacenamiento","RAM","procesador"};
        modeloTablaComputador  = new DefaultTableModel(computador, titulosTablaComputador );
           tblComputador.setModel(modeloTablaComputador); 
       // cmbTipoProducto.setModel(modeloComboBoxComputador);
        
        //CCESORIO
        
        String[] titulosTablaAccesorio = new String[]{"tipo","color"};
        modeloTablaAccesorio  = new DefaultTableModel(accesorio, titulosTablaAccesorio ); 
      tblAccesorio.setModel(modeloTablaAccesorio); 
        // cmbTipoProducto.setModel(modeloComboBoxAccesorio);
        //COMPONENTE
       
         String[] titulosTablaComponente = new String[]{"tipo","capacidad","velocidad"};
        modeloTablaComponente = new DefaultTableModel(componente, titulosTablaComponente);
             tblComponente.setModel(modeloTablaComponente); 
             // cmbTipoProducto.setModel(modeloComboBoxComponente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pSupletorio = new javax.swing.JTabbedPane();
        tpnProducto = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        cmbTipoProducto = new javax.swing.JComboBox();
        labelCargo = new javax.swing.JLabel();
        btnRegistrarProducto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnVerRegistros = new javax.swing.JButton();
        panelRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComputador = new javax.swing.JTable();
        btnRegistrarCompu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipoComp = new javax.swing.JTextField();
        txtCapa = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProcesador = new javax.swing.JTextField();
        btnOtroProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnRegistrarAccesorio = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAccesorio = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTipoComponente = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        btnRegistrarComponente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblComponente = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        cmbRegistros = new javax.swing.JComboBox<>();
        btnVer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpnProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setText("Nombre:");
        tpnProducto.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        labelApellido.setText("Precio");
        tpnProducto.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        tpnProducto.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));

        tpnProducto.add(cmbTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 117, 80, -1));

        labelCargo.setText("Tipo");
        tpnProducto.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 120, -1, -1));

        btnRegistrarProducto.setText("Registrar");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });
        tpnProducto.add(btnRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        tpnProducto.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -30, -1, -1));

        jLabel1.setText("Marca");
        tpnProducto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        tpnProducto.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        btnVerRegistros.setText("Ver registros");
        btnVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistrosActionPerformed(evt);
            }
        });
        tpnProducto.add(btnVerRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 120, -1));

        pSupletorio.addTab("Producto", tpnProducto);

        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblComputador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblComputador);

        panelRegistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 276, 70));

        btnRegistrarCompu.setText("registrar computador");
        btnRegistrarCompu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompuActionPerformed(evt);
            }
        });
        panelRegistro.add(btnRegistrarCompu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel3.setText("tipo");
        panelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel4.setText("capacidad de alma.");
        panelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel5.setText("RAM");
        panelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        panelRegistro.add(txtTipoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, -1));

        txtCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapaActionPerformed(evt);
            }
        });
        panelRegistro.add(txtCapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 90, -1));
        panelRegistro.add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));

        jLabel10.setText("procesador");
        panelRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        panelRegistro.add(txtProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, -1));

        btnOtroProducto.setText("Ingresar otro producto");
        btnOtroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtroProductoActionPerformed(evt);
            }
        });
        panelRegistro.add(btnOtroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        pSupletorio.addTab("computador", panelRegistro);

        jLabel2.setText("tipo");

        jLabel6.setText("color");

        btnRegistrarAccesorio.setText("resgistrar accesorio");
        btnRegistrarAccesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAccesorioActionPerformed(evt);
            }
        });

        tblAccesorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblAccesorio);

        jButton1.setText("Ingresar otro producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtColor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnRegistrarAccesorio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarAccesorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pSupletorio.addTab("accesorio", jPanel2);

        jLabel7.setText("tipo");

        jLabel8.setText("capacidad");

        jLabel9.setText("velocidad");

        btnRegistrarComponente.setText("registrar componente");
        btnRegistrarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarComponenteActionPerformed(evt);
            }
        });

        tblComponente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblComponente);

        jButton2.setText("Ingresar otro producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipoComponente, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(txtCapacidad)
                            .addComponent(txtVelocidad)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnRegistrarComponente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarComponente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pSupletorio.addTab("componente", jPanel3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable4);

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jButton3.setText("Ingresar otro producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btnVer))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(cmbRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(cmbRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pSupletorio.addTab("Registros", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pSupletorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pSupletorio, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCompuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompuActionPerformed

        String tipo = txtTipoComp.getText();
        String almacenamiento = txtCapa.getText();
        String ram= txtRam.getText();
         String procesador = txtProcesador.getText();
         
           String cargo = (String) cmbTipoProducto.getSelectedItem();    
 String contador = String.valueOf(contadorProducto);

        //Computador a  = new Computador(tipo, capacidad,ram,procesador);

        //OJOOOOOOO
        modeloTablaComputador.addRow(new String[]{tipo,almacenamiento,ram,procesador});

         
        
        // TODO add your handling code here:
        //Cuando presiones el boton acptar ese filtro, pasa esto:

        //Antes que nada voy a empezar eliminando las filas que ya fueron filtradas con cada vez que se aplaste el boton
    
    }//GEN-LAST:event_btnRegistrarCompuActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed

        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String marca= txtMarca.getText();

       
        contadorProducto++;
        String contador = String.valueOf(contadorProducto);

        Productos a = new Productos(nombre, precio,marca);

        //OJOOOOOOO
        modeloTablaEmpleado.addRow(new String[]{contador,nombre,precio,marca});

         String tipo = cmbTipoProducto.getSelectedItem().toString();

        if (tipo.equals("computador")) {
            pSupletorio.setSelectedIndex(1);
            btnRegistrarCompu.setEnabled(true);       
    }   
        
         if (tipo.equals("accesorio")) {
            pSupletorio.setSelectedIndex(2);
            btnRegistrarAccesorio.setEnabled(true);       
    }          
         
          if (tipo.equals("componente")) {
            pSupletorio.setSelectedIndex(3);
            btnRegistrarComponente.setEnabled(true);       
    }          
          
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void txtCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapaActionPerformed

    private void btnRegistrarAccesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAccesorioActionPerformed
        // TODO add your handling code here:
        
         String tipo = txtTipo.getText();
        String color = txtColor.getText();
        
        String contador = String.valueOf(contadorProducto);
           
        modeloTablaAccesorio.addRow(new String[]{tipo,color});

       
    }//GEN-LAST:event_btnRegistrarAccesorioActionPerformed

    private void btnRegistrarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarComponenteActionPerformed
        // TODO add your handling code here:
        
        String tipo = txtTipoComponente.getText();
        String almacenamiento = txtCapacidad.getText();
        String velocidad= txtVelocidad.getText();
       
              
 String contador = String.valueOf(contadorProducto);

        //Computador a  = new Computador(tipo, capacidad,ram,procesador);

        //OJOOOOOOO
        modeloTablaComponente.addRow(new String[]{tipo,almacenamiento,velocidad});
        
    }//GEN-LAST:event_btnRegistrarComponenteActionPerformed

    private void btnOtroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtroProductoActionPerformed
      pSupletorio.setSelectedIndex(0);
      txtNombre.setText("");
      txtMarca.setText("");
      txtPrecio.setText("");
 // TODO add your handling code here:
    }//GEN-LAST:event_btnOtroProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
pSupletorio.setSelectedIndex(0);  
txtNombre.setText("");
      txtMarca.setText("");
      txtPrecio.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
pSupletorio.setSelectedIndex(0); 
txtNombre.setText("");
      txtMarca.setText("");
      txtPrecio.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistrosActionPerformed
      pSupletorio.setSelectedIndex(4);   // TODO add your handling code here:
    }//GEN-LAST:event_btnVerRegistrosActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
         
        
       int numeroFilas = modeloTablaRegistro.getRowCount();
        for(int i= 0; i<numeroFilas; i++){
            modeloTablaRegistro.removeRow(0);
        }
        String cargoFiltrado = (String) cmbRegistros.getSelectedItem();
        System.out.println("Item seleccionado: "+cargoFiltrado);
       
//       for(Computador item: listaComputador){ 
//            if(cargoFiltrado.equals("Computador")){ //Entra aqui:
//                //Si el empleado "X" tiene por cargo: 
//                if(item.getCargo().equals("Accesorio")){
//                System.out.println("Solo se han filtrado: "+item.getCargo());
//                contadorGerentes++;
//                String contador = String.valueOf(contadorGerentes);
//                 //...entonces añadelo a mi tabla de filtrado!
//            
//               modeloTablaRegistro.addRow(new String[]{contador,item.getNombre(),item.getMarca(), item.getPrecio()});               }
//           }
//       }
    }//GEN-LAST:event_btnVerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         pSupletorio.setSelectedIndex(0);
      txtNombre.setText("");
      txtMarca.setText("");
      txtPrecio.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
    private javax.swing.JButton btnOtroProducto;
    private javax.swing.JButton btnRegistrarAccesorio;
    private javax.swing.JButton btnRegistrarComponente;
    private javax.swing.JButton btnRegistrarCompu;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVerRegistros;
    private javax.swing.JComboBox<String> cmbRegistros;
    private javax.swing.JComboBox cmbTipoProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTabbedPane pSupletorio;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTable tblAccesorio;
    private javax.swing.JTable tblComponente;
    private javax.swing.JTable tblComputador;
    private javax.swing.JPanel tpnProducto;
    private javax.swing.JTextField txtCapa;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTipoComp;
    private javax.swing.JTextField txtTipoComponente;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
