package com.ilp03.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.AttendanceFindDAO;
import com.ilp03.entity.Employee;

public class AttendanceFindServiceImpl implements AttendanceFindService {

	@Override
	public void getAllAttendance() {
		Connection connection = AttendanceFindDAO.getConnection();
		ArrayList<Employee> attendanceList = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the minimum attendance required: ");
		int minAttendance = scanner.nextInt();
		scanner.nextLine();
		attendanceList = AttendanceFindDAO.getLessThanMinAttendanceOfEmployees(connection, minAttendance);
		System.out.printf("%-12s\t%-10s\t%-10s\t%-6s\t%-110s\t%-20s\t%-6s%n","Employee No.","First Name","Last Name","Rating","Feedback","Department Name","Attendance %");
		for (Employee employee : attendanceList) {
			System.out.printf("%-12d\t%-10s\t%-10s\t%-6d\t%-110s\t%-20s\t%-6d%n",employee.getEmpNo(),employee.getFirstName(),employee.getLastName(),employee.getPerformance().getRating(),employee.getPerformance().getFeedback(),employee.getDepartment().getName(),employee.getAttendance().getAttendance_count());
	
		}
		AttendanceFindDAO.closeConnection(connection);
	}

	// TODO Auto-generated method stub

}
