package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

        List<Byte> list=new ArrayList<>();



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
