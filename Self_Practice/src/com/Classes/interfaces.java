package com.Classes;
interface bicycle{
    void applybreak(int d);
}
class motorcycle implements bicycle{

    @Override
    public void applybreak(int d) {
        System.out.println("speed decreasing");
    }
}
public class interfaces {
    public static void main(String[] args) {

    }
}
