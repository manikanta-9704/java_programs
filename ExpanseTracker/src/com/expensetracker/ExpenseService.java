package com.expensetracker;

import java.util.ArrayList;

public class ExpenseService {

    private ArrayList<Expense> expenses = new ArrayList<>();

    private int nextExpenseId = 101;

    // Add Expense
    public void addExpense(String description, double amount, ExpenseType expenseType) {

        Expense expense = new Expense(
                nextExpenseId,
                description,
                amount,
                expenseType
        );

        expenses.add(expense);

        System.out.println("Expense added successfully!");
        System.out.println("Expense ID: " + nextExpenseId);

        nextExpenseId++;
    }

    // View All Expenses
    public void viewAllExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\n========== ALL EXPENSES ==========");

        for (Expense expense : expenses) {
            expense.displayExpense();
        }
    }

    // Find Expense by ID
    public Expense findExpenseById(int expenseId) {

        for (Expense expense : expenses) {

            if (expense.getExpenseId() == expenseId) {
                return expense;
            }
        }

        return null;
    }

    // Modify Expense
    public boolean modifyExpense(
            int expenseId,
            String description,
            double amount,
            ExpenseType expenseType) {

        Expense expense = findExpenseById(expenseId);

        if (expense == null) {
            return false;
        }

        expense.setDescription(description);
        expense.setAmount(amount);
        expense.setExpenseType(expenseType);

        return true;
    }

    // Delete Expense
    public boolean deleteExpense(int expenseId) {

        Expense expense = findExpenseById(expenseId);

        if (expense == null) {
            return false;
        }

        expenses.remove(expense);

        return true;
    }
}