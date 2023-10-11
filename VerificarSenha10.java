import java.util.Scanner;

public class VerificarSenha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma senha
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        // Verifica se a senha atende aos critérios
        boolean senhaValida = verificarSenha(senha);

        // Imprime o resultado
        if (senhaValida) {
            System.out.println("Resultado: A senha é válida.");
        } else {
            System.out.println("Resultado: A senha é inválida. A senha deve conter pelo menos 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula e pelo menos um número.");
        }

        // Fecha o scanner
        scanner.close();
    }

    // Função para verificar se uma senha atende aos critérios especificados
    public static boolean verificarSenha(String senha) {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        boolean temLetraMaiuscula = false;
        boolean temLetraMinuscula = false;
        boolean temNumero = false;

        // Itera sobre cada caractere da senha
        for (char caractere : senha.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                temLetraMaiuscula = true;
            } else if (Character.isLowerCase(caractere)) {
                temLetraMinuscula = true;
            } else if (Character.isDigit(caractere)) {
                temNumero = true;
            }
        }

        // Retorna true se a senha atender a todos os critérios
        return temLetraMaiuscula && temLetraMinuscula && temNumero;
    }
}
