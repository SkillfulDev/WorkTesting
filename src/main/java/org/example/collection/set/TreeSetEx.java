package org.example.collection.set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.model.Student;
import org.example.model.StudentClass;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<StudentClass> treeSet = new TreeSet<>(Comparator.comparingInt(StudentClass::getAge));
        treeSet.add(StudentClass.builder().name("Sam").age(41).build());
        treeSet.add(StudentClass.builder().name("Sam").age(39).build());
        treeSet.add(StudentClass.builder().name("Sam").age(23).build());
        treeSet.add(StudentClass.builder().name("Sam").age(18).build());

        System.out.println(treeSet);

    }
}



