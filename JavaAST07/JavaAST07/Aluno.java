package JavaAST07;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 7) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f%n", i + 1, notas[i]);
        }

        System.out.printf("Média: %.2f%n", calcularMedia());
    }
}