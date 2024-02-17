package Exercice1;

public class Thread2 extends Thread {
    private final Object lock;

    public Thread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + i + " de la classe B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}