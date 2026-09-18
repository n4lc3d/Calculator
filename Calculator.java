//imports the scanner class, which the program will use to read user input
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
       //declares variable scanner to read input
    
       Scanner scanner = new Scanner(System.in);

       //texts the title after the program is started
      System.out.println("Simple Java Calculator");

      //prints the prompt for the first user input and saves it as number1 (double means numerical)
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        //asks for the number operation and stores it (char stores just one character, which is the operator here)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        //prints the prompt for the second user input and saves it as number2 (double means numerical)
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

       //creates the variable result, which will be created from the interactions between the first 2 numbers and the case of the operation (or char)
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

         //the scanner resets if the operator wasn't an option
                default:
                System.out.println("Invalid operator.");
                scanner.close();
                return;
        }

        //the system prints out the result based on the value of its variable
        System.out.println("Result: " + result);

        scanner.close();
    }
}
