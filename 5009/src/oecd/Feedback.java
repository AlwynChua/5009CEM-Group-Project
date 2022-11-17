/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oecd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Feedback extends javax.swing.JFrame {

    public Feedback() {
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

        jP_feedback = new javax.swing.JPanel();
        jL_name = new javax.swing.JLabel();
        txtsubject = new javax.swing.JTextField();
        jL_email = new javax.swing.JLabel();
        txtuid = new javax.swing.JTextField();
        jL_subject = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jL_context = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcontext = new javax.swing.JTextArea();
        jL_feedback = new javax.swing.JLabel();
        jBtn_back = new javax.swing.JButton();
        jBtn_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jL_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_name.setText("UID:");

        txtsubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jL_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_email.setText("Username:");

        txtuid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jL_subject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_subject.setText("Subject:");

        txtuname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });

        jL_context.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_context.setText("Context:");

        txtcontext.setColumns(20);
        txtcontext.setRows(5);
        jScrollPane1.setViewportView(txtcontext);

        jL_feedback.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jL_feedback.setText("Feedback");

        jBtn_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_back.setText("Cancel");
        jBtn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_backActionPerformed(evt);
            }
        });

        jBtn_submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_submit.setText("Submit");
        jBtn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_feedbackLayout = new javax.swing.GroupLayout(jP_feedback);
        jP_feedback.setLayout(jP_feedbackLayout);
        jP_feedbackLayout.setHorizontalGroup(
            jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_feedbackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jP_feedbackLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_email)
                    .addComponent(jL_name)
                    .addComponent(jL_subject)
                    .addComponent(jL_context))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_feedbackLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_feedbackLayout.createSequentialGroup()
                        .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuid, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_feedbackLayout.createSequentialGroup()
                        .addComponent(jL_feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))))
        );
        jP_feedbackLayout.setVerticalGroup(
            jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_feedbackLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jL_feedback)
                .addGap(18, 18, 18)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_name))
                .addGap(18, 18, 18)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_email))
                .addGap(18, 18, 18)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_subject))
                .addGap(18, 18, 18)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_context)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jP_feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_back)
                    .addComponent(jBtn_submit))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_feedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_feedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //delcare the database
    Connection con1;
    PreparedStatement insert;
    
    private void jBtn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtn_backActionPerformed

    private void jBtn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_submitActionPerformed
        // TODO add your handling code here:

        //to set string and get the text from form
        String uid = txtuid.getText();
        String uname = txtuname.getText();
        String subject = txtsubject.getText();
        String context = txtcontext.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connect to database and insert the credentials
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/5009_database", "root", "");
            insert = con1.prepareStatement("insert into feedbackform(uid,uname,subject,context)values(?,?,?,?)");
            insert.setString(1, uid);
            insert.setString(2, uname);
            insert.setString(3, subject);
            insert.setString(4, context);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "Feedback has been sent!");
            
            dispose();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CompanyEditBtn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CompanyEditBtn.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBtn_submitActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_back;
    private javax.swing.JButton jBtn_submit;
    private javax.swing.JLabel jL_context;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_feedback;
    private javax.swing.JLabel jL_name;
    private javax.swing.JLabel jL_subject;
    private javax.swing.JPanel jP_feedback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtcontext;
    private javax.swing.JTextField txtsubject;
    private javax.swing.JTextField txtuid;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}