package JavaAST10;

public class Compras {

    private static final int QUANTIDADE_COMPRAS = 3;

    private Produto[] produtos;
    private int proximaPosicao;

    public Compras() {
        produtos = new Produto[QUANTIDADE_COMPRAS];
        proximaPosicao = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (proximaPosicao < produtos.length) {
            produtos[proximaPosicao] = produto;
            proximaPosicao++;
        }
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}