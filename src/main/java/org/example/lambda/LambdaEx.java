package org.example.lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LambdaEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(Student.builder().name("Iliya").sex('m').age(19).course(4).avgGrade(7.7).build());
        students.add(Student.builder().name("Kate").sex('f').age(26).course(3).avgGrade(6.3).build());
        students.add(Student.builder().name("Steve").sex('m').age(33).course(3).avgGrade(7.9).build());
        students.add(Student.builder().name("Anna").sex('f').age(21).course(4).avgGrade(8.5).build());
        students.add(Student.builder().name("Kristina").sex('f').age(20).course(1).avgGrade(9.7).build());

        System.out.println(students);

    }
}
