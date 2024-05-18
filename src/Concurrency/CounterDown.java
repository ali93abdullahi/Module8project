package Concurrency;

public class CounterDown extends Thread {
    @Override
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("Counter Down: " + i);
            try {
                Thread.sleep(500); // Adding delay to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}