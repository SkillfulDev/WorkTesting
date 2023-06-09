package org.example.collection.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();
        map1.put(10000,"Kuznecov Andrey");
        map1.put(3000,"Alex Bin");
        map1.put(233333,"Simone Stroke");

        for (Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

        System.out.println(map1);

    }
}
