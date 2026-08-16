package com.Employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EmployeeServices service = new EmployeeServices();

		int choice;

		do {

			System.out.println("\n================================");
			System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
			System.out.println("================================");

			System.out.println("1. Add Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {

				System.out.println("\nEnter Employee Details");

				System.out.print("Enter Employee ID: ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Employee Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Gender: ");
				String gender = sc.nextLine();

				System.out.print("Enter Department: ");
				String department = sc.nextLine();

				System.out.print("Enter Designation: ");
				String designation = sc.nextLine();

				System.out.print("Enter Salary: ");
				double salary = sc.nextDouble();

				Employee e1 = new Employee(id, name, gender, department, designation, salary);

				service.addEmployees(e1);
			}

			case 2 -> {

				service.displayEmployees();
			}

			case 3 -> {

				int searchChoice;

				do {

					System.out.println("\n===== SEARCH EMPLOYEE =====");

					System.out.println("1. Search by ID");
					System.out.println("2. Search by Name");
					System.out.println("3. Search by Department");
					System.out.println("4. Back");

					System.out.print("Enter choice: ");
					searchChoice = sc.nextInt();

					switch (searchChoice) {

					case 1 -> {

						System.out.print("Enter ID: ");
						int id = sc.nextInt();

						Employee foundId = service.foundById(id);

						if (foundId == null) {
							System.out.println("Employee not found.");
						} else {
							foundId.display();
						}
					}

					case 2 -> {

						sc.nextLine();

						System.out.print("Enter name: ");
						String name = sc.nextLine();

						Employee foundName = service.foundByName(name);

						if (foundName == null) {
							System.out.println("Employee not found.");
						} else {
							foundName.display();
						}
					}

					case 3 -> {
sc.nextLine();
						System.out.print("enter department name:");
						String deptName=sc.nextLine();
						service.foundByDepartment(deptName);
					}

					case 4 -> {

						System.out.println("Returning to main menu...");
					}

					default -> {

						System.out.println("Invalid search choice.");
					}
					}

				} while (searchChoice != 4);
			}

			case 4 -> {
				System.out.println("1.update department");
				System.out.println("2.update designation");
				System.out.println("update salary");
				int updateChoice;
				do {
					System.out.print("enter choice:");
					updateChoice=sc.nextInt();
					switch(updateChoice) {
					case 1->{
						sc.nextLine();
						System.out.print("enter updated department:");
						String updatedDepartment=sc.nextLine();
					}
					}
					
				}while(updateChoice!=3);

			}

			case 5 -> {

				System.out.println("Delete Employee - Coming Soon");
			}

			case 6 -> {

				System.out.println("Thank you for using Employee Management System.");
			}

			default -> {

				System.out.println("Invalid choice. Please enter 1-6.");
			}
			}

		} while (choice != 6);

		sc.close();
	}
}