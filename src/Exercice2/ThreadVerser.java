package Exercice2;

public class ThreadVerser implements Runnable {
    private final Compte compte;

    public ThreadVerser(Compte compte) {
        this.compte = compte;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            compte.verser(10);
        }
    }
}