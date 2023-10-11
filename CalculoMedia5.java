import java.util.ArrayList;
import java.util.Scanner;

public class CalculoMedia5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira uma lista de números separados por vírgula
            System.out.print("Digite uma lista de números separados por vírgula: ");
            String input = scanner.nextLine();

            // Divide a entrada do usuário em um array de strings
            String[] numerosString = input.split(",");

            // Inicializa uma lista para armazenar os números
            ArrayList<Double> numeros = new ArrayList<>();

            // Converte as strings em números de ponto flutuante e os adiciona à lista
            for (String numeroString : numerosString) {
                try {
                    double numero = Double.parseDouble(numeroString.trim());
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.err.println("Erro: Entrada inválida. Certifique-se de que todos os valores sejam números.");
                    return;
                }
            }

            // Verifica se a lista está vazia
            if (numeros.isEmpty()) {
                System.out.println("Resultado: A lista está vazia, não é possível calcular a média.");
            } else {
                // Calcula a média dos números na lista
                double soma = 0;
                for (double numero : numeros) {
                    soma += numero;
                }
                double media = soma / numeros.size();

                // Imprime o resultado
                System.out.println("Resultado: A média dos números é " + media + ".");
            }

            // Fecha o scanner
            scanner.close();
        }
    }
}
