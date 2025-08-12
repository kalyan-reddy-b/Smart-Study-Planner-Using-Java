
import java.util.*;
import java.io.*;

public class Planner {
    private List<Subject> topics = new ArrayList<>();
    private DataStore store = new DataStore("data.json");
    private Scanner sc = new Scanner(System.in);

    public void addTopic() {
        System.out.print("Enter subject name: ");
        String name = sc.nextLine();
        System.out.print("Enter topic name: ");
        String topic = sc.nextLine();
        System.out.print("Enter difficulty (1-5): ");
        int diff = sc.nextInt();
        System.out.print("Enter days until deadline: ");
        int days = sc.nextInt();
        sc.nextLine();

        topics.add(new Subject(name, topic, diff, days));
        System.out.println("Topic added successfully!");
    }

    public void viewTopics() {
        if (topics.isEmpty()) {
            System.out.println("No topics found.");
            return;
        }
        System.out.println("\n--- All Topics ---");
        for (Subject s : topics) {
            System.out.println(s);
        }
    }

    public void generatePlan() {
        if (topics.isEmpty()) {
            System.out.println("No topics to plan.");
            return;
        }
        topics.sort((a, b) -> Double.compare(b.priorityScore(), a.priorityScore()));
        System.out.println("\n--- Today's Priority Plan ---");
        for (int i = 0; i < topics.size(); i++) {
            System.out.println((i+1) + ". " + topics.get(i));
        }
    }

    public void saveData() {
        store.save(topics);
    }

    public void loadData() {
        topics = store.load();
    }
}
