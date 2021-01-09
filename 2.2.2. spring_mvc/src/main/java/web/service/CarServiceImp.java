package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Opel", "red", 123));
        carList.add(new Car("BMW", "blue", 240));
        carList.add(new Car("BMW", "white", 20));
        carList.add(new Car("Merc", "orange", 24));
        carList.add(new Car("Jeep", "black", 410));
    }

    public CarServiceImp() {
    }

    public List<Car> getCarList(Integer count) {
        List<Car> cars = new ArrayList<>();
        if (count > 0 && count <= 5) {
            for (int i = 0; i < count; i++) {
                cars.add(carList.get(i));
            }
        } else if (count > 5) {
            cars = carList;
        }
        return cars;
    }
}
