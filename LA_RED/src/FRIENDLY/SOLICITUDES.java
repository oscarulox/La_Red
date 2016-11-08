/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRIENDLY;

import CORE.BE;
import CORE.USUARIOS_PANEL;
import javax.swing.DefaultListModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author SAMSUNG
 */
public class SOLICITUDES extends javax.swing.JFrame {
    private class SOLICITUD{
        private int id, id_remitente;
        private String user_name;

        public SOLICITUD(JSONObject data) {
            this.id = Integer.parseInt( data.get("id").toString() );
            this.id_remitente = Integer.parseInt( data.get("id_remitente").toString() );
            this.user_name = data.get("user_name").toString();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId_remitente() {
            return id_remitente;
        }

        public void setId_remitente(int id_remitente) {
            this.id_remitente = id_remitente;
        }
        
        public JSONObject toJSON(){
            JSONObject response = new JSONObject();
            response.put("id", id);
            response.put("id_remitente", id_remitente);
            return response;
        }

        @Override
        public String toString() {
            return user_name;
        }
        
        
        
    }
    /**
     * Creates new form SOLICITUDES
     */
    public SOLICITUDES() {
        initComponents();
    }

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jpUsuarios = new javax.swing.JPanel();

        jmSolicitud.setText("Aceptar Solicitud");
        jmSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSolicitudActionPerformed(evt);
            }
        });
        jpMenu.add(jmSolicitud);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jpUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        JSONArray solicitudes = (JSONArray)BE.read("listarSolicitudes", null);
        System.out.println("133 --> " + solicitudes);
//        DefaultListModel lista = new DefaultListModel();
//        for (Object solicitud : solicitudes) {
//            lista.addElement( new SOLICITUD( (JSONObject) solicitud ) );
//        }
//        this.lstSolicitudes.setModel(lista);
        
        USUARIOS_PANEL vistaSmall = new USUARIOS_PANEL("listarSolicitudes");

        vistaSmall.setBounds(0, 0, 200, 500);
        vistaSmall.setVisible(true);
        this.jpUsuarios.add( vistaSmall );
        jpUsuarios.repaint();
        jpUsuarios.validate();
    }//GEN-LAST:event_formComponentShown

    private void jmSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSolicitudActionPerformed
        // TODO add your handling code here:
        JSONObject data = new JSONObject();
        data.put("id", solicitudSelec.getId());
        BE.read("aceptarSolicitud", data);
        System.out.println(solicitudSelec.getId());
    }//GEN-LAST:event_jmSolicitudActionPerformed

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
            java.util.logging.Logger.getLogger(SOLICITUDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SOLICITUDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SOLICITUDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SOLICITUDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SOLICITUDES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmSolicitud;
    private javax.swing.JPopupMenu jpMenu;
    private javax.swing.JPanel jpUsuarios;
    // End of variables declaration//GEN-END:variables
    private SOLICITUD solicitudSelec;
}
