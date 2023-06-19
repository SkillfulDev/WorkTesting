package org.example.static_nested_class;

import lombok.*;
import lombok.experimental.Accessors;
@Builder
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

//class Test {
//    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine(32);
//        System.out.println(engine);
//        Car.Engine engine1 = new Car.Engine(4);
//        System.out.println(engine1);
//
//        Car car=Car.builder().engine(engine).speed(188).model("Suzuki").build();
//
//        System.out.println(car);
//    }
//}
