package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000 ; i++) {
            names.add("this"+i);

        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);

        long startTime2 = System.currentTimeMillis();
        List<String> names2= new ArrayList<>(10000001);
        for (int i = 0; i < 1000000; i++) {
            names2.add("Thant"+i);

        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}
