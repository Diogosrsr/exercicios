import java.util.Random;
import java.util.Scanner;

public class JogoDaForca11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palavras = {"elefante", "banana", "computador", "programacao", "girafa", "bicicleta"};
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        int tentativasMaximas = 6;
        int tentativas = 0;
        boolean[] letrasCorretas = new boolean[palavraEscolhida.length()];

        System.out.println("Bem-vindo ao jogo da forca!");
        System.out.println("Tente adivinhar a palavra.");

        while (tentativas < tentativasMaximas) {
            System.out.println("\nPalavra: " + exibirPalavra(palavraEscolhida, letrasCorretas));
            System.out.println("Tentativas restantes: " + (tentativasMaximas - tentativas));
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);
            letra = Character.toLowerCase(letra);

            if (adivinharLetra(letra, palavraEscolhida, letrasCorretas)) {
                System.out.println("Letra correta!");
            } else {
                System.out.println("Letra incorreta.");
                tentativas++;
            }

            if (palavraCompletada(palavraEscolhida, letrasCorretas)) {
                System.out.println("\nResultado: Parabéns, você adivinhou a palavra!");
                break;
            }
        }

        if (tentativas == tentativasMaximas) {
            System.out.println("\nResultado: Você esgotou suas tentativas. A palavra era \"" + palavraEscolhida + "\".");
        }

        scanner.close();
    }

    public static String exibirPalavra(String palavra, boolean[] letrasCorretas) {
        StringBuilder palavraExibida = new StringBuilder();

        for (int i = 0; i < palavra.length(); i++) {
            if (letrasCorretas[i]) {
                palavraExibida.append(palavra.charAt(i));
            } else {
                palavraExibida.append("_");
            }
            palavraExibida.append(" ");
        }

        return palavraExibida.toString();
    }

    public static boolean adivinharLetra(char letra, String palavra, boolean[] letrasCorretas) {
        boolean letraCorreta = false;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                letrasCorretas[i] = true;
                letraCorreta = true;
            }
        }

        return letraCorreta;
    }

    public static boolean palavraCompletada(String palavra, boolean[] letrasCorretas) {
        for (boolean correta : letrasCorretas) {
            if (!correta) {
                return false;
            }
        }
        return true;
    }
}
