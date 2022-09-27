/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.util.List;
import java.util.ArrayList;
import modelo.Estudiante;

/**
 *
 * @author usuario
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    List <Estudiante>estudianteList=null;
    public Formulario() {
        initComponents();
        setTitle("Registro Estudiante");
        estudianteList=new ArrayList<Estudiante>();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Registro = new javax.swing.JPanel();
        jLabel_codigo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_apellido = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_seminario = new javax.swing.JLabel();
        jTextField_codigo = new javax.swing.JTextField();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_seminario = new javax.swing.JTextField();
        jPanel_botones = new javax.swing.JPanel();
        jButton_guardar = new javax.swing.JButton();
        jButton_Mostrar = new javax.swing.JButton();
        jPanel_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_codigo.setText("Codigo:");

        jLabel_nombre.setText("Nombre:");

        jLabel_apellido.setText("Apellido:");

        jLabel_email.setText("Email:");

        jLabel_seminario.setText("Seminario:");

        jTextField_codigo.setText("jTextField1");
        jTextField_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codigoActionPerformed(evt);
            }
        });

        jTextField_nombre.setText("jTextField2");

        jTextField_apellido.setText("jTextField3");

        jTextField_email.setText("jTextField4");

        jTextField_seminario.setText("jTextField5");
        jTextField_seminario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_seminarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_RegistroLayout = new javax.swing.GroupLayout(jPanel_Registro);
        jPanel_Registro.setLayout(jPanel_RegistroLayout);
        jPanel_RegistroLayout.setHorizontalGroup(
            jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegistroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_RegistroLayout.createSequentialGroup()
                        .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_RegistroLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel_codigo)
                                    .addGap(74, 74, 74))
                                .addGroup(jPanel_RegistroLayout.createSequentialGroup()
                                    .addComponent(jLabel_nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(jLabel_apellido)
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jTextField_nombre)
                            .addComponent(jTextField_apellido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_RegistroLayout.createSequentialGroup()
                        .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_email)
                            .addComponent(jLabel_seminario))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_email)
                            .addComponent(jTextField_seminario))))
                .addGap(38, 38, 38))
        );
        jPanel_RegistroLayout.setVerticalGroup(
            jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_codigo)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_apellido)
                    .addComponent(jTextField_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_seminario)
                    .addComponent(jTextField_seminario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        jButton_Mostrar.setText("Mostrar");
        jButton_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_botonesLayout = new javax.swing.GroupLayout(jPanel_botones);
        jPanel_botones.setLayout(jPanel_botonesLayout);
        jPanel_botonesLayout.setHorizontalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Mostrar)
                    .addComponent(jButton_guardar))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel_botonesLayout.setVerticalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton_guardar)
                .addGap(29, 29, 29)
                .addComponent(jButton_Mostrar)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jButton_guardar.getAccessibleContext().setAccessibleName("");

        jLabel1.setText("REGISTRO ESTUDIANTE");

        javax.swing.GroupLayout jPanel_tituloLayout = new javax.swing.GroupLayout(jPanel_titulo);
        jPanel_titulo.setLayout(jPanel_tituloLayout);
        jPanel_tituloLayout.setHorizontalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tituloLayout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
        );
        jPanel_tituloLayout.setVerticalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTextArea_mostrar.setColumns(20);
        jTextArea_mostrar.setRows(5);
        jScrollPane1.setViewportView(jTextArea_mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codigoActionPerformed

    private void jTextField_seminarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_seminarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_seminarioActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Estudiante e= new Estudiante();
        e.setCodigo(jTextField_codigo.getText());
        e.setNombre(jTextField_nombre.getText());
        e.setApellido(jTextField_apellido.getText());
        e.setEmail(jTextField_email.getText());
        e.setSeminario(jTextField_seminario.getText());
        
        estudianteList.add(e);
                
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jButton_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarActionPerformed
       jTextArea_mostrar.setText(estudianteList.toString());
    }//GEN-LAST:event_jButton_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Mostrar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_apellido;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_seminario;
    private javax.swing.JPanel jPanel_Registro;
    private javax.swing.JPanel jPanel_botones;
    private javax.swing.JPanel jPanel_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_mostrar;
    public javax.swing.JTextField jTextField_apellido;
    public javax.swing.JTextField jTextField_codigo;
    public javax.swing.JTextField jTextField_email;
    public javax.swing.JTextField jTextField_nombre;
    public javax.swing.JTextField jTextField_seminario;
    // End of variables declaration//GEN-END:variables
}
