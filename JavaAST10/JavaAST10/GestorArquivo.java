package JavaAST10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArquivo {

    public void gravarCompras(Compras compras) {

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("compras.txt"))) {

            for (Produto produto : compras.getProdutos()) {

                escritor.write(
                        produto.getNome() + ";" +
                                produto.getQuantidade() + ";" +
                                produto.getPrecoUnitario()
                );

                escritor.newLine();
            }

            System.out.println("\nCompras gravadas com sucesso em compras.txt.");

        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }

    public Compras lerCompras() {

        Compras compras = new Compras();

        try (BufferedReader leitor = new BufferedReader(new FileReader("compras.txt"))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(";");

                String nome = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double precoUnitario = Double.parseDouble(dados[2]);

                Produto produto = new Produto(nome, quantidade, precoUnitario);

                compras.adicionarProduto(produto);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return compras;
    }
}