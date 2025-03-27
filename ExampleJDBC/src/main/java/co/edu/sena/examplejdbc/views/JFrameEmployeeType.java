package co.edu.sena.examplejdbc.views;

import co.edu.sena.examplejdbc.controllers.EmployeeTypeController;
import co.edu.sena.examplejdbc.controllers.IEmployeeTypeController;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 25/03/2025
 * @author Juan Diego Orrego Vargas
 */
public class JFrameEmployeeType extends javax.swing.JFrame {
    
    private IEmployeeTypeController employeeTypeController = new EmployeeTypeController();

    /**
     * Creates new form JFrameEmployeeType
     */
    public JFrameEmployeeType() {
        initComponents();
        fillTable();
    }

    public void fillTable() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableEmployeeTypes.setModel(model);
            model.addColumn("Id");
            model.addColumn("Descripción");
            
            String[] rows = new String[2];
            List<EmployeeType> types = employeeTypeController.findAll();
            for (EmployeeType type : types) {
                rows[0] = String.valueOf(type.getId());
                rows[1] = String.valueOf(type.getDescript());
                model.addRow(rows);
            }
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanelBackground = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelDescript = new javax.swing.JLabel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployeeTypes = new javax.swing.JTable();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldDescript = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de empleado");

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 102));
        jPanelBackground.setForeground(new java.awt.Color(0, 153, 204));

        jLabelTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setText("Tipo de empleado");

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(51, 51, 51));
        jLabelId.setText("Id:");

        jLabelDescript.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescript.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDescript.setText("Descripción:");

        jButtonInsert.setBackground(new java.awt.Color(0, 153, 51));
        jButtonInsert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Crear");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 204));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Modificar");
        jButtonUpdate.setEnabled(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClean.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClean.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonClean.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClean.setText("Limpiar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        jTableEmployeeTypes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEmployeeTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeTypesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployeeTypes);

        jTextFieldId.setForeground(new java.awt.Color(51, 51, 51));

        jTextFieldDescript.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, Short.MAX_VALUE)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelDescript)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDescript, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelTitle)
                .addGap(48, 48, 48)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelDescript)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clear();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        try {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setDescript(jTextFieldDescript.getText().toUpperCase());
            employeeTypeController.insert(employeeType);
            MessageUtils.showInfoMessage("Tipo de empleado creado exitosamente!");
            clear();
            fillTable();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jTableEmployeeTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeTypesMouseClicked
        int rowSelected = jTableEmployeeTypes.getSelectedRow();
        
        if (rowSelected != -1) {
            jButtonInsert.setEnabled(false);
            jButtonDelete.setEnabled(true);
            jButtonUpdate.setEnabled(true);
            
            // Obtener de la tabla la celda con el id del tipo de empleado
            int idSelected = Integer.parseInt(jTableEmployeeTypes.getValueAt(rowSelected, 0).toString());
            
            try {
                EmployeeType findEmployeeType = employeeTypeController.findById(idSelected);
                jTextFieldId.setText(String.valueOf(findEmployeeType.getId()));
                jTextFieldDescript.setText(String.valueOf(findEmployeeType.getDescript()));
                
            } catch (Exception e) {
                MessageUtils.showErrorMessage(e.getMessage());
            }
        }
    }//GEN-LAST:event_jTableEmployeeTypesMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setId(Integer.parseInt(jTextFieldId.getText()));
            employeeType.setDescript(jTextFieldDescript.getText().toUpperCase());
            
            employeeTypeController.update(employeeType);
            MessageUtils.showInfoMessage("Tipo de empleado actualizado exitosamente!");
            clear();
            fillTable();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane,
                    "¿Esta seguro de eliminar el tipo de empleado?", "Confirmar" ,
                    JOptionPane.YES_NO_OPTION);
            
            if (option == 0) {
                int id = Integer.parseInt(jTextFieldId.getText());
                employeeTypeController.delete(id);
                MessageUtils.showInfoMessage("Tipo de empleado eliminado exitosamente");
                clear();
                fillTable();
            }
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    public void clear() {
        jTextFieldId.setText("");
        jTextFieldDescript.setText("");
        jTableEmployeeTypes.clearSelection();
        jButtonInsert.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jTextFieldId.requestFocus();
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
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEmployeeType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDescript;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployeeTypes;
    private javax.swing.JTextField jTextFieldDescript;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
