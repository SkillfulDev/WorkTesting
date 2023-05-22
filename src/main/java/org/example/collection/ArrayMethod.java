package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethod {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Some","People","Want"));
    List<String> list2 = new ArrayList<>(List.of("!!!!",":::"));
        System.out.println(list1);
        System.out.println(list2);
//        list1.addAll(list2);
//        System.out.println(list1);
        list1.addAll(1,list2);
        System.out.println(list1);

    }
}
