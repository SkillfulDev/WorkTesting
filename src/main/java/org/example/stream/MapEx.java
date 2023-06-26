package org.example.stream;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MapEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>
                (List.of(Student.builder().name("anna").age(18).sex('f').build()
                        , Student.builder().name("kate").age(19).sex('f').build()
                        , Student.builder().name("jhony").age(22).sex('m').build()
                        , Student.builder().name("steve").age(32).sex('m').build()
                        , Student.builder().name("antonny").age(28).sex('m').build()
                        , Student.builder().name("rozy").age(21).sex('f').build()));

        students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .filter(el -> el.getSex() == 'f').sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);


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
