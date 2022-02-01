package com.Assignments.jan_31_2022;

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true) {
            System.out.println("Thread running");
            System.out.println("hello");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true) {
            System.out.println("Thread2 running");
            System.out.println("Bye");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
