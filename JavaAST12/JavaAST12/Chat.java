package JavaAST12;

public class Chat {

    private static final int LIMITE_MENSAGENS = 10;

    private String nomeUsuario1;
    private String nomeUsuario2;
    private String[] mensagens;
    private int proximaPosicao;

    public Chat(String nomeUsuario1, String nomeUsuario2) {
        this.nomeUsuario1 = nomeUsuario1;
        this.nomeUsuario2 = nomeUsuario2;
        this.mensagens = new String[LIMITE_MENSAGENS];
        this.proximaPosicao = 0;
    }

    public void adicionarMensagem(String mensagem) {
        if (proximaPosicao < mensagens.length) {
            mensagens[proximaPosicao] = mensagem;
            proximaPosicao++;
        }
    }

    public String getNomeUsuario(int indice) {
        if (indice == 0) {
            return nomeUsuario1;
        }

        return nomeUsuario2;
    }

    public String[] getMensagens() {
        return mensagens;
    }
}