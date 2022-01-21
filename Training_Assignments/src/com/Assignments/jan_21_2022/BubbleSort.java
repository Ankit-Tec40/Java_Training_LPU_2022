package com.Assignments.jan_21_2022;

public class BubbleSort {

    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }


        for(int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,4,1,6,8,9};
        sort(arr);
    }
}
