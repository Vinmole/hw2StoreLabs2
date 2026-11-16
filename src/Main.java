import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subtotal = 0;
        int items = 0;
        int choice = 0;
        while (choice != 5) {
            System.out.println("===== SIMPLE STORE =====" + '\n' +
                    "1. Mouse - $20" + '\n' +
                    "2. Keyboard - $40" + '\n' +
                    "3. Headphones - $50" + '\n' +
                    "4. Laptop Stand - $30" + '\n' +
                    "5. Checkout" + '\n');
            System.out.print("Choose a product: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }
            String name = "";
            int price = 0;
            if (choice == 1) {
                name = "Mouse";
                price = 20;
            } else if (choice == 2) {
                name = "Keyboard";
                price = 40;
            } else if (choice == 3) {
                name = "Headphones";
                price = 50;
            } else if (choice == 4) {
                name = "Laptop Stand";
                price = 30;
            } else {
                System.out.println("Invalid");
                System.out.println("Please choose a number from 1 to 5");
                continue;
            }

            System.out.println("You selected: " + name);
            System.out.println("Price: $" + price);
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                // Invalid quantity: nothing is added
                System.out.println("Invalid");
                System.out.println("Quantity must be greater than 0");
            } else {
                subtotal = subtotal + price * quantity;
                items = items + quantity;
                System.out.println("Added to cart");
                System.out.println("Current total: $" + subtotal);
            }
        }

        int discount = 0;
        System.out.println("       CHECKOUT      ");
        System.out.println("Items purchased: " + items);
        System.out.println("Subtotal: $" + subtotal);
        if (subtotal >= 100) {
            discount = subtotal / 10; // 10% discount
            System.out.println("You received  10% discount");
        }
        int finalTotal = subtotal - discount;
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);

        //Payment
        int payment = 0;
        while (payment < finalTotal) {
            System.out.print("Enter payment amount: $");
            payment = scanner.nextInt();
            if (payment < finalTotal) {
                System.out.println("Insufficient payment.");
                System.out.println("You  need to pay: $" + (finalTotal - payment));
            }
        }
        System.out.println("Payment successful");

        //Receipt
        int change = payment - finalTotal;
        System.out.println("======================");
        System.out.println(" SIMPLE STORE");
        System.out.println("======================");
        System.out.println("Items purchased: " + items);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);
        System.out.println("Payment: $" + payment);
        System.out.println("Change: $" + change);
        System.out.println("======================");
        System.out.println("Thank you for shopping!");
        System.out.println("======================");
    }
}