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

        Map<Boolean, List<Student>> collect = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAge() > 20));

        for (Boolean aBoolean : collect.keySet()) {
            System.out.println(aBoolean);

        }


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
