import java.util.Scanner;
import java.util.InputMismatchException;

public class Calc {

	private static Scanner sc = new Scanner(System.in);
	private static int result;

	public static void main(String[] args) {
        System.out.println("Calculator by Das Voximon");
        System.out.println("1.Basic Calculator");
        System.out.println("2.Scientific Calculator");
        System.out.println("3.Currency Converter");

        System.out.print("Select an option: ");
        int choose =  sc.nextInt();

        switch (choose) {
            case 1:
                basicCalc();
                break;
            case 2:
                sciCalc();
                break;
            default:
                System.err.println("Other Calculators are currently not available");
        }

	}

	private static void basicCalc() {
        try {
        	System.out.println("A basic Calculator");
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Basic Operator(+,-,*,/): ");
            String opn = sc.next();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (opn) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                	result = num1 - num2;
                	break;
                case "*":
                	result = num1 * num2;
                	break;
                case "/":
                	result = num1/num2;
                	break;
                default:
                	System.out.println("Not part of basic Operator");
            }
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Input must be an Integer");
        }
    }

    private static void sciCalc() {

        System.out.println("Sorry, nothing here yet");
    }

}