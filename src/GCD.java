import java.util.Scanner;
public class GCD {
    /**
     * Time complexity 6(n) where a the first int , b the second int
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
    long startTime = System.nanoTime();
    int GCD = gcd(a , b);
    double elapsedTime = (double) (System.nanoTime() - startTime) / 1000000000;
    System.out.println("Runtime: " + elapsedTime + " seconds" +
            "\nTime complexity: O(n)");
}
}

