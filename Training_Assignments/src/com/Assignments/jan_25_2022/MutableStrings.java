package com.Assignments.jan_25_2022;

public class MutableStrings {
    public static void main(String[] args) {
        StringBuffer str1=new StringBuffer("My Name Is Ankit kumar");
        StringBuilder str2=new StringBuilder("My Name Is Ankit kumar");

        System.out.println("--------------String Buffer-------------");
        System.out.println(str1.append(234));
        System.out.println(str1.capacity());
        System.out.println(str1.reverse());

        System.out.println("-------------String Builder-------------");
        System.out.println(str2.append(245));
        System.out.println(str2.capacity());
        System.out.println(str2.reverse());

    }
}
