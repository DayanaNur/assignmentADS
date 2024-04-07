import java.util.Scanner;
public class BinomialCoefficient {
    /**
     * Time complexity 1(n) where n is the total num , k is num of items
     * this method calculates the binomial coefficient recursively using the formula:
     * C(n, k) = C(n - 1, k - 1) + C(n - 1, k)
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n , int k){
        // if k equals 0 or k equals n, return 1
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
        long startTime = System.nanoTime();
        int BinomialCoefficient = binomialCoefficient(n , k);
        double elapsedTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Runtime: " + elapsedTime + " seconds" +
                "\nTime complexity: O(n)");
    }
}
