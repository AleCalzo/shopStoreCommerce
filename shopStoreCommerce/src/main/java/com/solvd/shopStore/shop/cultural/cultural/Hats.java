package com.solvd.shopStore.shop.cultural.cultural;

import com.solvd.shopStore.shop.cultural.interfaces.Cupon;

public class Hats extends Products implements Cupon {


    private String colors;


    public Hats() {
        super("Mario Bross", 35.11, 0, false, "Platforms");
    }

    public Hats(String name, double costUnit, int cantStock,
                boolean available, String colors) {
        super("Mario Bross", 35.11, 0, false, "Platforms");
        this.colors = colors;
    }

    public double applyCupon(double cupon1) {
        return 10;
    }

    @Override
    public String toString() {
        return "HATS ARTICLE\n" + Cupon.super.toString() + "Colors: "
                + this.colors;
    }


    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

}

