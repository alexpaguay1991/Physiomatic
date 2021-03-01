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
 */
public class FrmPhysioterapistManagment extends javax.swing.JFrame {

    /**
     * Creates new form JFPhysioterapistManagment
     */
    public FrmPhysioterapistManagment() {
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

        jLabel5 = new javax.swing.JLabel();
        LBTitle = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lbBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuLogin = new javax.swing.JMenu();
        minLoginPhyisioterapist = new javax.swing.JMenuItem();
        mnuRegister = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBTitle.setFont(new java.awt.Font("Arial", 3, 60)); // NOI18N
        LBTitle.setForeground(new java.awt.Color(255, 255, 255));
        LBTitle.setText("PHYSIOMATIC v1.0");
        getContentPane().add(LBTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 680, -1));

        lbName.setFont(new java.awt.Font("Arial", 2, 25)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Powered By SDC Team");
        getContentPane().add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 102, 102));
        btnExit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(254, 254, 254));
        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 120, 50));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 731, 558));

        mnuLogin.setText("INICIAR SESIÓN");

        minLoginPhyisioterapist.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        minLoginPhyisioterapist.setText("Fisioterapeuta");
        minLoginPhyisioterapist.setActionCommand("Fisioterapeuta");
        minLoginPhyisioterapist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minLoginPhyisioterapistActionPerformed(evt);
            }
        });
        mnuLogin.add(minLoginPhyisioterapist);

        jMenuBar1.add(mnuLogin);

        mnuRegister.setText("REGISTRARSE");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Paciente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuRegister.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Fisioterapeuta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuRegister.add(jMenuItem2);

        jMenuBar1.add(mnuRegister);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minLoginPhyisioterapistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minLoginPhyisioterapistActionPerformed

        this.setVisible(false);
        FrmLoginPhysioterapist frmLoginPhysioterapist = new FrmLoginPhysioterapist();
        frmLoginPhysioterapist.setVisible(true);
    }//GEN-LAST:event_minLoginPhyisioterapistActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmCreatePatient frmCreatePatient = new FrmCreatePatient();
        this.setVisible(false);
        frmCreatePatient.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       FrmRegistrationPhysioterapist frmRegisterPhysioterapist = new FrmRegistrationPhysioterapist();
       this.setVisible(false);
       frmRegisterPhysioterapist.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPhysioterapistManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPhysioterapistManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPhysioterapistManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPhysioterapistManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPhysioterapistManagment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBTitle;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbName;
    private javax.swing.JMenuItem minLoginPhyisioterapist;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JMenu mnuRegister;
    // End of variables declaration//GEN-END:variables
}
