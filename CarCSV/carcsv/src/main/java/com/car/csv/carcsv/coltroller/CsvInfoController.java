package com.car.csv.carcsv.coltroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.car.csv.carcsv.model.Car;

import org.springframework.stereotype.Controller;

@Controller
public class CsvInfoController {
    static final String CARS = "cars";


    private List<Car> getListCar() throws IOException{
        return Files.lines(Paths.get("carlist.csv"))
            .map(Car::new)
            .collect(Collectors.toList());
    }

    @GetMapping(value = "/")
    public String getCarLisrtrt(Model model) throws IOException {
        List<Car> collection = getListCar();
        model.addAttribute(CARS, collection);
        return "home";
    }
}
