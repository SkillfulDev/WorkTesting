package org.example.collection.map_interface;

import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        map.put(Student.builder().name("Ivan").surname("Grozniy").course(5).build(), 5.5);
        map.put(Student.builder().name("Svetlana").surname("Marchenko").course(4).build(), 5.9);
        map.put(Student.builder().name("Oleg").surname("Potapov").course(3).build(), 4.5);
        map.put(Student.builder().name("Kristina").surname("Volk").course(5).build(), 6.5);
        Student st = Student.builder().name("Ivan").surname("Grozniy").course(5).build();

        System.out.println(map.containsKey(st));


        System.out.println(map);

    }

}

@Builder
@AllArgsConstructor
@Setter
@Getter
@ToString
class Student {
    String name;
    String surname;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
}
