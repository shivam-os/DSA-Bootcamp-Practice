import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This program will greet you!");
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Hi! " + name + " Have a nice day!");

    }

}
