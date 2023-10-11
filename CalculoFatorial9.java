import java.util.Scanner;

public class CalculoFatorial9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número para calcular o fatorial
        System.out.print("Calcular o fatorial de: ");
        int numero = scanner.nextInt();

        // Calcula o fatorial do número
        long fatorial = calcularFatorial(numero);

        // Imprime o resultado
        System.out.println("Resultado: O fatorial de " + numero + " é " + fatorial + ".");

        // Fecha o scanner
        scanner.close();
    }

    // Função para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        if (n < 0) {
            return -1; // Retorna -1 para indicar um valor inválido
        } else if (n == 0 || n == 1) {
            return 1; // O fatorial de 0 e 1 é 1
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
