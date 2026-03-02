import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = input.nextLine();
        String reversed = "";
        boolean isPalindrome;

        System.out.println("Input Text: " + str);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (str.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        input.close();
    }
}