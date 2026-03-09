package PACKAGE_NAME;

import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Is Palindrome? : false");
        }

        scanner.close();
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
