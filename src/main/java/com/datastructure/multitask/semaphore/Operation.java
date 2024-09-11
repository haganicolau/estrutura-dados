package com.datastructure.multitask.semaphore;

import java.util.concurrent.Semaphore;

public class Operation extends Thread {

    private Parking parking;
    private Semaphore semaphore;

    private Car car;

    /**
     * 1- come in
     * 2- come out
     */
    private int operation;

    public Operation(Parking parking, int operation, Car car, Semaphore semaphore) {
        this.parking = parking;
        this.operation = operation;
        this.car = car;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        if (operation == 1) {
            try {
                comeIn(parking, car);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (operation == 2) {
            comeOut(parking, car);
        } else {
            System.out.println("operation not found");
        }
    }

    public void comeIn(Parking parking, Car car) throws InterruptedException {
        parking.comeIn(car);
        semaphore.acquire();
    }

    public void comeOut(Parking parking, Car car) {
        if (! parking.contain(car)) {
            System.out.println("car not found");
            return;
        }
        semaphore.isFair();
        parking.comeOut(car);
        semaphore.release();
    }
}
