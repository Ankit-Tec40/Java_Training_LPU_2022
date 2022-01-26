package com.Classes.Collections;

import java.util.ArrayDeque;

class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(4582);
        ad.offer(5646);
        ad.offer(81626);
        ad.offer(4298);
        ad.offerFirst(979);
        ad.offerLast(2995);

        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
    }
}
