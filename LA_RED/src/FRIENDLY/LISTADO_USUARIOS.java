/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRIENDLY;

import CODE.PROJECTS;
import CORE.BE;
import CORE.USUARIOS_PANEL;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import la_red.LA_RED;
import la_red.USUARIO;
import org.json.simple.JSONObject;

/**
 *
 * @author SAMSUNG
 */

public class LISTADO_USUARIOS extends javax.swing.JFrame implements Runnable{
    /**
     * Creates new form LISTADO_USUARIOS
     */
    private String endpoint;
    public LISTADO_USUARIOS() {
        initComponents();
        if( LA_RED.usuario.getTipo() == 3 ){
            this.btnVerProyectos.setVisible(false);
        }
    }
    public LISTADO_USUARIOS(String endpoint) {
        initComponents();
        this.btnVerProyectos.setVisible(endpoint.equals("listarAmigos"));
        System.out.println( );
//        if( LA_RED.usuario.getTipo() == 3 ){
//            this.btnVerProyectos.setVisible(false);
//        }
        this.jtpTabs.setEnabledAt(1, LA_RED.usuario.getTipo() == 1);
        this.endpoint = endpoint;
    }
    public String x = "test";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPopupMenu();
        jmSolicitud = new javax.swing.JMenuItem();
        jpUsuarios = new javax.swing.JPanel();
        jtpTabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVerProyectos = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        chkActivo = new javax.swing.JCheckBox();
        txtTelefono = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        jdpFecha = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();

        jmSolicitud.setText("Enviar Solicitud");
        jmSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSolicitudActionPerformed(evt);
            }
        });
        jpMenu.add(jmSolicitud);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jtpTabs.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jtpTabsComponentShown(evt);
            }
        });

        jLabel1.setText("jLabel1");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");

        lblUserName.setText("UserName");

        jLabel2.setText("Tipo");

        jLabel3.setText("Nacionalidad");

        btnVerProyectos.setText("Ver Proyectos");
        btnVerProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerProyectosMouseClicked(evt);
            }
        });

        lblTipo.setText("jLabel5");

        lblNacionalidad.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNacionalidad)
                            .addComponent(lblTipo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 245, Short.MAX_VALUE)
                .addComponent(btnVerProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserName)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNacionalidad))
                .addGap(26, 26, 26)
                .addComponent(btnVerProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpTabs.addTab("Datos Personales", jPanel1);

        jLabel4.setText("Apellido");

        jLabel8.setText("Nombre");

        jLabel9.setText("Nacionalidad");

        btnCrear.setText("Modificar");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        jLabel10.setText("Tipo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Premium", "Basico" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        chkActivo.setText("Activo");

        lblTel.setText("Telefono");

        jdpFecha.setDateFormatString("yyyy-MM-dd");

        lblFecha.setText("Fecha Inicio");

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpDatosLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkActivo)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addGap(26, 26, 26)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jdpFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(chkActivo)
                        .addGap(10, 10, 10)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jtpTabs.addTab("Panel Administrador", jpDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jtpTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jtpTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
//        JSONArray usuarios = (JSONArray)BE.read("listarUsuarios", LA_RED.usuario.toJSON());
//        System.out.println(usuarios);
////        DefaultListModel lista = new DefaultListModel();
//        for (Object usuario : usuarios) {
//            int pos = usuarios.indexOf(usuario);
//            USUARIO nUsuario = new USUARIO( (JSONObject)usuario , this);
////            lista.addElement( nUsuario );
//            JPanel vistaSmall = nUsuario.getVistaSmall();
//            vistaSmall.setBounds(0, pos * 80, 200, 80);
//            vistaSmall.setVisible(true);
//            this.jpUsuarios.add( vistaSmall );
//        }
//        jpUsuarios.repaint();
//        jpUsuarios.validate();
            vistaSmall = new USUARIOS_PANEL(endpoint);
            
            vistaSmall.setBounds(0, 0, 200, 500);
            vistaSmall.setVisible(true);
            this.jpUsuarios.add( vistaSmall );
        jpUsuarios.repaint();
        jpUsuarios.validate();
        selectedUser = vistaSmall.getSelectedUser();
        Thread proceso =  new Thread( this );
        proceso.start();
//        this.jpDatos.setEnabled(LA_RED.usuario.getTipo() == 1);
        
//        selectedUser = vistaSmall.getSelectedUser();
//        this.lstUsuarios.setModel(lista);
    }//GEN-LAST:event_formComponentShown

    private void jmSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSolicitudActionPerformed
        // TODO add your handling code here:
        JSONObject data = new JSONObject();
        data.put("id", selectedUser.getId());
        BE.read("enviarSolicitud", data);
        System.out.println(selectedUser.getId());
    }//GEN-LAST:event_jmSolicitudActionPerformed

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked

        JSONObject nUsuario = new JSONObject();
        nUsuario.put("nombre",this.txtNombre.getText());
        nUsuario.put("apellido", this.txtApellido.getText());
        //        nUsuario.put("user_name",this.txtUserName.getText());
        //        nUsuario.put("password",this.txtPassword.getText());
        nUsuario.put("nacionalidad",this.txtNacionalidad.getText());
        nUsuario.put("telefono",this.txtTelefono.getText());
        nUsuario.put("id",this.selectedUser.getId());
        nUsuario.put("tipo", this.cmbTipo.getSelectedIndex());
        nUsuario.put("activo", ( this.chkActivo.isSelected() ? 1 : 0));
        //        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //            nUsuario.put("fecha_nacimiento",dt.format(this.jdpFecha.getDate()) );
            //            System.out.println(dt.format(this.jdpFecha.getDate()));
            BE.read("modificarUser", nUsuario);

        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Usuario Creado con exito", "Registro",JOptionPane.INFORMATION_MESSAGE);
        this.hide();
        //        JSONArray usuarios = (JSONArray)(BE.READ("usuario", new String[]{"user_name"} , new Object[][]{
            //            {"user_name","=",this.txtUserName.getText()}
            //        }));
//        if( usuarios.size() == 0){
    //            BE.CREATE("usuario", nuevoUsuario);
    //        }else{
    //            System.out.println("Usuario ya existe");
    //        }
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnVerProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerProyectosMouseClicked
        // TODO add your handling code here:
        PROJECTS nProyectos = new PROJECTS( selectedUser.getId() );
        nProyectos.show();
    }//GEN-LAST:event_btnVerProyectosMouseClicked

    private void jtpTabsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jtpTabsComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jtpTabsComponentShown

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        // TODO add your handling code here:
        if( this.cmbTipo.getSelectedIndex() == 1 ){
            this.lblFecha.setVisible(true);
            this.lblTel.setVisible(true);
            this.jdpFecha.setVisible( true );
            this.txtTelefono.setVisible( true );
        }else{
            this.lblFecha.setVisible(true);
            this.lblTel.setVisible(true);
            this.jdpFecha.setVisible(true);
            this.txtTelefono.setVisible(true);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LISTADO_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LISTADO_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LISTADO_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LISTADO_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() { 
//                new LISTADO_USUARIOS().setVisible(true);
//            }
//        });
    }
    @Override
    public void run(){
        while( true ){
            try {
//                System.out.println(selectedUser.getId() + " !== " + vistaSmall.getSelectedUser().getId() );
//                if( selectedUser.getId() != vistaSmall.getSelectedUser().getId() ){
                    selectedUser = vistaSmall.getSelectedUser();
                    this.lblNombre.setText( selectedUser.getNombre() + " " + selectedUser.getApellido());
                    this.lblUserName.setText( selectedUser.getUser_name());
                    this.lblNacionalidad.setText( selectedUser.getNacionalidad());
                    this.lblTipo.setText( selectedUser.getTipo() == 1 ? "Administrador" : selectedUser.getTipo() == 2 ? "Premium" : "Regular");
                    this.txtNombre.setText( selectedUser.getNombre() );
                    this.txtApellido.setText( selectedUser.getApellido());
                    this.txtTelefono.setText( selectedUser.getTelefono());
                    this.txtNacionalidad.setText( selectedUser.getNacionalidad());
                    this.cmbTipo.setSelectedIndex( selectedUser.getTipo());
                    this.chkActivo.setEnabled((selectedUser.getActivo() == 1));
                    this.chkActivo.setEnabled((selectedUser.getActivo() == 1));
//                    this.txtUserName.setText( selectedUser.getUser_name());
//                    this.txtPassword.setText( selectedUser.getNombre() );
//                    this.txtNacionalidad.setText( selectedUser. );
                    this.cmbTipo.setSelectedIndex(selectedUser.getTipo());
//                    JSONObject data = new JSONObject();
//                    data.put("id_amigo",selectedUser.getId());
//                    JSONArray mensajes = (JSONArray)BE.read("obtenerMsj", data);
//                    String contenido = "";
//                    for (Object mensaje : mensajes) {
//                        JSONObject msjJSON = (JSONObject)mensaje;
//                        contenido += msjJSON.get("fecha") + selectedUser.getUser_name() + "-->" + "Contexto"+"\n";
//                    }
//                    txtMensajes.setText( contenido );
//                    Thread.sleep( 1000 );
//                    System.out.println("Mensajes ===> " + mensajes.toJSONString());
//                    System.out.println( "SELECTED =============> " + selectedUser.getId() );
//                }
                Thread.sleep( 100 );
            } catch (Exception e) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVerProyectos;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdpFecha;
    private javax.swing.JMenuItem jmSolicitud;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPopupMenu jpMenu;
    private javax.swing.JPanel jpUsuarios;
    private javax.swing.JTabbedPane jtpTabs;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    private USUARIO selectedUser;
    private USUARIOS_PANEL vistaSmall;
}
