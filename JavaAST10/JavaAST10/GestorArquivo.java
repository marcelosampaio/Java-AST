package JavaAST10;

import java.io.BufferedWriter;
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
}