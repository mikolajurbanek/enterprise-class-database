package com.codecool;

import java.util.Random;

public class RandomStringGenerator {


    public String randomString(int range) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'

        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(range)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return "'" + generatedString + "'";
    }
}
