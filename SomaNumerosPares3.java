import java.util.ArrayList;
import java.util.Scanner;

public class SomaNumerosPares3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira uma lista de números separados por vírgula
            System.out.print("Digite uma lista de números separados por vírgula: ");
            String input = scanner.nextLine();

            // Divide a entrada do usuário em um array de strings
            String[] numerosString = input.split(",");

            // Inicializa uma lista para armazenar os números
            ArrayList<Integer> numeros = new ArrayList<>();

            // Converte as strings em números inteiros e os adiciona à lista
            for (String numeroString : numerosString) {
                try {
                    int numero = Integer.parseInt(numeroString.trim());
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.err.println("Erro: Entrada inválida. Certifique-se de que todos os valores sejam números inteiros.");
                    return;
                }
            }

            // Inicializa uma variável para armazenar a soma dos números pares
            int soma = 0;

            // Itera sobre a lista de números
            for (int numero : numeros) {
                // Verifica se o número é par
                if (numero % 2 == 0) {
                    soma += numero;
                }
            }

            // Verifica se há números pares na lista e imprime o resultado
            if (soma > 0) {
                System.out.println("Resultado: A soma dos números pares é " + soma + ".");
            } else {
                System.out.println("Resultado: A lista não contém números pares.");
            }

            // Fecha o scanner
            scanner.close();
        }
    }
}
