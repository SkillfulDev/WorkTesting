package org.example.io;

import java.io.*;

public class BuffEx {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("some.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("some2.txt",true))) {
            int character;
            while ((character=bufferedReader.read()) != -1) {
                bufferedWriter.write(character);
                bufferedWriter.write("--");
            }
        }
    }
}