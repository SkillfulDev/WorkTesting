package org.example.model;

import lombok.Builder;


@Builder
public record Student(
        String name,
        char sex,
        int age,
        int course,
        double avGrade
) {
}