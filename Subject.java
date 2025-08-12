
public class Subject {
    String subjectName;
    String topicName;
    int difficulty;
    int daysUntilDeadline;

    public Subject(String subjectName, String topicName, int difficulty, int daysUntilDeadline) {
        this.subjectName = subjectName;
        this.topicName = topicName;
        this.difficulty = difficulty;
        this.daysUntilDeadline = daysUntilDeadline;
    }

    public double priorityScore() {
        return (difficulty * 2) + (10.0 / (daysUntilDeadline + 1));
    }

    @Override
    public String toString() {
        return subjectName + " - " + topicName + " (Difficulty: " + difficulty +
               ", Due in: " + daysUntilDeadline + " days)";
    }
}
