package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWordGenerator {

    private Random random = new Random();
    private String[] colors = {"'Blue'", "'Red'", "'Orange'", "'Black'", "'Yellow'", "'Green'", "'Grey'"};
    private String[] types = {"'Frame'", "'Bar'", "'Rim'", "'FrontHub'", "'Spokes'", "'Peg'", "'Cranks'",
            "'Stems'", "'Fork'", "'Tires'", "'BackHub'", "'Saddle'", "'SeatPost'", "'Pedals'", "'Support'" };

    public String randomColor() {
        return colors[random.nextInt(colors.length-1)];
    }

    public String randomType(){

        return types[random.nextInt(types.length-1)];
    }


}




