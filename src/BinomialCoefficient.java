import java.util.Scanner;
public class BinomialCoefficient {
    public static int binomialCoefficient(int n , int k){
        if ( k == 0 || k == n){
            return 1;
        }
        return binomialCoefficient(n - 1 , k - 1) + binomialCoefficient(n - 1 , k);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();
        System.out.println();
        int k = scanner.nextInt();
        int result = binomialCoefficient(n , k );
        System.out.println(result);
        scanner.close();
    }
}
