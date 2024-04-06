import java.util.Scanner;
public class GCD {
    public static int gcd(int a , int b){
        if (b == 0){
            return a;
    }
    return gcd(b , a % b);
}
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int a = scanner.nextInt();
        System.out.println();
        int b = scanner.nextInt();
        int result = gcd(a , b);
        System.out.println(result);
        scanner.close();
}
}
/**
 * This method find the GCD of two numbers.
 * If b is 0 , it will return a
 * then calculate gcd
 */
