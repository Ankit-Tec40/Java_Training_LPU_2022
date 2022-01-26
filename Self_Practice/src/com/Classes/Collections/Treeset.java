package com.Classes.Collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        s.add(456);
        s.add(955);
        s.add(565);
        s.add(8678);

        System.out.println(s);
        System.out.println(s.remove(456));
        System.out.println(s.contains(456));

    }
}
