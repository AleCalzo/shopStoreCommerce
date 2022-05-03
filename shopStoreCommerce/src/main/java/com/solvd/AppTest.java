package com.solvd;

import com.solvd.shopStore.shop.cultural.cultural.Cine;
import com.solvd.shopStore.shop.cultural.cultural.Management;
import com.solvd.shopStore.shop.cultural.cultural.Products;
import com.solvd.shopStore.shop.cultural.cultural.reads.Reads;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppTest {

    private static final Logger LOG = LogManager.getLogger("");

    public static void main(String[] args) {

        LOG.debug("Welcome to the Big Store of Music, Videogames, Movies, Books and much more!\n--------\n"
                + "This program simulate a shop to buy products\n"
                + "The articles can only be sold if they are availables in the store\n"
                + "The Custumer can:\n"
                + "\t Buy products availabless.\n"
                + "\t Add more products to the cart.\n"
                + "\t Check for the final bill.");

        boolean continues = true;
        int lectureProduct, lectureQuantity;


        Products disc1 = new Music("Portishead", 18.53, 6, true, "Trip Hop");
        Products disc2 = new Music("Radiohead", 21.2, 20, true, "Rock");
        Products cine1 = new Cine("Hierro 3", 30.2, 5, true, "Kim Ki Duk");
        Products game1 = new Products("Mario Bross", 35.11, 0, false,
                "Platforms");

        Products catalogue[] = new Products[3];

        Management management = new Management();

        catalogue[0] = disc1;
        catalogue[1] = disc2;
        catalogue[2] = cine1;
        catalogue[3] = game1;

        List<String> values= new ArrayList<String>();
        values.add("game2");

        do {
            LOG.debug("\n\n Enter an Option:\n"
                    + "1. Show products\n" + "2. Sell products\n"
                    + "3. Show box\n"
                    + "EXIT --> Press any other number\n");
            switch (Reads.datoInt()) {
                case 1:
                    management.showProducts(catalogue);
                    break;
                case 2:
                    LOG.debug("¿What product would you like to buy?");
                    management.showNameProducts(catalogue);
                    lectureProduct = Reads.datoInt();
                    LOG.debug("¿How many would you like to buy?");
                    lectureQuantity = Reads.datoInt();

                    management.buyProduct(catalogue, lectureProduct,
                            lectureQuantity);
                    break;
                case 3:
                    LOG.debug(management.showRegister + " $");
                    break;
                default:

                    continues = false;
            }

        } while (continues);

        LOG.debug("---- See you soon!!. ----");

    }

    public static class Music extends Products {


        private String gender;


        public Music() {
            super("Mario Bross", 35.11, 0, false, "Platforms");
        }

        public Music(String name, double costUnit, int cantStock,
                     boolean available, String gender) {
            super(name, costUnit, cantStock, available);
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "MUSIC ARTICLE\n" + super.toString() + "Gender: "
                    + this.gender;
        }


        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    }
