package Calculadoras.SimpleCalculator;

import java.util.Scanner;

public class SimpleCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number01;
        double number02;
        String operation;
        String continueCalculation;

        System.out.println("Welcome to Soa's Calculator!");
        do {
            // Getting user input
            System.out.print("Enter the first number: ");
            number01 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            number02 = sc.nextDouble();

            System.out.print("Enter the operation you want to perform (+, -, *, /): ");
            operation = sc.next();

            // Performing the chosen operation
            switch (operation) {
                case "+":
                    System.out.printf("Sum: %.2f%n", number01 + number02);
                    break;
                case "-":
                    System.out.printf("Subtraction: %.2f%n", number01 - number02);
                    break;
                case "*":
                    System.out.printf("Multiplication: %.2f%n", number01 * number02);
                    break;
                case "/":
                    if (number02 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.printf("Division: %.2f%n", number01 / number02);
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to perform another calculation? (Yes/No): ");
            continueCalculation = sc.next();

        } while (continueCalculation.equalsIgnoreCase("Yes"));

        System.out.println("Closing the calculator. Thank you for using it!");
        sc.close();
    }
}