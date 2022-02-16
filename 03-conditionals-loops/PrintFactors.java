import java.util.Scanner;

public class PrintFactors {

    public static void main(String args[]) {

        // This program prints all the factors of the given number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = input.nextInt();

        System.out.println("Factors of " + num + " are: ");

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(num);
    }
}
