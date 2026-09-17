package JavaAST08;

public class Gerente extends Funcionario {

    private static final double BONUS = 0.20;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * BONUS);
    }
}