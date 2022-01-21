package com.Classes;

public class VariableParameterMethod {
    static int c=5;
    public static void main(String[] args) {
        // write your code here
        int a=3,b=5;
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b));

    }

    static int sum(int ...arr)
    {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;
    }

}


