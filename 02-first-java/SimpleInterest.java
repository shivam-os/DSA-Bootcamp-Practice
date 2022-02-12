import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate Simple Interest!");

        System.out.print("Enter principle amount (P): ");
        double principle = input.nextDouble();

        System.out.print("Enter time in years (T): ");
        double time = input.nextDouble();

        System.out.print("Enter rate (R): ");
        float rate = input.nextFloat();

        double si = (principle * rate * time) / 100;
        System.out.println("Calculated simple interest is: " + si);
    }
}
