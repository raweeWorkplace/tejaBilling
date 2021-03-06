/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;


import Dao.DataBase_Connection;
import PanelForms.Test.Encryption;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ranjan
 */
public class forgotPasswordPanel extends javax.swing.JPanel {
    protected Connection conInstance;
    protected Statement smtInstance;
    ResultSet rs;
    DataBase_Connection dao;
    private String Warning;

    /**
     * Creates new form forgotPasswordPanel
     */
    public forgotPasswordPanel() {
        initComponents();
        dao = new DataBase_Connection();
        conInstance = dao.getConnection();
    }
    
    public void reset(){
        txtUserName.setText("");
        pwdOldMasterPassword.setText("");
        pwdNewPassword.setText("");
        pwdConfirmNewPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pwdOldMasterPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        pwdNewPassword = new javax.swing.JPasswordField();
        pwdConfirmNewPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        submittButton = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        lblWarning = new javax.swing.JLabel();

        jPanel2.setBackground(java.awt.SystemColor.control);
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        jLabel6.setText("Forgot Password ??");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel7.setText("Username :");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel8.setText("Master Password :");

        pwdOldMasterPassword.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        pwdOldMasterPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdOldMasterPasswordKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel9.setText("New Password :");

        pwdNewPassword.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        pwdNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdNewPasswordKeyPressed(evt);
            }
        });

        pwdConfirmNewPassword.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        pwdConfirmNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdConfirmNewPasswordKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel10.setText("Confirm Password :");

        submittButton.setFont(new java.awt.Font("Century Schoolbook L", 1, 15)); // NOI18N
        submittButton.setText("Update");
        submittButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submittButtonActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        lblWarning.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwdConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwdNewPassword)
                                    .addComponent(pwdOldMasterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(lblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(submittButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblWarning, pwdConfirmNewPassword, pwdNewPassword, pwdOldMasterPassword, txtUserName});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pwdOldMasterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pwdNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pwdConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submittButton)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void forgot(){
        try {
            String user = txtUserName.getText();
            String password1 = new String(pwdOldMasterPassword.getPassword());
            String password = Encryption.SHA1(password1);
            String passwordNew = new String(pwdNewPassword.getPassword());
            String confirm = new String(pwdConfirmNewPassword.getPassword());
            String passwordNew1 = Encryption.SHA1(passwordNew);

            String sql = "select UserId, masterPassword from Login_tbl where UserId = '" + user + "'";
            smtInstance = conInstance.createStatement();
            rs = smtInstance.executeQuery(sql);
            while (rs.next()) {

                String usname = rs.getString(1);
                String pswrd = rs.getString(2);

                if (user.equals(usname) && password.equals(pswrd)&&(passwordNew.equals(confirm))) {

                    String sqlUpdate = "update Login_tbl set Password = '"+passwordNew1+"'where UserId = '" + user + "'";
                    smtInstance = conInstance.createStatement();
                    smtInstance.executeUpdate(sqlUpdate);
                    JOptionPane.showMessageDialog(null,"Password Updated");

                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect login or password",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();
        
    }
    
    
    private void submittButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submittButtonActionPerformed
        if(!txtUserName.getText().isEmpty()){
            forgot();
        }
         else {
                    JOptionPane.showMessageDialog(this, "Enter Username",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_submittButtonActionPerformed

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        if(!txtUserName.getText().isEmpty()){
            try {
                String check = "select * from Login_tbl where UserId ='"+txtUserName.getText()+"'";
                smtInstance = conInstance.createStatement();
                ResultSet rs = smtInstance.executeQuery(check);

                if(!rs.next()){
                    Warning = "Invalid User.";
                    submittButton.setEnabled(false);
                }
                else{
                    Warning = "Valid Username.";
                    submittButton.setEnabled(true);

                }

            } catch (SQLException ex) {
                Logger.getLogger(regPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            Warning = "Invalid action";
            txtUserName.requestFocus();

        }
        lblWarning.setText(Warning);
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            pwdOldMasterPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void pwdOldMasterPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdOldMasterPasswordKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            pwdNewPassword.requestFocus();
        }
    }//GEN-LAST:event_pwdOldMasterPasswordKeyPressed

    private void pwdNewPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdNewPasswordKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            pwdConfirmNewPassword.requestFocus();
        }
    }//GEN-LAST:event_pwdNewPasswordKeyPressed

    private void pwdConfirmNewPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdConfirmNewPasswordKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            submittButton.requestFocus();
        }
    }//GEN-LAST:event_pwdConfirmNewPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JPasswordField pwdConfirmNewPassword;
    private javax.swing.JPasswordField pwdNewPassword;
    private javax.swing.JPasswordField pwdOldMasterPassword;
    private javax.swing.JButton submittButton;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
