package org.example.file;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\JTe\\file.txt");
        File file1 = new File("C:\\Work\\JTe\\file1.txt");
        File directory = new File("C:\\Work\\JTe\\A");

        file1.createNewFile();


        System.out.println(file.exists());

    }
}
