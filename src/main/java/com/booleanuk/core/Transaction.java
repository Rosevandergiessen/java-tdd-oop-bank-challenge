package com.booleanuk.core;

public class Transaction {
    private double amount;
    private String type;
    private String date;

    // Constructors
    public Transaction(String type, double amount){
        setType(type);
        setAmount(amount);
        setDate(makeDateStamp());
    }

    // Getters & Setters
    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Methods
    public String makeDateStamp(){
        return "";
    }

}
