import java.util.Scanner;
public class GCD {
    /**
     * Recursive method to find the greatest common divisor (GCD) of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of the two integers.
     */
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

