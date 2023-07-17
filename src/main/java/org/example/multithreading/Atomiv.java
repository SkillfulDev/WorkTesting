package org.example.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atomiv {
    public static int couter = 0;

    public static synchronized void increment(){
        couter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunnableImp1());
        Thread thread2 = new Thread(new RunnableImp1());


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(couter);
        System.out.println("Main ends" );




    }
}

class RunnableImp1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Atomiv.increment();
        }

    }
}