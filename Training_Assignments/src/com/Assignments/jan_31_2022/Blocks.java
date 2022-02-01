package com.Assignments.jan_31_2022;
class employee{
    int id;
    String name;
    {
        System.out.println("block hi mai");
        name="Ankit";
    }

    static{
        System.out.println("mai static block hai");
    }
    employee(){
        String n=name;
        System.out.println("hello "+n);
    }
}
public class Blocks {
    public static void main(String[] args) {
        System.out.println("mai main hai");
        employee ob=new employee();
    }
}
