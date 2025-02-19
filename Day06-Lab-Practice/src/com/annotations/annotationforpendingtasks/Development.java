package com.annotations.annotationforpendingtasks;

// Defining a class that uses the @Todo annotation
public class Development {
	// Applying the @Todo annotation to a pending feature
	@Todo(task = "Implement signup autherization", assignedTo = "Ajeet Raj", priority = "HIGH")
	public void signupFeature() {
		System.out.println("signup feature is under development");
	}

	// Applying the @Todo annotation to another pending feature
	@Todo(task = "Optimize database queries", assignedTo = "Ajeet Pandey", priority = "MEDIUM")
	public void databaseOptimization() {
		System.out.println("Database optimization is under development");
	}
}

