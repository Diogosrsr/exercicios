import java.util.Scanner;

public class ContagemDeVogais2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Converte a frase para letras minúsculas para fazer a contagem sem diferenciação entre maiúsculas e minúsculas
        frase = frase.toLowerCase();

        // Inicializa um contador de vogais
        int contador = 0;

        // Define as vogais em uma string
        String vogais = "aeiou";

        // Itera sobre cada caractere na frase
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            // Verifica se o caractere é uma vogal
            if (vogais.indexOf(caractere) != -1) {
                contador++;
            }
        }

        // Verifica se há vogais na frase e imprime o resultado
        if (contador > 0) {
            System.out.println("Resultado: A frase possui " + contador + " vogais.");
        } else {
            System.out.println("Resultado: A frase não possui vogais.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
