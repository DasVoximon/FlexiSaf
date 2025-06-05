import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Detect if user input is an even or odd number

        try {
            System.out.print("Enter a number: ");
            int input = sc.nextInt();

            if (input % 2 == 0) {
                System.out.println("You just inputed an even number");
            }
            if (input % 2 != 0){
                System.out.println("The number is an odd number");
            }

        } catch (InputMismatchException e) {
            System.err.println("Must be an Integer");
        }

    }

}