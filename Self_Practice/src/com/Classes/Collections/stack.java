package com.Classes.Collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(234);
        st.push(575);


        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);


    }
}
