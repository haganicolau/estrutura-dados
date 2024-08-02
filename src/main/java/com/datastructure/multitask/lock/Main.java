package com.datastructure.multitask.lock;

public class Main {

    public static void main(String[] args) {

        Bank bankNic = new Bank();

        bankNic.addNewAccount(1, 100.00);//90 90    90   100 100
        bankNic.addNewAccount(2, 105.00);//210 220  245  235 235
        bankNic.addNewAccount(3, 115.00);//150 150  125  150 135
        bankNic.addNewAccount(4, 120.00);
        bankNic.addNewAccount(5, 125.00);
        bankNic.addNewAccount(6, 130.00);
        /**
         * 1- transfer
         * 2- deposit
         * 3- withdrawal
         */
        Thread t1 = new Thread(new Operation(bankNic, 1, 10.00, 1, 2), "Thread-1");
        Thread t2 = new Thread(new Operation(bankNic, 1, 10.00, 1,3), "Thread-2");
        Thread t3 = new Thread(new Operation(bankNic, 1, 10.00, 1,4), "Thread-3");
        Thread t4 = new Thread(new Operation(bankNic, 1, 10.00, 1,5), "Thread-4");
        Thread t5 = new Thread(new Operation(bankNic, 1, 10.00, 1, 6), "Thread-5");
//        Thread t6 = new Thread(new Operation(bankNic, 2, 10.00, 3, 0), "Thread-6");
//        Thread t7 = new Thread(new Operation(bankNic, 2, 25.50, 2, 0), "Thread-7");
//        Thread t8 = new Thread(new Operation(bankNic, 3, 20.00, 3,0), "Thread-8");

        // Iniciando as threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();

        // Aguardando a conclusão de todas as threads
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
//            t6.join();
//            t7.join();
//            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bankNic.printAllAccounts();
    }
}
