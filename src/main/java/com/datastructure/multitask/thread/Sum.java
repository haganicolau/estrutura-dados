package com.datastructure.multitask.thread;

public class Sum {

    public static void main(String[] args) throws InterruptedException {

        SumThread sum1 = new SumThread("sum1", 0, 5);
        SumThread sum2 = new SumThread("sum2", 6, 10);
        SumThread sum3 = new SumThread("sum3", 11, 15);
        SumThread sum4 = new SumThread("sum4", 16, 20);

        sum1.start();
        sum2.start();
        sum3.start();
        sum4.start();

        sum1.join();
        sum2.join();
        sum3.join();
        sum4.join();

        System.out.println("Sum sum1 = " + sum1.getResult());
        System.out.println("Sum sum2 = " + sum2.getResult());
        System.out.println("Sum sum3 = " + sum3.getResult());
        System.out.println("Sum sum4 = " + sum4.getResult());
    }

    public static class SumThread extends Thread {
        private int start;
        private int end;
        private int result;
        private boolean isFinished = false;

        private String nameThread;

        public SumThread(String nameThread, int start, int end) {
            System.out.println(nameThread + ": Creating SumThread");
            this.nameThread = nameThread;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            System.out.println(nameThread + ": Thread running");
            this.result = this.sum(start, end);
            this.isFinished = true;
        }

        public int sum(int start, int end) {
            System.out.println(nameThread + ": Sum...");
            int i = start;
            for(; i <= end; i++) {
                i++;
                System.out.println(nameThread + ": Contando: " + i);
            }
            return i;
        }

        public int getResult() {
            return this.result;
        }
    }

}


