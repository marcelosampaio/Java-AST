package JavaAST02;

import java.util.Scanner;

public class JavaAST02 {

    private static final int TAMANHO_MINIMO = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalhoRequisitos();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha = solicitarSenhaValida(scanner);

        System.out.println("\nParabéns, " + nome + "! Sua senha foi validada e cadastrada com sucesso.");

        scanner.close();
    }

    private static void exibirCabecalhoRequisitos() {
        System.out.println("\n--- Critérios para a Senha ---");
        System.out.println("- Mínimo de " + TAMANHO_MINIMO + " caracteres");
        System.out.println("- Pelo menos uma letra maiúscula");
        System.out.println("- Pelo menos um número");
        System.out.println("- Pelo menos um caractere especial (@, #, $, etc.)");
        System.out.println("------------------------------------------------\n");
    }

    private static String solicitarSenhaValida(Scanner scanner) {
        String senha;
        do {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            String erro = validarSenha(senha);

            if (erro == null) {
                return senha; // Senha válida, sai do loop
            }

            System.out.println("Senha inválida: " + erro);
            System.out.println("Tente novamente.\n");

        } while (true);
    }

    // --- RESPONSABILIDADE ÚNICA: Validar regras de acordo estrito com o enunciado ---
    private static String validarSenha(String senha) {
        if (!possuiTamanhoMinimo(senha)) {
            return "A senha deve ter no mínimo " + TAMANHO_MINIMO + " caracteres.";
        }
        if (!possuiMaiuscula(senha)) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!possuiNumero(senha)) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!possuiCaractereEspecial(senha)) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }

        return null; // Nenhum erro encontrado
    }

    // Métodos auxiliares atômicos para cada validação específica
    private static boolean possuiTamanhoMinimo(String senha) {
        return senha.length() >= TAMANHO_MINIMO;
    }

    private static boolean possuiMaiuscula(String senha) {
        return senha.chars().anyMatch(Character::isUpperCase);
    }

    private static boolean possuiNumero(String senha) {
        return senha.chars().anyMatch(Character::isDigit);
    }

    private static boolean possuiCaractereEspecial(String senha) {
        return senha.chars().anyMatch(c -> !Character.isLetterOrDigit(c));
    }
}