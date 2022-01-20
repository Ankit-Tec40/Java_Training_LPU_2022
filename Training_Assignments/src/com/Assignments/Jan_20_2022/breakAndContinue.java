package com.Assignments.Jan_20_2022;

import java.util.Scanner;

public class breakAndContinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no_Of_Floors=20;
        System.out.println("Choose your floor");
        int destination=sc.nextInt();
        for(int i=1;i<=20;i++){
            if(destination==i){
                System.out.println("You have reached");
                break;
            }
        }

    }
}
