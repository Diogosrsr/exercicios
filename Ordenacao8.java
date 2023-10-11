import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira a lista de números separados por vírgula
            System.out.print("Digite uma lista de números separados por vírgula: ");
            String input = scanner.nextLine();

            // Divide a entrada do usuário em um array de strings
            String[] numerosString = input.split(",");

            // Inicializa um array de inteiros para armazenar os números
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

            // Chama a função para ordenar a lista
            ordenarNumeros(numeros);

            // Imprime a lista ordenada
            System.out.println("Resultado: Lista ordenada: " + Arrays.toString(numeros));

            // Fecha o scanner
            scanner.close();
        }
    }

    // Função para ordenar um array de inteiros em ordem crescente usando o algoritmo Bubble Sort
    public static void ordenarNumeros(int[] array) {
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }

            // Se nenhum elemento foi trocado nesta passagem, a lista já está ordenada
            if (!trocou) {
                break;
            }
        }
    }
}
