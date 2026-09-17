package JavaAST06;

public class JavaAST06 {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo(
                "ABC-1234",
                "Toyota Corolla",
                2024,
                15000.0
        );

        Veiculo veiculo2 = new Veiculo(
                "DEF-5678",
                "Honda Civic",
                2023,
                22000.0
        );

        veiculo1.registrarViagem(350.5);
        veiculo2.registrarViagem(420.75);

        System.out.println("--- Veículo 1 ---");
        veiculo1.exibirDetalhes();

        System.out.println("\n--- Veículo 2 ---");
        veiculo2.exibirDetalhes();
    }
}