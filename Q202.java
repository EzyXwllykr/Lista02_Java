/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando;

        do {
            System.out.println("Cálculo da Regra de Três Simples");
            System.out.print("Digite o primeiro valor (referente a X): ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo valor (referente a Y): ");
            double num2 = scanner.nextDouble();
            System.out.print("Digite o terceiro valor (referente a Z): ");
            double num3 = scanner.nextDouble();

            // Cálculo
            double resultado = (num2 * num3) / num1;
            System.out.println("O Resultado é: " + resultado);

            // Continuar ou sair
            System.out.print("Deseja realizar outro cálculo? ('S' para sim ou 'N' para sair): ");
            comando = scanner.next();
        } while (comando.equalsIgnoreCase("S"));

        System.out.println("Saindo do programa.");
        scanner.close();
    }
}
