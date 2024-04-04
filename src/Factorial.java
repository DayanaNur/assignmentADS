import java.util.Scanner;
public class Factorial {
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
/**
 * This method find factorial of n.
 * Factorial of n and 1 equal to 1.
 * Recursive call to calculate factorial of (n-1)
 */
