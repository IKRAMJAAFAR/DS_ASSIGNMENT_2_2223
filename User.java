/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;


package facemash_gui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class User extends DataStorage{
    String name;
    String username;
    String email;
    String phone;
    private LocalDate birthday;
    int year,month,day;
    private String password;
    int age;
    String gender;
    private String address;
    ArrayList<User> friends;
    ArrayList<String> hobbies;
    ArrayList<String> jobs;
    static ArrayList<User> users=new ArrayList<>();
    static User user;
    static DataStorage d=new DataStorage();
    public User(String username, String email, String phone, String password) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        friends=new ArrayList<>();
        hobbies=new ArrayList<>();
        jobs=new ArrayList<>();
    }

    public User(String name,String username,String email,String phone,String birthday,String password,String gender,String address,ArrayList<User> friends,ArrayList<String> hobbies,ArrayList<String> jobs){
        this.name=name;
        this.username=username;
        this.email=email;
        this.phone=phone;
        this.password=password;
        year= Integer.parseInt(birthday.split(",")[0]);
        month= Integer.parseInt(birthday.split(",")[1]);
        day= Integer.parseInt(birthday.split(",")[2]);
        this.birthday = LocalDate.of(year, month, day);
        this.age = calculateAge();
        this.address = address;
        this.gender = gender;
        this.friends=friends;
        this.hobbies=hobbies;
        this.jobs=jobs;
    }
    private int calculateAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday, now);
        return period.getYears();
    }

    public static User getUser(String username){
        for(int i=0;i<users.size();i++)
            if(users.get(i).username.equals(username))
                return users.get(i);
        return null;
    }
    public void addFriend(User friend) {
        friends.add(friend);
        friend.friends.add(this);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
        friend.friends.remove(this);
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void removeHobby(String hobby) {
        hobbies.remove(hobby);
    }

    public void addJob(String job) {
        jobs.add(job);
    }

    public void removeJob(String job) {
        jobs.remove(job);
    }

    public void updateGender(String gender) {
        this.gender = gender;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    public static User login(String emailOrPhone, String password) {
        RCTransCipher temp = new RCTransCipher();
        for(int i=0;i<users.size();i++)
            if ((emailOrPhone.equals(users.get(i).email) || emailOrPhone.equals(users.get(i).phone)) && password.equals(temp.decrpyt(users.get(i).password)))
                return users.get(i);
        return null;
    }

    public void setup(String name, String birthday, String address, String gender, String hobby, String job) {
        this.name = name;
        year= Integer.parseInt(birthday.split(",")[0]);
        month= Integer.parseInt(birthday.split(",")[1]);
        day= Integer.parseInt(birthday.split(",")[2]);
        this.birthday = LocalDate.of(year, month, day);
        this.age = calculateAge();
        this.address = address;
        this.gender = gender;
        hobbies = new ArrayList<>();
        addHobby(hobby);
        jobs = new ArrayList<>();
        addJob(job);
    }

    public void edit(String name, boolean n, String birthday, boolean b, String address, boolean a, String gender, boolean g) {
        if(n)
            this.name = name;
        if(b) {
            year= Integer.parseInt(birthday.split(",")[0]);
            month= Integer.parseInt(birthday.split(",")[1]);
            day= Integer.parseInt(birthday.split(",")[2]);
            this.birthday = LocalDate.of(year, month, day);
            this.age = calculateAge();
        }
        if(a)
            this.address = address;
        if(g)
            this.gender = gender;
    }
    //to edit hobbies and jobs, use add or remove methods

    public void se(String name,String username,String email,String phone,String birthday,String gender,String hobbies,String jobs){
        this.name=name;
        this.username=username;
        this.email=email;
        this.phone=phone;
        year= Integer.parseInt(birthday.split(",")[0]);
        month= Integer.parseInt(birthday.split(",")[1]);
        day= Integer.parseInt(birthday.split(",")[2]);
        this.birthday = LocalDate.of(year, month, day);
        this.age=calculateAge();
        this.gender=gender;
        this.hobbies=new ArrayList<>();
        String[] hobby=hobbies.split(",");
        for(int j=0;j<hobby.length;j++)
            this.hobbies.add(hobby[j]);
        this.jobs=new ArrayList<>();
        String[] job=jobs.split(",");
        for(int j=0;j<job.length;j++)
            this.jobs.add(job[j]);
    }

    public static boolean register(String username,String email,String phone,String password,String retype){
        RCTransCipher temp = new RCTransCipher();
        if(password.equals(retype)){
            users.add(new User(username,email,phone,temp.encrpyt(password)));
            return true;
        }else
            return false;
    }

    public static void input(){
        users=new ArrayList<User>();
        for(int i=1;i<=users.size();i++){
            String username=d.retrieveDataMain(""+i);
            String name=d.retrieveData(username,"name");
            String email=d.retrieveData(username,"email");
            String phone=d.retrieveData(username,"phone");
            String birthday=d.retrieveData(username,"birthday");
            String password=d.retrieveData(username,"password");
            int age= Integer.parseInt(d.retrieveData(username,"age"));
            String gender=d.retrieveData(username,"gender");
            String address=d.retrieveData(username,"address");
            ArrayList<User> friends=new ArrayList<>();
            ArrayList<String> hobbies=new ArrayList<>();
            String[] hobby=d.retrieveData(username,"hobby").split(",");
            for(int j=0;j<hobby.length;j++)
                hobbies.add(hobby[j]);
            ArrayList<String> jobs=new ArrayList<>();
            String[] job=d.retrieveData(username,"job").split(",");
            for(int j=0;j<job.length;j++)
                jobs.add(job[j]);
            users.add(new User(name,username,email,phone,birthday,password,gender,address,friends,hobbies,jobs));
        }
        for(int i=0;i<users.size();i++){
            String username=d.retrieveDataMain(""+i);
            String[] friend=d.retrieveData(username,"friend").split(",");
            for(int j=0;j<friend.length;j++)
                users.get(i).friends.add(User.getUser(friend[j]));
        }
    }

    public static void output() throws SQLException {
        d=new DataStorage();
        d.createMainTable("list");
        for(int i=1;i<=users.size();i++){
            if(i==users.size()){
                User u=users.get(i-1);
                d.addData(""+users.size(),u.username,""+i);
                d.createTable(u.username);
                d.updateData(u.username,"name",u.name);
                d.updateData(u.username,"email",u.email);
                d.updateData(u.username,"phone",u.phone);
                d.updateData(u.username,"birthday",u.year+","+u.month+","+u.day);
                d.updateData(u.username,"password",u.password);
                d.updateData(u.username,"age",""+u.age);
                d.updateData(u.username,"gender",u.gender);
                d.updateData(u.username,"address",u.address);
                String friend="";
                for(int j=0;j<u.friends.size();j++)
                    friend+=u.friends.get(j).username+",";
                d.updateData(u.username,"friend",friend);
                String hobby="";
                for(int j=0;j<u.hobbies.size();j++)
                    hobby+=u.hobbies.get(j)+",";
                d.updateData(u.username,"hobby",hobby);
                String job="";
                for(int j=0;j<u.jobs.size();j++)
                    job+=u.jobs.get(j)+",";
                d.updateData(u.username,"job",job);
            }
        }
    }
    
    
    public List<User> findMutualFriends(User otherUser) {
        List<User> mutualFriends = new ArrayList<>();

        // Print a message to indicate the start of finding mutual friends
        System.out.println("Mutual Friends:");

        // Iterate through the list of friends
        for (User friend : friends) {
            // Check if the other user also has this friend
            if (otherUser.friends.contains(friend)) {
                // If the friend is found in both users' friend lists, add them to the mutualFriends list
                mutualFriends.add(friend);
            }
        }

        // Check if any mutual friends were found
        if (mutualFriends.isEmpty()) {
            // If no mutual friends were found, print a message indicating so
            System.out.println("No mutual friends found.");
        } else {
            // If mutual friends were found, iterate through the list and print their usernames
            for (User friend : mutualFriends) {
                System.out.println(friend.username);
            }
        }

        // Return the list of mutual friends
        return mutualFriends;
    }
    
}