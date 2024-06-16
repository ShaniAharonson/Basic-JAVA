import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number ");
            System.out.println(">");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("To array:"+Arrays.toString(naturalToArray(number)));
            } else {
                System.out.println("Invalid option. Enter again");
            }
        } while (!(number >= 0));

    }

    public static int[] naturalToArray(int number) {
        String myNum = Integer.toString(number);
        int[] array = new int[myNum.length()];
        while (number != 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                array[i] = number % 10;
                number /= 10;
            }
        }
        return array;
    }
}

