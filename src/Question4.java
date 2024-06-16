import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number ");
            System.out.println(">");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("is Palindrome? "+ isPalindrome(number));
            } else {
                System.out.println("Invalid option. Enter again");
            }
        } while (!(number >= 0));
    }
    public static boolean isPalindrome (int number){
        int originalNumber = number;
        int palindrome = 0;
        while (number != 0) {
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number /= 10;
        }
        return originalNumber == palindrome;

    }
}
