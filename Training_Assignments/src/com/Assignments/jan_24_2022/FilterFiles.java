package com.Assignments.jan_24_2022;

import java.util.Objects;
import java.util.Scanner;

public class FilterFiles {
    public static void main(String[] args) {
        String[] file={"song.mp3","hello.jpg","get.txt","video.mp4","image.jpg","print.png","table.txt"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File type");
        String fileType=sc.next();
        for(String x:file){
            String[] t=x.split("\\.");
            if(t[1].equals(fileType)){
                System.out.println(x);
            }


        }

    }
}
