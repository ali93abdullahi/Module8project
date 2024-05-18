package Concurrency;

public class Main {
    public static void main(String[] args) {
        CounterUp counterUp = new CounterUp();
        counterUp.start();
        try {
            counterUp.join(); // Ensuring CounterDown starts after CounterUp finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        CounterDown counterDown = new CounterDown();
        counterDown.start();
    }
}
