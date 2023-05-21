package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(40);
        list.add(4);
        list.add(20);
        list.add(998);
        list.add(230);
        list.add(20);

        System.out.println(sumList(list));


    }

    public static double sumList(List<? extends Number> list){
        double temp=0;
        for (Number number : list) {
            temp+= number.doubleValue();

        }
        return temp;
    }



}
