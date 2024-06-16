import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int natural;
        do {
            System.out.println("Enter a positive number ");
            System.out.println(">");
            natural = scanner.nextInt();
            if (natural > 0) {
                System.out.println("The opposite number is: "+ getReverseNatural(natural));
            } else {
                System.out.println("Not a positive number");
            }
        } while (!(natural > 0));


    }

    public static int getReverseNatural(int natural) {
        int reversed = 0;
        while (natural != 0) {
            int digit = natural % 10;
            reversed = reversed * 10 + digit;
            natural /= 10; //12 //1
        }
        return reversed;
    }
}