import java.util.Scanner;

public class fact {

    static int factorial(int n) {
        int prod = 1;

        if (n == 1 || n == 0) {
            prod = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                prod = prod * i;
            }
        }

        return prod;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Eneter a number to find factorial of: ");
        int num = input.nextInt();

        System.out.println("The factorial of " + num + " is: " + factorial(num));
    }

}
