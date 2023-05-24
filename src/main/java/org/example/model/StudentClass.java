package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor@Builder
public class StudentClass {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;
}
