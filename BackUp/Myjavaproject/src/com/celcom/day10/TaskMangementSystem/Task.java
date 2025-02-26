package com.celcom.day10.TaskMangementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
	private String taskName;
	private LocalDateTime datetime;
	private boolean completed;

	public Task(String taskName, LocalDateTime datetime) {
		super();
		this.taskName = taskName;
		this.datetime = datetime;
		this.completed = false;
	}

	public String getTaskName() {
		return taskName;
	}
  
	  public String getFormattedDatetime() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm - dd/MM/yyyy");
	        return this.datetime.format(formatter);
	    }
	public void markCompleted() {
		this.completed = true;
	}

	@Override
	public String toString() {
		return this.taskName + " - " + getFormattedDatetime() + " - " + (this.completed ? " Completed " : " Not Completed");
	}

}
