package org.example.collection;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String string = "1";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str.append(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            string = string + i;
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println(endTime1 - startTime1);

    }
}
