package com.example.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TaskManager {
    private static final Logger logger = Logger.getLogger(TaskManager.class.getName());
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
        logger.info("Task added.");
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            logger.info("Task " + (i + 1) + ": " + tasks.get(i));
        }
    }

    public void removeTask(int id) {
        if (id > 0 && id <= tasks.size()) {
            tasks.remove(id - 1);
            logger.info("Task removed.");
        } else {
            logger.warning("Invalid task id.");
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("Complete project");
        tm.listTasks();
        tm.removeTask(1);
    }
}