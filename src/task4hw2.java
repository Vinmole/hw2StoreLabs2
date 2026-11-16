import java.util.Scanner;

public class task4hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Choose operation: addition (+), subtraction (-), multiplication (*), division (/)");
        System.out.print("Your choice (name or symbol): ");
        String op = scanner.next().trim().toLowerCase();

        if (op.equals("addition") || op.equals("+")) {
            System.out.println("Operation: Addition");
            System.out.println("Result: " + a + " + " + b + " = " + (a + b));
        } else if (op.equals("subtraction") || op.equals("-")) {
            System.out.println("Operation: Subtraction");
            System.out.println("Result: " + a + " - " + b + " = " + (a - b));
        } else if (op.equals("multiplication") || op.equals("*")) {
            System.out.println("Operation: Multiplication");
            System.out.println("Result: " + a + " * " + b + " = " + (a * b));
        } else if (op.equals("division") || op.equals("/")) {
            System.out.println("Operation: Division");
            if (b == 0) {
                System.out.println("Warning: division by zero is not allowed!");
            } else {
                System.out.println("Result: " + a + " / " + b + " = " + (a / b));
            }
        } else {
            System.out.println("Warning: operation \"" + op + "\" does not exist!");
        }
        scanner.close();
    }
}