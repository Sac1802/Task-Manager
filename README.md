# Task Manager (Java Console Project)

## 📋 Description
This is a simple **Task Manager** project built in **Java** as part of a learning exercise.  
The application allows users to create, view, and manage tasks from the command line.  
Each task has a title, description, priority, and date, as well as a state represented by an enum.

## 🧩 Features
- Add new tasks
- View the list of tasks
- Change the status of a task
- Use enums to manage task states (`OPEN`, `IN_PROGRESS`, `FINISHED`)
- Display task details using a custom `toString()` method

## 🗂️ Project Structure
```

firstProjectJava/
├── src/
│   ├── Main.java        # Entry point of the application
│   ├── Menu.java        # Handles user interaction and options
│   ├── Task.java        # Represents a task entity with fields and methods
│   └── States.java      # Enum that defines task states
└── README.md

````

## ⚙️ How to Run
1. Make sure you have **Java 17 or higher** installed.
2. Open a terminal in the project directory.
3. Compile the project:

    ```bash
   javac src/*.java
    ```

4. Run the program:

   ```bash
   java -cp src Main
   ```