package JavaAST07;

import java.util.Scanner;

public class JavaAST07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine().trim();

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = solicitarNota(scanner, "Digite a nota " + (i + 1) + ": ");
        }

        Aluno aluno = new Aluno(nome, matricula, notas);

        System.out.println("\n--- Resultado do Aluno ---");
        aluno.exibirDetalhes();
        aluno.verificarAprovacao();

        scanner.close();
    }

    private static double solicitarNota(Scanner scanner, String mensagem) {
        System.out.print(mensagem);

        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um valor numérico.");
            scanner.next();
            System.out.print(mensagem);
        }

        return scanner.nextDouble();
    }
}