package com.Assignments.jan_31_2022;
class student{
    int roll;
    String name;

    student(){} //default constructor

    student(int roll,String name){  //constructor
        this.roll=roll;
        this.name=name;
    }

    void display(){
        System.out.println("My Name is "+name);
    }

    //override toSrting method
    public String toString(){
        return "roll no="+roll+" name="+name;
    }

    //override equals method
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        if(!(obj instanceof student s)){
            return false;
        }
        return roll == s.roll;
    }

}
public class Objectclasses {
    public static void main(String[] args) {
        student ob=new student(5,"Ankit");
        student ob2=new student(5,"Abhinash");

        ob.display();
        System.out.println(ob.hashCode());
        System.out.println(ob.getClass());
        System.out.println(ob);
        System.out.println(ob.toString());

        System.out.println("-----------------------------");
        if(ob.equals(ob2)){
            System.out.println("ob1 = ob2");
        }else{
            System.out.println("ob1 != ob2");
        }

    }
}
