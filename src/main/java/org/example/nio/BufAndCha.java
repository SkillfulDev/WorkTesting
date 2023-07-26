package org.example.nio;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class BufAndCha {
    String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) throws IOException {
//
////        Path path = Paths.get("C:\\Work\\tools" +
////                "\\TestDirectory\\test22.txt");
//
//        Files.createFile(path);
//
//        try (RandomAccessFile accessFile = new RandomAccessFile("some.txt", "r");
//             RandomAccessFile accessFile1 = new RandomAccessFile("C:\\Work\\tools" +
//                     "\\TestDirectory\\test22.txt", "rw")) {
//            FileChannel channel = accessFile.getChannel();
//            ByteBuffer buffer = ByteBuffer.allocate(200);
//
//            channel.read(buffer);
//            buffer.flip();
//            FileChannel channelWrite = accessFile1.getChannel();
//            channelWrite.write(buffer);
//
//            Map<String, Object> allAttributes = Files.readAttributes(path, "*");
//
//            for (String s : allAttributes.keySet()) {
//                System.out.println(s);
//
//            }
//        }
    }
}
