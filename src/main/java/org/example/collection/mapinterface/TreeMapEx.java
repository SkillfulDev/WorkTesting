package org.example.collection.mapinterface;

import org.example.model.Student;
import org.example.model.StudentClass;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

//        Map<StudentClass,Integer> students1 = new TreeMap<>();
        Map<StudentClass,Integer> students = new TreeMap<>(Comparator.comparing(StudentClass::getName));
        students.put(StudentClass.builder().age(18).name("Sam").build(),1);
        students.put(StudentClass.builder().age(21).name("Andrew").build(),4);
        students.put(StudentClass.builder().age(23).name("Anna").build(),15);
        students.put(StudentClass.builder().age(19).name("Kate").build(),71);
        students.put(StudentClass.builder().age(22).name("Neil").build(),61);


        System.out.println(students);

//        System.out.println(students);



    }
}
