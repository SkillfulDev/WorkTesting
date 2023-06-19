package org.example.static_nested_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    int speed;
    String model;
    Engine engine;

    @AllArgsConstructor
    @Getter
    @Setter@ToString
    public static class Engine {
        int horsePower;
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(32);
        System.out.println(engine);
    }
}
