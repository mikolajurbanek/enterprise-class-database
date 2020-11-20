package com.codecool;

public class App {


    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        String loginDetails = dataGenerator.generateLoginDetails();
        String bikeParts = dataGenerator.generateBikeParts();
        String addressDetails = dataGenerator.generateAddressDetail();
        String users = dataGenerator.generateUsers();
        String baskets = dataGenerator.generateBaskets();
        DateTimeGetter dateTimeGetter = new DateTimeGetter();
        RandomNumericGenerator randomNumericGenerator = new RandomNumericGenerator();
        System.out.println(dataGenerator.generateAddressDetail());




    }
}
