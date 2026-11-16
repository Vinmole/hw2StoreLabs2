import java.util.Scanner;
public class task6hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Monthly income: ");
        double income = scanner.nextDouble();
        System.out.print("Credit score (0-100): ");
        int creditScore = scanner.nextInt();
        System.out.print("Years at current job: ");
        double yearsAtJob = scanner.nextDouble();
        System.out.print("Existing debt (true/false): ");
        boolean hasDebt = scanner.nextBoolean();

        boolean ageOk = age >= 21 && age <= 65;
        boolean incomeOk = income >= 30000;
        boolean creditOk = creditScore >= 70;
        boolean stabilityOk = yearsAtJob >= 2 || !hasDebt;

        System.out.println();
        System.out.println("Age requirement: " + (ageOk ? "✅" : "❌"));
        System.out.println("Income requirement: " + (incomeOk ? "✅" : "❌"));
        System.out.println("Credit score requirement: " + (creditOk ? "✅" : "❌"));
        System.out.println("Job/debt requirement: " + (stabilityOk ? "✅" : "❌"));

        if (ageOk && incomeOk && creditOk && stabilityOk) {
            System.out.println("Result: Loan Approved ✅");
        } else {
            System.out.println("Result: Loan Rejected ❌");
        }
        scanner.close();
    }
}