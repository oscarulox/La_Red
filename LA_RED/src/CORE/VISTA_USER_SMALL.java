/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CORE;

import java.awt.Component;
import javax.swing.JButton;
import org.json.simple.JSONObject;

/**
 *
 * @author SAMSUNG
 */
public class VISTA_USER_SMALL extends javax.swing.JPanel implements Runnable{
    
    /**
     * Creates new form VISTA_USER_SMALL
     * @param nombre
     * @param apellido
     */
    private int id;
    private Component parent;
    public VISTA_USER_SMALL(int id, String nombre, String apellido, String user_name, Component parent) {
        initComponents();
        this.id = id;
        this.jlNombre.setText( nombre + apellido );
        this.jlUser_name.setText( user_name );
        this.parent = parent;
    }
    public void run(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlImagen = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlUser_name = new javax.swing.JLabel();
        btnSolicitud = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));

        jlImagen.setText("FOTO");

        jlNombre.setText("jlNombre");

        jlUser_name.setText("jLabel3");

        btnSolicitud.setText("Enviar Solicitud");
        btnSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSolicitudMouseClicked(evt);
            }
        });

        btnVer.setText("Ver");

        jButton1.setText("Follow");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUser_name))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolicitud))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUser_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitud)
                    .addComponent(btnVer)
                    .addComponent(jButton1)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitudMouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_btnSolicitudMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSolicitud;
    public javax.swing.JButton btnVer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlUser_name;
    // End of variables declaration//GEN-END:variables
}
