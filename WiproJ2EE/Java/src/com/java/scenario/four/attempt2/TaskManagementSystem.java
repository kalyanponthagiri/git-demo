package com.java.scenario.four.attempt2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskManagementSystem {
	
	private HashMap<Integer, Employee> employeeMap = new HashMap<>();
	private HashMap<Integer, List<Task>> taskMap = new HashMap<>();
	private PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
	private LinkedList<Task> pendingTasks = new LinkedList<>();
	
	public void addEmployee(Employee data) {
		employeeMap.put(data.getID(), data);
	}
	
	public void assignTask(int employeeID, Task task) {
		if(!employeeMap.containsKey(employeeID)) {
			System.out.println("Employee ID not found");
			return;
		}
		
		taskMap.putIfAbsent(employeeID, new ArrayList<>());
		taskMap.get(employeeID).add(task);
		taskQueue.offer(task);
		
		if (!task.getStatus().equalsIgnoreCase("completed")) {
            pendingTasks.add(task);
        }
	}
	
	public Task getTaskByPriority() {
        return taskQueue.peek();
    }
	
	public List<Task> getTasksByEmployeeName(String name) {
        List<Task> tasks = new ArrayList<>();
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(name)) {
                tasks.addAll(taskMap.getOrDefault(entry.getKey(), new ArrayList<>()));
            }
        }
        return tasks;
    }

    public List<Task> getTasksByDepartment(String department) {
        List<Task> tasks = new ArrayList<>();
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if (entry.getValue().getDepartment().equalsIgnoreCase(department)) {
                tasks.addAll(taskMap.getOrDefault(entry.getKey(), new ArrayList<>()));
            }
        }
        return tasks;
    }

    public void removeCompletedTasks() {
        Iterator<Task> iterator = pendingTasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getStatus().equalsIgnoreCase("completed")) {
                iterator.remove();
                taskQueue.remove(task);
            }
        }
    }

    public List<Task> getPendingTasks() {
        return new ArrayList<>(pendingTasks);
    }
}
