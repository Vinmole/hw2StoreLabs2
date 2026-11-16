import java.util.Scanner;

public class Studytracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weeklygoal = 600;
        int program= 0;
        int math = 0;
        int eng = 0;
        int other = 0;
        int Totaltime = 0;
        int sessions = 0;

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("===== STUDY TRACKER =====");
            System.out.println("1. Add study session");
            System.out.println("2. View statistics");
            System.out.println("3. Check weekly goal");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println();
                System.out.println("Choose subject:");
                System.out.println("1. Programming");
                System.out.println("2. Mathematics");
                System.out.println("3. English");
                System.out.println("4. Other");
                System.out.print("Choose an option: ");
                int subject = scanner.nextInt();

                if (subject < 1 || subject > 4) {
                    System.out.println("Invalid subject. Choose a number from 1 to 4.");
                } else {
                    System.out.print("Study time in minutes: ");
                    int minutes = scanner.nextInt();

                    if (minutes <= 0) {
                        System.out.println("Invalid study time. Time must be greater than 0.");
                    } else {
                        if (subject == 1) {
                            program += minutes;
                        } else if (subject == 2) {
                            math += minutes;
                        } else if (subject == 3) {
                            eng += minutes;
                        } else {
                            other += minutes;
                        }
                        Totaltime += minutes;
                        sessions++;

                        System.out.println("Study session added!");
                        System.out.println("Current total study time: " + Totaltime + " minutes");
                    }
                }
            } else if (choice == 2) {
                System.out.println();
                System.out.println("===== WEEKLY STATISTICS =====");
                System.out.println("Study sessions: " + sessions);
                System.out.println("Total study time: " + Totaltime + " minutes");
                System.out.println("Programming: " + program + " minutes");
                System.out.println("Mathematics: " + math + " minutes");
                System.out.println("English: " + eng + " minutes");
                System.out.println("Other: " + other + " minutes");
            } else if (choice == 3) {
                System.out.println();
                System.out.println("Weekly goal: " + weeklygoal + " minutes");
                System.out.println("You studied: " + Totaltime + " minutes");
                if (Totaltime >= weeklygoal) {
                    System.out.println("Weekly goal achieved!");
                } else {
                    System.out.println("Remaining: " + (weeklygoal - Totaltime) + " minutes");
                }
            } else if (choice == 4) {
                System.out.println("Study tracker closed. Keep up the good work!");
                running = false;
            } else {
                System.out.println("Invalid option. Choose a number from 1 to 4.");
            }
        }
    }
}
