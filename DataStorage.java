/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Application;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataStorage {
    //URL that connects java to the our mysql database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/facebook";
    
    //database username
    private static final String USER = "root";
    
    //database password
    private static final String PASSWORD = "wia1002";
    
    //method that creates a table for a list of users' username
    public static void createMainTable(String name){
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            //sql statement to create table
            String sql = "CREATE TABLE "+name+" ("
                        + "size VARCHAR(300),"
                        + "username VARCHAR(300)"
                        + ")";

            //execute the statement
            stmt.executeUpdate(sql);
            
            //if successful, print "Table created successfully!"
            System.out.println("Table created successfully!");
            
        } catch (SQLException e) {
            //if unsuccessful, print "Error creating table: " + error message
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
    
    //method that creates a new table for each new user
    public static void createTable(String name){
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            //sql statement to create table
            String sql = "CREATE TABLE "+name+" ("
                        + "name VARCHAR(300),"
                        + "username VARCHAR(300),"
                        + "email VARCHAR(300),"
                        + "phone VARCHAR(300),"
                        + "birthday VARCHAR(300),"
                        + "password VARCHAR(300),"
                        + "age VARCHAR(300),"
                        + "gender VARCHAR(300),"
                        + "address VARCHAR(300),"
                        + "friend VARCHAR(300),"
                        + "hobby VARCHAR(300),"
                        + "job VARCHAR(300)"
                        + ")";

            //execute the statement
            stmt.executeUpdate(sql);
            
            //if successful, print "Table created successfully!"
            System.out.println("Table created successfully!");
            
        } catch (SQLException e) {
            //if unsuccessful, print "Error creating table: " + error message
            System.out.println("Error creating table: " + e.getMessage());
        }
        //add a default row with null values
        addRow(name);
    }
    
    
    //method that adds new data into the main table
    public static void addData(String size, String username, String conditionValue) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            //update each column with data
            String sql1 = "INSERT INTO list (size) VALUES ('" + size + "')";
            String sql2 = "UPDATE list SET username = '" + username + "' WHERE size = '" + conditionValue + "'";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            
            // if successful, print "Data added successfully!"
            System.out.println("Data added successfully!");
            
        } catch (SQLException e) {
            // if unsuccessful, print "Error adding data: " + error message
            System.out.println("Error editing data: " + e.getMessage());
        }
    }
    
    //method to update data in the user's table
    public static void updateData(String tableName, String columnName, String newData) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            // update the specified column with the new data
            String sql = "UPDATE " + tableName + " SET " + columnName + " = '" + newData + "'";
            stmt.executeUpdate(sql);
            
            // if successful, print "Data updated successfully!"
            System.out.println("Data updated successfully!");
            
        } catch (SQLException e) {
            // if unsuccessful, print "Error updating data: " + error message
            System.out.println("Error updating data: " + e.getMessage());
        }
    }
    
    // method to retrieve data from a specific column in the user's table
    public static String retrieveData(String tableName, String columnName) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            // select the specified column from the table
            String sql = "SELECT " + columnName + " FROM " + tableName;
            ResultSet resultSet = stmt.executeQuery(sql);
            
            // iterate over the result set and print the data
            while (resultSet.next()) {
                String data = resultSet.getString(columnName);
                System.out.println(data);
            }
            
            resultSet.close();

        } catch (SQLException e) {
            // if unsuccessful, print "Error retrieving data: " + error message
            System.out.println("Error retrieving data: " + e.getMessage());
        }
        return null;
    }
    
    // method to retrieve a specific username from the main table
    public static String retrieveDataMain(String conditionValue) {
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
         Statement stmt = conn.createStatement()) {
        
        // select the specified column from the table for the specified row
        String sql = "SELECT username FROM list WHERE size = '" + conditionValue + "'";
        ResultSet resultSet = stmt.executeQuery(sql);
        
        // iterate over the result set and retrieve the data
        String data = null;
        if (resultSet.next()) {
            data = resultSet.getString("username");
            System.out.println(data);
        }
        
        resultSet.close();
        
        return data;

    } catch (SQLException e) {
        // if unsuccessful, print "Error retrieving data: " + error message
        System.out.println("Error retrieving data: " + e.getMessage());
        return null;
    }
}

    
    // method to add a new row with existing columns
    public static void addRow(String tableName) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            // retrieve the column names from the table
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM " + tableName);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            // construct the SQL query to insert a new row
            StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");
            StringBuilder values = new StringBuilder(") VALUES (");
            
            // append column names and NULL values
            for (int i = 1; i <= columnCount; i++) {
                sql.append(metaData.getColumnName(i));
                values.append("NULL");
                
                // add a comma if it's not the last column
                if (i != columnCount) {
                    sql.append(", ");
                    values.append(", ");
                }
            }
            
            sql.append(values).append(")");
            
            // execute the SQL query to insert the new row
            stmt.executeUpdate(sql.toString());
            
            // if successful, print "Row added successfully!"
            System.out.println("Row added successfully!");
            
        } catch (SQLException e) {
            // if unsuccessful, print "Error adding row: " + error message
            System.out.println("Error adding row: " + e.getMessage());
        }
    }
}