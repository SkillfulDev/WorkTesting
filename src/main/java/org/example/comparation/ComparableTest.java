package org.example.comparation;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                Employee.builder().id(1000).name("Kate").surname("Tregulov").salary(1000).build(),
                Employee.builder().id(300).name("Kate").surname("Smirnova").salary(5000).build(),
                Employee.builder().id(200).name("Sam").surname("Smith").salary(9000).build()));




        employees.stream().sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getId))
                .forEach(System.out::println);

    }
 }

@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    @Override
    public int compareTo(Employee o) {

        return this.getId()-o.getId();
    }


}
