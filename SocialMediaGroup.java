/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaGroup {
    private List<User> users;
    private List<Group> groups;

    public SocialMediaGroup() {
        users = new ArrayList<>();
        groups = new ArrayList<>();
    }

    public boolean groupExists(String groupName) {
        for (Group group : groups) {
            if (group.getGroupName().equals(groupName)) {
                return true;
            }
        }
        return false;
    }

    public List<User> getUsers() {
        return users;
    }
   
    public List<Group> getGroups() {
        return groups;
    }

    public void registerUser(String username) {
        User user = new User(username);
        users.add(user);
    }

    public void createGroup(String groupName, String adminUsername) {
        User admin = findUserByUsername(adminUsername);
        if (admin != null) {
            Group group = new Group(groupName, admin);
            groups.add(group);
        } else {
            System.out.println("Admin username is invalid.");
        }
    }

    public void inviteToGroup(String groupName, String invitingUsername, String invitedUsername) {
    Group group = findGroupByName(groupName);
    if (group != null) {
        User invitingUser = findUserByUsername(invitingUsername);
        if (invitingUser != null) {
            if (group.getAdmin() == invitingUser) {
                User invitedUser = findUserByUsername(invitedUsername);
                if (invitedUser != null) {
                    group.addMember(invitedUser);
                    System.out.println(invitedUser.getUsername() + " has been invited to " + group.getGroupName());
                } else {
                    System.out.println("Invited username is invalid.");
                }
            } else {
                System.out.println(invitingUser.getUsername() + " is not the admin of " + group.getGroupName());
            }
        } else {
            System.out.println("Inviting username is invalid.");
        }
    } else {
        System.out.println("Group not found.");
    }
}

    public void removeMemberFromGroup(String groupName, String username) {
        Group group = findGroupByName(groupName);
        User user = findUserByUsername(username);

        if (group != null && user != null) {
            if (group.getMembers().contains(user)) {
                group.removeMember(user);
            } else {
                System.out.println(username + " is not a member of " + groupName);
            }
        } else {
            System.out.println("Group or user not found.");
        }
    }

    public void displayUserGroups(String username) {
        User user = findUserByUsername(username);
        if (user != null) {
            System.out.println("Groups for user " + username + ":");
            for (Group group : groups) {
                if (group.getAdmin() == user) {
                    System.out.println("- " + group.getGroupName());
                }
            }
        } else {
            System.out.println("Invalid username.");
        }
    }

    private User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    Group findGroupByName(String groupName) {
        for (Group group : groups) {
            if (group.getGroupName().equals(groupName)) {
                return group;
            }
        }
        return null;
    }

     class User {
        private String username;

        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }
    }

     class Group {
        private String groupName;
        private User admin;
        private List<User> members;

        public Group(String groupName, User admin) {
            this.groupName = groupName;
            this.admin = admin;
            this.members = new ArrayList<>();
        }

        public String getGroupName() {
            return groupName;
        }

        public User getAdmin() {
            return admin;
        }

        public List<User> getMembers() {
            return members;
        }

        public void addMember(User user) {
            members.add(user);
        }

        public void removeMember(User user) {
            members.remove(user);
        }
    }
}
    
