import java.util.Scanner;

public class Prime {

    static void printPrimes(int a, int b) {

        for (int i = a; i <= b; i++) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("The prime numbers b/w the above numbers are: ");
        printPrimes(num1, num2);
    }

}
