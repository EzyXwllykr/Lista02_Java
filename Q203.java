/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

public class Q203 {
    public static void main(String[] args) {
        System.out.println("Os números entre 1 e 1000 que quando dividos por 11 obtemos resto = 5 são: ");
        
boolean primeiroNum = true; //verificar o primeiro numero

        for (int i = 1; i <= 1000; i++) {
            if (i % 11 == 5) {
                if (!primeiroNum) {
                    System.out.print(", "); //adicionar vírgula depois do primeiro número
                }
                System.out.print(i);
                primeiroNum = false; //verifica o fim do output
            }
        }

        System.out.print("."); // Adiciona o ponto depois do último número
        System.out.println();

    }
}
