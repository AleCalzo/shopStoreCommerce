package com.solvd.shopStore.shop.cultural.cultural;

import com.solvd.shopStore.shop.cultural.interfaces.Regards;

public class Comics extends Products implements Regards {


    private String caracter;

    public Comics() {
        super("Mario Bross", 35.11, 0, false, "Platforms");
    }

    public Comics(String name, double costUnit, int cantStock,
                  boolean available, String caracter) {
        super(name, costUnit, cantStock, available);
        this.caracter = caracter;
    }

    @Override
    public String sayHello(String greeting) {
        return "thank you for stop by!";
    }

    @Override
    public String toString() {
        return "COMIC ARTICLE\n" + super.toString() + "Caracter: "
                + this.caracter;

    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
}

