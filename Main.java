
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planner planner = new Planner();
        planner.loadData();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Smart Study Planner ===");
            System.out.println("1. Add Subject/Topic");
            System.out.println("2. View All Topics");
            System.out.println("3. Generate Study Plan");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    planner.addTopic();
                    break;
                case 2:
                    planner.viewTopics();
                    break;
                case 3:
                    planner.generatePlan();
                    break;
                case 4:
                    planner.saveData();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
