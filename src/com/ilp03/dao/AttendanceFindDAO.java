package com.ilp03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import com.ilp03.entity.Attendance;
import com.ilp03.entity.Department;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Performance;

public class AttendanceFindDAO {
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

	public static ArrayList<Employee> getLessThanMinAttendanceOfEmployees(Connection connection, int minAttendance) {
		ArrayList<Employee> attendanceList = new ArrayList<Employee>();

		try {
			
			PreparedStatement preparedStatement= connection.prepareStatement(" SELECT * from employee join performance on employee.emp_no=performance.employeeID join department ON employee.deptId = department.DepartmentID JOIN attendance ON employee.emp_no = attendance.EmployeeID WHERE employee.emp_no IN (SELECT EmployeeID FROM attendance WHERE attendance_count < ?);");
			preparedStatement.setInt(1,minAttendance);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				
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
				
				//18-23
				int attendanceId=resultSet.getInt(18);
				int attEmployeeId=resultSet.getInt(19);
				Time timeIn=resultSet.getTime(20);
				Time timeOut=resultSet.getTime(21);
				int attendance_count=resultSet.getInt(22);
				int createById=resultSet.getInt(23);
				Attendance attendance= new Attendance(attendanceId,attEmployeeId,timeIn,timeOut,attendance_count,createById);

				
				int empNo = resultSet.getInt(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				String email=resultSet.getString(4);
				String position=resultSet.getString(5);
				int deptId=resultSet.getInt(6);
				int managerId=resultSet.getInt(7);
				int createdById=resultSet.getInt(8);
				int updatedById=resultSet.getInt(9);

				Employee employee = new Employee(empNo,firstName,lastName,email,position,deptId,managerId,createdById,updatedById,performance,department,attendance);
				attendanceList.add(employee);

			
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return attendanceList;
	}

}
