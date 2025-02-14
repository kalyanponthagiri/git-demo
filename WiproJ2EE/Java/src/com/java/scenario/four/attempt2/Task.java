package com.java.scenario.four.attempt2;

public class Task {
	
	private int taskID;
	private String description;
	private int priority;
	private String status;
	
	public Task(int taskID, String description, int priority, String status) {
		super();
		this.taskID = taskID;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
