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
       double a = 18.7;
       double b = 18.7;

        System.out.println(a/b);
       if (a%b==0){
           System.out.println("true");
       }else{
           System.out.println("false");
       }



    }
}
