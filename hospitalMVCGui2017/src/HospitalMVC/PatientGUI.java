package HospitalMVC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author sveinson-r
 */
public class PatientGUI extends javax.swing.JFrame {


    /**
     * Creates new form PatientGUI
     */
    public PatientGUI() {
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

        patientInputPanel = new javax.swing.JPanel();
        inputPanelLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        daysLbl = new javax.swing.JLabel();
        roomTypeLbl = new javax.swing.JLabel();
        nurseTypeLbl = new javax.swing.JLabel();
        tvTypeLbl = new javax.swing.JLabel();
        phoneTypeLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        roomTypeInput = new javax.swing.JComboBox();
        nurseTypeInput = new javax.swing.JComboBox();
        tvTypeInput = new javax.swing.JComboBox();
        phoneTypeInput = new javax.swing.JComboBox();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        daysSpinner = new javax.swing.JSpinner();
        patientInfoPanel = new javax.swing.JPanel();
        patientList = new javax.swing.JScrollPane();
        patientListPnl = new javax.swing.JList();
        patientInfoLbl = new javax.swing.JLabel();
        patientInfoDetail = new javax.swing.JScrollPane();
        patientDetailTxt = new javax.swing.JTextArea();
        saveBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Information");
        setBackground(new java.awt.Color(204, 255, 255));
        setName("patientFrame"); // NOI18N

        patientInputPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inputPanelLbl.setBackground(new java.awt.Color(153, 153, 153));
        inputPanelLbl.setText("Input Patient Informaiton");
        inputPanelLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        firstNameLbl.setText("First Name:");

        lastNameLbl.setText("Last Name:");

        daysLbl.setText("Days");

        roomTypeLbl.setText("Room Type:");

        nurseTypeLbl.setText("Nurse Type:");

        tvTypeLbl.setText("TV Service:");

        phoneTypeLbl.setText("Phone Service:");

        roomTypeInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "Intensive Care", "Private", "Double" }));
        roomTypeInput.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomTypeInputItemStateChanged(evt);
            }
        });

        nurseTypeInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "No Nurse", "Private", "Semi-Private" }));

        tvTypeInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "No T.V.", "T.V." }));

        phoneTypeInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "No Phone", "Phone" }));

        submitBtn.setText("Submit");

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        daysSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        javax.swing.GroupLayout patientInputPanelLayout = new javax.swing.GroupLayout(patientInputPanel);
        patientInputPanel.setLayout(patientInputPanelLayout);
        patientInputPanelLayout.setHorizontalGroup(
            patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientInputPanelLayout.createSequentialGroup()
                        .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameTxt))
                        .addGap(18, 18, 18)
                        .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLbl)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysLbl)
                            .addComponent(daysSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomTypeLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(patientInputPanelLayout.createSequentialGroup()
                                .addComponent(nurseTypeLbl)
                                .addGap(34, 34, 34)
                                .addComponent(tvTypeLbl))
                            .addGroup(patientInputPanelLayout.createSequentialGroup()
                                .addComponent(nurseTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tvTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTypeLbl)))
                    .addComponent(inputPanelLbl)
                    .addGroup(patientInputPanelLayout.createSequentialGroup()
                        .addComponent(submitBtn)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientInputPanelLayout.setVerticalGroup(
            patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanelLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLbl)
                    .addComponent(lastNameLbl)
                    .addComponent(daysLbl)
                    .addComponent(roomTypeLbl)
                    .addComponent(nurseTypeLbl)
                    .addComponent(tvTypeLbl)
                    .addComponent(phoneTypeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nurseTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(clearBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        patientInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Informatino"));

        patientListPnl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        patientListPnl.setToolTipText("");
        patientList.setViewportView(patientListPnl);

        patientInfoLbl.setText("Patient Detail");

        patientDetailTxt.setColumns(20);
        patientDetailTxt.setRows(5);
        patientInfoDetail.setViewportView(patientDetailTxt);

        saveBtn.setText("Save List");

        loadBtn.setText("Load List");

        javax.swing.GroupLayout patientInfoPanelLayout = new javax.swing.GroupLayout(patientInfoPanel);
        patientInfoPanel.setLayout(patientInfoPanelLayout);
        patientInfoPanelLayout.setHorizontalGroup(
            patientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientList, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(patientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientInfoPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(patientInfoLbl))
                    .addGroup(patientInfoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadBtn)
                            .addComponent(saveBtn))))
                .addGap(18, 18, 18)
                .addComponent(patientInfoDetail)
                .addContainerGap())
        );
        patientInfoPanelLayout.setVerticalGroup(
            patientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientInfoPanelLayout.createSequentialGroup()
                .addGroup(patientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientInfoDetail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientInfoPanelLayout.createSequentialGroup()
                        .addComponent(patientInfoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(patientInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(patientInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomTypeInputItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomTypeInputItemStateChanged
        // TODO add your handling code here:
        System.out.println("room selected");
        if(roomTypeInput.getSelectedItem().equals("Intensive Care")){
            //System.out.println("room selected " + roomTypeInput.getSelectedItem());
            nurseTypeInput.setEnabled(true);
            phoneTypeInput.setSelectedIndex(1);
            tvTypeInput.setSelectedIndex(1);
            
            phoneTypeInput.setEnabled(false);
            tvTypeInput.setEnabled(false);
        } // end if combo box selection is intensive care
        else{
            nurseTypeInput.setSelectedIndex(1);
            nurseTypeInput.setEnabled(false);
            
            phoneTypeInput.setEnabled(true);
            tvTypeInput.setEnabled(true);
        } // end if combo box selection is not intensive care
    }//GEN-LAST:event_roomTypeInputItemStateChanged

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("clear button clicked");
        reSetInputs();
        firstNameTxt.requestFocus();
    }//GEN-LAST:event_clearBtnActionPerformed

    
    // custom methods
    
    private void reSetInputs(){
        firstNameTxt.setText("");
        lastNameTxt.setText("");
        daysSpinner.setValue(0);
        
        roomTypeInput.setSelectedIndex(0);
        nurseTypeInput.setSelectedIndex(0);
        phoneTypeInput.setSelectedIndex(0);
        tvTypeInput.setSelectedIndex(0);
        
        nurseTypeInput.setEnabled(true);            
        phoneTypeInput.setEnabled(true);
        tvTypeInput.setEnabled(true);        
        
    } // end reSetInputs

    /**
     * @param args the command line arguments
   */ 
 public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientGUI().setVisible(true);
            }
        });
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel daysLbl;
    private javax.swing.JSpinner daysSpinner;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel inputPanelLbl;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JButton loadBtn;
    private javax.swing.JComboBox nurseTypeInput;
    private javax.swing.JLabel nurseTypeLbl;
    private javax.swing.JTextArea patientDetailTxt;
    private javax.swing.JScrollPane patientInfoDetail;
    private javax.swing.JLabel patientInfoLbl;
    private javax.swing.JPanel patientInfoPanel;
    private javax.swing.JPanel patientInputPanel;
    private javax.swing.JScrollPane patientList;
    private javax.swing.JList patientListPnl;
    private javax.swing.JComboBox phoneTypeInput;
    private javax.swing.JLabel phoneTypeLbl;
    private javax.swing.JComboBox roomTypeInput;
    private javax.swing.JLabel roomTypeLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox tvTypeInput;
    private javax.swing.JLabel tvTypeLbl;
    // End of variables declaration//GEN-END:variables
}
