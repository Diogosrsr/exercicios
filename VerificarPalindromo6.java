import java.util.Scanner;

public class VerificarPalindromo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Remove espaços em branco extras e converte a palavra para letras minúsculas para evitar diferenciação de maiúsculas e minúsculas
        palavra = palavra.trim().toLowerCase();

        // Inicializa uma variável para armazenar se a palavra é um palíndromo
        boolean ePalindromo = true;

        // Itera sobre a metade da palavra (até o meio)
        int metade = palavra.length() / 2;
        for (int i = 0; i < metade; i++) {
            // Compara o caractere atual com o caractere correspondente no final
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                ePalindromo = false;
                break;
            }
        }

        // Verifica se a palavra é um palíndromo e imprime o resultado
        if (ePalindromo) {
            System.out.println("Resultado: A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("Resultado: A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
