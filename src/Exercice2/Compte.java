package Exercice2;

public class Compte {
    private int solde = 0;

    public synchronized void verser(int montant) {
        solde += montant;
    }

    public synchronized void retirer(int montant) {
        solde -= montant;
    }

    public synchronized int consulter() {
        return solde;
    }
}