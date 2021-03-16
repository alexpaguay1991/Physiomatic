/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import com.toedter.calendar.JDayChooser;
import ec.edu.espe.physiomatic.controller.PatientController;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.utils.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrmCreateClinicalHistory extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FrmCreateClinicalHistory() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtOther.setVisible(false);
        txtOtherDisease.setVisible(false);
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
        cmbDocument = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbBloodType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        spnWeight = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        spnHeight = new javax.swing.JSpinner();
        lbAllergy = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        chkCancer = new javax.swing.JCheckBox();
        chkDiabetes = new javax.swing.JCheckBox();
        chkAsthma = new javax.swing.JCheckBox();
        chkFood = new javax.swing.JCheckBox();
        chkAntibiotic = new javax.swing.JCheckBox();
        chkMedicine = new javax.swing.JCheckBox();
        chkOthers = new javax.swing.JCheckBox();
        txtOther = new javax.swing.JTextField();
        chkBronchitis = new javax.swing.JCheckBox();
        chkEpilepsy = new javax.swing.JCheckBox();
        chkOtherDisease = new javax.swing.JCheckBox();
        txtOtherDisease = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lbBrackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACIÓN PERSONAL DEL PACIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 520, -1));

        cmbDocument.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmbDocument.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.I", "Pasaporte" }));
        getContentPane().add(cmbDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 30));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setText("Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 83, -1, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIPO DE SANGRE:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        cmbBloodType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "O+", "O-", "AB+", "" }));
        cmbBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBloodTypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 60, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PESO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        spnWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnWeight.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(200.0f), Float.valueOf(1.0f)));
        getContentPane().add(spnWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 70, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ESTATURA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        spnHeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnHeight.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(200.0f), Float.valueOf(1.0f)));
        getContentPane().add(spnHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 70, 30));

        lbAllergy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAllergy.setForeground(new java.awt.Color(255, 255, 255));
        lbAllergy.setText("Alergias:");
        getContentPane().add(lbAllergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enfermedades:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnSave.setBackground(new java.awt.Color(0, 51, 51));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("GUARDAR");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        chkCancer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCancer.setForeground(new java.awt.Color(255, 255, 255));
        chkCancer.setText("Cancer");
        getContentPane().add(chkCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        chkDiabetes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkDiabetes.setForeground(new java.awt.Color(255, 255, 255));
        chkDiabetes.setText("Diabetes");
        getContentPane().add(chkDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        chkAsthma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAsthma.setForeground(new java.awt.Color(255, 255, 255));
        chkAsthma.setText("Asthma");
        chkAsthma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsthmaActionPerformed(evt);
            }
        });
        getContentPane().add(chkAsthma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        chkFood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkFood.setForeground(new java.awt.Color(255, 255, 255));
        chkFood.setText("Comida");
        getContentPane().add(chkFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        chkAntibiotic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAntibiotic.setForeground(new java.awt.Color(255, 255, 255));
        chkAntibiotic.setText("Antibióticos");
        chkAntibiotic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAntibioticActionPerformed(evt);
            }
        });
        getContentPane().add(chkAntibiotic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        chkMedicine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkMedicine.setForeground(new java.awt.Color(255, 255, 255));
        chkMedicine.setText("Medicinas");
        getContentPane().add(chkMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        chkOthers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkOthers.setForeground(new java.awt.Color(255, 255, 255));
        chkOthers.setText("Otros");
        chkOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOthersActionPerformed(evt);
            }
        });
        getContentPane().add(chkOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtOther.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtherActionPerformed(evt);
            }
        });
        getContentPane().add(txtOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 240, -1));

        chkBronchitis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkBronchitis.setForeground(new java.awt.Color(255, 255, 255));
        chkBronchitis.setText("Bronquitis");
        getContentPane().add(chkBronchitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        chkEpilepsy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkEpilepsy.setForeground(new java.awt.Color(255, 255, 255));
        chkEpilepsy.setText("Epilepsia");
        getContentPane().add(chkEpilepsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        chkOtherDisease.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkOtherDisease.setForeground(new java.awt.Color(255, 255, 255));
        chkOtherDisease.setText("Otros");
        chkOtherDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOtherDiseaseActionPerformed(evt);
            }
        });
        getContentPane().add(chkOtherDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtOtherDisease.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtOtherDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 230, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("ATRÁS");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, 30));

        lbBrackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        lbBrackground.setPreferredSize(new java.awt.Dimension(151, 25));
        getContentPane().add(lbBrackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String dataToSave = "La información que se guardara es" + "\n" + txtId.getText() + cmbBloodType.getSelectedItem();
        int selection = JOptionPane.showConfirmDialog(null, dataToSave, "Historia Clinica", JOptionPane.YES_NO_CANCEL_OPTION);
        Connection connection2 =  new Connection(dataToSave);
        
        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "La información fue guardada", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            try {
                long id = Long.parseLong(txtId.getText());
                float height = (float) spnHeight.getValue();
                float weight = (float) spnWeight.getValue();
                String bloodType = (String) cmbBloodType.getSelectedItem();
                String asthma = "", bronquitis = "", cancer = "", diabetes = "", epilepsy = "", otherDisease = "";
                if (chkAsthma.isSelected()) {
                    asthma = chkAsthma.getName();
                }
                if (chkBronchitis.isSelected()) {
                    bronquitis = chkBronchitis.getName();
                }
                if (chkCancer.isSelected()) {
                    cancer = chkCancer.getName();
                }
                if (chkEpilepsy.isSelected()) {
                    epilepsy = chkEpilepsy.getName();
                }
                if (chkDiabetes.isSelected()) {
                    diabetes = chkDiabetes.getName();
                }
                if (chkOtherDisease.isSelected()) {
                    otherDisease = txtOtherDisease.getText();
                }
                String familyBackground = asthma + bronquitis + cancer + diabetes + epilepsy + otherDisease;
                String food = "", medicine = "", antibiotic = "", otherAllergy = "";
                if (chkAntibiotic.isSelected()) {
                    antibiotic = chkAntibiotic.getName();
                }
                if (chkFood.isSelected()) {
                    food = chkFood.getName();
                }
                if (chkMedicine.isSelected()) {
                    medicine = chkMedicine.getName();
                }
                if (chkOthers.isSelected()) {
                    otherAllergy = txtOther.getText();
                }
                String allergy = food + medicine + antibiotic + otherAllergy;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = jDateChooser1.getDate();
                String birthDate = sdf.format(date);
                System.out.println(birthDate);
                PatientController.createClinicalHistory(id, birthDate, weight, height, familyBackground, bloodType, allergy);
                emptyFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se guardó la información debe ingresar solo digitos numéricos en el id", "Registro de Fisioterapista", JOptionPane.ERROR_MESSAGE);
            }
            emptyFields();
        } else if (selection == 1) {
            JOptionPane.showMessageDialog(null, "La información no se guardo", "Erro", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "La acción fue cancelada", "Cancelar", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    public void emptyFields() {
        spnWeight.setValue(0);
        spnHeight.setValue(0);
        cmbBloodType.setSelectedIndex(0);
        cmbDocument.setSelectedIndex(0);
        chkAsthma.setSelected(false);
        chkCancer.setSelected(false);
        chkDiabetes.setSelected(false);
        txtId.setText("");
        chkBronchitis.setSelected(false);
        chkFood.setSelected(false);
        chkMedicine.setSelected(false);
        chkEpilepsy.setSelected(false);
        chkOtherDisease.setSelected(false);
        chkOthers.setSelected(false);
        chkAntibiotic.setSelected(false);
        txtOther.setText("");
        txtOther.setVisible(false);
        txtOtherDisease.setText("");
        txtOtherDisease.setVisible(false);
    }

    private void chkAsthmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsthmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsthmaActionPerformed

    private void cmbBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBloodTypeActionPerformed

    private void chkAntibioticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAntibioticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAntibioticActionPerformed

    private void chkOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOthersActionPerformed
        if (chkOthers.isSelected()) {
            txtOther.setVisible(true);
        } else {
            txtOther.setVisible(false);
        }
    }//GEN-LAST:event_chkOthersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuPhysioterapist frMenuPhysioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frMenuPhysioterapist.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtherActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_txtOtherActionPerformed

    private void chkOtherDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOtherDiseaseActionPerformed
        if (chkOtherDisease.isSelected()) {
            txtOtherDisease.setVisible(true);
        } else {
            txtOtherDisease.setVisible(false);
        }
    }//GEN-LAST:event_chkOtherDiseaseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCreateClinicalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateClinicalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateClinicalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateClinicalHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmCreateClinicalHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkAntibiotic;
    private javax.swing.JCheckBox chkAsthma;
    private javax.swing.JCheckBox chkBronchitis;
    private javax.swing.JCheckBox chkCancer;
    private javax.swing.JCheckBox chkDiabetes;
    private javax.swing.JCheckBox chkEpilepsy;
    private javax.swing.JCheckBox chkFood;
    private javax.swing.JCheckBox chkMedicine;
    private javax.swing.JCheckBox chkOtherDisease;
    private javax.swing.JCheckBox chkOthers;
    private javax.swing.JComboBox<String> cmbBloodType;
    private javax.swing.JComboBox<String> cmbDocument;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbAllergy;
    private javax.swing.JLabel lbBrackground;
    private javax.swing.JSpinner spnHeight;
    private javax.swing.JSpinner spnWeight;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtOther;
    private javax.swing.JTextField txtOtherDisease;
    // End of variables declaration//GEN-END:variables
}
