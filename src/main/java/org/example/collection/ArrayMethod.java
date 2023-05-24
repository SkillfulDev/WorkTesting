package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethod {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Some", "People", "Want"));
        List<String> list2 = List.copyOf(list1);

        list2.add("New String");

        System.out.println(list1);
    }
}
