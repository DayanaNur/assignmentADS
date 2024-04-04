import java.util.Scanner;
public class PrimeCheck {
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
/**
 * This method checks a given number n is prime or composite.
 * The method check for divisibility by numbers from 2 to sqrt(n). If divisible , it's not prime.
 */
