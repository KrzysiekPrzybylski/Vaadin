package com.przybylski.vaadindemo.menager;

import com.przybylski.vaadindemo.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarManager {

    List<Car> carList;

    public CarManager() {
        carList = new ArrayList<>();

        carList.add(new Car("BMW","X5"));
        carList.add(new Car("Dacia", "Sandero"));
        carList.add(new Car("Citroen", "Berlingo"));
    }
    public void addCar(Car car){
        carList.add(car);
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
