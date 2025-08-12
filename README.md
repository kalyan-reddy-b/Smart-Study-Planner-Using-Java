# 📚 Smart Study Planner

A **Java console-based application** that helps students organize their study schedule, prioritize topics based on difficulty and deadlines, and generate a daily study plan.  
This project uses **JSON file storage** to persist data between sessions, making it a simple but effective productivity tool for students.

---

## ✨ Features
- ➕ **Add Subjects & Topics** — Include difficulty (1–5) and days until deadline.
- 📋 **View All Topics** — Easily review all saved tasks.
- 🗓 **Generate Study Plan** — Automatically sorts topics by priority.
- 💾 **Persistent Storage** — Data saved to `data.json` so you don’t lose your progress.

---

## 📂 Project Structure
```
SmartStudyPlanner/
 ├── src/
 │   ├── Main.java         # Application entry point
 │   ├── Planner.java      # Core logic for topic management & planning
 │   ├── Subject.java      # Topic/subject data model
 │   └── DataStore.java    # JSON storage handler
 ├── lib/json.jar          # org.json library for JSON handling
 ├── README.md             # Project documentation
 └── data.json             # Auto-created after first run (stores topics)
```

---

## 🚀 How to Run

### 1️⃣ Prerequisites
- **Java 8** or later
- **org.json** library (included in `lib/json.jar`)

### 2️⃣ Compile the Code
Open a terminal/command prompt inside the project folder and run:
```bash
javac -cp lib/json.jar src/*.java
```

### 3️⃣ Run the Application
```bash
java -cp "src;lib/json.jar" Main
```
> 💡 On Mac/Linux, replace `;` with `:` in the classpath.

---

## 🖥 Example Output
```
=== Smart Study Planner ===
1. Add Subject/Topic
2. View All Topics
3. Generate Study Plan
4. Exit
Enter choice: 1
Enter subject name: DSA
Enter topic name: Binary Search
Enter difficulty (1-5): 4
Enter days until deadline: 2
Topic added successfully!

=== Smart Study Planner ===
Enter choice: 3

--- Today's Priority Plan ---
1. DSA - Binary Search (Difficulty: 4, Due in: 2 days)
```

---

## 📌 How It Works
The application calculates a **priority score** for each topic:
```
Priority = (Difficulty × 2) + (10 ÷ (Days Until Deadline + 1))
```
Topics with **higher scores** are shown first in the daily plan.

---

## 🔮 Future Improvements
- 🖼 **GUI version** using Java Swing
- 📤 Export study plans to PDF/Excel
- 🔔 Add notifications/reminders
- 📱 Create an Android version

---

## 🤝 Contributing
1. Fork this repository
2. Create a new branch (`feature-new`)
3. Commit your changes
4. Push to your fork
5. Submit a pull request

---

## 📝 License
This project is licensed under the **MIT License** — feel free to use and modify it.

---

## 🧑‍💻 Author
**Bhumireddy Kalyan Kumar Reddy**  
💌 Email: bhumireddykalyan4@gmail.com  
