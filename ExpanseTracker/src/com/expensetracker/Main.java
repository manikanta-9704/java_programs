package com.expensetracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpenseService service = new ExpenseService();

        int choice;

        do {

            System.out.println("\n========== EXPENSE TRACKER ==========");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Modify Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n========== ADD EXPENSE ==========");

                    System.out.print("Enter description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    ExpenseType expenseType = selectExpenseType(sc);

                    service.addExpense(
                            description,
                            amount,
                            expenseType
                    );

                    break;

                case 2:

                    System.out.println("\n========== VIEW EXPENSES ==========");

                    service.viewAllExpenses();

                    break;

                case 3:

                    System.out.println("\n========== MODIFY EXPENSE ==========");

                    System.out.print("Enter Expense ID: ");
                    int modifyId = sc.nextInt();
                    sc.nextLine();

                    Expense expense = service.findExpenseById(modifyId);

                    if (expense == null) {

                        System.out.println("Expense not found.");

                    } else {

                        System.out.print("Enter new description: ");
                        String newDescription = sc.nextLine();

                        System.out.print("Enter new amount: ");
                        double newAmount = sc.nextDouble();

                        ExpenseType newExpenseType = selectExpenseType(sc);

                        boolean modified = service.modifyExpense(
                                modifyId,
                                newDescription,
                                newAmount,
                                newExpenseType
                        );

                        if (modified) {
                            System.out.println("Expense modified successfully.");
                        } else {
                            System.out.println("Unable to modify expense.");
                        }
                    }

                    break;

                case 4:

                    System.out.println("\n========== DELETE EXPENSE ==========");

                    System.out.print("Enter Expense ID: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = service.deleteExpense(deleteId);

                    if (deleted) {
                        System.out.println("Expense deleted successfully.");
                    } else {
                        System.out.println("Expense not found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank you for using Expense Tracker.");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    public static ExpenseType selectExpenseType(Scanner sc) {

        System.out.println("\nSelect Expense Type:");

        System.out.println("1. Food");
        System.out.println("2. Travel");
        System.out.println("3. Shopping");
        System.out.println("4. Bills");
        System.out.println("5. Entertainment");
        System.out.println("6. Medical");
        System.out.println("7. Other");

        System.out.print("Enter type: ");

        int typeChoice = sc.nextInt();

        switch (typeChoice) {

            case 1:
                return ExpenseType.FOOD;

            case 2:
                return ExpenseType.TRAVEL;

            case 3:
                return ExpenseType.SHOPPING;

            case 4:
                return ExpenseType.BILLS;

            case 5:
                return ExpenseType.ENTERTAINMENT;

            case 6:
                return ExpenseType.MEDICAL;

            case 7:
                return ExpenseType.OTHER;

            default:
                System.out.println("Invalid type. Other selected.");
                return ExpenseType.OTHER;
        }
    }
}