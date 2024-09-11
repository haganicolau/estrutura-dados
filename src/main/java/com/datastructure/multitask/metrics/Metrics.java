package com.datastructure.multitask.metrics;

public class Metrics {
    private long count = 0;

    /**
     * the volatile word guarantee all operations using that
     * variable will be atomic **/
    private volatile double avarege;

    /**
     * the synchronized guarantee the operation is atomic
     * @param sample
     */
    public synchronized void addSample(long sample) {
        double currentSum = avarege * count;
        count ++;
        avarege = (currentSum + sample) / count;
    }

    public double getAvarege () {
        return avarege;
    }
}
