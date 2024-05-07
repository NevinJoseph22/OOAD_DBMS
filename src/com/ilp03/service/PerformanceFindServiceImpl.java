package com.ilp03.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.PerformanceFindDAO;
import com.ilp03.entity.Employee;

public class PerformanceFindServiceImpl implements PerformanceFindService {

	@Override
	public void getAllEmployee() {
		Connection connection = PerformanceFindDAO.getConnection();
		ArrayList<Employee> employeeList = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the department name: ");
		String departmentName = scanner.nextLine();
		employeeList = PerformanceFindDAO.getPerformanceOfEmployeesInADepartment(connection, departmentName);
		System.out.printf("%-12s\t%-10s\t%-10s\t%-15s\t%-6s\t%s%n","Employee No.","First Name","Last Name","Date Of Entry","Rating","Feedback ");
		for(Employee employee : employeeList)
		{
			System.out.printf("%-12d\t%-10s\t%-10s\t%-15s\t%-6d\t%s%n",employee.getEmpNo(),employee.getFirstName(),employee.getLastName(),employee.getPerformance().getDate(),employee.getPerformance().getRating(),employee.getPerformance().getFeedback());
		}
		PerformanceFindDAO.closeConnection(connection);
	}

}
