package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> list = new CarServiceImp().getCarList();

    @GetMapping(value = "/cars")
    public String carPage( @RequestParam(value = "count", defaultValue = "7") Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        if(count > 0 && count <=5) {
            for(int i = 0; i < count; i++) {
                cars.add(list.get(i));
            }
        } else if (count > 5) {
            cars = list;
        }
        model.addAttribute("cars", cars);
        return "cars";
    }

}
