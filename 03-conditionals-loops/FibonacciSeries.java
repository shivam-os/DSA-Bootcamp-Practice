import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till we've to print Fibonacci series: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.println("The generated Fibonacci series is: ");

        while (a <= num) {
            System.out.print(" " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}