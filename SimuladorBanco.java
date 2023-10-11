import java.util.Scanner;

public class SimuladorBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o saldo inicial
        System.out.print("Digite o saldo inicial: R$ ");
        double saldo = scanner.nextDouble();

        // Exibe o saldo inicial
        System.out.println("Saldo atual: R$ " + saldo);

        // Solicita ao usuário que insira o valor do depósito
        System.out.print("Digite o valor do depósito: R$ ");
        double deposito = scanner.nextDouble();

        // Realiza o depósito
        saldo += deposito;

        // Exibe o saldo atual após o depósito
        System.out.println("Resultado: Saldo atual: R$ " + saldo);

        // Solicita ao usuário que insira o valor do saque
        System.out.print("Digite o valor do saque: R$ ");
        double saque = scanner.nextDouble();

        // Verifica se há saldo suficiente para o saque
        if (saldo >= saque) {
            // Realiza o saque
            saldo -= saque;
            System.out.println("Resultado: Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Resultado: Saldo insuficiente para realizar o saque.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
