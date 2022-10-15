package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carsIndex(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.getCarsList());
        if (count == null || count >= carService.getCarsCount()) {
            model.addAttribute("count", carService.getCarsCount());
        } else {
            model.addAttribute("count", count);
        }
        return "cars";
    }
}
