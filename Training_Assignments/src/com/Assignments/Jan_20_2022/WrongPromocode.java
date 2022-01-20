package com.Assignments.Jan_20_2022;

import java.util.Scanner;

public class WrongPromocode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance");
        double distance=sc.nextDouble();
        double cost=distance*5;
        double minCost=300;
        int promocode=45612;
        double discount=0;

        //discount=15% if cost of travel is >= min cost

        System.out.println("Enter Promocode If Available");
        int promocodeIn= sc.nextInt();

        if(promocode==promocodeIn && cost>=minCost){
            discount=cost*0.15;
            System.out.println("Your Travel distance is "+distance+"KM");
            System.out.println("Total Cost = ₹"+cost);
            System.out.println("Discount = ₹"+discount);
            System.out.println("Pay ₹"+(cost-discount));
        }
        else if(promocode!=promocodeIn && cost>=minCost){
            System.out.println("Your Travel distance is "+distance+"KM");
            System.out.println("Total Cost = ₹"+cost);
            System.out.println("Discount = ₹"+discount);
            System.out.println("Pay ₹"+(cost-discount));

            System.out.println("suggested promo codes is "+promocode+" for 15% discount");
        }
        else if(cost<minCost){
            System.out.println("Your Travel distance is "+distance+"KM");
            System.out.println("Total Cost = ₹"+cost);
            System.out.println("Discount = ₹"+discount);
            System.out.println("Pay ₹"+(cost-discount));

            System.out.println("suggested promo codes are");
        }





    }
}

