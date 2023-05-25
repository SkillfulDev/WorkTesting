package org.example.comparation;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                Employee.builder().id(100).name("Sergey").surname("Tregulov").salary(1000).build(),
                Employee.builder().id(300).name("Kate").surname("Smirnova").salary(5000).build(),
                Employee.builder().id(200).name("Sam").surname("Smith").salary(9000).build()));

        System.out.println(employees);
        Collections.sort(employees);


    }

}

@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
class Employee {
    int id;
    String name;
    String surname;
    int salary;
}
