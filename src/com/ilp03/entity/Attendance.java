package com.ilp03.entity;

import java.sql.Time;

public class Attendance {
	private int attendanceId;
	private int employeeId;
	private Time timeIn;
	private Time timeOut;
	private int attendance_count;
	private int createdById;
	public Attendance(int attendanceId, int employeeId,Time timeIn,Time timeOut, int attendance_count,
			int createdById) {
		super();
		this.attendanceId = attendanceId;
		this.employeeId = employeeId;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.attendance_count = attendance_count;
		this.createdById = createdById;
	}
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Time getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(Time timeIn) {
		this.timeIn = timeIn;
	}
	public Time getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(Time timeOut) {
		this.timeOut = timeOut;
	}
	public int getAttendance_count() {
		return attendance_count;
	}
	public void setAttendance_count(int attendance_count) {
		this.attendance_count = attendance_count;
	}
	public int getCreatedById() {
		return createdById;
	}
	public void setCreatedById(int createdById) {
		this.createdById = createdById;
	}
	
}
