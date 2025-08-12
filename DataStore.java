
import java.io.*;
import java.util.*;
import org.json.*;

public class DataStore {
    private String filename;

    public DataStore(String filename) {
        this.filename = filename;
    }

    public void save(List<Subject> topics) {
        JSONArray arr = new JSONArray();
        for (Subject s : topics) {
            JSONObject obj = new JSONObject();
            obj.put("subjectName", s.subjectName);
            obj.put("topicName", s.topicName);
            obj.put("difficulty", s.difficulty);
            obj.put("daysUntilDeadline", s.daysUntilDeadline);
            arr.put(obj);
        }
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(arr.toString(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Subject> load() {
        List<Subject> topics = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) return topics;
        try {
            String content = new String(java.nio.file.Files.readAllBytes(file.toPath()));
            JSONArray arr = new JSONArray(content);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                topics.add(new Subject(
                        obj.getString("subjectName"),
                        obj.getString("topicName"),
                        obj.getInt("difficulty"),
                        obj.getInt("daysUntilDeadline")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return topics;
    }
}
