package com.company;

import java.util.Objects;

public class Car {
    public Car(String model, Integer prize) {
        this.model = model;
        this.prize = prize;
    }

    private String model;
    private Integer prize;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(prize, car.prize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, prize);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", prize=" + prize +
                '}';
    }
}
