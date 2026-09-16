package JavaAST03;

public class Contribuinte {
    private String nome;
    private double salarioMensal;

    public Contribuinte(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // --- RESPONSABILIDADE ÚNICA: Regras de cálculo de imposto baseadas no IRPF anual ---
    public double calcularImpostoAnual() {
        double salarioAnual = getSalarioAnual();
        double aliquota = 0.0;

        if (salarioAnual <= 22847.76) {
            aliquota = 0.0;
        } else if (salarioAnual <= 33919.80) {
            aliquota = 0.075;
        } else if (salarioAnual <= 45012.60) {
            aliquota = 0.15;
        } else {
            aliquota = 0.275;
        }

        return salarioAnual * aliquota;
    }

    public double getImpostoMensal() {
        return calcularImpostoAnual() / 12;
    }

    public double getSalarioLiquidoMensal() {
        return salarioMensal - getImpostoMensal();
    }
}