import java.util.Scanner;

public class PalindromeNums {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Enter the digit to find: ");
        int digit = input.nextInt();

        // Counting the number of digits
        int count = 0;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 == digit) {
                count++;
            }
        }

    }
}
