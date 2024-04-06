import java.util.Scanner;

public class Main {
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
    /**
 *  The 'Main' class contains two methods: 'findMinimum' and 'main'.
 *  The 'findMinimum' method is a recursive function that finds the minimum element in an array. It takes an array 'arr' and the number of elements 'n' as parameters.
 *  The 'main' method is the entry point of the program. It prompts the user to enter
 *  the number of elements in the array and then enters the elements one by one.
 */