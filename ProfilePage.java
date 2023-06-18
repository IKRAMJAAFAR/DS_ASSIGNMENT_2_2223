/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;


import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ProfilePage extends javax.swing.JFrame {

    public ProfilePage() {
        setLocation(433,150);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_FACEMASH = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        label_Username = new javax.swing.JLabel();
        label_Name = new javax.swing.JLabel();
        label_Email = new javax.swing.JLabel();
        label_Contact = new javax.swing.JLabel();
        label_Birthday = new javax.swing.JLabel();
        label_Age = new javax.swing.JLabel();
        label_NumbeOfFriend = new javax.swing.JLabel();
        label_Gender = new javax.swing.JLabel();
        label_About = new javax.swing.JLabel();
        label_Hobby = new javax.swing.JLabel();
        label_Job = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textField_About = new javax.swing.JTextArea();
        textField_Hobby = new javax.swing.JTextField();
        textField_NumberOfFriend = new javax.swing.JTextField();
        textField_Gender = new javax.swing.JTextField();
        textField_Username = new javax.swing.JTextField();
        textField_Name = new javax.swing.JTextField();
        textField_Email = new javax.swing.JTextField();
        textField_Contact = new javax.swing.JTextField();
        textField_Birthday = new javax.swing.JTextField();
        textField_Age = new javax.swing.JTextField();
        textField_Job = new javax.swing.JTextField();
        button_SaveEdit = new javax.swing.JButton();
        button_HomePage = new javax.swing.JButton();
        button_FriendsPage = new javax.swing.JButton();
        button_ProfilePage = new javax.swing.JButton();
        button_Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        label_FACEMASH.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        label_FACEMASH.setForeground(new java.awt.Color(153, 0, 0));
        label_FACEMASH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_FACEMASH.setText("FACEMASH");

        label_Username.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Username.setForeground(new java.awt.Color(0, 0, 0));
        label_Username.setText("Username:");

        label_Name.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Name.setForeground(new java.awt.Color(0, 0, 0));
        label_Name.setText("Name:");

        label_Email.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Email.setForeground(new java.awt.Color(0, 0, 0));
        label_Email.setText("Email address:");

        label_Contact.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Contact.setForeground(new java.awt.Color(0, 0, 0));
        label_Contact.setText("Contact number:");

        label_Birthday.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Birthday.setForeground(new java.awt.Color(0, 0, 0));
        label_Birthday.setText("Birthday:");

        label_Age.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Age.setForeground(new java.awt.Color(0, 0, 0));
        label_Age.setText("Age:");

        label_NumbeOfFriend.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_NumbeOfFriend.setForeground(new java.awt.Color(0, 0, 0));
        label_NumbeOfFriend.setText("Number of friend(s):");

        label_Gender.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Gender.setForeground(new java.awt.Color(0, 0, 0));
        label_Gender.setText("Gender:");

        label_About.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_About.setForeground(new java.awt.Color(0, 0, 0));
        label_About.setText("About me:");

        label_Hobby.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Hobby.setForeground(new java.awt.Color(0, 0, 0));
        label_Hobby.setText("Hobby:");

        label_Job.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        label_Job.setForeground(new java.awt.Color(0, 0, 0));
        label_Job.setText("Job:");

        textField_About.setColumns(20);
        textField_About.setRows(5);
        jScrollPane1.setViewportView(textField_About);

        button_SaveEdit.setText("Save edit");
        button_SaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SaveEditActionPerformed(evt);
            }
        });

        button_HomePage.setText("Home");
        button_HomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomePageActionPerformed(evt);
            }
        });

        button_FriendsPage.setText("Friends");
        button_FriendsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FriendsPageActionPerformed(evt);
            }
        });

        button_ProfilePage.setText("Profile");
        button_ProfilePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ProfilePageActionPerformed(evt);
            }
        });

        button_Logout.setText("Log out");
        button_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_FACEMASH, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(label_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label_Contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(label_About, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textField_Contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                .addComponent(textField_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textField_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textField_Username, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label_Age, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                    .addComponent(label_Job, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textField_Age)
                                                    .addComponent(textField_Job)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(label_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(label_Hobby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(label_NumbeOfFriend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(label_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textField_Gender)
                                            .addComponent(textField_NumberOfFriend)
                                            .addComponent(textField_Hobby, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(button_SaveEdit))))))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_FriendsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_ProfilePage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_FACEMASH, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_FriendsPage)
                    .addComponent(button_ProfilePage)
                    .addComponent(button_Logout)
                    .addComponent(button_HomePage))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_SaveEdit))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_NumbeOfFriend, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_NumberOfFriend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Hobby, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Hobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_About, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void button_HomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HomePageActionPerformed
        //go to HomePage
        HomePage goHome = new HomePage();
        goHome.show();//open HomePage
        dispose();//close ProfilePage
    }//GEN-LAST:event_button_HomePageActionPerformed

    private void button_FriendsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FriendsPageActionPerformed
        //go to FriendPage
        FriendPage goFriends = new FriendPage();
        goFriends.show();//open FriendPage
        dispose();//close ProfilePage
    }//GEN-LAST:event_button_FriendsPageActionPerformed

    private void button_ProfilePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ProfilePageActionPerformed
        //go to ProfilePage
        ProfilePage goProfile =  new ProfilePage();
        goProfile.show();//open ProfilePage
        dispose();//close ProfilePage
    }//GEN-LAST:event_button_ProfilePageActionPerformed

    private void button_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LogoutActionPerformed
        //go to LoginPage
        LoginPage goLogin = new LoginPage();
        goLogin.show();//open LoginPage
        dispose();//close ProfilePage
        JOptionPane.showMessageDialog(null, "Log out successful.");
    }//GEN-LAST:event_button_LogoutActionPerformed

    private void button_SaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SaveEditActionPerformed
        User.user.se(textField_Name.getText(),textField_Username.getText(),textField_Email.getText(),textField_Contact.getText(),textField_Birthday.getText(),textField_Gender.getText(),textField_Hobby.getText(),textField_Job.getText());
        try {
            User.output();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_button_SaveEditActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_FriendsPage;
    private javax.swing.JButton button_HomePage;
    private javax.swing.JButton button_Logout;
    private javax.swing.JButton button_ProfilePage;
    private javax.swing.JButton button_SaveEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_About;
    private javax.swing.JLabel label_Age;
    private javax.swing.JLabel label_Birthday;
    private javax.swing.JLabel label_Contact;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_FACEMASH;
    private javax.swing.JLabel label_Gender;
    private javax.swing.JLabel label_Hobby;
    private javax.swing.JLabel label_Job;
    private javax.swing.JLabel label_Name;
    private javax.swing.JLabel label_NumbeOfFriend;
    private javax.swing.JLabel label_Username;
    private javax.swing.JTextArea textField_About;
    private javax.swing.JTextField textField_Age;
    private javax.swing.JTextField textField_Birthday;
    private javax.swing.JTextField textField_Contact;
    private javax.swing.JTextField textField_Email;
    private javax.swing.JTextField textField_Gender;
    private javax.swing.JTextField textField_Hobby;
    private javax.swing.JTextField textField_Job;
    private javax.swing.JTextField textField_Name;
    private javax.swing.JTextField textField_NumberOfFriend;
    private javax.swing.JTextField textField_Username;
    // End of variables declaration//GEN-END:variables
}