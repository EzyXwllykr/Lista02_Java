/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da série Fibonacci que deseja: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Erro. Insira um número maior que zero.");
        } else {
            System.out.print("Série Fibonacci: ");
            printFibonacci(n);
        }

        scanner.close();
        System.out.println();
    }

    // Cálculo da série de Fibonacci
    public static void printFibonacci(int n) {
        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
