import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci");

        int num, numa, n;
        numa = 0;
        num = 1;

        System.out.println("Quantos números da sequência Fibonacci você deseja? ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        if (n <= 0){
            System.out.println("Valor fornecido inválido");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(numa);
                int nump = num + numa;
                numa = num;
                num = nump;
            }
        }


    }
}
