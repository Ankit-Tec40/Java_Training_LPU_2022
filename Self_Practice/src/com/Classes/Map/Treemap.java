package com.Classes.Map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new TreeMap<>();
        mp.put(1,456);
        mp.put(5,785);
        mp.put(6,785);
        mp.put(9,897);


        System.out.println(mp);

        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
