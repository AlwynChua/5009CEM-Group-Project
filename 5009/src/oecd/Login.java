/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oecd;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.Statement;

public class Login extends javax.swing.JFrame { //implements ActionListener

    /*DBConnection conn;*/
    // Creates new form Login //
    public Login() {
        initComponents();
        /*conn = new DBConnection();
        if(conn == null){
            JOptionPane.showMessageDialog(this, "DB Connection not available", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            userLogin();
        }
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        */
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_login = new javax.swing.JLabel();
        jTF_email = new javax.swing.JTextField();
        jP_password = new javax.swing.JPasswordField();
        jBtn_signIn = new javax.swing.JButton();
        jBtn_signUp = new javax.swing.JButton();
        jBtn_Exit = new javax.swing.JButton();
        jL_email = new javax.swing.JLabel();
        jL_password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_login.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jL_login.setText("Sign In");

        jTF_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTF_email.setText("Email");
        jTF_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_emailActionPerformed(evt);
            }
        });

        jP_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jP_password.setText("jPasswordField1");
        jP_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jP_passwordActionPerformed(evt);
            }
        });

        jBtn_signIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_signIn.setText("Sign In");
        jBtn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_signInActionPerformed(evt);
            }
        });

        jBtn_signUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_signUp.setText("Sign Up");
        jBtn_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_signUpActionPerformed(evt);
            }
        });

        jBtn_Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_Exit.setText("Return");
        jBtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ExitActionPerformed(evt);
            }
        });

        jL_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jL_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jBtn_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jL_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTF_email)
                        .addComponent(jP_password)
                        .addComponent(jL_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jL_login)
                .addGap(18, 18, 18)
                .addComponent(jTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_email, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jP_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_password, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_signUp)
                    .addComponent(jBtn_signIn)
                    .addComponent(jBtn_Exit))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //buttons function
    private void jBtn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_signInActionPerformed
        // TODO add your handling code here:
        //third example
        String email = jTF_email.getText();
        String password = String.valueOf(jP_password.getPassword());
        if(email.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Email / Password should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //start the login process.
            userLogin(email, password);
        }
    }//GEN-LAST:event_jBtn_signInActionPerformed

    private void jBtn_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_signUpActionPerformed
        // TODO add your handling code here:
        //this.toBack();
        dispose();
        Registration registration = new Registration();
        registration.setTitle("Sign Up/Register a account");
        registration.setLocationRelativeTo(null); //center the form
        registration.setVisible(true);
        //registration.toFront();
    }//GEN-LAST:event_jBtn_signUpActionPerformed

    private void jBtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
        WelcomePage returnMainMenu = new WelcomePage();
        returnMainMenu.setTitle("Main Menu");
        returnMainMenu.setLocationRelativeTo(null); //center the form
        returnMainMenu.setVisible(true);
    }//GEN-LAST:event_jBtn_ExitActionPerformed

    private void jP_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jP_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_passwordActionPerformed

    private void jTF_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_emailActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Exit;
    private javax.swing.JButton jBtn_signIn;
    private javax.swing.JButton jBtn_signUp;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_login;
    private javax.swing.JLabel jL_password;
    private javax.swing.JPasswordField jP_password;
    private javax.swing.JTextField jTF_email;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String email, String password){
        Connection conn = DBConnection.connectDB();
        if(conn != null){
            try {
            PreparedStatement pst = (PreparedStatement)conn.prepareStatement("Select  * from user WHERE email=? and password=?");
            //PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, email);
            pst.setString(2, password);
            //pst.setString(1, jTF_email.getText());
            //pst.setString(2, jP_password.getPassword().toString());
            ResultSet res = pst.executeQuery();
            if(res.next()){
                //JOptionPane.showMessageDialog(null, "Email and Password Matched");
                //display user home page
                dispose();
                
                String uid = res.getString("uid");
                String fname = res.getString("fname");
                String lname = res.getString("lname");
                String uic = res.getString("ic");
                String ucontact = res.getString("contact");
                
                CompanyList userFunctions = new CompanyList(uid, fname, lname, uic, ucontact, email, password);
                userFunctions.setTitle("Company and Services");
                userFunctions.setLocationRelativeTo(null); //center the form
                userFunctions.setVisible(true);
                //setVisible(false);
            }else{
                System.out.println("email " + email);
                System.out.println("password " + password);
                JOptionPane.showMessageDialog(this, "Email and Password Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                //jTF_email.setText("");
                //jP_password.setText("");
            }
            //throw new UnsupportedOperationException("Not supported yet.");
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("There connection is not available");
        }
    }
}
