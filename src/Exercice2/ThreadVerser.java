package Exercice2;

public class ThreadVerser implements Runnable {
    private final Compte compte;
    private final Object lock;


    public ThreadVerser(Compte compte, Object lock) {
        this.compte = compte;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 1000; i++) {
                compte.verser(10);
            }
        }
    }
}