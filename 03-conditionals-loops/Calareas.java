import java.util.Scanner;
import java.lang.Math;

public class Calareas {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program calculates area of basic geometrical figures.");
        System.out.print(
                "1. Circle \n2. Parallelogram \n3. Rectangle \n4. Rhombus \n5. Triangle \n6. Isosceles Triangle \n7. Equilateral Triangle");
        System.out.print("\nEnter your choice: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1: // For circle
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();
                double result = 3.14 * Math.pow(radius, 2);
                System.out.println("Area: " + result);
                break;

            case 2: // For parallelogram
                System.out.print("Enter the base: ");
                double base = input.nextDouble();
                System.out.print("Enter the height: ");
                double height = input.nextDouble();
                System.out.println("Area: " + base * height);
                break;

            case 3: // For Rectangle
                System.out.print("Enter the length: ");
                double length = input.nextDouble();
                System.out.print("Enter the breadth: ");
                double breadth = input.nextDouble();
                System.out.println("Area: " + length * breadth);
                break;

            case 4: // For Rhombus
                System.out.print("Enter the length of first diagonal: ");
                double d1 = input.nextDouble();
                System.out.print("Enter the lenght of second diagonal: ");
                double d2 = input.nextDouble();
                System.out.println("Area: " + d1 * d2);
                break;

            case 5: // For Triangle
                System.out.print("Enter the base: ");
                double baseT = input.nextDouble();
                System.out.print("Enter the height: ");
                double heightT = input.nextDouble();
                System.out.println("Area: " + baseT * heightT);
                break;

            case 6: // For Isosceles Triangle
                System.out.print("Enter the first side: ");
                double a = input.nextDouble();
                System.out.print("Enter the second side: ");
                double b = input.nextDouble();
                result = b / 2 * (Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2) / 4))));
                System.out.println("Area: " + result);
                break;

            case 7: // For Equilateral Triangle
                System.out.print("Enter the side: ");
                double side = input.nextDouble();
                result = (Math.sqrt(3) / 4) * Math.pow(side, 2);
                System.out.println("Area: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}