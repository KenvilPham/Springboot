package home.car2021.carcollection2021.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Car {
    private int id;
    private String name;
    private String manufacturer;
    private int price;
    private String photoUri;
}
