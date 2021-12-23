package ECS;
import java.sql.*;
import javax.swing.JOptionPane;

public class ECSMainInterface extends javax.swing.JFrame {
    Employee empForm = new Employee();
    /**
     * Creates new form ECSMainInterface
     */
    public ECSMainInterface(Employee emp) {
        initComponents();
        // Center the form location on display
        this.setLocationRelativeTo(null);
        // Set the current user's name to display on the interface
        this.lblUserName.setText(lblUserName.getText() + " " + emp.getLastName() + ", " + emp.getFirstName());
        // Set the current Employee object to the object passed to constructor
        empForm = emp;
        // Make the table uneditable
        tblEquipment.setDefaultEditor(Object.class, null);
        // Call to local method
        loadInventory();
    }
    public ECSMainInterface() {
        initComponents();
        // Center form
        this.setLocationRelativeTo(null); 
        // Placeholder for maintenance worker username (class.getUsername())
        this.lblUserName.setText(lblUserName.getText() + " %s");
        // Make table uneditable
        tblEquipment.setDefaultEditor(Object.class, null);
        // Call to local method
        loadInventory();
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
        btnLogout = new javax.swing.JButton();
        lblECS = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipment = new javax.swing.JTable();
        btnReturnEquipment = new javax.swing.JButton();
        btnCheckoutEquipment = new javax.swing.JButton();
        btnItemList = new javax.swing.JButton();
        btnCheckedOutitems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipment Checkout System");
        setBackground(new java.awt.Color(55, 55, 55));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/ECS/resources/ECS_Icon.png"))).getImage());
        setResizable(false);

        pnlTitle.setBackground(new java.awt.Color(38, 64, 86));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblECS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblECS.setForeground(new java.awt.Color(255, 255, 255));
        lblECS.setText("Equipment Checkout System");

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(236, 240, 241));
        lblUserName.setText("Name:");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblECS)
                .addGap(133, 133, 133)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblECS, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUserName)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlMain.setBackground(new java.awt.Color(248, 148, 6));

        tblEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Quantity", "Item Description"
            }
        ));
        jScrollPane1.setViewportView(tblEquipment);

        btnReturnEquipment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReturnEquipment.setText("Return Equipment");
        btnReturnEquipment.setToolTipText("");
        btnReturnEquipment.setEnabled(false);
        btnReturnEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnEquipmentActionPerformed(evt);
            }
        });

        btnCheckoutEquipment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCheckoutEquipment.setText("Checkout Equipment");
        btnCheckoutEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutEquipmentActionPerformed(evt);
            }
        });

        btnItemList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnItemList.setText("Reload Inventory");
        btnItemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemListActionPerformed(evt);
            }
        });

        btnCheckedOutitems.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCheckedOutitems.setText("Checked Out Items");
        btnCheckedOutitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckedOutitemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCheckoutEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReturnEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCheckedOutitems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnItemList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckoutEquipment)
                    .addComponent(btnItemList))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnEquipment)
                    .addComponent(btnCheckedOutitems))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // JButton - Logout from main interface
        LoginForm lgf = new LoginForm();
        // Display the LoginForm 
        lgf.setVisible(true);
        // Pack - size of components
        lgf.pack();
        // Center the form location on display
        lgf.setLocationRelativeTo(null);
        // Destroy the current employee object
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnItemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemListActionPerformed
        loadInventory();
    }//GEN-LAST:event_btnItemListActionPerformed

    private void btnCheckedOutitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckedOutitemsActionPerformed
        viewCheckedOutItems();    
    }//GEN-LAST:event_btnCheckedOutitemsActionPerformed

    private void btnCheckoutEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutEquipmentActionPerformed
        // Check if an item row is not selected
        if (tblEquipment.getSelectionModel().isSelectionEmpty()) {
            // Prompt user to select an item to checkout
            JOptionPane.showMessageDialog(this, "Please select an item to checkout", "Error: No item selected", JOptionPane.ERROR_MESSAGE);
            // Call local method
            loadInventory();
        } else {
            /*
            Collect all information within the TableModel for selected item
            Parse/type cast necessary information
            Method call - get Table Model then get the value at table (row,column) location
            */
            int ID = Integer.parseInt(tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 0).toString());
            String name = tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 1).toString();
            int quantity = Integer.parseInt(tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 2).toString());
            String description = tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 3).toString();
            
            // Create new Item object using above parameters
            Item item = new Item(ID, quantity, name, description);
            
            // Prompt user using local method for quantity to checkout
            int quantityToCheckout = promptQuantity(item);
            // Check for valid amount to remove from database
            if (quantityToCheckout == -1) {
                JOptionPane.showMessageDialog(this, "Error: Invalid quantity to checkout", "Error: Invalid quantity", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Check if quantity available is less than quantity to checkout
            if (quantity < quantityToCheckout) {
                JOptionPane.showMessageDialog(this, "Error: Insufficient quantity to checkout", "Error: Insufficient quantity", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Confirm dialog
            int confirmationCheckout = JOptionPane.showConfirmDialog(null, "Are you sure you would like to checkout "
                    + String.valueOf(quantityToCheckout) + "x " + item.getName() + " with item ID#" + String.valueOf(ID) + "?");
            
            // Compare confirm dialog result
            if (confirmationCheckout == 0) {
                // Store success result from local method that interfaces with DataIO method
                boolean successCheckout = checkoutItem(item.getID(), quantityToCheckout);
                // If boolean true returned
                if (successCheckout) {
                    // Notify user of successful item checkout
                    JOptionPane.showMessageDialog(this, "Successfully checked out item");
                    // Display employee items currently checked out
                    viewCheckedOutItems();
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Could not checkout item from inventory", "Error: Inventory unmodified", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                // Unsuccessful Item checkout
                JOptionPane.showMessageDialog(this, "Database unmodified");
                return;
            }   
            
        }
    }//GEN-LAST:event_btnCheckoutEquipmentActionPerformed

    private void btnReturnEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnEquipmentActionPerformed
        // Check if an item row is not selected
        if (tblEquipment.getSelectionModel().isSelectionEmpty()) {
            // Prompt user to select a row within the ListSelectionModel
            JOptionPane.showMessageDialog(this, "Please select an order to return", "Error: No order selected", JOptionPane.ERROR_MESSAGE);
        } 
        else {
            // Get the required data from table
            String transID = tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 3).toString();
            String itemID = tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 4).toString();
            String itemName = tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 5).toString();
            String quantity = tblEquipment.getModel().getValueAt(tblEquipment.getSelectedRow(), 6).toString();
            
            // Confirm dialog
            int confirmationReturn = JOptionPane.showConfirmDialog(null,
                    "Are you sure you would like to return " + quantity + "x " + itemName + " with the order#" + transID + "?");
            if (confirmationReturn == 0) {
                // Store success result from local method that interfaces with DataIO method
                boolean successReturn = returnItem(transID, itemID, quantity);
                // If boolean true returned
                if (successReturn) {
                    // Notify user of successful item return
                    JOptionPane.showMessageDialog(this, "Successfully returned item");
                    // Display current inventory for employee
                    loadInventory();
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Could not return item", "Error: Inventory unmodified", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                // Unsuccessful Item return
                JOptionPane.showMessageDialog(this, "Database unmodified");
                return;
            }   
        }
    }//GEN-LAST:event_btnReturnEquipmentActionPerformed

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
            java.util.logging.Logger.getLogger(ECSMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECSMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECSMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECSMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ECSMainInterface().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckedOutitems;
    private javax.swing.JButton btnCheckoutEquipment;
    private javax.swing.JButton btnItemList;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReturnEquipment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblECS;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tblEquipment;
    // End of variables declaration//GEN-END:variables
    public void loadInventory() {
        // Disable the return equipment JButton
        btnReturnEquipment.setEnabled(false);
        
        // Create a new database interface object
        DataIO data = new DataIO();
        
        try {
            // Set TableModel using database interface object
            tblEquipment.setModel(data.loadInventory());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException cex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
        }
    }
    public int promptQuantity(Item item) {
        // Prompt user for quantity
        String response = JOptionPane.showInputDialog("Enter the quantity of " + item.getName() + " to checkout:");
        // Define and initialize variable
        int responseInt = 0;
        
        try {
            // store response from user after type cast
            responseInt = Integer.parseInt(response);
            // If invalid amount entered by user
            if (responseInt < 1) {
                // Prompt user and exit method
                JOptionPane.showMessageDialog(this, "Error: Quantity must be greater than 0", "Error: Invalid quantity", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
        } catch (Exception ex) {
            // Invalid data type entry, prompt user and exit method
            JOptionPane.showMessageDialog(this, "Error: Invalid format for quantity, must be an integer", "Error: Number format", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        // Successful quantity entered and returned
        return responseInt;
    }
    public boolean checkoutItem(int itemID, int quantityToCheckout) {
        // Create new database interface object
        DataIO data = new DataIO();
        // Define and initialize variable
        int response = 0;
        
        try {
            // store return value of checkoutItem and compare in if statement below
            response = data.checkoutItem(String.valueOf(itemID), String.valueOf(quantityToCheckout), String.valueOf(empForm.getEmployeeID()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (response == 1 || response == 2) {
            JOptionPane.showMessageDialog(this, "Error: This amount would surpass a global/individual item limit", "Error: Item limit reached", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean returnItem(String transID, String itemID, String quantityReturned) {
        // Create new database interface object
        DataIO data = new DataIO();
        // Define and initialize variable
        int response = 0;
        try {
            // store return value of returnitem and compare in if statement below
            response = data.returnItem(transID, itemID, quantityReturned);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (ClassNotFoundException cex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (response == 1) {
            JOptionPane.showMessageDialog(this, "Error: Failed to remove from database", "Error: Inventory unmodified", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public void viewCheckedOutItems() {
        // Create new database interface object
        DataIO data = new DataIO();
        // Enable return equipment JButton
        btnReturnEquipment.setEnabled(true);
        
        try {
            // Populate JTable with checked out item for employee based on logged in user
            tblEquipment.setModel(data.checkedOutItems(empForm.getUsername()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: Network connection", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException cex) {
            JOptionPane.showMessageDialog(this, "Error: Could not load inventory", "Error: SQL Driver", JOptionPane.ERROR_MESSAGE);
        }
    }
}
