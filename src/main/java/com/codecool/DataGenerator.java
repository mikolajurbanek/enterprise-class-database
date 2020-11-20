package com.codecool;

import java.util.Random;

public class DataGenerator {

    RandomStringGenerator rsg = new RandomStringGenerator();
    RandomWordGenerator rwg = new RandomWordGenerator();
    RandomNumericGenerator rng = new RandomNumericGenerator();
    DateTimeGetter dtg = new DateTimeGetter();


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
            stringBuilder.append("insert into bike_parts (\"brand\", \"model\", \"color\", " +
                    "\"type\", \"price\", \"weight\", \"description\") values (");
            stringBuilder.append("'").append(rsg.randomString(5)).append("',"); //brand
            stringBuilder.append("'").append(rsg.randomString(7)).append("',"); //model
            stringBuilder.append(rwg.randomColor()).append(","); //color
            stringBuilder.append(rwg.randomType()).append(","); //type
            stringBuilder.append(rng.randomPrice()).append(","); //price
            stringBuilder.append(rng.randomWeight()).append(","); //weight
            stringBuilder.append("'").append(rsg.randomString(400)).append(". ").append("');").append("\n"); //description
        }
        return stringBuilder.toString();
    }

    public String generateUsers() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<10001; i++) {
            stringBuilder.append("insert into users (\"login_details_id\") values (");
            stringBuilder.append(i + ");" + "\n");
        }
        return stringBuilder.toString();
    }


    public String generateAddressDetail() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 7000; i<10000; i++) {
            stringBuilder.append("insert into user_address_details (\"user_id\", \"first_name\", " +
                    "\"surname\", \"country\", \"zip-code\", \"town\"," +
                    " \"street\", \"street_number\", \"flat_number\", \"phone_number\") values (");
            stringBuilder.append(i + ",");
            stringBuilder.append(rsg.randomString(4)+ ",");
            stringBuilder.append(rsg.randomString(6)+ ",");
            stringBuilder.append("'Poland',");
            stringBuilder.append(rng.randomZipCode() + ",");
            stringBuilder.append(rsg.randomString(5) + ",");
            stringBuilder.append(rsg.randomString(7) + ",");
            stringBuilder.append(rng.randomNumberGenerator(100) + ",");
            stringBuilder.append(rng.randomNumberGenerator(100) + ",");
            stringBuilder.append(rng.randomPhoneGenerator() + ");" + "\n" );
        }
        return stringBuilder.toString();
    }

    public String getDeliveryStatuses(){
        return "insert into delivery_statuses(id, status) values (1, 'waiting for payment');\n" +
                "insert into delivery_statuses(id, status) values (2, 'packing');\n" +
                "insert into delivery_statuses(id, status) values (3, 'in road');\n" +
                "insert into delivery_statuses(id, status) values (4, 'delivered');";
    }

    public String generateBaskets(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int j = 0; j<4; j++) {
            for (int i = 0; i < 100; i++) {
                stringBuilder.append("insert into basket (\"id\", \"bike_parts_id\", \"quantity\") values (");
                stringBuilder.append(i + "," );
                stringBuilder.append(rng.randomNumberGenerator(49,2) + ",");
                stringBuilder.append(rng.randomNumberGenerator(4,1) + ");" + "\n");
            }
        }
        return stringBuilder.toString();
    }

    public String getPaymentStatuses(){
        return "insert into payment_statuses(id, status) values (1, 'not payed');\n" +
                "insert into payment_statuses(id, status) values (2, 'payed');\n";

    }

    public String generatePayments(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("insert into payments (\"status_id\", \"date\", \"time\", \"amount\") values (");
            stringBuilder.append(rng.randomNumberGenerator(2,1) + ",");
            stringBuilder.append("current_date,");
            stringBuilder.append("current_time,");
            stringBuilder.append(rng.randomPrice() + ");" + "\n");
        }
        return stringBuilder.toString();
    }


    public String generateOrders(){
        StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                stringBuilder.append("insert into orders (\"user_id\", \"date\", \"time\", \"payment_id\", \"basket_id\") values (");
                stringBuilder.append(rng.randomNumberGenerator(100) + ",");
                stringBuilder.append("current_date,");
                stringBuilder.append("current_time,");
                stringBuilder.append(i + "," );
                stringBuilder.append(i + ");" + "\n");
            }
        return stringBuilder.toString();

    }

    public String generateDeliveries(){

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("insert into delivery (\"order_id\", \"status_id\", \"date\", \"time\") values (");
            stringBuilder.append(i + ",");
            stringBuilder.append(rng.randomNumberGenerator(3,1) + ",");
            stringBuilder.append("current_date,");
            stringBuilder.append("current_time");
            stringBuilder.append( ");" + "\n");
        }
        return stringBuilder.toString();

    }






}
