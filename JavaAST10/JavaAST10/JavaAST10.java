package JavaAST10;

public class JavaAST10 {

    public static void main(String[] args) {

        Compras compras = new Compras();

        compras.adicionarProduto(
                0,
                new Produto("Arroz", 2, 10.00)
        );

        compras.adicionarProduto(
                1,
                new Produto("Feijão", 3, 8.50)
        );

        compras.adicionarProduto(
                2,
                new Produto("Leite", 4, 5.00)
        );

        exibirCompras(compras);
    }

    private static void exibirCompras(Compras compras) {

        System.out.println("--- Compras ---");

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