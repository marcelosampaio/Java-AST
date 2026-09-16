package JavaAST02;

public class Usuario {
    private static final int TAMANHO_MINIMO = 8;

    private String nome;
    private String senha;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public boolean tentarCadastrarSenha(String senhaCandidata) {
        String erro = validarSenha(senhaCandidata);

        if (erro == null) {
            this.senha = senhaCandidata;
            return true;
        }
        return false;
    }

    // Regra de validação isolada (Encapsulada na classe de domínio)
    public static String validarSenha(String senha) {
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

        return null; // Válida
    }

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