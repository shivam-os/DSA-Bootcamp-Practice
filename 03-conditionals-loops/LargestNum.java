import java.util.Scanner;

public class LargestNum {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int userChoice;
        int sum = 0;
        int large = 0;

        do {
            System.out.print("Enter 0 or a number: ");
            userChoice = input.nextInt();
            sum = sum + userChoice; // Adds all the user inputs

            // Compares the user input for largest number
            if (userChoice > large) {
                large = userChoice;
            }
        } while (userChoice != 0);

        System.out.println("The largest number entered: " + large);
        System.out.println("The sum of all entered numbers is: " + sum);
    }
}
