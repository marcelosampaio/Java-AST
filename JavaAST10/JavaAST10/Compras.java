package JavaAST10;

public class Compras {

    private Produto[] produtos;

    public Compras() {
        produtos = new Produto[3];
    }

    public void adicionarProduto(int indice, Produto produto) {
        produtos[indice] = produto;
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}