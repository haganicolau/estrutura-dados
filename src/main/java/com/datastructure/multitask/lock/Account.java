package com.datastructure.multitask.lock;

public class Account {

    private final Integer id;
    private Double balance;

    public Account(Integer id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(Double value) {
        this.balance = this.balance + value;
    }

    public synchronized void withdrawal(Double value) {
        if (value > this.balance) {
            System.out.println("Impossível realizar esta ação. Saldo insufficient");
            return;
        }

        this.balance = this.balance - value;
    }

    public Integer getId() {
        return id;
    }
}
