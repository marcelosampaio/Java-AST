package JavaAST02;

import java.util.Scanner;

public class JavaAST02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalhoRequisitos();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().trim();

        // Instanciando o objeto Usuario
        Usuario usuario = new Usuario(nome);

        solicitarSenhaAoUsuario(scanner, usuario);

        System.out.println("\nParabéns, " + usuario.getNome() + "! Sua senha foi validada e cadastrada com sucesso.");

        scanner.close();
    }

    private static void exibirCabecalhoRequisitos() {
        System.out.println("\n--- Critérios para a Senha ---");
        System.out.println("- Mínimo de 8 caracteres");
        System.out.println("- Pelo menos uma letra maiúscula");
        System.out.println("- Pelo menos um número");
        System.out.println("- Pelo menos um caractere especial (@, #, $, etc.)");
        System.out.println("-----------------------------------------------\n");
    }

    private static void solicitarSenhaAoUsuario(Scanner scanner, Usuario usuario) {
        boolean senhaCadastrada = false;

        do {
            System.out.print("Digite sua senha: ");
            String senhaCandidata = scanner.nextLine();

            // Validação usando o método estático da classe Usuario
            String erro = Usuario.validarSenha(senhaCandidata);

            if (erro == null) {
                usuario.tentarCadastrarSenha(senhaCandidata);
                senhaCadastrada = true;
            } else {
                System.out.println("Senha inválida: " + erro);
                System.out.println("Tente novamente.\n");
            }

        } while (!senhaCadastrada);
    }
}