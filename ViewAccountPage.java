/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewAccountPage extends JFrame {

    private JTextField fullNameTextField;
    private JTextField userNameTextField;
    private JTextArea interestsTextArea;
    private JTextArea familyMembersTextArea;
    private JTextArea friendsTextArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewAccountPage frame = new ViewAccountPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViewAccountPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("View Account");

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblFullName = new JLabel("Full Name:");
        lblFullName.setBounds(10, 10, 80, 14);
        panel.add(lblFullName);

        fullNameTextField = new JTextField();
        fullNameTextField.setBounds(100, 10, 200, 20);
        panel.add(fullNameTextField);
        fullNameTextField.setColumns(10);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(10, 40, 80, 14);
        panel.add(lblUsername);

        userNameTextField = new JTextField();
        userNameTextField.setBounds(100, 40, 200, 20);
        panel.add(userNameTextField);
        userNameTextField.setColumns(10);

        JButton viewButton = new JButton("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        viewButton.setBounds(10, 70, 80, 23);
        panel.add(viewButton);

        JLabel lblInterests = new JLabel("Interests:");
        lblInterests.setBounds(10, 100, 80, 14);
        panel.add(lblInterests);

        interestsTextArea = new JTextArea();
        interestsTextArea.setBounds(100, 100, 200, 50);
        panel.add(interestsTextArea);

        JLabel lblFamilyMembers = new JLabel("Family Members:");
        lblFamilyMembers.setBounds(10, 160, 100, 14);
        panel.add(lblFamilyMembers);

        familyMembersTextArea = new JTextArea();
        familyMembersTextArea.setBounds(100, 160, 200, 50);
        panel.add(familyMembersTextArea);

        JLabel lblFriends = new JLabel("Friends:");
        lblFriends.setBounds(10, 220, 80, 14);
        panel.add(lblFriends);

        friendsTextArea = new JTextArea();
        friendsTextArea.setBounds(100, 220, 200, 50);
        panel.add(friendsTextArea);
    }

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String fullName = fullNameTextField.getText();
        String userName = userNameTextField.getText();

        // Establish a connection to the database
        String url = "jdbc:mysql://localhost:3306/facebook";
        String username = "your-username";
        String password = "your-password";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement object
            Statement statement = connection.createStatement();

            // Execute a query to retrieve user data based on full name and username
            String query = "SELECT * FROM your-table WHERE full_name = '" + fullName + "' AND username = '" + userName + "'";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                // Retrieve data from the result set
                String interests = resultSet.getString("interests");
                String familyMembers = resultSet.getString("family_members");
                String friends = resultSet.getString("friends");

                // Update the GUI components with the retrieved data
                interestsTextArea.setText(interests);
                familyMembersTextArea.setText(familyMembers);
                friendsTextArea.setText(friends);
            } else {
                // User not found, display an error message or handle it accordingly
                JOptionPane.showMessageDialog(this, "User not found");
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the SQL exception
        }
    }
}








 