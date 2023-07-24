package org.example.nio;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufAndCha {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("some.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(250);
            StringBuilder builder = new StringBuilder();
            int byteCounter = channel.read(buffer);
            System.out.println(byteCounter);
            buffer.flip();
            while (buffer.hasRemaining()) {
                builder.append((char) buffer.get());

            }
            System.out.println(builder);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
