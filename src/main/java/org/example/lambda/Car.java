package org.example.lambda;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class Car {
    String model;
    String color;
    double wheals;

    Double engine;
}
