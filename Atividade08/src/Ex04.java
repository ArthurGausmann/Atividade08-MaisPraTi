import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, inv;

        System.out.println("Escreva um número que será invertido: ");
        num = scan.nextInt();

        String nums = Integer.toString(num);

        String invs = new StringBuilder(nums).reverse().toString();

        inv = Integer.parseInt(invs);

        System.out.println(inv);
    }
}
