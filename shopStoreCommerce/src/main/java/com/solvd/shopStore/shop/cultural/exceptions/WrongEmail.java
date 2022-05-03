package com.solvd.shopStore.shop.cultural.exceptions;

class WrongEmail extends RuntimeException {
    public WrongEmail() {
    }

    public WrongEmail(String erorMje) {

        super(erorMje);
    }
}