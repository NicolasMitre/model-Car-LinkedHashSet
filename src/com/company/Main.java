package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Llenar un ArrayList con objetos Car
        // (String model, Integer prize), cargar algunos varias veces,
        // luego eliminar los repetidos.

        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Fiat", 1);
        Car car2 = new Car("Chevrolet", 2);
        Car car3 = new Car("BMW", 3);

        cars.add(car3);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car3);
        cars.add(car2);
        cars.add(car1);

        LinkedHashSet<Car> hashSet = new LinkedHashSet<>(cars);

        ArrayList<Car> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println(listWithoutDuplicates);

    }
}
