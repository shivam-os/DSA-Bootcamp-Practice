import java.util.Scanner;

public class Triplets {

    static boolean checkTriplets(int n1, int n2, int n3) {
        if ((n1 * n1 + n2 * n2 == n3 * n3) || (n1 * n1 + n3 * n3 == n2 * n2) || (n3 * n3 + n2 * n2 == n1 * n1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (checkTriplets(num1, num2, num3)) {
            System.out.println("The above no.s are pythagorean triplets!");
        } else {
            System.out.println("Sorry! The above no.s are not pythagorean triplets!");
        }
    }

}
