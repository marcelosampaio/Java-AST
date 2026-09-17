package JavaAST04;

public class Emprestimo {

    private String nome;
    private double valor;
    private int parcelas;

    private static final double TAXA_JUROS_MENSAL = 0.03;

    public Emprestimo(String nome, double valor, int parcelas) {
        this.nome = nome;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularJuros() {
        return valor * TAXA_JUROS_MENSAL * parcelas;
    }

    public double calcularTotalPago() {
        return valor + calcularJuros();
    }

    public double calcularValorParcela() {
        return calcularTotalPago() / parcelas;
    }
}