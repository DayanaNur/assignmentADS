import java.util.Scanner;
public class CheckDigit {
    /**
     * Checks if all characters in the string are digits recursively.
     * @param s The string to check.
     * @param index The index of the current character being checked.
     * @return True if all characters are digits, false otherwise.
     */
    public static boolean checkDigit(String s , int index){
        //if the index reaches the end of the string, return true
        if(index == s.length())
            return true;
        //check if the character at the current index is a digit
        if(!Character.isDigit(s.charAt(index)))
            return false;
        // check the next character
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
