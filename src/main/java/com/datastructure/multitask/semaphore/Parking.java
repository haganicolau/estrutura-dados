package com.datastructure.multitask.semaphore;

import java.util.HashMap;
import java.util.Map;

public class Parking {

    private int vacanciesQuantity;

    private Map<String, Car> vacancies = new HashMap<>();

    public Parking(int vacanciesQuantity) {
        this.vacanciesQuantity = vacanciesQuantity;
    }

    public int getVacanciesQuantity() {
        return vacanciesQuantity;
    }

    public Map<String, Car> getVacancies() {
        return vacancies;
    }

    public void comeIn(Car car) {
        this.vacancies.put(car.getPlate(), car);
    }

    public void comeOut(Car car) {
        this.vacancies.get(car.getPlate());
    }

    public boolean contain(Car car) {
        return this.vacancies.containsKey(car.getPlate());
    }

    public void printAllCars() {
        for (Map.Entry<String, Car> accountEntry : vacancies.entrySet()) {
            Car car = accountEntry.getValue();
            System.out.println("Car plate: " + car.getPlate());
        }

    }
}
