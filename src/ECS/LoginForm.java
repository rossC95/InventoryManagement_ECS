package ECS;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public LoginForm() {           
        initComponents();
        this.getRootPane().setDefaultButton(btnLogin);
        this.setLocationRelativeTo(null); //center form in the middle of screen
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
        lblLoginForm = new javax.swing.JLabel();
        pnlForm = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txfUserName = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblRegisterEntry = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipment Checkout System Login");
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/ECS/resources/ECS_Icon.png"))).getImage());
        setResizable(false);

        pnlTitle.setBackground(new java.awt.Color(38, 64, 86));

        lblLoginForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLoginForm.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginForm.setText("Login Form");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlForm.setBackground(new java.awt.Color(248, 148, 6));

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(236, 240, 241));
        lblUserName.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(236, 241, 240));
        lblPassword.setText("Password:");

        txfUserName.setBackground(new java.awt.Color(249, 191, 59));
        txfUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfUserName.setForeground(new java.awt.Color(255, 255, 255));

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

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(38, 64, 86));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegisterEntry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRegisterEntry.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterEntry.setText("Click here To Create A New User Account");
        lblRegisterEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegisterEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterEntryMouseClicked(evt);
            }
        });

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ECS/resources/GBMainLogo.png"))); // NOI18N

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormLayout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfUserName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addComponent(lblRegisterEntry)
                        .addGap(41, 41, 41))))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lblRegisterEntry))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblIcon)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegisterEntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterEntryMouseClicked
        RegistrationForm rgf = new RegistrationForm();
        rgf.setLocationRelativeTo(null);
        rgf.setVisible(true);
        rgf.pack();
        this.dispose();
      
    }//GEN-LAST:event_lblRegisterEntryMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (Login()) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error: Invalid credentials", "Error: User does not exist", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txfUserName.setText("");
        jpfPassword.setText("");
        txfUserName.requestFocus();
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLoginForm;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterEntry;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTextField txfUserName;
    // End of variables declaration//GEN-END:variables
    private boolean Login() {
        String username = txfUserName.getText();
        String password = PasswordHash.hash(jpfPassword.getText());
        DataIO data = new DataIO();
        boolean userExists = false;
        Employee emp = new Employee();
        try {
            userExists = data.validateEmployee(username, password);
            if (userExists) {
                try {
                    emp = data.login(username, password);
                    if (emp.getIsManager()) {
                        // Pass employee object to manager interface
                        ECSManagerInterface ecsManager = new ECSManagerInterface(emp);
                        ecsManager.setLocationRelativeTo(null);
                        ecsManager.setVisible(true);
                        ecsManager.pack();
                        return true;
                    } else {
                        // Pass employee object to interface
                        ECSMainInterface ecsMain = new ECSMainInterface(emp);
                        ecsMain.setLocationRelativeTo(null);
                        ecsMain.setVisible(true);
                        ecsMain.pack();    
                        return true;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                            "Database Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } catch (ClassNotFoundException ex)
                {
                        JOptionPane.showMessageDialog(this, "Driver Not Found Error: " + ex.getMessage(),
                                "Database Driver Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

            } else {
                return false;
            }
        }
        catch (SQLException ex)
        {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                        "Database Error", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        catch (ClassNotFoundException ex)
        {
                JOptionPane.showMessageDialog(this, "Driver Not Found Error: " + ex.getMessage(),
                        "Database Driver Error", JOptionPane.ERROR_MESSAGE);
                return false;
        }   
    }
}
