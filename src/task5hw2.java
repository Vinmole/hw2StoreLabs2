import java.util.Scanner;

public class task5hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grading System ===");
        System.out.print("Attendance points (0-10): ");
        double attendance = scanner.nextDouble();
        System.out.print("Homework points (0-60): ");
        double homework = scanner.nextDouble();
        System.out.print("Exam points (0-30): ");
        double exam = scanner.nextDouble();

        if (attendance < 0 || attendance > 10
                || homework < 0 || homework > 60
                || exam < 0 || exam > 30) {
            System.out.println("Error: points are out of the allowed range "
                    + "(attendance 0-10, homework 0-60, exam 0-30).");
        } else {
            double total = attendance + homework + exam;

            System.out.println();
            System.out.println("--- Result ---");
            System.out.println("Attendance: " + attendance + " / 10");
            System.out.println("Homework:   " + homework + " / 60");
            System.out.println("Exam:       " + exam + " / 30");
            System.out.println("Total points: " + total + " / 100");

            if (total > 65 && attendance >= 6 && exam >= 17) {
                System.out.println("Status: PASSED");
            } else {
                System.out.println("Status: FAILED");
                if (total <= 65) {
                    System.out.println(" - Total must be more than 65 points.");
                }
                if (attendance < 6) {
                    System.out.println(" - Attendance must be at least 6 points.");
                }
                if (exam < 17) {
                    System.out.println(" - Exam must be at least 17 points.");
                }
            }
        }
    }
}