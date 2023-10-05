import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a operação matemática a ser realizada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println(input);
        int opcao = input.nextInt();

        OperacaoMatematica operacao;
        double resultado;

        switch (opcao) {
            case 1:
                operacao = new Soma();
                break;
            case 2:
                operacao = new Subtracao();
                break;
            case 3:
                operacao = new Multiplicacao();
                break;
            case 4:
                operacao = new Divisao();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        resultado = operacao.calcular(num1, num2);

        System.out.println("O resultado da operação é: " + resultado);
        
    }
}

