package org.example.lambda;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(createCar(() -> Car.builder().color("Green").model("Zusuki").engine(5.5).wheals(4.2).build()));
        cars.add(createCar(() -> Car.builder().color("Red").model("Camry").engine(1.5).wheals(7.7).build()));
        cars.add(createCar(() -> Car.builder().color("Black").model("Honda").engine(8.5).wheals(1.4).build()));
        double temp = 0;
        for (int i = 0; i < cars.size(); i++) {
            temp += getAvgEngine(cars.get(i), Car::getWheals);
        }
        System.out.println(temp / cars.size());
    }

    public static Car createCar(Supplier<Car> supplier) {
        return supplier.get();
    }

    public static Double getAvgEngine(Car car, Function<Car, Double> fnc) {
        return fnc.apply(car);
    }

}
