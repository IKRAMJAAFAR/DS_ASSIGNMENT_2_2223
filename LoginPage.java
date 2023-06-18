/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;



import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        setLocation(433,234);   //pop up in the middle of screen
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_FACEMASH = new javax.swing.JLabel();
        label_Welcome = new javax.swing.JLabel();
        label_Email = new javax.swing.JLabel();
        label_Password = new javax.swing.JLabel();
        button_Forgot = new javax.swing.JButton();
        textField_Email = new javax.swing.JTextField();
        button_Login = new javax.swing.JButton();
        button_Register = new javax.swing.JButton();
        textField_Password = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        label_FACEMASH.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        label_FACEMASH.setForeground(new java.awt.Color(255, 255, 255));
        label_FACEMASH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_FACEMASH.setText("FACEMASH");

        label_Welcome.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        label_Welcome.setForeground(new java.awt.Color(255, 255, 255));
        label_Welcome.setText("Welcome To");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_Welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_FACEMASH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_FACEMASH, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(label_Welcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_Email.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        label_Email.setForeground(new java.awt.Color(0, 0, 0));
        label_Email.setText("Email address:");

        label_Password.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        label_Password.setForeground(new java.awt.Color(0, 0, 0));
        label_Password.setText("Password       :");

        button_Forgot.setText("Forgot password?");
        button_Forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ForgotActionPerformed(evt);
            }
        });

        textField_Email.setToolTipText("");
        textField_Email.setActionCommand("");
        textField_Email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textField_Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField_Email.setName(""); // NOI18N
        textField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_EmailActionPerformed(evt);
            }
        });

        button_Login.setText("Login");
        button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LoginActionPerformed(evt);
            }
        });

        button_Register.setText("Register");
        button_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegisterActionPerformed(evt);
            }
        });

        textField_Password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(label_Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(button_Register)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(button_Forgot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(label_Email)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_Email))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_Password))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Login)
                    .addComponent(button_Register))
                .addGap(20, 20, 20)
                .addComponent(button_Forgot)
                .addGap(29, 29, 29))
        );

        textField_Email.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ForgotActionPerformed

    }//GEN-LAST:event_button_ForgotActionPerformed

    private void textField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_EmailActionPerformed

    }//GEN-LAST:event_textField_EmailActionPerformed

    private void button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LoginActionPerformed
        
        //User.input();
        String emailOrPhone = textField_Email.getText();
        String password = textField_Password.getText();
        User u = User.login(emailOrPhone,password);
        if(emailOrPhone.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(null, "LOGIN FAILED!\nPlease fill in your email or phone and password.");
        }else if(u!=null){
            User.user = u;
            HomePage goHome = new HomePage();
            goHome.show();
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "LOGIN FAILED!\nPlease enter the right email or phone and password.");
        }
        /*muiz edition
        String email = textField_Email.getText();
        String password = textField_Password.getText();
        //System.out.println(email + "\n" + password);
        if(textField_Email.getText().isEmpty()||textField_Password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "LOGIN FAILED!\nPlease fill in your email and password.");
            
        }else if(textField_Email.getText().equals("test")&&textField_Password.getText().equals("123")){    //for testing purpose only since database not complete yet
            HomePage goHome = new HomePage();
            goHome.show();//open HomePage
            dispose();//close LoginPage
            
        }else{
            JOptionPane.showMessageDialog(null, "LOGIN FAILED!\nPlease enter the right email and password.");
        }
        */
    }//GEN-LAST:event_button_LoginActionPerformed

    private void button_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegisterActionPerformed
        //open sign up page
        SignUpPage goSignUp = new SignUpPage();
        goSignUp.show();    //open SignUpPage
        
        dispose();  //close LoginPage
    }//GEN-LAST:event_button_RegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Forgot;
    private javax.swing.JButton button_Login;
    private javax.swing.JButton button_Register;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_FACEMASH;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_Welcome;
    private javax.swing.JTextField textField_Email;
    private javax.swing.JPasswordField textField_Password;
    // End of variables declaration//GEN-END:variables
}
