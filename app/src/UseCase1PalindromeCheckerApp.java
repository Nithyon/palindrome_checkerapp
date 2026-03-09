public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        // Basic hardcoded input
        String input = "madam";

        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
