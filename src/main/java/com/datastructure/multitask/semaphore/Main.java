package com.datastructure.multitask.semaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Parking parking = new Parking(5);

        Car car1 = new Car("ABC123");
        Car car2 = new Car("EBG987");
        Car car3 = new Car("PLK321");
        Car car4 = new Car("QAZ147");
        Car car5 = new Car("TGB258");
        Car car6 = new Car("NBV159");

        Semaphore semaphore = new Semaphore(5);

        Thread t1 = new Thread(new Operation(parking, 1, car1, semaphore));
        Thread t2 = new Thread(new Operation(parking, 1, car2, semaphore));
        Thread t3 = new Thread(new Operation(parking, 1, car3, semaphore));
        Thread t4 = new Thread(new Operation(parking, 1, car4, semaphore));
        Thread t5 = new Thread(new Operation(parking, 1, car5, semaphore));
        Thread t6 = new Thread(new Operation(parking, 1, car6, semaphore));


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            //t6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        parking.printAllCars();

    }
}
