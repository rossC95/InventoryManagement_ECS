package ECS;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jason
 */
public class UpdateLimits extends javax.swing.JFrame {
    /**
     * Creates new form AddItem
     */
    ArrayList<Integer> values = new ArrayList<>();
    public UpdateLimits(int resID, int itemID, int itemRestrict, boolean resTypeIndividual, int empID) {
        initComponents();
        txfItemID.setText(Integer.toString(itemID));
        txfResQuantity.setText(Integer.toString(itemRestrict));  
        if (resTypeIndividual) {
            cmbResType.setSelectedIndex(1);
            txfEmpID.setEnabled(true);
            txfEmpID.setText(Integer.toString(empID));
        }
        values.add(resID);
        btnUpdate.setEnabled(true);
        btnAdd.setEnabled(false);
        btnRemoveLimit.setEnabled(true);
        //make table uneditable
        tblEmployeeSearch.setDefaultEditor(Object.class, null);
    }
    public UpdateLimits() {
        initComponents();   
        btnAdd.setEnabled(true);
        lblAddItem.setText("Add Item Limit");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitle = new javax.swing.JPanel();
        lblAddItem = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblEmployeeID = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txfResQuantity = new javax.swing.JTextField();
        lblRestrictionType = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txfEmpID = new javax.swing.JTextField();
        txfItemID = new javax.swing.JTextField();
        cmbResType = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeSearch = new javax.swing.JTable();
        btnEmployeeSearch = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        txfEmployeeSearch = new javax.swing.JTextField();
        btnRemoveLimit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Item Limits");
        setAlwaysOnTop(true);
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/ECS/resources/ECS_Icon.png"))).getImage());
        setResizable(false);

        pnlTitle.setBackground(new java.awt.Color(38, 64, 86));

        lblAddItem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddItem.setForeground(new java.awt.Color(255, 255, 255));
        lblAddItem.setText("Update Item Limits");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.setBackground(new java.awt.Color(248, 148, 6));

        lblEmployeeID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(236, 241, 240));
        lblEmployeeID.setText("Employee ID:");

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(38, 64, 86));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(38, 64, 86));
        btnUpdate.setText("Update Limit");
        btnUpdate.setToolTipText("Select an entry from the list to update an item limit");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(236, 240, 241));
        lblName.setText("Restriction Quantity:");

        txfResQuantity.setBackground(new java.awt.Color(249, 191, 59));
        txfResQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfResQuantity.setForeground(new java.awt.Color(255, 255, 255));

        lblRestrictionType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRestrictionType.setForeground(new java.awt.Color(236, 240, 241));
        lblRestrictionType.setText("Restriction Type:");

        lblID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(236, 240, 241));
        lblID.setText("Item ID:");

        txfEmpID.setBackground(new java.awt.Color(249, 191, 59));
        txfEmpID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfEmpID.setForeground(new java.awt.Color(255, 255, 255));
        txfEmpID.setEnabled(false);

        txfItemID.setBackground(new java.awt.Color(249, 191, 59));
        txfItemID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfItemID.setForeground(new java.awt.Color(255, 255, 255));

        cmbResType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Global", "Individual" }));
        cmbResType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbResTypeItemStateChanged(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(38, 64, 86));
        btnAdd.setText("Add Limit");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblEmployeeSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FNAME", "LNAME", "USERNAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeSearch);

        btnEmployeeSearch.setText("Search");
        btnEmployeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeSearchActionPerformed(evt);
            }
        });

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnRemoveLimit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveLimit.setForeground(new java.awt.Color(38, 64, 86));
        btnRemoveLimit.setText("Remove Limit");
        btnRemoveLimit.setToolTipText("Select an entry from the list to remove an item limit");
        btnRemoveLimit.setEnabled(false);
        btnRemoveLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveLimitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRestrictionType)
                            .addComponent(lblEmployeeID)
                            .addComponent(lblName)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfResQuantity)
                            .addComponent(txfEmpID)
                            .addComponent(txfItemID)
                            .addComponent(cmbResType, 0, 212, Short.MAX_VALUE)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(432, 432, 432))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(txfEmployeeSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEmployeeSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelect))))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnRemoveLimit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRemoveLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txfItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txfResQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestrictionType)
                    .addComponent(cmbResType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmployeeSearch)
                    .addComponent(btnSelect)
                    .addComponent(txfEmployeeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        boolean success = addItemLimit();
        if (success) {
            JOptionPane.showMessageDialog(this, "Successfully updated limit in database");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error: Failed to update limit in database", "Error: Format error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbResTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbResTypeItemStateChanged
        if (cmbResType.getSelectedIndex() == 1) {
            txfEmpID.setEnabled(true);
        } else {
            txfEmpID.setText("");
            txfEmpID.setEnabled(false);
        }
    }//GEN-LAST:event_cmbResTypeItemStateChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        boolean resTypeIndividual = cmbResType.getSelectedIndex() == 1;
        int resType = (resTypeIndividual) ? 1 : 0;
        values.add(Integer.parseInt(txfItemID.getText()));
        try {
            values.add(Integer.parseInt(txfResQuantity.getText()));
            if (Integer.parseInt(txfResQuantity.getText()) < 1) {
                JOptionPane.showMessageDialog(this, "Error: Quantity must be greater than 0", "Error: Invalid quantity", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Invalid quantity", "Error: Invalid quantity", JOptionPane.ERROR_MESSAGE);
            return;
        }
        values.add(resType);
        values.add(cmbResType.getSelectedIndex());
        if (resTypeIndividual) {
            values.add(Integer.parseInt(txfEmpID.getText()));
        }
        boolean success = updateItemLimit();
        if (success) {
            JOptionPane.showMessageDialog(this, "Successfully updated limit in database");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error: Failed to update limit in database", "Error: Format error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEmployeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeSearchActionPerformed
        // Employee Search
        DataIO data = new DataIO();
        try {
            /* 
            new DefaultTableModel storing results from employeeSearch method
            using EmployeeSearch textfield 
            */
            DefaultTableModel model = data.employeeSearch(txfEmployeeSearch.getText());
            // set model to return value from employeeSearch call
            tblEmployeeSearch.setModel(model);
            //tblEmployeeSearch.getSelectedRow();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Search Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEmployeeSearchActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        if (cmbResType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Error: Cannot select employee ID for global limits", "Error: Invalid input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // column for username (must be unique, names may have duplicates)
        int column = 2;
        // using selected row
        int row = tblEmployeeSearch.getSelectedRow();
        // storing username value
        String value = tblEmployeeSearch.getModel().getValueAt(row, column).toString();
        
        // new database interface object
        DataIO data = new DataIO();
        try {
            // storing id value from method using username argument
            int id = data.mapUserNameToID(value);
            // convert int to String to set Employee ID field
            txfEmpID.setText(String.valueOf(id));
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Selection Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnRemoveLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveLimitActionPerformed
        int idToDelete = values.get(0);
        this.setAlwaysOnTop(false);
        int confirmationRemove = JOptionPane.showConfirmDialog(null, "Are you sure you would like to remove item limit with restriction ID#" + String.valueOf(idToDelete) + "?");
        this.setAlwaysOnTop(true);
        if (confirmationRemove == 0) {
            boolean successRemove = removeLimit(idToDelete);
            if (successRemove) {
                JOptionPane.showMessageDialog(this, "Successfully removed item from database");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error: Could not remove from inventory", "Error: Inventory unmodified", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Database unmodified");
            return;
        }
    }//GEN-LAST:event_btnRemoveLimitActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateLimits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLimits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLimits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLimits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                         
                new UpdateLimits().setVisible(true);              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEmployeeSearch;
    private javax.swing.JButton btnRemoveLimit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbResType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRestrictionType;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tblEmployeeSearch;
    private javax.swing.JTextField txfEmpID;
    private javax.swing.JTextField txfEmployeeSearch;
    private javax.swing.JTextField txfItemID;
    private javax.swing.JTextField txfResQuantity;
    // End of variables declaration//GEN-END:variables
    public boolean updateItemLimit() {
       DataIO data = new DataIO();
       try {
            data.updateItemLimit(values);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (ClassNotFoundException cex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }
    public boolean addItemLimit() {
        try {
            values.add(Integer.parseInt(txfItemID.getText()));
            if (Integer.parseInt(txfResQuantity.getText()) < 1) {
                JOptionPane.showMessageDialog(this, "Error: Quantity must be greater than 0", "Error: Invalid quantity", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            values.add(Integer.parseInt(txfResQuantity.getText()));
            values.add(cmbResType.getSelectedIndex());
            if (cmbResType.getSelectedIndex() == 1) {
                values.add(Integer.parseInt(txfEmpID.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: Not all fields were entered correctly", "Error: Invalid input", JOptionPane.ERROR_MESSAGE);
        }
       DataIO data = new DataIO();
       try {
            data.addItemLimit(values);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (ClassNotFoundException cex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }   
    public boolean removeLimit(int resID) {
       DataIO data = new DataIO();
       try {
            data.removeLimit(resID);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (ClassNotFoundException cex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       return true;
    }  
}
