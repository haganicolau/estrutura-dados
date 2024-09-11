package com.datastructure.multitask.metrics;

import java.util.Random;

public class BusinessLogic extends Thread {
    private Metrics metrics;
    private Random rand = new Random();

    public BusinessLogic(Metrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public void run() {
        while (true) {
            long start = System.currentTimeMillis();

            try {
                Thread.sleep(rand.nextInt(10));
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            long end = System.currentTimeMillis();
            metrics.addSample(end - start);

        }
    }
}
