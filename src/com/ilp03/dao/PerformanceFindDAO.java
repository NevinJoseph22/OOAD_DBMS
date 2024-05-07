package com.ilp03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.entity.Department;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Performance;

public class PerformanceFindDAO {
	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/remotework_db?useSSL=false";
		String userName = "root";
		String password = "Kaithathara@123!";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Employee> getPerformanceOfEmployeesInADepartment(Connection connection, String departmentName) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
//		Statement statement;
		try {
			
			PreparedStatement preparedStatement= connection.prepareStatement("SELECT * from employee  INNER JOIN performance  ON employee.emp_no = performance.employeeID INNER JOIN department  ON employee.deptId = department.DepartmentID WHERE department.name = ?;");
			preparedStatement.setString(1,departmentName);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				//10
				int performanceId=resultSet.getInt(10);
				int employeeId=resultSet.getInt(11);
				Date date = resultSet.getDate(12);
				int rating =resultSet.getInt(13);
				String feedback=resultSet.getString(14);
				int evaluatorId=resultSet.getInt(15);
				Performance performance = new Performance(performanceId,employeeId,date, rating,feedback,evaluatorId);
				
				int departmentId=resultSet.getInt(16);
				String name=resultSet.getString(17);
				Department department=new Department(departmentId,name);
				
				int empNo = resultSet.getInt(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				String email=resultSet.getString(4);
				String position=resultSet.getString(5);
				int deptId=resultSet.getInt(6);
				int managerId=resultSet.getInt(7);
				int createdById=resultSet.getInt(8);
				int updatedById=resultSet.getInt(9);

				Employee employee = new Employee(empNo,firstName,lastName,email,position,deptId,managerId,createdById,updatedById,performance,department);
				employeeList.add(employee);

			
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employeeList;
	}

}
