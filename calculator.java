import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Ask for the operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Compute the result based on the operation
        double result = 0;
        switch (operation) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
        // Display the result
        System.out.println("The result is: " + result);
    }
}


















































































	   