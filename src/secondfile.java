import java.util.Scanner;

public class secondfile {
    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many palindrome numbers to print: ");
        int count = scanner.nextInt();
        int num = 1, printed = 0;
        System.out.println("Palindrome series:");
        while (printed < count) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
                printed++;
            }
            num++;
        }
        scanner.close();
    }
}