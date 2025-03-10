import java.util.Scanner;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int entry;
        int secret = random.nextInt(0, 50);

        System.out.println(secret);

        do {
            System.out.println("Tente adivinhar o número entre 0 e 50: ");
            entry = scan.nextInt();
        } while (entry != secret);

        System.out.println("Parabéns você adivinhou o número!");
    }
}
