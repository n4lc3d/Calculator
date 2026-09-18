//Imports the scanner class, which the program will use to read user input
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Java Calculator");

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                if (number2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                result = number1 / number2;
                break;

            default:
                System.out.println("Invalid operator.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
