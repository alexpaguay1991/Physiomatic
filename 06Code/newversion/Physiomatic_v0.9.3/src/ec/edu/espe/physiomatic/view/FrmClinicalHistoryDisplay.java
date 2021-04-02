/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Patient;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrmClinicalHistoryDisplay extends javax.swing.JFrame implements Printable {



    /**
     * Creates new form FrmPatientDisplay
     */
    public FrmClinicalHistoryDisplay() {
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

        buttonPrint = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblPersonalInformation = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblMedicalInformation = new javax.swing.JLabel();
        lblBloodType = new javax.swing.JLabel();
        txtBloodType = new javax.swing.JTextField();
        lblBirthDate = new javax.swing.JLabel();
        txtBirthDate = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblFamilyBackground = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaFamilyBackground = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiagnostic = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAllergys = new javax.swing.JTextArea();
        lblHeight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPrint.setBackground(new java.awt.Color(0, 51, 51));
        buttonPrint.setForeground(new java.awt.Color(255, 255, 255));
        buttonPrint.setText("Imprimir");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 700, -1, -1));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("HISTORIA CLINICA");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lblPersonalInformation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPersonalInformation.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonalInformation.setText("Información Personal");
        getContentPane().add(lblPersonalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombre: ");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtName.setBackground(new java.awt.Color(0, 153, 153));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, 30));

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Apellido:");
        getContentPane().add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        txtLastName.setBackground(new java.awt.Color(0, 153, 153));
        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 250, 30));

        txtId.setBackground(new java.awt.Color(0, 153, 153));
        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 180, 30));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Cedula de identidad: ");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Dirección: ");
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtAddress.setBackground(new java.awt.Color(0, 153, 153));
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, 30));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Correo electrónico:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtEmail.setBackground(new java.awt.Color(0, 153, 153));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 230, 30));

        lblPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Número telefónico:");
        getContentPane().add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        txtPhoneNumber.setBackground(new java.awt.Color(0, 153, 153));
        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 150, 30));

        lblMedicalInformation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMedicalInformation.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicalInformation.setText("Información Médica");
        getContentPane().add(lblMedicalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        lblBloodType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBloodType.setForeground(new java.awt.Color(255, 255, 255));
        lblBloodType.setText("Tipo de Sangre: ");
        getContentPane().add(lblBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtBloodType.setBackground(new java.awt.Color(0, 153, 153));
        txtBloodType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBloodType.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 80, 30));

        lblBirthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthDate.setText("Fecha de Nacimiento:");
        getContentPane().add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 20));

        txtBirthDate.setBackground(new java.awt.Color(0, 153, 153));
        txtBirthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 150, 30));

        lblWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblWeight.setText("Peso: ");
        getContentPane().add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        txtWeight.setBackground(new java.awt.Color(0, 153, 153));
        txtWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 70, 30));

        lblText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Estatura:");
        getContentPane().add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        txtHeight.setBackground(new java.awt.Color(0, 153, 153));
        txtHeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(255, 255, 255));
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });
        getContentPane().add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 70, 30));

        lblFamilyBackground.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFamilyBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblFamilyBackground.setText("Antecedentes Familiares:");
        getContentPane().add(lblFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtaFamilyBackground.setEditable(false);
        txtaFamilyBackground.setBackground(new java.awt.Color(0, 153, 153));
        txtaFamilyBackground.setColumns(20);
        txtaFamilyBackground.setForeground(new java.awt.Color(255, 255, 255));
        txtaFamilyBackground.setRows(5);
        jScrollPane1.setViewportView(txtaFamilyBackground);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 340, 50));

        tblDiagnostic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha del diagnóstico", "Patología", "Sintomas", "Tratamiento"
            }
        ));
        jScrollPane2.setViewportView(tblDiagnostic);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 690, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Diagnóstico:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 700, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 51, 51));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Mostrar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alergia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jScrollPane3.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane3.setForeground(new java.awt.Color(0, 102, 102));

        txtAllergys.setBackground(new java.awt.Color(0, 153, 153));
        txtAllergys.setColumns(20);
        txtAllergys.setRows(5);
        jScrollPane3.setViewportView(txtAllergys);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 310, 50));

        lblHeight.setBackground(new java.awt.Color(0, 102, 102));
        lblHeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(255, 255, 255));
        lblHeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        getContentPane().add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 761, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            Patient patient = PhysiomaticController.retrievePatient(Long.parseLong(txtId.getText()));           
            ClinicalHistory clinicalHistory = PhysiomaticController.retrieveClinicalHistory(patient);                        
            txtName.setText(patient.getName());
            txtLastName.setText(patient.getLastName());
            txtAddress.setText(patient.getAddress());
            txtBirthDate.setText(clinicalHistory.getBirthDate());
            txtBloodType.setText(clinicalHistory.getBloodType());
            txtEmail.setText(clinicalHistory.getPatient().getEmail());
            txtHeight.setText(String.valueOf(clinicalHistory.getHeight()));          
            txtWeight.setText(String.valueOf(clinicalHistory.getWeight()));
            txtAllergys.setText(clinicalHistory.getAllergy());
            txtPhoneNumber.setText(clinicalHistory.getPatient().getPhoneNumber());
            txtaFamilyBackground.setText(clinicalHistory.getFamiliyBackground());
            String[][] matrix;
            matrix = PhysiomaticController.showTableClinicalHistory(patient.getId());
            tblDiagnostic.setModel(new javax.swing.table.DefaultTableModel(
                    matrix,
                    new String[]{
                        "Fecha del diagnóstico", "Síntomas", "Tratamiento", "Patología"
                    }
            ));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El paciente no está registrado", "Historia Clínica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenuPhysioterapist frmMenuPhysioterapist = new FrmMenuPhysioterapist();
        this.setVisible(false);
        frmMenuPhysioterapist.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(this);

        if (job.printDialog()) {
            try {
                job.print();

            } catch (PrinterException ex) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "La impresion se canceló");
        }
    }//GEN-LAST:event_buttonPrintActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClinicalHistoryDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClinicalHistoryDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClinicalHistoryDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClinicalHistoryDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClinicalHistoryDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFamilyBackground;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMedicalInformation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonalInformation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    public javax.swing.JTable tblDiagnostic;
    public javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtAllergys;
    public javax.swing.JTextField txtBirthDate;
    public javax.swing.JTextField txtBloodType;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtHeight;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPhoneNumber;
    public javax.swing.JTextField txtWeight;
    public javax.swing.JTextArea txtaFamilyBackground;
    // End of variables declaration//GEN-END:variables
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
}
