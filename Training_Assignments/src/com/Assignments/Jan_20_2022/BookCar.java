package com.Assignments.Jan_20_2022;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class BookCar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance");
        double distance=sc.nextDouble();
        double cost=distance*5;
        double minCost=300;
        int promocode=45612;
        //discount=15% if cost of travel is >= min cost

        System.out.println("Enter Promocode If Available");
        int promocodeIn= sc.nextInt();

        if(promocode==promocodeIn && cost>=minCost){
            double discount=cost*0.15;
            System.out.println("Your Travel distance is "+distance+"KM");
            System.out.println("Total Cost = ₹"+cost);
            System.out.println("Discount = ₹"+discount);
            System.out.println("Pay ₹"+(cost-discount));
        }
        else{
            double discount=0;
            System.out.println("Your Travel distance is "+distance+"KM");
            System.out.println("Total Cost = ₹"+cost);
            System.out.println("Discount = ₹"+discount);
            System.out.println("Pay ₹"+(cost-discount));
        }





    }
}
