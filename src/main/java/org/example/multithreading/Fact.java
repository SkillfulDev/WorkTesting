package org.example.multithreading;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fact {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial();
        Future<Integer> futur
        executorService.execute(factorial);

    }
}

class Factorial implements Runnable {

    @Override
    public void run() {
        System.out.println("Gaf");
    }
}
