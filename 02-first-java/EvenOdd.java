import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Input will be taken from Keyboard
        System.out.println("This program will tell whether a number is even/odd/zero!");

        System.out.print("Enter a number : ");
        int num = input.nextInt(); // Takes the input in the num variable for int data type

        if (num == 0) {
            System.out.println("This is Zero.");
        } else if (num % 2 == 0) {
            // Checks even no. by dividing by 2 and seeing if the remainder is zero
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }
    }

}
