/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.utils.Connection;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFLoginPhysioterapist
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        tfpassword = new javax.swing.JPasswordField();
        btnAccept = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 130, 30));

        tfUser.setBackground(new java.awt.Color(0, 153, 153));
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        getContentPane().add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 160, 30));

        tfpassword.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 160, 30));

        btnAccept.setBackground(new java.awt.Color(0, 51, 51));
        btnAccept.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Atrás");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 91, -1));

        btnNext.setBackground(new java.awt.Color(0, 51, 51));
        btnNext.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 91, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/userIcon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 220));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background2.jpg"))); // NOI18N
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 392, 529));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        FrmPhysioterapistManagment frmPhysioterapistManagment = new FrmPhysioterapistManagment();
        this.setVisible(false);
        frmPhysioterapistManagment.setVisible(true);
    }//GEN-LAST:event_btnAcceptActionPerformed

    Connection conection;
    String username;
    String password;
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       conection =new Connection("physioterapist");
        Physioterapist physioterapist;
        username=tfUser.getText();
        password= tfpassword.getText();
        physioterapist=conection.retrievePhysioterapist(username, password);
        if (username.contentEquals(physioterapist.getUserName()) && password.contentEquals(physioterapist.getPassword())){
            FrmMenuPhysioterapist frmMenuPhyisioterapist = new FrmMenuPhysioterapist();
            this.setVisible(false);
            frmMenuPhyisioterapist.setVisible(true);
        }else{
            JOptionPane.showConfirmDialog(null, "USUARIO Y CONTRASEÑA INVÁLIDOS", "ERROR DE AUTENTICACIÓN" + "\nGuardado", JOptionPane.INFORMATION_MESSAGE);
           
        }
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JTextField tfUser;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
