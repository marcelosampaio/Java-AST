package JavaAST12;

public class Chat {

    private static final int QUANTIDADE_MENSAGENS = 10;

    private String nomeUsuario1;
    private String nomeUsuario2;
    private String[] mensagens;

    public Chat(String nomeUsuario1, String nomeUsuario2) {
        this.nomeUsuario1 = nomeUsuario1;
        this.nomeUsuario2 = nomeUsuario2;
        this.mensagens = new String[QUANTIDADE_MENSAGENS];
    }
}