import java.util.Scanner;

public class task7hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total purchase amount ($): ");
        double amount = scanner.nextDouble();
        System.out.print("Premium member (true/false): ");
        boolean premium = scanner.nextBoolean();
        System.out.print("Number of previous orders: ");
        int previousOrders = scanner.nextInt();
        System.out.print("Has discount coupon (true/false): ");
        boolean coupon = scanner.nextBoolean();
        System.out.print("Birthday month (true/false): ");
        boolean birthday = scanner.nextBoolean();

        int discountPercent;

        // Check from the biggest discount to the smallest
        if (amount >= 200 && premium && (coupon || birthday)) {
            discountPercent = 20;
        } else if (amount >= 150 && (premium || previousOrders >= 10)) {
            discountPercent = 15;
        } else if (amount >= 100 && coupon) {
            discountPercent = 10;
        } else {
            discountPercent = 0;
        }

        double discountAmount = amount * discountPercent / 100.0;
        double finalPrice = amount - discountAmount;

        System.out.println();
        System.out.println("Original price: $" + amount);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Final price: $" + finalPrice + (discountPercent > 0 ? " 🎉" : ""));
        scanner.close();
    }
}
