package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.service.AttendanceFindServiceImpl;
import com.ilp03.service.PerformanceFindServiceImpl;

public class MainUtility {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PerformanceFindServiceImpl performanceFindServiceImpl= new PerformanceFindServiceImpl();
		
		
		AttendanceFindServiceImpl attendanceFindServiceImpl= new AttendanceFindServiceImpl();
		
		
		boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("1. Get the performance of a department");
            System.out.println("2. Attendance less than minimum required");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    performanceFindServiceImpl.getAllEmployee();
                    break;
                case 2:
                    attendanceFindServiceImpl.getAllAttendance();
                    break;
                case 3:
                    continueLoop = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
		// TODO Auto-generated method stub

	}

}
