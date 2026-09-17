package JavaAST06;

public class Veiculo {

    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void registrarViagem(double km) {
        quilometragem += km;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Quilometragem: %.2f km%n", quilometragem);
    }
}