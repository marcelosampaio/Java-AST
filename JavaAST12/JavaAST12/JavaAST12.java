package JavaAST12;

import java.util.Scanner;

public class JavaAST12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String nomeUsuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String nomeUsuario2 = scanner.nextLine();

        Chat chat = new Chat(nomeUsuario1, nomeUsuario2);

        ChatEngine chatEngine = new ChatEngine(chat, scanner);

        chatEngine.iniciarConversa();

        scanner.close();
    }
}