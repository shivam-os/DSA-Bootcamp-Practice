import java.util.Scanner;

public class FibonacciAtN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nthnum = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count < nthnum) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println("The " + nthnum + "th fibonacci number is: " + b);

    }
}
