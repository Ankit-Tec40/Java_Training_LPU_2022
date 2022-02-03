package com.Classes;



public class Main {
    static int c=5;
    public static void main(String[] args) {
	// write your code here
        int a=3,b=5;
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b));

    }

    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
}
