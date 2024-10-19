/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a operação que deseja:");
            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
      
            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro. Não é possível dividir por zero.");
                        }
                        break;
                }
            } else if (opcao != 5) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        System.out.println("Saindo da calculadora.");
        scanner.close();
    }
}
