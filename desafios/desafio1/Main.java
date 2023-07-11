import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLinhasEntrada = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < numeroLinhasEntrada; i++) {
            int valor = scanner.nextInt();
            numeros.add(valor);
        }

        List<Integer> pares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> impares = numeros.stream()
                .filter(num -> num % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
    }
}
