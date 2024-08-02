package com.datastructure.multitask.lock;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Integer, Account> accounts = new HashMap<>();

    public void addNewAccount(int id, Double startBalance) {
        accounts.put(id, new Account(id, startBalance));
    }

    public Account getAccount(Integer id) {
        return accounts.get(id);
    }

    public void printAllAccounts() {
        for (Map.Entry<Integer, Account> accountEntry : accounts.entrySet()) {
            Account account = accountEntry.getValue();
            System.out.println("Account id: " + account.getId() + ", balance: R$ "+ account.getBalance());
        }

    }
}
