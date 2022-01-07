import java.util.Scanner;

public class Factorial {

    // Problem Statement- Write a program to print factorial of a number, also take
    // input.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programme To Print Factorial Of A Number!");
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        // Calculating Factorial
        int count = num;
        int factorial = 1;
        while (count > 1) {
            factorial *= count;
            count--;
        }
        System.out.print("The factorial of " + num + " is : " + factorial);
    }
}
