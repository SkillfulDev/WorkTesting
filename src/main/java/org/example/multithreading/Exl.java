package org.example.multithreading;

public class Exl {
    public static void main(String[] args) {
        ExThread exThread = new ExThread();
        exThread.start();
    }
}

class ExThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}
