package JavaAST04;

import java.util.Scanner;

public class JavaAST04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = solicitarNome(scanner);
        double valor = solicitarValorEmprestimo(scanner);
        int parcelas = solicitarQuantidadeParcelas(scanner);

        Emprestimo emprestimo = new Emprestimo(nome, valor, parcelas);

        exibirResultado(emprestimo);

        scanner.close();
    }

    private static String solicitarNome(Scanner scanner) {
        System.out.print("Digite seu nome: ");
        return scanner.nextLine().trim();
    }

    private static double solicitarValorEmprestimo(Scanner scanner) {
        double valor;

        do {
            System.out.print("Digite o valor do empréstimo (R$): ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um valor numérico.");
                scanner.next();
                System.out.print("Digite o valor do empréstimo (R$): ");
            }

            valor = scanner.nextDouble();

            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero.");
            }

        } while (valor <= 0);

        return valor;
    }

    private static int solicitarQuantidadeParcelas(Scanner scanner) {
        int parcelas;

        do {
            System.out.print("Digite a quantidade de parcelas (6 a 48): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                System.out.print("Digite a quantidade de parcelas (6 a 48): ");
            }

            parcelas = scanner.nextInt();

            if (parcelas < 6 || parcelas > 48) {
                System.out.println("A quantidade de parcelas deve estar entre 6 e 48.");
            }

        } while (parcelas < 6 || parcelas > 48);

        return parcelas;
    }

    private static void exibirResultado(Emprestimo emprestimo) {
        System.out.println("\n--- Simulação de Empréstimo ---");
        System.out.println("Cliente: " + emprestimo.getNome());
        System.out.printf("Juros: R$ %.2f%n", emprestimo.calcularJuros());
        System.out.printf("Total pago: R$ %.2f%n", emprestimo.calcularTotalPago());
        System.out.printf("Valor da parcela: R$ %.2f%n", emprestimo.calcularValorParcela());
    }
}