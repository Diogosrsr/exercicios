import java.util.Scanner;

public class VerificacaoNumeroPrimo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        boolean ehPrimo = verificarPrimo(numero);

        if (ehPrimo) {
            System.out.println("Resultado: O número " + numero + " é primo.");
        } else {
            System.out.println("Resultado: O número " + numero + " não é primo.");
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos.
        }

        if (numero <= 3) {
            return true; // 2 e 3 são primos.
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; // Números divisíveis por 2 ou 3 não são primos.
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false; // Se for divisível por algum número entre i e i + 2, não é primo.
            }
        }

        return true; // Se não for divisível por nenhum número até a raiz quadrada, é primo.
    }
}
