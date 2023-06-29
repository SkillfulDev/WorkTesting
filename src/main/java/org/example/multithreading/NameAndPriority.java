package org.example.multithreading;

import java.util.ArrayList;
import java.util.List;

public class NameAndPriority implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new NameAndPriority());
        Thread thread1 = new Thread(new NameAndPriority());
        Thread thread2 = new Thread(new NameAndPriority());
        Thread thread3 = new Thread(new NameAndPriority());
        Thread thread4 = new Thread(new NameAndPriority());
        Thread thread5 = new Thread(new NameAndPriority());
        thread1.setName("My thread");
        thread4.setPriority(Thread.MAX_PRIORITY);


        List<Thread> threads = new ArrayList<>();

        threads.add(thread);
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);



        for (Thread thread6 : threads) {
            thread6.start();
            System.out.println(thread6.getName()+"$$$$$$"+thread6.getPriority());

            System.out.println(thread6.getPriority());
        }
    }
}
