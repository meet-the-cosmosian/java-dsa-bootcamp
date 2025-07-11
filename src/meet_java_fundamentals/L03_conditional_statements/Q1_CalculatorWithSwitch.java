// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

package meet_java_fundamentals.L03_conditional_statements;

import java.util.*;

public class Q1_CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number(a): ");
        double a = sc.nextDouble();
        System.out.println("Enter second number(b): ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: ");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Remainder (%)");
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The result of " + a + " + " + b + " is: " + (a + b));
                break;
            case 2:
                System.out.println("The result of " + a + " - " + b + " is: " + (a - b));
                break;
            case 3:
                System.out.println("The result of " + a + " * " + b + " is: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("The result of " + a + " / " + b + " is: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("The result of " + a + " % " + b + " is: " + (a % b));
                } else {
                    System.out.println("Error: Remainder by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    }  
}
