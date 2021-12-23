package ECS;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
        initComponents();
        this.getRootPane().setDefaultButton(btnRegister);
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
        lblRegisterForm = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblPosition = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txfLastName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txfUserName = new javax.swing.JTextField();
        lblRePassword = new javax.swing.JLabel();
        jpfRePassword = new javax.swing.JPasswordField();
        lblFirstName = new javax.swing.JLabel();
        txfFirstName = new javax.swing.JTextField();
        drpIsManager = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipment Checkout System Registration");
        setAlwaysOnTop(true);
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/ECS/resources/ECS_Icon.png"))).getImage());
        setResizable(false);

        pnlTitle.setBackground(new java.awt.Color(38, 64, 86));

        lblRegisterForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRegisterForm.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterForm.setText("Registration Form");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegisterForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegisterForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.setBackground(new java.awt.Color(248, 148, 6));

        lblPosition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(236, 240, 241));
        lblPosition.setText("Position:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(236, 241, 240));
        lblPassword.setText("Password:");

        jpfPassword.setBackground(new java.awt.Color(249, 191, 59));
        jpfPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpfPassword.setForeground(new java.awt.Color(255, 255, 255));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(38, 64, 86));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(38, 64, 86));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Click Here To Return To Login Screen");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(236, 240, 241));
        lblLastName.setText("Last Name:");

        txfLastName.setBackground(new java.awt.Color(249, 191, 59));
        txfLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfLastName.setForeground(new java.awt.Color(255, 255, 255));

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(236, 240, 241));
        lblUserName.setText("User Name:");

        txfUserName.setBackground(new java.awt.Color(249, 191, 59));
        txfUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfUserName.setForeground(new java.awt.Color(255, 255, 255));

        lblRePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(236, 241, 240));
        lblRePassword.setText("Re-Type PW:");

        jpfRePassword.setBackground(new java.awt.Color(249, 191, 59));
        jpfRePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpfRePassword.setForeground(new java.awt.Color(255, 255, 255));

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(236, 240, 241));
        lblFirstName.setText("First Name:");

        txfFirstName.setBackground(new java.awt.Color(249, 191, 59));
        txfFirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfFirstName.setForeground(new java.awt.Color(255, 255, 255));

        drpIsManager.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ECS/resources/GBMainLogo.png"))); // NOI18N

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRePassword)
                                .addComponent(lblPosition))
                            .addGap(18, 18, 18)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpfRePassword)
                                .addComponent(drpIsManager, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlMainLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserName)
                                .addComponent(lblPassword)
                                .addComponent(lblLastName)
                                .addComponent(lblFirstName))
                            .addGap(18, 18, 18)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfLastName)
                                    .addComponent(txfUserName)
                                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(btnRegister)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRePassword)
                    .addComponent(jpfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosition)
                    .addComponent(drpIsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblLogin)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // Create login form object
        LoginForm lgf = new LoginForm();
        // Set the location to the center of the screen
        lgf.setLocationRelativeTo(null);
        // Set visible attribute
        lgf.setVisible(true);
        // Size components
        lgf.pack();
        // Discard current JFrame interface
        this.dispose();

    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // Call local registration method
        boolean regSuccess = Register();
        // If returned true
        if (regSuccess) {
            // Notify user that account is created successfully
            JOptionPane.showMessageDialog(this, "Registration Successful");
            // Create new login form
            LoginForm lgf = new LoginForm();
            // Set the location to the center of the screen
            lgf.setLocationRelativeTo(null);
            // Set visible attribute
            lgf.setVisible(true);
            // Size components
            lgf.pack();
            // Discard current JFrame interface
            this.dispose();
            
        } else {
            // else notify user that an error occurred during account creation
            JOptionPane.showMessageDialog(this, "There was an error creating your account, please try again");
        }   
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear all of the textfields
        txfFirstName.setText("");
        txfLastName.setText("");
        txfUserName.setText("");
        jpfPassword.setText("");
        jpfRePassword.setText("");
        drpIsManager.setSelectedIndex(0);
        
        // Set the focus cursor to the first data textfield
        txfFirstName.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> drpIsManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JPasswordField jpfRePassword;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblRegisterForm;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTextField txfFirstName;
    private javax.swing.JTextField txfLastName;
    private javax.swing.JTextField txfUserName;
    // End of variables declaration//GEN-END:variables

    private Employee createEmployee() {
        /* 
        Regular Expressions used to ensure employee information
        coincides with organization policy.
        Input Validation
        */     
        
        String firstName = txfFirstName.getText();
        if (!regexMatch(firstName, "[a-zA-Z]+")) {
            firstName = "-1";
        }
        
        String lastName = txfLastName.getText();
        if (!regexMatch(lastName, "[a-zA-Z]+")) {
            lastName = "-1";
        }
        
        String password = "";
        
        boolean isManager = false;
        
        if (drpIsManager.getSelectedItem() == "Manager") {
            isManager = true;
        }
        
        String username = txfUserName.getText();
        
        if (!regexMatch(username, "[a-zA-Z0-9]+")) {
            username = "-1";
        }
        
        if (jpfPassword.getText().equals(jpfRePassword.getText())) {
            password = jpfPassword.getText();
        } 
        
        else {
            JOptionPane.showMessageDialog(this, "Error: Passwords do not match", "Error: Password mismatch", JOptionPane.ERROR_MESSAGE);
            password = "-1";
        }  
        
        // Create employee object using information from textfields
        Employee emp = new Employee(firstName, lastName, username, PasswordHash.hash(password), isManager);
        
        return emp;
    }

    private boolean Register() {
        // Create employee using local method
        Employee emp = createEmployee();
        
        // Input Validation from createEmployee return value
        if (emp.getPassword().equals("-1")) {
            return false;
        }
        
        // Input Validation from createEmployee return value
        if (emp.getFirstName().equals("-1")) {
            JOptionPane.showMessageDialog(this, "First name contains invalid characters", "Error: Invalid input", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Input Validation from createEmployee return value
        if (emp.getLastName().equals("-1")) {
            JOptionPane.showMessageDialog(this, "Last name contains invalid characters", "Error: Invalid input", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Input Validation from createEmployee return value
        if (emp.getUsername().equals("-1")) {
            JOptionPane.showMessageDialog(this, "Username contains invalid characters", "Error: Invalid input", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Create new database interface instance
        DataIO data = new DataIO();
        try {
            // Check for duplicate login credentials
            if (data.checkUserAlreadyExists(emp)) {
                JOptionPane.showMessageDialog(this, "Error: Username already exists", "Error: Username already exists", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            // Add employee to the database
            data.add(emp);
        } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                        "Database Error", JOptionPane.ERROR_MESSAGE);
                return false;
        } catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(this, "Driver Not Found Error: " + ex.getMessage(),
                        "Database Driver Error", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        
        return true;
    }
    private boolean regexMatch(String input, String pattern) {
        if (!input.matches(pattern)) {
            return false;
        }
        return true;
    }
}