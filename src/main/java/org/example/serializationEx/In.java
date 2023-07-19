package org.example.serializationEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class In {
    public static void main(String[] args) throws ClassNotFoundException {
        List<String> employees = new ArrayList<>();

        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("employeesOut.bin"))) {
            employees=(ArrayList)objectInputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
