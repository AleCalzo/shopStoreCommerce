package com.solvd.shopStore.shop.cultural.cultural;

public class Products {
    protected String author;
    private String name;
    private double costUnit;
    private int cantStock;
    private boolean available = false;
    public static int dimentionArray;
    private boolean Available;

    public Products(String author, String name, double costUnit, int cantStock, boolean available, boolean available1) {
        this.author = author;
        this.name = name;
        this.costUnit = costUnit;
        this.cantStock = cantStock;
        this.available = available;
        Available = available1;
    }

    public Products(String mario_bross, double v, int i, boolean b, String platforms) {

    }

    public Products(String name, double costUnit, int cantStock, boolean available) {
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(double costUnit) {
        this.costUnit = costUnit;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public static int getDimentionArray() {
        return dimentionArray;
    }

    public static void setDimentionArray(int dimentionArray) {
        Products.dimentionArray = dimentionArray;
    }
}
