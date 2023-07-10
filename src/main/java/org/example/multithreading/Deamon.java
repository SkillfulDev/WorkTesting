package org.example.multithreading;

import java.awt.image.renderable.RenderableImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Deamon {
    public static void main(String[] args) {
        System.out.println("Main Thread starts working");

        Thread userTh= new UserThread();
        Thread deamTh= new DeamonThread();


        deamTh.setDaemon(true);
        userTh.start();
        deamTh.start();
        System.out.println("Main Thread finish working");


    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println("Thread is deamon "+Thread.currentThread().isDaemon());
        for (char i = 'A'; i < 'H'; i++) {
            System.out.println(i);
        }
    }
}

class DeamonThread extends Thread{
    public void run(){
        System.out.println("Thread is deamon "+Thread.currentThread().isDaemon());
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
