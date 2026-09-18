package JavaAST12;

import java.util.Scanner;

public class ChatEngine {

    private static final int TOTAL_MENSAGENS = 10;

    private Chat chat;
    private Scanner scanner;

    public ChatEngine(Chat chat, Scanner scanner) {
        this.chat = chat;
        this.scanner = scanner;
    }

    public void iniciarConversa() {

        for (int i = 0; i < TOTAL_MENSAGENS; i++) {

            int indiceUsuario = i % 2;
            String nomeUsuario = chat.getNomeUsuario(indiceUsuario);

            System.out.print(nomeUsuario + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();

            chat.adicionarMensagem(mensagem);
        }

        exibirHistorico();

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");
    }

    private void exibirHistorico() {

        System.out.println("\n===== Histórico de Mensagens =====");

        String[] mensagens = chat.getMensagens();

        for (int i = 0; i < mensagens.length; i++) {

            int indiceUsuario = i % 2;
            String nomeUsuario = chat.getNomeUsuario(indiceUsuario);

            System.out.println(nomeUsuario + ": " + mensagens[i]);
        }
    }
}