package com.solvd.shopStore.shop.cultural.cultural;


import com.solvd.shopStore.shop.cultural.interfaces.Author;
import com.solvd.shopStore.shop.cultural.interfaces.Regards;

public class Book extends Products implements Author, Regards {


    private String author;


    public Book() {
        super("Mario Bross", 35.11, 0, false, "Platforms");
    }

    public Book(String name, double costUnit, int cantStock,
                boolean available, String author) {
        super(name, costUnit, cantStock, available);
        this.author = author;
    }

    public String nameAutohors(String nameA) {
        return "This Author name is:" + nameA;
    }

    @Override
    public String sayHello(String greeting) {
        return "thank you for stop by!";
    }

    @Override
    public String toString() {
        return "BOOK ARTICLE\n" + super.toString() + "Author: "
                + this.author;
    }


}

