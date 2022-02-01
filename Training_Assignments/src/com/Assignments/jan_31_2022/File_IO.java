package com.Assignments.jan_31_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_IO {
    public static void main(String[] args) {

        //Create a file
        File myfile1=new File("file.txt");
        try {
            myfile1.createNewFile();
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }

        //Write to a file
        try {
            FileWriter filewriter=new FileWriter("file.txt");
            filewriter.write("my name is Ankit");
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read file
        File myfile2=new File("file.txt");
        try {
            Scanner sc=new Scanner(myfile2);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // delete file
        File myfile3=new File("file.txt");
        if(myfile3.delete()){
            System.out.println(myfile3.getName()+" deleted");
        }


    }
}
