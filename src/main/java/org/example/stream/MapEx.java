package org.example.stream;

import lombok.*;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>
                (List.of(Student.builder().name("anna").age(18).sex('f').build()
                        , Student.builder().name("kate").age(19).sex('f').build()
                        , Student.builder().name("jhony").age(22).sex('m').build()
                        , Student.builder().name("steve").age(32).sex('m').build()
                        , Student.builder().name("antonny").age(28).sex('m').build()
                        , Student.builder().name("rozy").age(21).sex('f').build()));

        List<Integer> list = students.stream().map(Student::getAge).sorted().toList();
        System.out.println(list);


    }
}

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
class Student {
    String name;
    int age;
    char sex;
}
