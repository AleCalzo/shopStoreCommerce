package com.solvd.shopStore.shop.cultural.enums;

public enum CategoryTypes {
    BOOKS("Specify by Authors."),
    COMICS("Super Heroes from the 80´s to the 90´s"),
    TSHIRT("Whith the Superheroes of your Comics");

    public final String data;

    CategoryTypes(String data) {
        this.data = data;
    }
}