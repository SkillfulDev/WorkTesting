package org.example;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

public class Sorted {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(Student.builder().sex('m').age(26).avGrade(8.8).course(5).name("Tommy").build(););
        students.add(Student.builder().sex('f').age(19).avGrade(7.8).course(3).name("Anna").build());
        students.add(Student.builder().sex('m').age(23).avGrade(8.1).course(2).name("Krage").build());
        students.add(Student.builder().sex('f').age(21).avGrade(8.8).course(3).name("Kate").build());
        students.add(Student.builder().sex('m').age(32).avGrade(6.8).course(5).name("Bob").build());
        students.add(Student.builder().sex('f').age(29).avGrade(7.4).course(2).name("Kristina").build());



        students.stream().sorted(Comparator.comparing(Student::age)).forEach(System.out::println);

    }
}
