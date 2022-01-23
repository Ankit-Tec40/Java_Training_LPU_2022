package com.Classes;
abstract class base{
    abstract void say();
}
class derived extends base{

    @Override
    void say() {
        System.out.println("hello");
    }
}
public class abstractclass  {
    public static void main(String[] args) {

    }
}
