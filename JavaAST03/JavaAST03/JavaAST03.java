package JavaAST03;

import java.util.Scanner;

public class JavaAST03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalhoTabela();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().trim();

        double salarioMensal = solicitarSalarioMensal(scanner);

        // Instanciando o objeto Contribuinte (Orientação a Objetos)
        Contribuinte contribuinte = new Contribuinte(nome, salarioMensal);

        exibirResultados(contribuinte);

        scanner.close();
    }

    private static void exibirCabecalhoTabela() {
        System.out.println("\n--- Tabela de Imposto de Renda (Anual) ---");
        System.out.println("- Até R$ 22.847,76: Isento");
        System.out.println("- De R$ 22.847,77 a R$ 33.919,80: 7,5%");
        System.out.println("- De R$ 33.919,81 a R$ 45.012,60: 15%");
        System.out.println("- Acima de R$ 45.012,61: 27,5%");
        System.out.println("-------------------------------------------\n");
    }

    private static double solicitarSalarioMensal(Scanner scanner) {
        double salario = -1;
        while (salario < 0) {
            System.out.print("Digite seu salário mensal (R$): ");
            if (scanner.hasNextDouble()) {
                salario = scanner.nextDouble();
                if (salario < 0) {
                    System.out.println("O salário não pode ser negativo. Tente novamente.\n");
                }
            } else {
                System.out.println("Entrada inválida. Digite um valor numérico válido.\n");
                scanner.next(); // Limpa o buffer inválido
            }
        }
        scanner.nextLine(); // Consome a quebra de linha pendente
        return salario;
    }

    private static void exibirResultados(Contribuinte c) {
        System.out.println("\n========================================");
        System.out.println("          EXTRATO DE IMPOSTOS           ");
        System.out.println("========================================");
        System.out.println("Contribuinte: " + c.getNome());
        System.out.printf("Salário Mensal Bruto:   R$ %.2f\n", c.getSalarioMensal());
        System.out.printf("Imposto de Renda: R$ %.2f\n", c.getImpostoMensal());
        System.out.printf("Salário Líquido Mensal: R$ %.2f\n", c.getSalarioLiquidoMensal());
        System.out.println("========================================");
    }
}