package com.codecool;

import java.util.Random;

public class RandomNumericGenerator {

    Random random = new Random();


    protected String randomPrice(){
        float price = random.nextFloat() * 200;
        return String.format("%.02f", price).replace(",", ".")  ;
    }

    protected  String randomWeight(){
        float weight = random.nextFloat() + 1;
        return String.format("%.02f", weight).replace(",", ".") ;
    }

    protected String randomZipCode(){
        return "'" + String.format("%.00f", Math.random()*(99-10)+10) + "-" + String.format("%.00f", Math.random()*(999-100)+100) + "'";
    }

    protected String randomNumberGenerator(){
        return String.valueOf(random.nextInt(100));
    }

    protected String randomPhoneGenerator(){
        return String.format("%.00f", Math.random()*(999-100)+100) + "-" +
                String.format("%.00f", Math.random()*(999-100)+100) + "-" +
                String.format("%.00f", Math.random()*(999-100)+100);
    }
}
