package com.Classes.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue <Integer> qu=new LinkedList<>();
        qu.offer(200);
        qu.offer(425);

        System.out.println(qu);
        System.out.println(qu.poll());

    }
}
