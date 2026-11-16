import java.util.Scanner;

public class Screentimetracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int socialMedia = 0;
        int gaming = 0;
        int studying = 0;
        int streaming = 0;
        int totalScreenTime = 0;
        int sessions = 0;

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("===== SCREEN-TIME TRACKER =====");
            System.out.println("1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                String categoryName;
                if (choice == 1) {
                    categoryName = "social media";
                } else if (choice == 2) {
                    categoryName = "gaming";
                } else if (choice == 3) {
                    categoryName = "studying";
                } else {
                    categoryName = "video or streaming";
                }

                System.out.print("Enter " + categoryName + " minutes: ");
                int minutes = scanner.nextInt();

                if (minutes <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    if (choice == 1) {
                        socialMedia += minutes;
                    } else if (choice == 2) {
                        gaming += minutes;
                    } else if (choice == 3) {
                        studying += minutes;
                    } else {
                        streaming += minutes;
                    }
                    totalScreenTime += minutes;
                    sessions++;
                    System.out.println("Time added successfully!");
                }
            } else if (choice == 5) {
                int entertainmentTime = socialMedia + gaming + streaming;

                System.out.println();
                System.out.println("===== TODAY'S SCREEN TIME =====");
                System.out.println("Social media: " + socialMedia + " minutes");
                System.out.println("Gaming: " + gaming + " minutes");
                System.out.println("Studying: " + studying + " minutes");
                System.out.println("Streaming: " + streaming + " minutes");
                System.out.println("Total screen time: " + totalScreenTime + " minutes");
                System.out.println("Recorded sessions: " + sessions);
                System.out.println();

                if (studying > entertainmentTime) {
                    System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
                } else if (entertainmentTime > studying) {
                    System.out.println("Entertainment screen time is greater than study time.");
                } else {
                    System.out.println("Study and entertainment screen time are equal.");
                }

                if (totalScreenTime < 120) {
                    System.out.println("Low screen time");
                } else if (totalScreenTime <= 240) {
                    System.out.println("Moderate screen time");
                } else {
                    System.out.println("High screen time");
                }
            } else if (choice == 6) {
                System.out.println("Screen-time tracker closed.");
                running = false;
            } else {
                System.out.println("Invalid option. Choose a number from 1 to 6.");
            }
        }
        scanner.close();
    }
}