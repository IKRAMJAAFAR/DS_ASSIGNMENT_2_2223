/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    LinkedList<String> stack = new LinkedList<>();//for traceback function
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement prestate = null;
    int countRow = 0;//total post in the database
    int postIndex = 0;//1st post as reference index
    
    public HomePage() {
        setLocation(433,150);
        initComponents();

        try{
            con = db.mycon();           //the database address can be found in db class.
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Post");

            if(rs.next()){
                textField_ID.setText(rs.getString(1));
                textField_Date.setText(rs.getString(2));
                textField_Time.setText(rs.getString(3));
                textArea_ViewPost.setText(rs.getString(4));
            }
          
            countRow = 0;
            while(rs.next())
                countRow++;


        }catch(SQLException e){
            System.out.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        label_FACEMASH = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        button_HomePage = new javax.swing.JButton();
        button_FriendsPage = new javax.swing.JButton();
        button_ProfilePage = new javax.swing.JButton();
        button_Logout = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        label_Submit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_SubmitPost = new javax.swing.JTextArea();
        button_Submit = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        label_View = new javax.swing.JLabel();
        label_ID = new javax.swing.JLabel();
        label_Date = new javax.swing.JLabel();
        label_Time = new javax.swing.JLabel();
        textField_ID = new javax.swing.JTextField();
        textField_Date = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea_ViewPost = new javax.swing.JTextArea();
        textField_Time = new javax.swing.JTextField();
        button_Next = new javax.swing.JButton();
        button_Previous = new javax.swing.JButton();
        button_Traceback = new javax.swing.JButton();
        button_Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        label_FACEMASH.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        label_FACEMASH.setForeground(new java.awt.Color(153, 0, 0));
        label_FACEMASH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_FACEMASH.setText("FACEMASH");

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

        label_Submit.setBackground(new java.awt.Color(0, 0, 0));
        label_Submit.setForeground(new java.awt.Color(0, 0, 0));
        label_Submit.setText("Submit your post:");

        textArea_SubmitPost.setColumns(20);
        textArea_SubmitPost.setRows(5);
        jScrollPane1.setViewportView(textArea_SubmitPost);

        button_Submit.setText("Submit");
        button_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SubmitActionPerformed(evt);
            }
        });

        label_View.setForeground(new java.awt.Color(0, 0, 0));
        label_View.setText("View available online post: ");

        label_ID.setForeground(new java.awt.Color(0, 0, 0));
        label_ID.setText("Post ID:");

        label_Date.setForeground(new java.awt.Color(0, 0, 0));
        label_Date.setText("Date:");

        label_Time.setForeground(new java.awt.Color(0, 0, 0));
        label_Time.setText("Time:");

        textField_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_DateActionPerformed(evt);
            }
        });

        textArea_ViewPost.setColumns(20);
        textArea_ViewPost.setRows(5);
        jScrollPane2.setViewportView(textArea_ViewPost);

        button_Next.setText("Next");
        button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NextActionPerformed(evt);
            }
        });

        button_Previous.setText("Previous");
        button_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PreviousActionPerformed(evt);
            }
        });

        button_Traceback.setText("Traceback");
        button_Traceback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TracebackActionPerformed(evt);
            }
        });

        button_Search.setText("Search");
        button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_FACEMASH, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_FriendsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_ProfilePage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(button_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(label_View, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label_ID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(button_Traceback))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(button_Previous)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label_Date)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105)
                                        .addComponent(label_Time)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField_Time))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 138, Short.MAX_VALUE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_FriendsPage)
                        .addComponent(button_ProfilePage)
                        .addComponent(button_Logout))
                    .addComponent(button_HomePage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Submit)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(button_Submit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_View)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ID)
                    .addComponent(textField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Traceback)
                    .addComponent(button_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Date)
                    .addComponent(label_Time)
                    .addComponent(textField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Next)
                    .addComponent(button_Previous))
                .addGap(69, 69, 69))
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

    private void button_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_LogoutActionPerformed
        //go to LoginPage
        stack.clear();      //clear traceback memory
        LoginPage goLogin = new LoginPage();
        goLogin.show();//open LoginPage
        dispose();//close HomePage
        JOptionPane.showMessageDialog(null, "Log out successful.");
    }//GEN-LAST:event_button_LogoutActionPerformed

    private void button_ProfilePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ProfilePageActionPerformed
        //go to ProfilePage
        ProfilePage goProfile =  new ProfilePage();
        goProfile.show();//open ProfilePage
        dispose();//close HomePage
    }//GEN-LAST:event_button_ProfilePageActionPerformed

    private void button_FriendsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FriendsPageActionPerformed
        //go to FriendPage
        FriendPage goFriends = new FriendPage();
        goFriends.show();//open FriendPage
        dispose();//close HomePage
    }//GEN-LAST:event_button_FriendsPageActionPerformed

    private void button_HomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HomePageActionPerformed
        //go to HomePage
        HomePage goHome = new HomePage();
        goHome.show();//open HomePage
        dispose();//close HomePage
    }//GEN-LAST:event_button_HomePageActionPerformed

    private void button_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SubmitActionPerformed

        if(textArea_SubmitPost.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Submission failed!!!\nNothing to post.");
        else{
            //get current date and time
            LocalDate a = LocalDate.now();
            LocalTime b = LocalTime.now();
            String date = String.valueOf(a);
            String time = String.valueOf(b.getHour()) + ":" + String.valueOf(b.getMinute()) + ":" + String.valueOf(b.getSecond());
            String id = getIDFromTextFile();
            String content = textArea_SubmitPost.getText();
            try{
                con = db.mycon();           //the database address can be found in db class.
                st = con.createStatement();
                st.executeUpdate("INSERT INTO Post (ID, Date, Time, Content) VALUES ('"+id+"','"+date+"','"+time+"','"+content+"')");

                JOptionPane.showMessageDialog(null, "Submission success!!!\nYAY!");
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_button_SubmitActionPerformed

    //method to get unique ID from uniqueID.txt file
    public static String getIDFromTextFile(){
        String assignId = "";
        try{
            Scanner read = new Scanner(new FileInputStream("C:\\Users\\Muizz\\OneDrive\\Desktop\\Netbeans workspace\\FACEMASH_GUI\\src\\facemash_gui\\uniqueID.txt"));            

            assignId = read.nextLine();
            copyPasteExcept1();                  //call this method to copy paste the text file except the first line.
            read.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File error!");
        }   
        return assignId;
    }
    
    //method to copy everything in the text file and paste it back except the first line because it already been assigned to a post
    //the randomIdHolder.txt file contain usable id
    public static void copyPasteExcept1(){
        ArrayList<String> row = new ArrayList<>();

        try{
            Scanner read = new Scanner(new FileInputStream("C:\\Users\\Muizz\\OneDrive\\Desktop\\Netbeans workspace\\FACEMASH_GUI\\src\\facemash_gui\\uniqueID.txt"));
            read.nextLine();    //skip 1st ID
            while(read.hasNextLine()){         
                row.add(read.nextLine()); 
            }
  
        read.close();
        
        }catch(FileNotFoundException e){
            System.out.println("FILE ERROR!");
        }
        
        try{
            PrintWriter write = new PrintWriter(new FileOutputStream("C:\\Users\\Muizz\\OneDrive\\Desktop\\Netbeans workspace\\FACEMASH_GUI\\src\\facemash_gui\\uniqueID.txt"));

            for(int y=0; y<row.size(); y++){
                write.println(row.get(y));
            }
            
            write.close();
            
        }catch(FileNotFoundException e){
            System.out.println("FILE ERROR!");
        }
    }
    
    private void textField_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_DateActionPerformed

    }//GEN-LAST:event_textField_DateActionPerformed

    private void button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NextActionPerformed
        if(postIndex+1<=countRow){
            try{
                postIndex++;
                String sql = "SELECT * FROM Post LIMIT 1 OFFSET "+ postIndex;
                prestate = con.prepareCall(sql);
                rs = prestate.executeQuery();
                if(rs.next()){
                    textField_ID.setText(rs.getString(1));
                    textField_Date.setText(rs.getString(2));
                    textField_Time.setText(rs.getString(3));
                    textArea_ViewPost.setText(rs.getString(4));
                }
                stack.addLast(textField_ID.getText());//for traceback function

            }catch(SQLException e){
                System.out.println(e);
            }
        }else
            JOptionPane.showMessageDialog(null, "No next post!\nThis is the latest post.");
    }//GEN-LAST:event_button_NextActionPerformed

    private void button_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PreviousActionPerformed
        if(postIndex-1>=0){
            try{
                postIndex--;
                String sql = "SELECT * FROM Post LIMIT 1 OFFSET "+ postIndex;
                prestate = con.prepareCall(sql);
                rs = prestate.executeQuery();
                if(rs.next()){
                    textField_ID.setText(rs.getString(1));
                    textField_Date.setText(rs.getString(2));
                    textField_Time.setText(rs.getString(3));
                    textArea_ViewPost.setText(rs.getString(4));
                }
            
                stack.addLast(textField_ID.getText());//for traceback function
                
            }catch(SQLException e){
                System.out.println(e);
            }
        }else
            JOptionPane.showMessageDialog(null, "No previous post!\nThis is the oldest post.");
    }//GEN-LAST:event_button_PreviousActionPerformed

    private void button_TracebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TracebackActionPerformed
        if(stack.isEmpty())
            JOptionPane.showMessageDialog(null, "Nothing to be traced.");
        else{
            JOptionPane.showMessageDialog(null, "Post history from oldest to newest:\n"+stack.toString());
        }
        
    }//GEN-LAST:event_button_TracebackActionPerformed

    private void button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchActionPerformed

        if(textField_ID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty input!\nNothing to search.");
        }else{
            String searchKey = textField_ID.getText();
            try{
                String sql = "SELECT * FROM Post WHERE ID = "+searchKey;
                prestate = con.prepareCall(sql);
                //prestate.setString(1, searchKey);
                rs = prestate.executeQuery();
                
                if(rs.next()){  //id exist, then display the data of the row
                        textField_ID.setText(rs.getString(1));
                        textField_Date.setText(rs.getString(2));
                        textField_Time.setText(rs.getString(3));
                        textArea_ViewPost.setText(rs.getString(4));
                        JOptionPane.showMessageDialog(null, "Found the post.");
                }else{
                    JOptionPane.showMessageDialog(null, "Entered value does not exist in the record!");
                }
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_button_SearchActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_FriendsPage;
    private javax.swing.JButton button_HomePage;
    private javax.swing.JButton button_Logout;
    private javax.swing.JButton button_Next;
    private javax.swing.JButton button_Previous;
    private javax.swing.JButton button_ProfilePage;
    private javax.swing.JButton button_Search;
    private javax.swing.JButton button_Submit;
    private javax.swing.JButton button_Traceback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel label_Date;
    private javax.swing.JLabel label_FACEMASH;
    private javax.swing.JLabel label_ID;
    private javax.swing.JLabel label_Submit;
    private javax.swing.JLabel label_Time;
    private javax.swing.JLabel label_View;
    private javax.swing.JTextArea textArea_SubmitPost;
    private javax.swing.JTextArea textArea_ViewPost;
    private javax.swing.JTextField textField_Date;
    private javax.swing.JTextField textField_ID;
    private javax.swing.JTextField textField_Time;
    // End of variables declaration//GEN-END:variables
}