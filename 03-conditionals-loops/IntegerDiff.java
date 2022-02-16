import java.util.Scanner;

public class IntegerDiff {

    public static void main(String args[]) {

        // Find the difference between the product and sum of an integer's digits
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = input.nextInt();

        int temp = num;
        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int digit = temp % 10; // Extracting last digit from integer
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10; // New integer after removing last digit
        }

        System.out.println("Result: " + (product - sum));
    }
}