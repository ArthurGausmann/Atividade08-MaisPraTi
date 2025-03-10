import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;

        System.out.println("Escreva duas palavras, elas serão comparadas para verificar se são anagramas");
        System.out.println("Palavra 1: ");
        String p1 = scan.nextLine();
        System.out.println("Palavra 2: ");
        String p2 = scan.nextLine();

        for (String s : p1.split("")) {
            for (String t : p2.split("")) {
                if (s.equalsIgnoreCase(t)) {
                    a++;
                }
            }
        }

        if (a == p1.length() || a == p2.length()) {
            System.out.println("As palavras são anagramas");
        } else {
            System.out.println("Não são anagramas");
        }
    }
}
