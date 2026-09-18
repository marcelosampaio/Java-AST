package JavaAST11;

import java.util.Random;

public class Sorteio {

    private static final int QUANTIDADE_NUMEROS = 6;
    private static final int MENOR_NUMERO = 1;
    private static final int MAIOR_NUMERO = 60;

    private int[] numerosSorteados;

    public Sorteio() {
        numerosSorteados = new int[QUANTIDADE_NUMEROS];
    }

    public void gerarNumeros() {

        Random random = new Random();

        for (int i = 0; i < numerosSorteados.length; i++) {

            int numero;

            do {
                numero = random.nextInt(MAIOR_NUMERO) + MENOR_NUMERO;
            } while (numeroJaSorteado(numero));

            numerosSorteados[i] = numero;
        }
    }

    public int contarAcertos(int[] numerosUsuario) {

        int acertos = 0;

        for (int numeroUsuario : numerosUsuario) {

            if (numeroFoiSorteado(numeroUsuario)) {
                acertos++;
            }
        }

        return acertos;
    }

    private boolean numeroJaSorteado(int numero) {

        for (int numeroSorteado : numerosSorteados) {

            if (numeroSorteado == numero) {
                return true;
            }
        }

        return false;
    }

    private boolean numeroFoiSorteado(int numero) {

        for (int numeroSorteado : numerosSorteados) {

            if (numeroSorteado == numero) {
                return true;
            }
        }

        return false;
    }

    public void exibirNumerosSorteados() {

        System.out.print("Números sorteados: ");

        for (int numero : numerosSorteados) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }
}