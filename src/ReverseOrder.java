import java.util.Scanner;
public class ReverseOrder {
    /**
     * Time complexity 5(n) where n is the number of elements in the array
     * Reverses the elements of an array recursively.
     * @param arr The array to be reversed.
     * @param start The starting index of the array.
     * @param end The ending index of the array.
     */
    public static void reverse(int[] arr , int start , int end){
        if (start >= end)
            return;
        // swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr , start + 1 , end - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println();
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");


        }

        scanner.close();
        long startTime = System.nanoTime();
        reverse(arr , 0 , n-1);
        double elapsedTime = (double) (System.nanoTime() - startTime) / 1000000000;

        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nRuntime: " + elapsedTime + " seconds" +
                "\nTime complexity: O(n)");
    }

}
