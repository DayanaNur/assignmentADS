import java.util.Scanner;
public class Fibonacci {
    /**
     * Recursive method to find the nth Fibonacci number.
     * @param n The position of the Fibonacci number to find.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
        scanner.close();
    }
}
