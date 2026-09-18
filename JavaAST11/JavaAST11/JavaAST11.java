package JavaAST11;

import java.util.Scanner;

public class JavaAST11 {

    private static final int QUANTIDADE_NUMEROS = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numerosUsuario = solicitarNumeros(scanner);

        Sorteio sorteio = new Sorteio();

        sorteio.gerarNumeros();

        sorteio.exibirNumerosSorteados();

        int acertos = sorteio.contarAcertos(numerosUsuario);

        System.out.println("\nQuantidade de acertos: " + acertos);

        scanner.close();
    }

    private static int[] solicitarNumeros(Scanner scanner) {

        int[] numeros = new int[QUANTIDADE_NUMEROS];

        for (int i = 0; i < numeros.length; i++) {

            int numero;

            do {
                System.out.print("Digite o " + (i + 1) + "º número (1 a 60): ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    scanner.next();
                    System.out.print("Digite o " + (i + 1) + "º número (1 a 60): ");
                }

                numero = scanner.nextInt();

                if (numero < 1 || numero > 60) {
                    System.out.println("Número inválido. Digite um número entre 1 e 60.");
                } else if (numeroJaInformado(numeros, i, numero)) {
                    System.out.println("Número já informado. Digite outro número.");
                }

            } while (numero < 1 || numero > 60 || numeroJaInformado(numeros, i, numero));

            numeros[i] = numero;
        }

        return numeros;
    }

    private static boolean numeroJaInformado(int[] numeros, int quantidade, int numero) {

        for (int i = 0; i < quantidade; i++) {

            if (numeros[i] == numero) {
                return true;
            }
        }

        return false;
    }
}