/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

/**
 *
 * @author User
 */
public class FrmIdInput extends javax.swing.JFrame {

    private String id;

    /**
     * Creates new form FrmIdInput
     */
    public FrmIdInput() {
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

        lblEntry = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        txtIdPatient = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEntry.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEntry.setForeground(new java.awt.Color(255, 255, 255));
        lblEntry.setText("Ingrese el número de cédula del paciente:");
        getContentPane().add(lblEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnNext.setBackground(new java.awt.Color(0, 51, 51));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));
        getContentPane().add(txtIdPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 320, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pictures/background.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 471, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        FrmClinicalHistoryDisplay frmClinical = new FrmClinicalHistoryDisplay();
        id = txtIdPatient.getText();
        System.out.println(id);
        frmClinical.txtId.setText(txtIdPatient.getText());
        frmClinical.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIdInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIdInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIdInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIdInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIdInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEntry;
    private javax.swing.JTextField txtIdPatient;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
