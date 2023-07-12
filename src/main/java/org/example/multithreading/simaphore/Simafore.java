package org.example.multithreading.simaphore;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Semaphore;

public class Simafore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        new Person("Tim", semaphore);
        new Person("Sam", semaphore);
        new Person("Kate", semaphore);
        new Person("Anna", semaphore);
        new Person("Valeriy", semaphore);


    }
}

class Person extends Thread {
    String name;
    Semaphore semafore;

    public Person(String name, Semaphore semafore) {
        this.name = name;
        this.semafore = semafore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает.....");
            semafore.acquire();
            System.out.println(name + " использует телефон");
            sleep(2000);
            System.out.println(name + " завершил(а) разговор");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semafore.release();
        }

    }
}
