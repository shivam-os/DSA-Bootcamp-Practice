import java.util.Scanner;

public class MaxAndMin {

    static int maxnum(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }

        return max;
    }

    static int minnum(int n1, int n2, int n3) {
        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }

        return min;
    }

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int max = maxnum(num1, num2, num3);
        System.out.println("The maximum no. out of 3 is: " + max);
        int min = minnum(num1, num2, num3);
        System.out.println("The minimum no. out of 3 is: " + min);

    }

}
