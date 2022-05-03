package com.solvd.shopStore.shop.cultural.exceptions;

public class ProductStock extends RuntimeException {
    public ProductStock (){
        super("Sorry, there is no stock for that product");
    }

}
