package com.Classes.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(456);
        s.add(955);
        s.add(565);
        s.add(8678);
        s.add(456);

        System.out.println(s);
        System.out.println(s.remove(456));
        System.out.println(s.contains(456));

    }
}
