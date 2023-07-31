package org.example.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx {
    public static void main(String[] args) throws ClassNotFoundException {
        Class employeeClass= Class.forName("org.example.reflection.Employee");
      Method [] methodsEmployee=employeeClass.getMethods();

//        System.out.println(Arrays.toString(methodsEmployee));
        System.out.println(employeeClass.getName());
        System.out.println(employeeClass);
    }
}
