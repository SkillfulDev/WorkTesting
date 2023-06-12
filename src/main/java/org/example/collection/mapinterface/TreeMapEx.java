package org.example.collection.mapinterface;

import org.example.model.Student;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Map<Integer,String> students = new TreeMap<>();
        students.put(1,"Sam");
        students.put(2,"Bobby");
        students.put(3,"Kate");
        students.put(4,"Kenny");
        students.put(5,"Anna");

        System.out.println(students);

    }
}
