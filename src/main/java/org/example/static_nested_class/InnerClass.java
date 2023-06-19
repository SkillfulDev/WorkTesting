package org.example.static_nested_class;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class InnerClass {
    int speed;
    String model;
    Engine engine;

    public InnerClass(int speed, String model, int horsePower) {
        this.speed = speed;
        this.model = model;
        this.engine = this.new Engine(54);

    }

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public class Engine {
        int horsePower;
    }
}

class Test {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();





    }
}
