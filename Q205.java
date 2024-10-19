/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Random;
import java.util.Scanner;

public class Q205 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        int operadorNum = -1;

        // Laço de repetição até o usuário acertar o número
        while (operadorNum != x) {
            System.out.print("Digite um número entre 0 e 9: ");
            operadorNum = scanner.nextInt();

            if (operadorNum < x) {
                System.out.println("MAIOR");
            } else if (operadorNum > x) {
                System.out.println("MENOR");
            }
        }

        // Mensagem de sucesso
        System.out.println("ACERTOU!");
        scanner.close();
    }
}
