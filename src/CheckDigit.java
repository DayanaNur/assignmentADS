import java.util.Scanner;
public class CheckDigit {
    public static boolean checkDigit(String s , int index){
        if(index == s.length())
            return true;
        if(!Character.isDigit(s.charAt(index)))
            return false;
        return checkDigit(s , index + 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String s = scanner.nextLine();
        boolean ischeckDigit = checkDigit(s , 0);
        if (ischeckDigit){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();

    }

}
