package com.Classes.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> lst=new ArrayList<>();
        lst.add(123);
        lst.add(456);
        lst.add(406);
        lst.add(2,465);
        lst.remove(1);
        lst.remove((Integer) 123);
        lst.set(1,900);
        System.out.println(lst);

        //iterator
        Iterator<Integer> it=lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
