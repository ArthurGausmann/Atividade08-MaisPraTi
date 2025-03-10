import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        String pal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        pal = scan.next();

        String inv = new StringBuilder(pal).reverse().toString();

        if (pal.equalsIgnoreCase(inv)) {
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }
    }
}
