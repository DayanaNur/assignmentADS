import java.util.Scanner;
public class Average {
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
        double average = calculateAverage(array, n);
        System.out.println(average);
        scanner.close();
    }

}
/**
 * This method calculate average of elements in array by firs checking if the array is empty.
 * if array is not empty , calculate the sum of elements using 'sumOfElements'.
 * the 'sumOfElements' method is recursive function that calculate the sum of elements in array. It firs check if is only one element in the array, if there is it returns the elements
 * The 'main' method is the entry point of the program. It prompts the user to enter the
 *  number of elements in the array and then enters the elements one by one
 */
