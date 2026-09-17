package JavaAST08;

public class Estagiario extends Funcionario {

    private static final double DESCONTO = 0.10;

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * DESCONTO);
    }
}