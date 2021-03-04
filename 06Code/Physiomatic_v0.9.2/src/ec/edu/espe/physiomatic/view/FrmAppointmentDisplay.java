/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.utils.Connection;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrmAppointmentDisplay extends javax.swing.JFrame {

    Connection connection = new Connection("patients");
    Patient patient;

    /**
     * Creates new form FrmAppoinmentDisplay
     */
    public FrmAppointmentDisplay() {
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

        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        btnShow = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Cita Médica");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 150, -1));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(0, 153, 153));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 290, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombre:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Apellido:");
        getContentPane().add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(0, 153, 153));
        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(255, 255, 255));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 290, 30));

        lblPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Número telefónico:");
        getContentPane().add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setBackground(new java.awt.Color(0, 153, 153));
        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, 30));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Cedula de identidad:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtId.setBackground(new java.awt.Color(0, 153, 153));
        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, 30));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 51, 51));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha ", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tblAppointment);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 670, 150));

        btnShow.setBackground(new java.awt.Color(0, 51, 51));
        btnShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Mostrar");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        getContentPane().add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        
        try {
            patient = connection.retrievePatient(Long.parseLong(txtId.getText()));
            txtName.setText(patient.getName());
            txtLastName.setText(patient.getLastName());
            txtPhoneNumber.setText(patient.getPhoneNumber());
            txtId.setText(patient.getId() + "");
            String[][] matrix;
            matrix = PhysiomaticController.showAppointmentTable(Long.parseLong(txtId.getText()));
            tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
                    matrix,
                    new String[]{
                        "Fecha ", "Hora"
                    }
            ));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El paciente no está registrado", "Cita médica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuPhysioterapist frmMenuPhysioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frmMenuPhysioterapist.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAppointmentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAppointmentDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
