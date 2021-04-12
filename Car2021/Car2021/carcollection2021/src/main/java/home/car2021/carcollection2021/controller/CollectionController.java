package home.car2021.carcollection2021.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import home.car2021.carcollection2021.model.Car;

@Controller
public class CollectionController {

    @Value("${spring.application.name}")
    private String appName;

    static final String APP_NAME = "appName";
    static final String CARS = "cars";  

    @GetMapping(value = "/")
    public String getHome(Model model) {
        model.addAttribute(APP_NAME, appName);
        return "home";
    }

    @GetMapping(value = "/collection")
    public String getCollectionCar(Model model) {
        Car[] carList = {
            new Car(1, "Triton 4x4 Premium", "Mitsubishi", 869, "/images/triton.jpg"),
            new Car(2, "Ranger", "Ford", 1205, "/images/fordranger.jpg"),
            new Car(3, "Camry", "Toyota", 1305, "/images/camry.jpg"),
            new Car(4, "Fadil", "Vinfast", 369, "/images/fadil.jpg"),
            new Car(5, "Morning", "Kia", 385, "/images/kia_morning.jpg"),
            new Car(6, "CR-V", "Honda", 1215, "/images/hondacrv.jpg"),
            new Car(7, "Elantra", "Huyndai", 869, "/images/elantra.jpg"),
            new Car(8, "Santafe", "Huyndai", 1385, "/images/santafe.jpg"),
            new Car(9, "Vios", "Toyota", 615, "/images/vios.jpg")
        };
        model.addAttribute(CARS, carList);
        model.addAttribute(APP_NAME, appName);
        return "collection";
    }
}
