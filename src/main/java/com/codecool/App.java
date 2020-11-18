package com.codecool;

public class App {


    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        String loginDetails = dataGenerator.generateLoginDetails();
        String bikeParts = dataGenerator.generateBikeParts();
        String addressDetails = dataGenerator.generateAddressDetail();
        RandomNumericGenerator randomNumericGenerator = new RandomNumericGenerator();
//        System.out.println(addressDetails);
    }
}
