package com.Assignments.Jan_20_2022;

import java.util.Scanner;

public class nQueen {
    static int [][] chess=new int[4][4];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int t=4;t>=0;t--) {
            if(t==0){
                System.out.println("All queens are Kept at suitable Positions");
                break;
            }
            System.out.println(" Enter Row No (0 to 3)");
            int row = sc.nextInt();
            System.out.println("Enter column no (0 to 3)");
            int col = sc.nextInt();

            if(check(row, col)){
                chess[row][col]=1;
                System.out.println("Queen added at ("+row+","+col+")");
            }
            else{
                System.out.println("You Can not put Queen at this position \nTry Diffrent Position in 4*4 chess Board");
                t+=1;
            }

        }

    }

    static Boolean check(int row, int col){
        for(int r=0;r<4;r++){
            if(chess[r][col]==1){
                return false;
            }
        }
        for(int c=0;c<4;c++){
            if(chess[row][c]==1){
                return false;
            }
        }
        return true;
    }


}
