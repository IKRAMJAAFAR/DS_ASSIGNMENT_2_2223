/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

package facemash_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SocialMediaGroupGUI {
    private SocialMediaGroup socialMediaApp;
    private JFrame frame;
    private JTextField usernameField;
    private JTextField groupNameField;
    private JComboBox<String> groupList;
    private JTextArea outputArea;

    public SocialMediaGroupGUI() {
        socialMediaApp = new SocialMediaGroup();
        initializeGUI();
    }

    private void initializeGUI() {
        // Create the main frame
        frame = new JFrame("Social Media Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Create a panel for user registration
        JPanel userRegistrationPanel = createUserRegistrationPanel();
        frame.add(userRegistrationPanel, BorderLayout.NORTH);

        // Create a panel for group creation and management
        JPanel groupManagementPanel = createGroupManagementPanel();
        frame.add(groupManagementPanel, BorderLayout.CENTER);

        // Create an output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Set the frame visible
        frame.setVisible(true);
    }

    private JPanel createUserRegistrationPanel() {
        // Create the user registration panel
        JPanel userRegistrationPanel = new JPanel(new FlowLayout());

        // Create the username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        userRegistrationPanel.add(usernameLabel);
        userRegistrationPanel.add(usernameField);

        // Create the register user button
        JButton registerUserButton = new JButton("Register User");
        registerUserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                socialMediaApp.registerUser(username);
                usernameField.setText("");
                updateGroupList();
                displayOutput("User registered: " + username);
            }
        });
        userRegistrationPanel.add(registerUserButton);

        return userRegistrationPanel;
    }

    private JPanel createGroupManagementPanel() {
        // Create the group management panel
        JPanel groupManagementPanel = new JPanel(new FlowLayout());

        // Create the group name label and text field
        JLabel groupNameLabel = new JLabel("Group Name:");
        groupNameField = new JTextField(15);
        groupManagementPanel.add(groupNameLabel);
        groupManagementPanel.add(groupNameField);

        // Create the create group button
        JButton createGroupButton = new JButton("Create Group");
        createGroupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String groupName = groupNameField.getText();
                String adminUsername = (String) JOptionPane.showInputDialog(frame, "Enter admin username:", "Admin Username", JOptionPane.PLAIN_MESSAGE);
                socialMediaApp.createGroup(groupName, adminUsername);
                groupNameField.setText("");
                updateGroupList();
                displayOutput("Group created: " + groupName);
            }
        });
        groupManagementPanel.add(createGroupButton);

        // Create the group list combo box
        groupList = new JComboBox<>();
        groupList.setPreferredSize(new Dimension(150, 25));
        groupList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedGroup = (String) groupList.getSelectedItem();
                displayGroupMembers(selectedGroup);
            }
        });
        groupManagementPanel.add(groupList);

        // Create the add user to group button
        JButton addUserToGroupButton = new JButton("Add User to Group");
        addUserToGroupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedGroup = (String) groupList.getSelectedItem();
                String invitingUsername = (String) JOptionPane.showInputDialog(frame, "Enter inviting username:", "Inviting Username", JOptionPane.PLAIN_MESSAGE);
                String invitedUsername = (String) JOptionPane.showInputDialog(frame, "Enter invited username:", "Invited Username", JOptionPane.PLAIN_MESSAGE);
                socialMediaApp.inviteToGroup(selectedGroup, invitingUsername, invitedUsername);
                displayGroupMembers(selectedGroup);
                displayOutput("User added to group: " + invitedUsername);
            }
        });
        groupManagementPanel.add(addUserToGroupButton);

        // Create the display group users button
        JButton displayGroupUsersButton = new JButton("Display Group Users");
        displayGroupUsersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedGroup = (String) groupList.getSelectedItem();
                displayGroupUsers(selectedGroup);
            }
        });
        groupManagementPanel.add(displayGroupUsersButton);

        return groupManagementPanel;
    }

    private void updateGroupList() {
        groupList.removeAllItems();
        List<SocialMediaGroup.Group> groups = socialMediaApp.getGroups();
        for (SocialMediaGroup.Group group : groups) {
            groupList.addItem(group.getGroupName());
        }
    }

    private void displayGroupMembers(String groupName) {
        SocialMediaGroup.Group group = socialMediaApp.findGroupByName(groupName);
        if (group != null) {
            List<SocialMediaGroup.User> members = group.getMembers();
            StringBuilder sb = new StringBuilder();
            for (SocialMediaGroup.User member : members) {
                sb.append(member.getUsername()).append("\n");
            }
            JOptionPane.showMessageDialog(frame, sb.toString(), "Group Members - " + groupName, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void displayGroupUsers(String groupName) {
        SocialMediaGroup.Group group = socialMediaApp.findGroupByName(groupName);
        if (group != null) {
            List<SocialMediaGroup.User> users = socialMediaApp.getUsers();
            StringBuilder sb = new StringBuilder();
            for (SocialMediaGroup.User user : users) {
                sb.append(user.getUsername()).append("\n");
            }
            JOptionPane.showMessageDialog(frame, sb.toString(), "Group Users - " + groupName, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void displayOutput(String message) {
        JOptionPane.showMessageDialog(frame, message, "Output", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SocialMediaGroupGUI();
            }
        });
    }
}


     