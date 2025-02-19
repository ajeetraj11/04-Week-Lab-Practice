package com.annotations.customannotation;

// Defining the class that uses the custom annotation
public class TaskManager {
	// Applying the @TaskInfo annotation to a method
	@TaskInfo(priority = "High", assignedTo = "Ajeet")
	public void completeTask() {
		System.out.println("Task completed");
	}
}

