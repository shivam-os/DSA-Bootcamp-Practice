import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a simple calculator program!");

        // Taking the input of 2 numbers in num1 & num2 variables & opertor in operator
        // variable
        System.out.print("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operator : ");
        String operator = input.next();
        double result = 0;
        // Main calcuator program
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operation!");
        }
        System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is " + result);

    }

}
