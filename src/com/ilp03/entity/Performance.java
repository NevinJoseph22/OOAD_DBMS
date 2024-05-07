package com.ilp03.entity;

import java.sql.Date;

public class Performance {
	private int performanceId;
	private int employeeId;
	private Date date;
	private int rating;
	private String feedback;
	private int evaluatorId;
	public Performance(int performanceId, int employeeId, Date date, int rating, String feedback, int evaluatorId) {
		super();
		this.performanceId = performanceId;
		this.employeeId = employeeId;
		this.date = date;
		this.rating = rating;
		this.feedback = feedback;
		this.evaluatorId = evaluatorId;
	}
	public int getPerformanceId() {
		return performanceId;
	}
	public void setPerformanceId(int performanceId) {
		this.performanceId = performanceId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getEvaluatorId() {
		return evaluatorId;
	}
	public void setEvaluatorId(int evaluatorId) {
		this.evaluatorId = evaluatorId;
	}
	
	
}
