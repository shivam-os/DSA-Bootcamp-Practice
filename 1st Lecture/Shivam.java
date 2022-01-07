import java.util.Scanner; //Importing the file which contains Scanner class

//Main class of the java file is named sames as the file name. Also, this main class has to be public. The convention is to write the classes with their first letter as capital
public class Shivam {
    public static void main(String[] args) {
        System.out.println("This is a simple program!");

        System.out.print("Enter your number : ");

        Scanner input = new Scanner(System.in);

        int rollno = input.nextInt();

        System.out.println("Your roll number is : " + rollno);
    }
}