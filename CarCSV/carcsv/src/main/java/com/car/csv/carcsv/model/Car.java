package com.car.csv.carcsv.model;

import lombok.Data;

@Data
public class Car {
    private int id;
    private String name;
    private String manufacturer;
    private int price;

    public Car(String info) {
        String[] infoLineCSV = info.split(",");
        this.id = Integer.parseInt(infoLineCSV[0]);
        this.name = infoLineCSV[1];
        this.manufacturer = infoLineCSV[2];
        this.price = Integer.parseInt(infoLineCSV[3]);
    }
}
