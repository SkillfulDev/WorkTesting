package org.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTry {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("some.txt")) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }

}
