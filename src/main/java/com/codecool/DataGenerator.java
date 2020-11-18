package com.codecool;

import java.util.Random;

public class DataGenerator {

    RandomStringGenerator rsg = new RandomStringGenerator();
    RandomWordGenerator rwg = new RandomWordGenerator();
    RandomNumericGenerator rng = new RandomNumericGenerator();


    public String generateLoginDetails() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<1000; i++) {
            stringBuilder.append("insert into user_login_details (\"id\", \"e-mail\", \"password\") values (");
            stringBuilder.append(i + ",");
            stringBuilder.append("'" + rsg.randomString(8)+"@" + rsg.randomString(4) + ".com',");
            stringBuilder.append("'" + rsg.randomString(10) + "');" + "\n");

        }
        return stringBuilder.toString();
    }



    public String generateBikeParts() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<50; i++) {
            stringBuilder.append("insert into bike_parts (\"brand\", \"model\", \"color\", \"type\", \"price\", \"weight\", \"description\") values (");
            stringBuilder.append("'" + rsg.randomString(5 ) + "',"); //brand
            stringBuilder.append("'" + rsg.randomString(7 ) + "',"); //model
            stringBuilder.append(rwg.randomColor() + ","); //color
            stringBuilder.append(rwg.randomType() + ","); //type
            stringBuilder.append(rng.randomPrice() + ","); //price
            stringBuilder.append(rng.randomWeight() + ","); //weight
            stringBuilder.append("'" + rsg.randomString(400) + ". "  + "');" + "\n"); //description
        }
        return stringBuilder.toString();
    }


    public String generateAddressDetail() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<285; i++) {
            stringBuilder.append("insert into user_address_details (\"user_id\", \"country\", \"zip-code\", \"town\"," +
                    " \"street\", \"street_number\", \"flat_number\", \"phone_number\") values (");
            stringBuilder.append(i + ",");
            stringBuilder.append("'Poland',");
            stringBuilder.append(rng.randomZipCode() + ",");
            stringBuilder.append(rsg.randomString(5) + ",");
            stringBuilder.append(rsg.randomString(7) + ",");
            stringBuilder.append(rng.randomNumberGenerator() + ",");
            stringBuilder.append(rng.randomNumberGenerator() + ",");
            stringBuilder.append(rng.randomPhoneGenerator() + ");" + "\n" );
        }
        return stringBuilder.toString();
    }




}
