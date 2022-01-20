package com.Assignments.Jan_20_2022;

import java.util.Scanner;

//Implement Ternary Operators if possible in above scenari (discount coupon)
public class TernaryOperators {
    public static void main(String[] args) {
        int promoCode=123456;
        double minAmount=500;
        //discount=25%

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        double amount=sc.nextDouble();
        System.out.println("Enter Promocode");
        int promocCodeInput=sc.nextInt();
        double discount=(amount>=minAmount && promocCodeInput==promoCode)? amount*0.25 : 0;
        if (discount>0){
            System.out.println("You are eligible for discount of ₹"+discount);
            System.out.println("Pay ₹"+(amount-discount));
        }else{
            System.out.println("You are not eligible for discount please add ₹"+(minAmount-amount)+" more");
            System.out.println("Pay ₹"+amount);
        }


    }
}
