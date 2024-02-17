import Exercice1.Thread1;
import Exercice1.Thread2;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread threadA = new Thread(new Thread1(lock));
        Thread2 threadB = new Thread2(lock);

        threadA.start();
        threadB.start();
    }
}