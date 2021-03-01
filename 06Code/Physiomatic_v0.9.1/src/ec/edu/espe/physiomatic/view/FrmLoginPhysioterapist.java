/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

/**
 *
 * @author Acer
 * @author Yulliana Roman ESPE-DCCO
 * @author pzeadrian
 */
public class FrmLoginPhysioterapist extends javax.swing.JFrame {

    /**
     * Creates new form JFLoginPhysioterapist
     */
    public FrmLoginPhysioterapist() {
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

        lbTitle = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnAccept = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lbIcon = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("INICIAR SESIÓN");
        getContentPane().add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        lbUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        lbUserName.setText("USUARIO:");
        getContentPane().add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 30));

        lbPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("CONTRASEÑA:");
        getContentPane().add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 30));

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 180, 30));

        pwdPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 220, 30));

        btnAccept.setBackground(new java.awt.Color(0, 51, 51));
        btnAccept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Atrás");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 40));

        btnNext.setBackground(new java.awt.Color(0, 51, 51));
        btnNext.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 120, 40));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/userIcon.png"))); // NOI18N
        lbIcon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbIconFocusGained(evt);
            }
        });
        getContentPane().add(lbIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 200, 220));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background2.jpg"))); // NOI18N
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 392, 529));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        FrmPhysioterapistManagment frmPhysioterapistManagment = new FrmPhysioterapistManagment();
        this.setVisible(false);
        frmPhysioterapistManagment.setVisible(true);
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        FrmMenuPhysioterapist frmMenuPhyisioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frmMenuPhyisioterapist.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void lbIconFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbIconFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lbIconFocusGained

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
            java.util.logging.Logger.getLogger(FrmLoginPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoginPhysioterapist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lbBackground;
    public javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
