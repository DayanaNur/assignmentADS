import java.util.Scanner;
public class Average {
    /**
     * Time complexity 1(n) where n is the number of elements in array
     * Calculates the average of elements in an array.
     * @param arr The array of integers.
     * @param n   The number of elements in the array.
     * @return The average of elements in the array.
     */
    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } // If the array empty , return 0
        int sum = sumOfElements(arr, n);
        return(double) sum / n;
    }

    public static int sumOfElements(int[] arr , int n) {
        if (n == 1) {
            return arr[0];

        }
        return arr[n - 1] + sumOfElements(arr, n - 1);
    }
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long startTime = System.nanoTime();
        double average = sumOfElements(array, n);
        double elapsedTime = (double) (System.nanoTime() - startTime) / 1000000000;

        System.out.println(
                "\nruntime: " + elapsedTime +
                "\ntime complexity: O(n)");

        scanner.close();
    }

}
