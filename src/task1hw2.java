
import java.util.Scanner;
public class task1hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        double greatest;
        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }

        System.out.println("The greatest number is: " + greatest);
        scanner.close();
    }
}