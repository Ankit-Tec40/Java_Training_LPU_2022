package com.Assignments.jan_24_2022;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="My name Is Ankit Kumar  ";
        System.out.println(name.charAt(3));
        System.out.println(name.trim());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.replace('A','M'));
        String [] lst=name.split(" ");
        System.out.println(Arrays.toString(lst));

    }
}
