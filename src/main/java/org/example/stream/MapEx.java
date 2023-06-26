package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Some","people","like","speaking"));

       List<Integer> newList = list.stream().map(String::length).toList();

        int[] array = new int[]{2,3,4,5,6,7,8,8,3,2,21,2,};

        Arrays.stream(array).mapToDouble(el->el/15) .forEach(System.out::println);

    }
}
