package org.example.multithreading;


class Test extends Thread {
   volatile boolean running = false;

    @Override
    public void run() {
        long count = 0;
        while (running) {
            count++;
        }
        System.out.println("End of programm, and number of count= " + count);
    }

    public static void main(String[] args) throws InterruptedException {

        Test thread = new Test();

        System.out.println("StartingProgram");
        thread.start();
        Thread.sleep(3000);
        thread.running= false;
        thread.join();
        System.out.println("End main Thread");


    }


}

