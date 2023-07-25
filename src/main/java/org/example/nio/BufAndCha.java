package org.example.nio;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufAndCha {
    String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) throws IOException {

        try (RandomAccessFile accessFile = new RandomAccessFile("some.txt", "r");
             RandomAccessFile accessFile1 = new RandomAccessFile("C:\\Work\\tools" +
                     "\\TestDirectory\\test1.txt", "rw")) {
            FileChannel channel = accessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(200);

            channel.read(buffer);
            buffer.flip();
            FileChannel channelWrite = accessFile1.getChannel();
            channelWrite.write(buffer);
        }
    }
}
