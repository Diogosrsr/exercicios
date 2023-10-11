import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira a lista ordenada de números separados por vírgula
            System.out.print("Digite uma lista de números ordenados separados por vírgula: ");
            String input = scanner.nextLine();

            // Divide a entrada do usuário em um array de strings
            String[] numerosString = input.split(",");

            // Inicializa um array de inteiros para armazenar os números ordenados
            int[] numeros = new int[numerosString.length];

            // Converte as strings em números inteiros e os armazena no array
            for (int i = 0; i < numerosString.length; i++) {
                try {
                    numeros[i] = Integer.parseInt(numerosString[i].trim());
                } catch (NumberFormatException e) {
                    System.err.println("Erro: Entrada inválida. Certifique-se de que todos os valores sejam números inteiros.");
                    return;
                }
            }

            // Solicita ao usuário que insira o número a ser buscado
            System.out.print("Digite o número a ser buscado: ");
            int buscar = scanner.nextInt();

            // Realiza a busca binária
            int posicao = buscaBinaria(numeros, buscar);

            // Verifica se o número foi encontrado e imprime o resultado
            if (posicao != -1) {
                System.out.println("Resultado: O número " + buscar + " foi encontrado na posição " + posicao + ".");
            } else {
                System.out.println("Resultado: O número " + buscar + " não foi encontrado na lista.");
            }

            // Fecha o scanner
            scanner.close();
        }
    }

    // Função para realizar a busca binária em um array ordenado
    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Retorna -1 se o número não for encontrado
    }
}
