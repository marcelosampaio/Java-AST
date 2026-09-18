package JavaAST12;

import java.util.Scanner;

public class JavaAST12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String nomeUsuario1 = scanner.nextLine().trim();

        System.out.print("Digite o nome do segundo usuário: ");
        String nomeUsuario2 = scanner.nextLine().trim();

        Chat chat = new Chat(nomeUsuario1, nomeUsuario2);

        scanner.close();
    }
}