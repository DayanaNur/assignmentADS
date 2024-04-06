import  java.util.Scanner;
public class PowerOf {
    /**
     * Recursive method to calculate the power of an integer.
     * @param a The base integer.
     * @param n The exponent integer.
     * @return The result of raising 'a' to the power of 'n'.
     */
    public static int power(int  a , int n){
        if (n == 0)
            return 1;
        else if (n < 0)
            return 1 / power(a , n);
        else
            return a * power(a , n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int result = power(a , n);
        System.out.println(result);
        scanner.close();
    }
}

