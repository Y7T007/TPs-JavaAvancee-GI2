package Exercice2;

public class ThreadRetirer implements Runnable {
    private final Compte compte;

    public ThreadRetirer(Compte compte) {
        this.compte = compte;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            compte.retirer(10);
        }
    }
}