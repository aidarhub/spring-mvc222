package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp {
    private final List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Opel", "red", 123));
        carList.add(new Car("BMW", "blue", 240));
        carList.add(new Car("BMW", "white", 20));
        carList.add(new Car("Merc", "orange", 24));
        carList.add(new Car("Jeep", "black", 410));
    }

    public CarServiceImp(){}

    public List<Car> getCarList() {
        return carList;
    }
}
