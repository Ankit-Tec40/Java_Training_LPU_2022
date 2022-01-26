package com.Classes.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1023);
        pq.offer(4785);
        pq.offer(564);
        pq.offer(698);

        System.out.println(pq);//min heap
        System.out.println(pq.poll());

        //max heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(1023);
        pq2.offer(4785);
        pq2.offer(564);
        pq2.offer(698);
        System.out.println(pq2);
    }
}
