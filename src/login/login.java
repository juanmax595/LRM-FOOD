/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import login.iniciar.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Lugo
 */
public class login extends javax.swing.JFrame {


    public login() {
        initComponents();
    }
    conexion conn=new conexion();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Usuar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        INusu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ingresarusu1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        contra = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        butoningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setText("Correo");

        javax.swing.GroupLayout UsuarLayout = new javax.swing.GroupLayout(Usuar);
        Usuar.setLayout(UsuarLayout);
        UsuarLayout.setHorizontalGroup(
            UsuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );
        UsuarLayout.setVerticalGroup(
            UsuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );

        BG.add(Usuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo rappi/FoodHub Logotipos.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 570, 500));

        INusu.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        INusu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INusu.setText("Inicio sesion");
        INusu.setToolTipText("");
        BG.add(INusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 34));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 10));

        ingresarusu1.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        ingresarusu1.setForeground(new java.awt.Color(153, 153, 153));
        ingresarusu1.setText("Ingrese su correo");
        ingresarusu1.setBorder(null);
        ingresarusu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarusu1ActionPerformed(evt);
            }
        });
        BG.add(ingresarusu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 20));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 10));

        contra.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        contra.setText("Contraseña");
        BG.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        BG.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        butoningresar.setText("ingresar");
        butoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoningresarActionPerformed(evt);
            }
        });
        BG.add(butoningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarusu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarusu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarusu1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void butoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoningresarActionPerformed
        // TODO add your handling code here
        try{
        conexion con=new conexion();
        String u= ingresarusu1.getText();
        String c= jPasswordField1.getText();
        con.ConectarBasedeDatos();
        String SQL="SELECT idusuario,nombre FROM usuario WHERE correo='"+u+"'AND contraseña='"+c+"'";
        con.resultado=con.sentencia.executeQuery(SQL);
        if(con.resultado.next()){
            setVisible(false);
            //Menu menu=new menu()
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }catch(SQLException e){
        
    }
        
    }//GEN-LAST:event_butoningresarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel INusu;
    private javax.swing.JPanel Usuar;
    private javax.swing.JButton butoningresar;
    private javax.swing.JLabel contra;
    private javax.swing.JTextField ingresarusu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
