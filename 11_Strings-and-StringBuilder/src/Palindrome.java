import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string to check : ");
        String str = input.nextLine();

        boolean palindrome = isPalindrome(str);

        if(palindrome)
            System.out.printf("\"%s\" is palindrome",str);
        else
            System.out.printf("%s is not palindrome",str);
    }

    static boolean isPalindrome(String str){
        if(str.isEmpty())return true;

        str = str.toLowerCase();

        int l = str.length();
        boolean palindrome = true;

        for (int i = 0; i < l/2; i++) {
            if(str.charAt(i) != str.charAt(l-i-1)){
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }
}
