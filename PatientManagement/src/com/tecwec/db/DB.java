package com.tecwec.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

    Connection connection;
    Statement statement;

    private static DB db = new DB();

    private DB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("[DB] Driver Loaded");

            String url = "jdbc:mysql://localhost/javaclass";
            String user = "root";
            String password = "pass";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("[DB] Connection Created: "+connection);

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
    }

    public static DB getDB() {
        return db;
    }

    public Connection getConnection() {
        return connection;
    }


    public int executeUpdate(PreparedStatement statement) {

        int result = 0;

        try {
            result = statement.executeUpdate();
            System.out.println("[DB] SQL Statement Executed");

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }

        return result;
    }

    public ResultSet executeQuery(PreparedStatement statement) {

        ResultSet set = null;

        try {
            set = statement.executeQuery();
            System.out.println("[DB] SQL Statement Executed");

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }

        return set;
    }

    public void closeConnection() {
        try {
            connection.close();
            System.out.println("[DB] Connection Closed");
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
    }

//    public static void main(String[] args) {
//        DB ob=DB.getDB();
//        System.out.println(db.getConnection());
//    }

}
