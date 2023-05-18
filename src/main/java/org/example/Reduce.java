package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);



        Optional<Integer> num = numbers.stream().reduce((a, b) -> a * b);

        if (num.isPresent()) {
            System.out.println(num.get());
        } else {
            System.out.println("error");
        }

    }


}
