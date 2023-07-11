package desafios.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");

        for (int i = 0; i < notas.length; i++) {
            int quantidade = (int) (valor / notas[i]);
            valor %= notas[i];

            System.out.println(quantidade + " nota(s) de R$ " + notas[i] + ".00");
        }

        System.out.println("MOEDAS:");

        int valorEmCentavos = (int) Math.round(valor * 100);

        for (int i = 0; i < moedas.length; i++) {
            int quantidade = valorEmCentavos / moedas[i];
            valorEmCentavos %= moedas[i];

            System.out.println(quantidade + " moeda(s) de R$ " + moedas[i] / 100.0);
        }
    }
}
