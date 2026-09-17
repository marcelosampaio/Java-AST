package JavaAST10;

public class Compras {

    private static final int QUANTIDADE_COMPRAS = 3;

    private Produto[] produtos;

    public Compras() {
        produtos = new Produto[QUANTIDADE_COMPRAS];
    }

    public void adicionarProduto(int indice, Produto produto) {
        produtos[indice] = produto;
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}