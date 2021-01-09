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

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", defaultValue = "7") Integer count, ModelMap model) {
        List<Car> serviceImp = new CarServiceImp().getCarList(count);
        model.addAttribute("cars", serviceImp);
        return "cars";
    }
}
