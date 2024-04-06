import java.util.Scanner;
public class ReverseOrder {
    public static void reverse(int[] arr , int start , int end){
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr , start + 1 , end - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println();
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        reverse(arr , 0 , n-1);
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        scanner.close();
    }

}
