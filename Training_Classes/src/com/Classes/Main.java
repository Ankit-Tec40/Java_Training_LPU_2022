package com.Classes;

final class RazorPay{


    RazorPayCallbacks callbacks; // reference variable to RazorPayCallbacks
    // it will refer to the object of ZomatoPayment as per Polymorphic Statement

    boolean isBankInterfaceUp = false;

    void pay(int amount) {
        if(isBankInterfaceUp) {
            System.out.println("[RazorPay] Payment is done for amount: "+amount);
            callbacks.onSuccess("Payment Done", 101);
        }else {
            System.out.println("[RazorPay] Payment is not done for amount: "+amount);
            System.out.println("[RazorPay] Bank Interfcae is down. Please try again");
            callbacks.onFailure("Payment Failed", 201);
        }
    }

    void subscribe(RazorPayCallbacks callbacks) {
        this.callbacks = callbacks;
    }
}
class RazorPayCallbacks{

    void onSuccess(String message, int code) {
        System.out.println("Payment Success "+message+" "+code);
    }

    void onFailure(String message, int code) {
        System.out.println("Payment Failed "+message+" "+code);
    }

}
// Assume: This code is in Zomato
//         Zomato is internally