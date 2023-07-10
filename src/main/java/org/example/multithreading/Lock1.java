package org.example.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock1 {
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (char i = 'A'; i < 'J'; i++) {

            System.out.println(i);
        }
    }
}
