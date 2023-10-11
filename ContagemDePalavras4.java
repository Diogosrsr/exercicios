import java.util.Scanner;

public class ContagemDePalavras4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Divide a frase em palavras usando espaços como delimitadores
        String[] palavras = frase.split("\\s+");

        // Inicializa uma variável para armazenar o número de palavras
        int numeroDePalavras = 0;

        // Itera sobre as palavras para contar aquelas que não são apenas espaços em branco
        for (String palavra : palavras) {
            if (!palavra.trim().isEmpty()) {
                numeroDePalavras++;
            }
        }

        // Verifica se há palavras na frase e imprime o resultado
        if (numeroDePalavras > 0) {
            System.out.println("Resultado: A frase possui " + numeroDePalavras + " palavras.");
        } else {
            System.out.println("Resultado: A frase não possui palavras.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
