package com.solvd.shopStore.shop.cultural.exceptions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Image extends RuntimeException{

    public Image() {

        try {
            BufferedImage image = ImageIO.read(new File("src/graphic/footboll"));

        } catch (IOException e) {

            System.out.println("Image not found");

        }

    }
}
