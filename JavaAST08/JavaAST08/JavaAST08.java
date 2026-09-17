package JavaAST08;

public class JavaAST08 {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 10000.00);
        Funcionario estagiario = new Estagiario("Ana", 2000.00);

        exibirSalario(gerente);
        exibirSalario(estagiario);
    }

    private static void exibirSalario(Funcionario funcionario) {
        System.out.printf(
                "Funcionário: %s%nSalário final: R$ %.2f%n%n",
                funcionario.getNome(),
                funcionario.calcularSalario()
        );
    }
}