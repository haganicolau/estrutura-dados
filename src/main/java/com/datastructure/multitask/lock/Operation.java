package com.datastructure.multitask.lock;

public class Operation extends Thread {

    private Bank bank;
    private int accountNumber;
    private Double value;

    /**
     * 1- transfer
     * 2- deposit
     * 3- withdrawal
     */
    private int operation;

    private int accountNumberDestin;

    public Operation(Bank bank, int accountNumber, Double value, int operation, int accountNumberDestin) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.value = value;
        this.operation = operation;
        this.accountNumberDestin = accountNumberDestin;
    }

    @Override
    public void run() {
        if (operation == 1) {
            transfer(accountNumber, accountNumberDestin, value);

        } else if (operation == 2) {
            deposit(accountNumber, value);

        } else if (operation == 3) {
            withdrawal(accountNumber, value);
        }
    }

    public void transfer (Integer fromAccount, Integer toAccount, Double value) {
        Account origin = this.bank.getAccount(fromAccount);
        Account destin = this.bank.getAccount(toAccount);
        origin.withdrawal(value);
        destin.deposit(value);

//        synchronized (contaOrigem) {
//            synchronized (contaDestino) {
//                contaOrigem.sacar(valor);
//                contaDestino.depositar(valor);
//            }
//        }
    }

    public void deposit(Integer fromAccount, Double value) {
        Account account = this.bank.getAccount(fromAccount);
        account.deposit(value);
    }

    public void withdrawal(Integer fromAccount, Double value) {
        Account account = this.bank.getAccount(fromAccount);
        account.withdrawal(value);
    }

}
