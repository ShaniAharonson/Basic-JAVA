import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number ");
            System.out.println(">");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Not a positive number");
                continue;
            }
            if (isPalindrome(number)) {
                System.out.println("Palindrome number");
                break;
            } else {
                System.out.println("Not a palindrome number... let's make it palindrome:");
                System.out.println(makePalindrome(number));
                return;
            }
        } while (true);


    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int palindrome = 0;
        while (number != 0) {
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number /= 10;
        }
        return originalNumber == palindrome;
    }

    public static int makePalindrome(int number) {
        while (!isPalindrome(number)) {
            int reversed = reverseNumber(number);
            System.out.println(number += reversed);
        }
        return number;
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}
