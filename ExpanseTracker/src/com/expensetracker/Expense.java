package com.expensetracker;

public class Expense {

    private int expenseId;
    private String description;
    private double amount;
    private ExpenseType expenseType;

    public Expense(int expenseId, String description, double amount, ExpenseType expenseType) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.expenseType = expenseType;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
    	if(amount>0) {
        this.amount = amount;
    	}else {
    		System.out.println("enter amount");
    	}
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public void displayExpense() {
        System.out.println("Expense ID   : " + expenseId);
        System.out.println("Description  : " + description);
        System.out.println("Amount       : " + amount);
        System.out.println("Expense Type : " + expenseType);
        System.out.println("-----------------------------");
    }
}