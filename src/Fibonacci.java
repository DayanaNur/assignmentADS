import java.awt.*;
import java.util.Scanner;
public class Fibonacci {
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
/**
 * this method find fibonacci sequence
 * F0 = 0 , F1 = 1
 * recursive call to find Fn-1 and Fn-2
 */
