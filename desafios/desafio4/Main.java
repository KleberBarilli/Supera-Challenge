package desafios.desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String decifrada = decifrarLinha(linha);
            System.out.println(decifrada);
        }
    }

    public static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        StringBuilder decifrada = new StringBuilder(tamanho);

        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            decifrada.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            decifrada.append(linha.charAt(i));
        }

        return decifrada.toString();
    }
}
