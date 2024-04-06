import java.util.Scanner;
public class PrimeCheck {
    /**
     * Checks whether a given number is prime.
     * @param n The number to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n){
        if( n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int n = scanner.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        scanner.close();
    }
}
