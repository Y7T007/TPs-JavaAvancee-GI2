import Exercice1.Thread1;
import Exercice1.Thread2;
import Exercice2.Compte;
import Exercice2.ThreadRetirer;
import Exercice2.ThreadVerser;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread threadA = new Thread(new Thread1(lock));
        Thread2 threadB = new Thread2(lock);

        threadA.start();
        threadB.start();

//        Question 2 :
        Compte compte = new Compte();

        for (int i = 0; i < 20; i++) {
            new Thread(new ThreadVerser(compte)).start();
            new Thread(new ThreadRetirer(compte)).start();
        }

        System.out.println("Solde final : " + compte.consulter());

    }
}