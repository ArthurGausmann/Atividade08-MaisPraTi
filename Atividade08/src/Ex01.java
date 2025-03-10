import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        double a, b, result;
        result = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora, forneça dois valores e depois a operação que deseja realizar");
        System.out.println("Valor a: ");
        a = scan.nextInt();
        System.out.println("Valor b: ");
        b = scan.nextInt();

        System.out.println("Agora escreva a operação (+, -, *, /)");
        char op = scan.next().charAt(0);

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }

        System.out.println("O resultado da operação é: " + result);
    }
}
