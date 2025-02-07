package com.java.scenario.four.attempt1;

public class Task {
	
	private int taskId;
	private String description;
	private int priority;
	private String status;
	
	public Task(int taskId, String description, int priority, String status) {
		super();
		this.taskId = taskId;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
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
	
	@Override
	public String toString() {
		return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
	}
}
