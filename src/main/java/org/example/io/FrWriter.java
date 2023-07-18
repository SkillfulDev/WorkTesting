package org.example.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FrWriter {
    public static void main(String[] args) throws IOException {
        String text = "\n" +
                "м. Вишневе, Промислова вул., 5\n" +
                "Наконечний Олег Васильович \n" +
                "( Ремонт Принтера\n" +
                " «ЗІП»)\n" +
                "Від\n" +
                "Черноног Євген\n" +
                "0999149939\n" +
                "с. Проліски, Броварська вул., 2а\n";

        FileWriter writer = null;
        try {
            writer = new FileWriter("some.txt");
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));

            }
            System.out.println("Done!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
