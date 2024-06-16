import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number ");
            System.out.println(">");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("count digits:"+ getNumberOfDigits(number));
            } else {
                System.out.println("Invalid option. Enter again");
            }
        } while (!(number >= 0));

    }

    public static int getNumberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
