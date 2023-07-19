package org.example.serializationEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Out {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Bob");
        employees.add("Smith");
        employees.add("Bob");
        employees.add("Anna");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("employeesOut.bin")
        )) {
            objectOutputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
