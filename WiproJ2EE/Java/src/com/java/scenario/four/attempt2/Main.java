package com.java.scenario.four.attempt2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem();

        // Adding Employees
        Employee emp1 = new Employee(1, "Alice", "IT");
        Employee emp2 = new Employee(2, "Bob", "HR");
        Employee emp3 = new Employee(3, "Charlie", "Finance");

        taskManagementSystem.addEmployee(emp1);
        taskManagementSystem.addEmployee(emp2);
        taskManagementSystem.addEmployee(emp3);

        // Assigning Tasks
        Task task1 = new Task(101, "Fix server issues", 1, "Pending");
        Task task2 = new Task(102, "Update security patches", 2, "completed");
        Task task3 = new Task(103, "Prepare payroll report", 3, "Pending");
        Task task4 = new Task(104, "Interview new candidates", 2, "Pending");

        taskManagementSystem.assignTask(1, task1);
        taskManagementSystem.assignTask(1, task2);
        taskManagementSystem.assignTask(3, task3);
        taskManagementSystem.assignTask(2, task4);

        // Retrieving task by priority
        Task highestPriorityTask = taskManagementSystem.getTaskByPriority();
        System.out.println("Highest Priority Task: " + highestPriorityTask.getDescription());

        // Retrieving tasks by employee name
        List<Task> aliceTasks = taskManagementSystem.getTasksByEmployeeName("Alice");
        System.out.println("Tasks assigned to Alice:");
        for (Task task : aliceTasks) {
            System.out.println(task.getDescription());
        }

        // Retrieving tasks by department
        List<Task> itTasks = taskManagementSystem.getTasksByDepartment("IT");
        System.out.println("Tasks in IT department:");
        for (Task task : itTasks) {
            System.out.println(task.getDescription());
        }

        // Completing a task
        task1.setStatus("Completed");
        taskManagementSystem.removeCompletedTasks();

        // Displaying pending tasks
        System.out.println("Pending Tasks:");
        for (Task task : taskManagementSystem.getPendingTasks()) {
            System.out.println(task.getDescription());
        }
    }
    
}