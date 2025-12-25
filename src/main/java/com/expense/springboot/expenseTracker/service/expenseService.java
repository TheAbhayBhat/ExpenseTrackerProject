package com.expense.springboot.expenseTracker.service;
import  com.expense.springboot.expenseTracker.Vo.expenseVO;

public interface expenseService {
    public void addExpense(expenseVO expensevo);
    public void deleteExpense();
    public void updateExpense();
    public void getExpense();


}
