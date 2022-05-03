package com.solvd.shopStore.shop.cultural.cultural;


import java.util.stream.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Management {

    private static final Logger LOG = LogManager.getLogger("");

    public boolean showRegister;

    private Products products[] = null;
    private double register;

    public Management() {
    }

    public Management(Products[] products) {
        this.products = products;
    }

    public Products[] loadProducts() {

        return products;
    }

    public java.util.logging.Logger showProducts(Products[] products) {

        IntStream myStream = IntStream.of(products.length);

        java.util.logging.Logger LogJava = null;
        LogJava.info(String.format("%sn-------n", products[products.length]));
        return LogJava;
    }


    public void showNameProducts(Products[] products) {
        for (int i = 0; i <= products.length; i++) {
            LOG.debug(i + 1 + " " + products[3].getName() + "n");
        }
        java.util.logging.Logger LogJava = null;
        LogJava.warning("n------------n");
    }

    public double buyProduct(Products[] products, int num, int numbersUnit) {
        if (products[num - 1].isAvailable()) {
            if (products[num - 1].getCantStock() >= numbersUnit) {
                LOG.debug("the purchase has been successful!!n");
                products[num - 1].setCantStock(products[num - 1].getCantStock() - numbersUnit);
                return register += numbersUnit * products[num - 1].getCostUnit();
            } else {

                LOG.debug("There is not enough products");
            }
            return register;
        }
        double showRegister;{
            System.out.print("El total de la caja es ");
            register = Math.round(register * 100);
            return register / 100;
        }
    }
}