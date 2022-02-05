package com.tecwec.patientmanagement;

import com.tecwec.patientmanagement.db.DB;

public class HelloServlet{
    DB ob=DB.getDB();
    public void test(){
        System.out.println(ob.getConnection());
    }
    public static void main(String[] args) {
//        HelloServlet ob=new HelloServlet();
//        ob.test();
    }

}