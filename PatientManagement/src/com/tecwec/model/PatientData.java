package com.tecwec.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PatientData {
    public int id;
    public String name;
    public String phone;
    public String email;
    public String disease;
    public String registeredOnDate;

    public PatientData(){}

    public PatientData(int id, String name, String phone, String email, String disease, String registeredOnDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.disease = disease;
        this.registeredOnDate = registeredOnDate;
    }

    public void inputData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PatientID: ");
        id=sc.nextInt();
        System.out.println("Enter Patient Name: ");
        name=sc.next();
        System.out.println("Enter Phone No: ");
        phone=sc.next();
        System.out.println("Enter Email: ");
        email=sc.next();
        System.out.println("Enter Disease Name");
        disease=sc.next();

        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyy-MM-dd");
        registeredOnDate=formatter.format(date);

        System.out.println("Please Review Customer Details: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PatientData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", disease='" + disease + '\'' +
                ", registeredOnDate='" + registeredOnDate + '\'' +
                '}';
    }

    public String toSQL(){
        return "insert into PatientData(0, '\"+name+\"', '\"+phone+\"', '\"+email+\"', \"+disease+\" , '\"+registeredOnDate+\"');";
    }

//    public static void main(String[] args) {
//        PatientData ob=new PatientData();
//        ob.inputData();
//    }

}
