/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class FrmMenuPhysioterapist extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPhysioterapist
     */
    public FrmMenuPhysioterapist() {
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

        jMenu4 = new javax.swing.JMenu();
        lbTittle = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbName2 = new javax.swing.JLabel();
        lbName3 = new javax.swing.JLabel();
        lbName4 = new javax.swing.JLabel();
        lbName5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JToggleButton();
        lbBackground = new javax.swing.JLabel();
        mbrPhysioterapistMenu = new javax.swing.JMenuBar();
        mnuPatient = new javax.swing.JMenu();
        mitmShow = new javax.swing.JMenuItem();
        mnuAppointment = new javax.swing.JMenu();
        mitmShowAppoinment = new javax.swing.JMenuItem();
        mitmAddAppoinment = new javax.swing.JMenuItem();
        mnuClinicalHistory = new javax.swing.JMenu();
        mitmShowClinicalHistory = new javax.swing.JMenuItem();
        mnuModify = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mitmCreateDiagnotic = new javax.swing.JMenuItem();
        mnuBill = new javax.swing.JMenu();
        mitmShowBill = new javax.swing.JMenuItem();
        mitmCreateBill = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTittle.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lbTittle.setForeground(new java.awt.Color(0, 51, 51));
        lbTittle.setText("PHYSIOMATIC");
        getContentPane().add(lbTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 430, 110));

        lbName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("ROMAN YULLIANA");
        getContentPane().add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        lbName2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbName2.setForeground(new java.awt.Color(255, 255, 255));
        lbName2.setText("PAEZ ADRIAN");
        getContentPane().add(lbName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        lbName3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbName3.setForeground(new java.awt.Color(255, 255, 255));
        lbName3.setText("PAGUAY ALEX");
        getContentPane().add(lbName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        lbName4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbName4.setForeground(new java.awt.Color(255, 255, 255));
        lbName4.setText("PATIÑO BRYAN");
        getContentPane().add(lbName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        lbName5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbName5.setForeground(new java.awt.Color(255, 255, 255));
        lbName5.setText("RISUEÑO SANTIAGO");
        getContentPane().add(lbName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 51, 51));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("ATRÁS");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        lbBackground.setText("jLabel1");
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 729, 565));

        mnuPatient.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        mnuPatient.setText("Pacientes");

        mitmShow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitmShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmShow.setForeground(new java.awt.Color(0, 51, 51));
        mitmShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/mostrar.png"))); // NOI18N
        mitmShow.setText("Mostrar");
        mitmShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmShowActionPerformed(evt);
            }
        });
        mnuPatient.add(mitmShow);

        mbrPhysioterapistMenu.add(mnuPatient);

        mnuAppointment.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        mnuAppointment.setText("Citas");

        mitmShowAppoinment.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mitmShowAppoinment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmShowAppoinment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/mostrar.png"))); // NOI18N
        mitmShowAppoinment.setText("Mostrar");
        mitmShowAppoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmShowAppoinmentActionPerformed(evt);
            }
        });
        mnuAppointment.add(mitmShowAppoinment);

        mitmAddAppoinment.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mitmAddAppoinment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmAddAppoinment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/appointmentIcon.png"))); // NOI18N
        mitmAddAppoinment.setText("Generar");
        mnuAppointment.add(mitmAddAppoinment);

        mbrPhysioterapistMenu.add(mnuAppointment);

        mnuClinicalHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        mnuClinicalHistory.setText("Historiales Médicos");

        mitmShowClinicalHistory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mitmShowClinicalHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmShowClinicalHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/mostrar.png"))); // NOI18N
        mitmShowClinicalHistory.setText("Mostrar");
        mnuClinicalHistory.add(mitmShowClinicalHistory);

        mnuModify.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        mnuModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/modifyIcon.png"))); // NOI18N
        mnuModify.setText("Modificar");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/heigthIcon.jpeg"))); // NOI18N
        jMenuItem6.setText("Estatura");
        mnuModify.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/weightIcon.jpg"))); // NOI18N
        jMenuItem7.setText("Peso");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnuModify.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/addressIcon.jpg"))); // NOI18N
        jMenuItem8.setText("Dirección");
        mnuModify.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/phoneIcon.jpg"))); // NOI18N
        jMenuItem9.setText("Número telefónico");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnuModify.add(jMenuItem9);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/emailIcon.png"))); // NOI18N
        jMenuItem5.setText("Email");
        mnuModify.add(jMenuItem5);

        mnuClinicalHistory.add(mnuModify);

        mitmCreateDiagnotic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mitmCreateDiagnotic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmCreateDiagnotic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/diagnosticIcon.png"))); // NOI18N
        mitmCreateDiagnotic.setText("Crear diagnóstico");
        mitmCreateDiagnotic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmCreateDiagnoticActionPerformed(evt);
            }
        });
        mnuClinicalHistory.add(mitmCreateDiagnotic);

        mbrPhysioterapistMenu.add(mnuClinicalHistory);

        mnuBill.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        mnuBill.setText("Facturas");

        mitmShowBill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mitmShowBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmShowBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/mostrar.png"))); // NOI18N
        mitmShowBill.setText("Mostrar");
        mitmShowBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmShowBillActionPerformed(evt);
            }
        });
        mnuBill.add(mitmShowBill);

        mitmCreateBill.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        mitmCreateBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mitmCreateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/billIcon.jpg"))); // NOI18N
        mitmCreateBill.setText("Generar");
        mitmCreateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmCreateBillActionPerformed(evt);
            }
        });
        mnuBill.add(mitmCreateBill);

        mbrPhysioterapistMenu.add(mnuBill);

        setJMenuBar(mbrPhysioterapistMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitmShowAppoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmShowAppoinmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitmShowAppoinmentActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void mitmCreateDiagnoticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmCreateDiagnoticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitmCreateDiagnoticActionPerformed

    private void mitmShowBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmShowBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitmShowBillActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmLoginPhysioterapist frmLoginPhysioterapist = new FrmLoginPhysioterapist();
        this.setVisible(false);
        frmLoginPhysioterapist.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void mitmShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitmShowActionPerformed

    private void mitmCreateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmCreateBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitmCreateBillActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPhysioterapist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPhysioterapist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName2;
    private javax.swing.JLabel lbName3;
    private javax.swing.JLabel lbName4;
    private javax.swing.JLabel lbName5;
    private javax.swing.JLabel lbTittle;
    private javax.swing.JMenuBar mbrPhysioterapistMenu;
    private javax.swing.JMenuItem mitmAddAppoinment;
    private javax.swing.JMenuItem mitmCreateBill;
    private javax.swing.JMenuItem mitmCreateDiagnotic;
    private javax.swing.JMenuItem mitmShow;
    private javax.swing.JMenuItem mitmShowAppoinment;
    private javax.swing.JMenuItem mitmShowBill;
    private javax.swing.JMenuItem mitmShowClinicalHistory;
    private javax.swing.JMenu mnuAppointment;
    private javax.swing.JMenu mnuBill;
    private javax.swing.JMenu mnuClinicalHistory;
    private javax.swing.JMenu mnuModify;
    private javax.swing.JMenu mnuPatient;
    // End of variables declaration//GEN-END:variables
}
