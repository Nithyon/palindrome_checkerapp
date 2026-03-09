import java.util.LinkedList;
import java.util.Queue;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        Queue<Character> queue = new LinkedList<>();
        String reversed = "";

        // Push into queue in reverse traversal
        for (int i = input.length() - 1; i >= 0; i--) {
            queue.offer(input.charAt(i));
        }

        // Build reversed string from queue
        while (!queue.isEmpty()) {
            reversed = reversed + queue.poll();
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
