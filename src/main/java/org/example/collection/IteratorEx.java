package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Sam","Jhony","Samanta","Bob"));
//        System.out.println(list);
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
         String st=iter.next();
//            System.out.println(st);
            iter.remove();

        }
        System.out.println(list);

    }
}
