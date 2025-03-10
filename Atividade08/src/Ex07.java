import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;

        System.out.println("Escreva uma frase: ");
        String frase = scan.nextLine();

        for (String palavra : frase.split("\\s+")){
            a++;
        }

        System.out.println("A frase escrita possui " + a + " palavras");
    }
}
