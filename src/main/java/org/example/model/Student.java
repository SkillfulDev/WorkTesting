package org.example.model;

import lombok.Builder;
import lombok.ToString;


@Builder
public record Student(
        String name,
        char sex,
        int age,
        int course,
        double avGrade
) {
}