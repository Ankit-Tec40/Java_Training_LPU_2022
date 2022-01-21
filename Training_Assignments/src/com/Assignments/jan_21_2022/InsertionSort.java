package com.Assignments.jan_21_2022;

public class InsertionSort {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int val=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=val;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={5,8,3,9,2,10,54};
        sort(arr);
    }
}
