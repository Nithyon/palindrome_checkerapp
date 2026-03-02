class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Create linked list from string
        Node head = null;
        Node tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Check palindrome using two pointers
        boolean isPalindrome = true;

        Node start = head;
        Node end;

        while (start != null) {

            end = head;
            while (end.next != null) {
                end = end.next;
            }

            if (start.data != end.data) {
                isPalindrome = false;
                break;
            }

            // Move start forward
            start = start.next;

            // Remove last node
            Node temp = head;
            while (temp.next != end) {
                temp = temp.next;
            }
            temp.next = null;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}