package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-4,5,-44,324,423,-546,7,8324,324));
        System.out.println(list);
        list.stream().sorted().forEach(System.out::println);
    }
}
