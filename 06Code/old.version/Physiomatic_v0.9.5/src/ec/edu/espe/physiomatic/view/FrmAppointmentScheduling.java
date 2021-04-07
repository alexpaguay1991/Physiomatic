/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author User
 */
public class FrmAppointmentScheduling extends javax.swing.JFrame {

    /**
     * Creates new form FrmAppointmentScheduling
     */
    public FrmAppointmentScheduling() {
        initComponents();
        Date d = new Date();
        d.setTime(d.getTime());
        dcsDate.getJCalendar().setMinSelectableDate(d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        dcsDate = new com.toedter.calendar.JDateChooser();
        lblTitle = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        tbnExit = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spntime = new javax.swing.JSpinner(sm);
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(dcsDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, 30));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Agendar Cita");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblTime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Hora:");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula del paciente: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 30));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 160, 30));

        tbnExit.setBackground(new java.awt.Color(0, 51, 51));
        tbnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbnExit.setForeground(new java.awt.Color(255, 255, 255));
        tbnExit.setText("Guardar");
        tbnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnExitActionPerformed(evt);
            }
        });
        getContentPane().add(tbnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(spntime, "HH:mm");
        spntime.setEditor(de);
        getContentPane().add(spntime, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnExitActionPerformed
        String dataToSave = "La información que se guardara es" + "\n" + txtId.getText();
        int selection = JOptionPane.showConfirmDialog(null, dataToSave, "CITAS MÉDICAS", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "SE GUARDO LA INFORMACIÓN", "GUARDAR", JOptionPane.INFORMATION_MESSAGE);
            try {
                long id = Long.parseLong(txtId.getText());
                System.out.println(spntime.getValue());
                SimpleDateFormat stf = new SimpleDateFormat("hh:mm");
                Date date = (Date) spntime.getValue();
                String time = stf.format(date);                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                date = dcsDate.getDate();
                String dateOfAppointment = sdf.format(date) + "";
                PhysiomaticController.createAppoinment(dateOfAppointment, time, id);
                PhysiomaticController.addProductToConsumption(id, "1404", "1");
                emptyFields();
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "No se guardó la información debe ingresar solo digitos numéricos en el id", "Registro de Fisioterapista", JOptionPane.ERROR_MESSAGE);
            }
            emptyFields();
        } else if (selection == 1) {
            JOptionPane.showMessageDialog(null, "LA INFORMACIÓN NO SE GUARDÓ", "NO GUARDAR", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "ACCIÓN CANCELADA", "CANCELAR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tbnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuPhysioterapist frmMenuPhysioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frmMenuPhysioterapist.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    public void emptyFields() {
        txtId.setText("");
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
            java.util.logging.Logger.getLogger(FrmAppointmentScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAppointmentScheduling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private com.toedter.calendar.JDateChooser dcsDate;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spntime;
    private javax.swing.JToggleButton tbnExit;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
