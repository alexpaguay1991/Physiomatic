/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class FrmCreateDiagnostic extends javax.swing.JFrame {

    /**
     * Creates new form FrmCreateDiagnostic
     */
    public FrmCreateDiagnostic() {
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

        lblTitle = new javax.swing.JLabel();
        lblPathology = new javax.swing.JLabel();
        txtPathology = new javax.swing.JTextField();
        lblSymptoms = new javax.swing.JLabel();
        txtaSymptoms = new javax.swing.JScrollPane();
        txtSymptom = new javax.swing.JTextArea();
        lblTreatment = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaTreatment = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        dcsDate = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("DIAGNÓSTICO");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        lblPathology.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPathology.setForeground(new java.awt.Color(255, 255, 255));
        lblPathology.setText("Patología:");
        getContentPane().add(lblPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtPathology.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 390, 30));

        lblSymptoms.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSymptoms.setForeground(new java.awt.Color(255, 255, 255));
        lblSymptoms.setText("Síntomas:");
        getContentPane().add(lblSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtSymptom.setColumns(20);
        txtSymptom.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtSymptom.setRows(5);
        txtaSymptoms.setViewportView(txtSymptom);

        getContentPane().add(txtaSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 390, 100));

        lblTreatment.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblTreatment.setForeground(new java.awt.Color(255, 255, 255));
        lblTreatment.setText("Tratamiento:");
        getContentPane().add(lblTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txaTreatment.setColumns(20);
        txaTreatment.setRows(5);
        jScrollPane3.setViewportView(txaTreatment);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 390, 90));

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Fecha del diagnóstico:");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        getContentPane().add(dcsDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 170, 30));

        btnSave.setBackground(new java.awt.Color(0, 51, 51));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("C.I:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        lblBackground.setText("jLabel10");
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String pathology = txtPathology.getText();
        String Symptom = txtSymptom.getText();       
        long id = Long.parseLong(txtId.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = dcsDate.getDate();
        String dateOfAppointment = sdf.format(date);
        String treatment = txaTreatment.getText();
        PhysiomaticController.addDiagnostic(id, Symptom, pathology, treatment, dateOfAppointment);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuPhysioterapist frmMenuPhysioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frmMenuPhysioterapist.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    public void emptyFields() {
        txtPathology.setText("");
        txaTreatment.setText("");
        txtSymptom.setText("");
        dcsDate.setCalendar(null);
    }

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
            java.util.logging.Logger.getLogger(FrmCreateDiagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateDiagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateDiagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateDiagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreateDiagnostic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnSave;
    private com.toedter.calendar.JDateChooser dcsDate;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPathology;
    private javax.swing.JLabel lblSymptoms;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTreatment;
    public static javax.swing.JTextArea txaTreatment;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPathology;
    private javax.swing.JTextArea txtSymptom;
    private javax.swing.JScrollPane txtaSymptoms;
    // End of variables declaration//GEN-END:variables
}
