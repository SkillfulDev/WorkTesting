package org.example.multithreading;

import lombok.SneakyThrows;

import java.sql.SQLOutput;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorEx {
    public static void main(String[] args) {
        ExecutorService executorService =Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp());

        }
        System.out.println("Main ends");
    }
}
class RunnableImp implements Runnable{
    @SneakyThrows
    public void run (){
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}
