public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    public static boolean isPalindrome(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);
    }
}