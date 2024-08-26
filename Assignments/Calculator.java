package Assignments;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input an operator
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform the operation based on the operator using a switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':

                //Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;

            case '%':

                //Check for division by zero
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;

            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, /, or %.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}




