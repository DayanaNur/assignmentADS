import java.util.Scanner;
public class Factorial {
    /**
     * Recursive method to calculate the factorial of a number.
     * @param n The number to calculate factorial for.
     * @return The factorial of the given number.
     */

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}
