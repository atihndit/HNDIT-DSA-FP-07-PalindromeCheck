import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheck {

    // Function to check if a number is palindrome using a stack
    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (char ch : numStr.toCharArray()) {
            stack.push(ch);
        }

        // Use linear search to check if the number is a palindrome
        for (char ch : numStr.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean result = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);

        scanner.close();
    }
}
