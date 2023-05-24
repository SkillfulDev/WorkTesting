package org.example.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Zaur", "Zaur", "Svetlana", "Kate", "Bob", "Ada"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
