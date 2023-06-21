package org.example.lambda;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {
    String name;
    char sex;
    int age;

    int course;

    double avgGrade;


}
