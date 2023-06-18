/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import javax.swing.JOptionPane;
import java.sql.SQLException;

public class SignUpPage extends javax.swing.JFrame {

    public SignUpPage() {
        setLocation(433,234);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_FACEMASH = new javax.swing.JLabel();
        label_Register = new javax.swing.JLabel();
        label_RightNow = new javax.swing.JLabel();
        label_Username = new javax.swing.JLabel();
        label_Email = new javax.swing.JLabel();
        label_Phone = new javax.swing.JLabel();
        label_Password = new javax.swing.JLabel();
        label_Retype = new javax.swing.JLabel();
        textField_Username = new javax.swing.JTextField();
        textField_Email = new javax.swing.JTextField();
        textField_Phone = new javax.swing.JTextField();
        textField_Password = new javax.swing.JTextField();
        textField_Retype = new javax.swing.JTextField();
        button_Signup = new javax.swing.JButton();
        button_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        label_FACEMASH.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        label_FACEMASH.setForeground(new java.awt.Color(255, 255, 255));
        label_FACEMASH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_FACEMASH.setText("FACEMASH");

        label_Register.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        label_Register.setForeground(new java.awt.Color(255, 255, 255));
        label_Register.setText("Register");

        label_RightNow.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        label_RightNow.setForeground(new java.awt.Color(255, 255, 255));
        label_RightNow.setText("Right Now!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_Register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_FACEMASH, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_RightNow)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_FACEMASH, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(label_Register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_RightNow)
                .addGap(14, 14, 14))
        );

        label_Username.setForeground(new java.awt.Color(0, 0, 0));
        label_Username.setText("Username               :");

        label_Email.setForeground(new java.awt.Color(0, 0, 0));
        label_Email.setText("Email address         :");

        label_Phone.setForeground(new java.awt.Color(0, 0, 0));
        label_Phone.setText("Phone number         :");

        label_Password.setForeground(new java.awt.Color(0, 0, 0));
        label_Password.setText("Password                 :");

        label_Retype.setForeground(new java.awt.Color(0, 0, 0));
        label_Retype.setText("Retype password     :");

        textField_Username.setToolTipText("");
        textField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_UsernameActionPerformed(evt);
            }
        });

        textField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_EmailActionPerformed(evt);
            }
        });

        button_Signup.setText("Sign up");
        button_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SignupActionPerformed(evt);
            }
        });

        button_Login.setText("Login");
        button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Signup))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Email)
                            .addComponent(label_Phone)
                            .addComponent(label_Password)
                            .addComponent(label_Retype))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField_Username)
                            .addComponent(textField_Email)
                            .addComponent(textField_Phone)
                            .addComponent(textField_Password)
                            .addComponent(textField_Retype, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Username)
                    .addComponent(textField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Email)
                    .addComponent(textField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Phone)
                    .addComponent(textField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Password)
                    .addComponent(textField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Retype)
                    .addComponent(textField_Retype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Signup)
                    .addComponent(button_Login))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_UsernameActionPerformed

    private void textField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_EmailActionPerformed

    private void button_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SignupActionPerformed

        String username = textField_Username.getText();
        String email = textField_Email.getText();
        String phone = textField_Phone.getText();
        String password = textField_Password.getText();
        String retype = textField_Retype.getText();
        if(username.isEmpty()||email.isEmpty()||phone.isEmpty()||password.isEmpty()||retype.isEmpty()){
            JOptionPane.showMessageDialog(null, "SIGN UP FAILED!\nPlease fill all required information.");
        }else if(User.register(username,email,phone,password,retype)){
            try {
                User.output();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            JOptionPane.showMessageDialog(null, "SIGN UP SUCCESS");
            LoginPage goLogin = new LoginPage();
            goLogin.show();
            dispose();
        }else
            JOptionPane.showMessageDialog(null, "SIGN UP FAILED!");
        
    }//GEN-LAST:event_button_SignupActionPerformed

    private void button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LoginActionPerformed
        LoginPage goLogin = new LoginPage();
        goLogin.show();//open LoginPage
        dispose();//close SignUpPage
    }//GEN-LAST:event_button_LoginActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Login;
    private javax.swing.JButton button_Signup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_FACEMASH;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_Phone;
    private javax.swing.JLabel label_Register;
    private javax.swing.JLabel label_Retype;
    private javax.swing.JLabel label_RightNow;
    private javax.swing.JLabel label_Username;
    private javax.swing.JTextField textField_Email;
    private javax.swing.JTextField textField_Password;
    private javax.swing.JTextField textField_Phone;
    private javax.swing.JTextField textField_Retype;
    private javax.swing.JTextField textField_Username;
    // End of variables declaration//GEN-END:variables
}