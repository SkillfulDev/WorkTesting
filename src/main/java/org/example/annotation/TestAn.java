package org.example.annotation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class TestAn {
    public static void main(String[] args) {
        Parent parent = new Child("Sam");

        parent.showInfo();


    }
}
@NoArgsConstructor
@AllArgsConstructor
class Parent {
   String name;

    void showInfo() {
        System.out.println("Name Parent class is " + name);
    }
}

@NoArgsConstructor

class Child extends Parent {

    public Child(String name){
        super(name);
    }
    @Override
    @Deprecated
    void showInfo() {
        System.out.println("Name Child class is " + name);
    }

}