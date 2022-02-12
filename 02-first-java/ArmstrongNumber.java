import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int lowerlimit = input.nextInt();
        System.out.print("Enter second number: ");
        int upperlimit = input.nextInt();

        System.out.println("Armstrong no. b/w " + lowerlimit + " & " + upperlimit + " are: ");

        // We are assuming that the input numbers will be of 3 digits

        for (int i = lowerlimit; i <= upperlimit; i++) {
            int sum = 0;
            int temp = i;

            // Check armstrong numbers one by one
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}