package desafios.desafio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = num - k;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            int complement2 = num + k;
            if (map.containsKey(complement2)) {
                count += map.get(complement2);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
