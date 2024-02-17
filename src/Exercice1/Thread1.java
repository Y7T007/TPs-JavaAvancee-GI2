package Exercice1;

public class Thread1 implements Runnable {
    private final Object lock;

    public Thread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + i + " de la classe A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}