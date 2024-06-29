import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int operacao;

        System.out.println("Calculadora Simples em Java");
        System.out.println("===========================");

        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        // Entrada do segundo número
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        // Escolha da operação
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.print("Digite o número da operação desejada: ");
        operacao = scanner.nextInt();

        double resultado = 0;

        // Realiza a operação escolhida
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        scanner.close();
    }
}
