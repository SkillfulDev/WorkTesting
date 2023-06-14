package org.example.collection.map_interface;

import org.example.model.StudentClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        Map<StudentClass,Integer> students=new LinkedHashMap<>();
        students.put(StudentClass.builder().age(18).name("Sam").build(),1);
        students.put(StudentClass.builder().age(21).name("Andrew").build(),4);
        students.put(StudentClass.builder().age(23).name("Anna").build(),15);
        students.put(StudentClass.builder().age(19).name("Kate").build(),71);
        students.put(StudentClass.builder().age(22).name("Neil").build(),61);


        System.out.println(students);
    }
}
