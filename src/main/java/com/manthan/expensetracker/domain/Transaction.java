package com.manthan.expensetracker.domain;

import java.lang.reflect.Constructor;

public class Transaction {
    
    private Integer transactionId;
    private Integer categoryId;
    private Integer userId;
    private Double amount;
    private String note;
    private Long transactionDate;

    public Transaction(Integer transactionId, Integer categoryId, Integer userId, Double amount, String note, Long transactionDate){
        this.amount=amount;
        this.categoryId=categoryId;
        this.note=note;
        this.transactionDate=transactionDate;
        this.transactionId = transactionId;
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public String getNote() {
        return note;
    }
    public Long getTransactionDate() {
        return transactionDate;
    }
    public Integer getTransactionId() {
        return transactionId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public void setTransactionDate(Long transactionDate) {
        this.transactionDate = transactionDate;
    }
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
