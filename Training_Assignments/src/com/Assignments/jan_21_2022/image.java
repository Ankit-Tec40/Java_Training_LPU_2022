package com.Assignments.jan_21_2022;

public class image {

    static void Print3DArray(int[][][] array){
        for(int[][] a:array){
            for(int [] b:a){
                for (int c:b){
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }

    //1
    static void rotateRight(int[][][] arr){
        int[][][] newarr1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){

                }
            }
        }
    }








//    //2
//    static rotateLeft(int[][][] arr){
//
//    }
//








    //3
    static void grayScale(int[][][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int sum=0;
                for(int k=0;k<arr[i][j].length;k++){
                    sum+=arr[i][j][k];
                }
                int[] sumA={sum/3};
                arr[i][j]=sumA;
            }
        }
        System.out.println("---------Grey scale-------");
        Print3DArray(arr);

    }




    public static void main(String[] args) {
        int[][][] pixel={ {{25,47,96},{24,48,36},{12,78,24}},{{48,14,105},{45,200,48},{78,47,75}},{{72,98,65},{114,45,93},{125,68,27}} };
        grayScale(pixel);
        Print3DArray(pixel);

    }
}
