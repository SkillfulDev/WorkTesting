package org.example.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBin {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Work\\Разное\\Чек3.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("Чек3.jpg")) {
            int i;

            while ((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
