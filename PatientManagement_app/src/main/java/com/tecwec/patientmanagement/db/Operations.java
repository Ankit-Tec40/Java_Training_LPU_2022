package com.tecwec.patientmanagement.db;

import com.tecwec.patientmanagement.model.PatientData;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Operations implements Rules<PatientData>{

    static DB db=DB.getDB();

    @Override
    public int insert(PatientData object) {
        int result = 0;

        String sql = "insert into PatientsData values(null, ?, ?, ?, ?, ?)";
        try {

            Connection connection = db.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, object.name);
            statement.setString(2, object.phone);
            statement.setString(3, object.email);
            statement.setString(4, object.disease);
            statement.setString(5, object.registeredOnDate);
            result = db.executeUpdate(statement);
        }catch (Exception e) {
            System.err.println("Some Exception: "+e);
        }

        return result;
    }


    @Override
    public int update(PatientData object) {
        int result = 0;

        String sql = "update PatientsData set Name = ?, PhoneNo = ?, EmailID = ?, DiseaseName = ? where ID = ?";

        try {

            Connection connection = db.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, object.name);
            statement.setString(2, object.phone);
            statement.setString(3, object.email);
            statement.setString(4, object.disease);
            statement.setInt(5, object.id);
            result = db.executeUpdate(statement);
        }catch (Exception e) {
            System.err.println("Some Exception: "+e);
        }

        return result;
    }


    @Override
    public int delete(int id) {
        int result = 0;

        String sql = "delete from PatientsData where id = ?";
        try {
            Connection connection = db.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            result = db.executeUpdate(statement);
        }catch (Exception e) {
            System.err.println("Some Exception: "+e);
        }

        return result;
    }

    @Override
    public ArrayList<PatientData> query() {
        ArrayList<PatientData> patientdata = new ArrayList<PatientData>();

        String sql = "select * from PatientData";

        try {
            Connection connection = db.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet set = db.executeQuery(statement);
            if(set != null) {
                // next method will tell do we have the data in the ResultSet or not as next row for the table
                while(set.next()) {
                    PatientData data = new PatientData();
                    data.id = set.getInt(1); // column number
                    data.name = set.getString("Name"); // column name
                    data.phone = set.getString(3); // column number
                    data.email = set.getString("EmailID"); // column name
                    data.disease = set.getString("DiseaseName"); // column name
                    data.registeredOnDate = set.getString("RegisteredDate"); // column name
                    patientdata.add(data);
                }
            }

        }catch (Exception e) {
            System.err.println("Some Exception: "+e);
        }

        return patientdata;
    }


    @Override
    public int login(PatientData object) {
        return 0;
    }


    //Login and Register
    @Override
    public int register(PatientData object) {
        System.out.println("Registing user");

        int result = 0;

//        String sql = "insert into authentication values(?, ?, ?)";
        try {
            System.out.println("try Registing user");
            Connection connection = db.getConnection();
            System.out.println("Connected to database: "+connection);
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, object.getName());
//            statement.setString(2, object.getEmail());
//            statement.setString(3, object.getPassword());
//            result = db.executeUpdate(statement);
        }catch (Exception e) {
            System.err.println("Some Exception while Registering User: "+e);
        }
        return result;
    }


}
