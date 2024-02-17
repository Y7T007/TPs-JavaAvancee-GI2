import Exercice1.Thread1;
import Exercice1.Thread2;

public class Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new Thread1());
        Thread2 threadB = new Thread2();

        threadA.start();
        threadB.start();
    }
}