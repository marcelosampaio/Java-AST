package JavaAST10;

import java.util.Scanner;

public class JavaAST10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Compras compras = new Compras();

        for (int i = 0; i < compras.getProdutos().length; i++) {

            System.out.println("\n--- Compra " + (i + 1) + " ---");

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Digite o preço unitário: ");
            double precoUnitario = scanner.nextDouble();

            scanner.nextLine();

            Produto produto = new Produto(nome, quantidade, precoUnitario);

            compras.adicionarProduto(i, produto);
        }

        exibirCompras(compras);

        scanner.close();
    }

    private static void exibirCompras(Compras compras) {

        System.out.println("\n--- Compras ---");

        for (Produto produto : compras.getProdutos()) {
            System.out.printf(
                    "Produto: %s | Quantidade: %d | Preço unitário: R$ %.2f | Total: R$ %.2f%n",
                    produto.getNome(),
                    produto.getQuantidade(),
                    produto.getPrecoUnitario(),
                    produto.calcularTotal()
            );
        }
    }
}