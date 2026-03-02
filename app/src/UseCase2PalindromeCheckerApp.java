public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check palindrome condition
        if (text.equals(reversed)) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }

        // Program ends automatically
    }
}
