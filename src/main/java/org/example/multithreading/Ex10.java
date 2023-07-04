package org.example.multithreading;

public class Ex10 {


    public static void main(String[] args) throws InterruptedException {
        Incre incre = new Incre();
        Thread thread = new Thread(incre);
        Thread thread1 = new Thread(incre);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(For.counter);


    }


}

class Incre implements Runnable {

    public synchronized void increase() {
        For.counter++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increase();
        }
    }

}

class For {
    static int counter = 0;
}
