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
 * @author User
 */
public class FrmFirstAppointment extends javax.swing.JFrame {

    /**
     * Creates new form FrmFirstAppointment
     */
    public FrmFirstAppointment() {
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

        dcsDate = new com.toedter.calendar.JDateChooser();
        lblTitle = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tbnExit = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(dcsDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 30));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Agendar Cita");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblTime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Hora:");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 30));
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 120, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        tbnExit.setBackground(new java.awt.Color(0, 51, 51));
        tbnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbnExit.setForeground(new java.awt.Color(255, 255, 255));
        tbnExit.setText("Guardar");
        tbnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnExitActionPerformed(evt);
            }
        });
        getContentPane().add(tbnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnExitActionPerformed
        int selection = JOptionPane.showConfirmDialog(null, "", "Citas medicas", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "La información fue guardada", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            try {
                String time = txtTime.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = dcsDate.getDate();
                String dateOfAppointment = sdf.format(date) + "";
                FrmCreatePatient frmPatient = new FrmCreatePatient();
                long id = frmPatient.getId();
                System.out.println(id);
                PhysiomaticController.createConsumption(id, "1404");
                PhysiomaticController.createAppoinment(dateOfAppointment, time, id);
                emptyFields();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "No se guardó la información debe ingresar solo digitos numéricos en el id", "Registro de Fisioterapista", JOptionPane.ERROR_MESSAGE);
            }
            emptyFields();
        } else if (selection == 1) {
            JOptionPane.showMessageDialog(null, "Information was NOT saved", "NOT saved", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "Action was canceled", "Cancelled", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tbnExitActionPerformed

    public void emptyFields() {
        txtTime.setText("");
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuPhysioterapist frmMenuPhysioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frmMenuPhysioterapist.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFirstAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFirstAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFirstAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFirstAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFirstAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private com.toedter.calendar.JDateChooser dcsDate;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JToggleButton tbnExit;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
