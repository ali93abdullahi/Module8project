package Concurrency;

public class CounterUp extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Counter Up: " + i);
            try {
                Thread.sleep(500); // Adding delay to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}