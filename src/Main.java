import java.util.Scanner;

public class Main {
    /**
     * Finds the minimum element in an array recursively.
     * @param arr The array of integers.
     * @param n   The number of elements in the array.
     * @return The minimum element in the array.
     */
     public static int findMinimum(int[] arr, int n) {
            if (n == 1)
                return arr[0];
            int minOfRest = findMinimum(arr, n - 1);
            return Math.min(minOfRest, arr[n - 1]);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print(" ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println(n);
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int min = findMinimum(array, n);
            System.out.println(min);

            scanner.close();
        }
    }
