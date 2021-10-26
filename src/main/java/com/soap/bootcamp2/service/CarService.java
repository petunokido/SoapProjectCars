package com.soap.bootcamp2.service;

import com.soap.bootcamp2.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    private static final Map<String, Car> cars = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Car lamborghini = new Car();
        lamborghini.setCarId(1);
        lamborghini.setBrand("Lamborghini");
        lamborghini.setPrice(350000);


        Car porsche = new Car();
        porsche.setCarId(2);
        porsche.setBrand("Porsche");
        porsche.setPrice(200000);

        Car tesla = new Car();
        tesla.setCarId(3);
        tesla.setBrand("Porsche");
        tesla.setPrice(70000);

        cars.put(lamborghini.getBrand(), lamborghini);
        cars.put(porsche.getBrand(), porsche);
        cars.put(tesla.getBrand(), tesla);
    }

    public Car getCars(String brand) {
        System.out.println(brand);
        return cars.get(brand);
    }
}
