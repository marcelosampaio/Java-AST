package JavaAST09;

public class JavaAST09 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Marcelo", 1000.00);

        System.out.println("--- Saldo inicial ---");
        conta.exibirSaldo();

        conta.depositar(500.00);

        System.out.println("\n--- Após depósito ---");
        conta.exibirSaldo();

        conta.sacar(300.00);

        System.out.println("\n--- Após saque ---");
        conta.exibirSaldo();
    }
}