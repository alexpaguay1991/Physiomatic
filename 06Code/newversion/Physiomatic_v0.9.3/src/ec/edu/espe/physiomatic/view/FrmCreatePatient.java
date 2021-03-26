/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.physiomatic.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.utils.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class FrmCreatePatient extends javax.swing.JFrame {

    /** Creates new form FrmCreatePatient */
    public FrmCreatePatient() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtContact = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonSaved = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 240, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 290, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 320, -1));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 330, -1));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 350, -1));
        jPanel1.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 320, -1));

        buttonCancel.setBackground(new java.awt.Color(0, 51, 51));
        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancel.setText("ATRÁS");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, 30));

        buttonSaved.setBackground(new java.awt.Color(0, 51, 51));
        buttonSaved.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSaved.setForeground(new java.awt.Color(255, 255, 255));
        buttonSaved.setText("GUARDAR");
        buttonSaved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSavedActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSaved, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N° de cédula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/diagnosticIcon.png"))); // NOI18N
        jPanel1.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 50, 60));

        txtTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("NUEVO PACIENTE");
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/diagnosticIcon.png"))); // NOI18N
        jPanel1.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 60));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void buttonSavedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSavedActionPerformed
        int selection = JOptionPane.showConfirmDialog(null, null, "¿DESEA REGISTRAR EL PACIENTE?", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "SU INFORMACIÓN HA SIDO GUARDADA CON ÉXITO", txtLastName + "PACIENTE REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
             
            
                long id = Long.parseLong(txtId.getText());
                String name = txtName.getText();
                String lastName = txtLastName.getText();
                String email = tfEmail.getText();
                String address = tfAddress.getText();
                String phoneNumber = txtContact.getText();

                Patient patient = new Patient(id, address, name, lastName, email, phoneNumber);
                PhysiomaticController controller=new PhysiomaticController();
                controller.createPatient(id, address, name, lastName, email, phoneNumber);
               
                emptyFields();
               
           

        } else if (selection == 1) {
            JOptionPane.showMessageDialog(null, "SU INFORMACIÓN NO HA SIDO GUARDADA", txtLastName + "NO SE HA REGISTRADO EL PACIENTE", JOptionPane.ERROR_MESSAGE);
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "LA ACCIÓN FUE CANCELADA", txtLastName + "USTED HA CANCELADO LA ACCIÓN", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonSavedActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        FrmPhysioterapistManagment frmPhysioterapistManagment = new FrmPhysioterapistManagment();
        this.setVisible(false);
        frmPhysioterapistManagment.setVisible(true);
    }//GEN-LAST:event_buttonCancelActionPerformed

     public void emptyFields() {
        txtId.setText("");
        txtContact.setText("");
        txtLastName.setText("");
        txtName.setText("");
        tfAddress.setText("");
        tfEmail.setText("");
 
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
            java.util.logging.Logger.getLogger(FrmCreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreatePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSaved;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables

}
