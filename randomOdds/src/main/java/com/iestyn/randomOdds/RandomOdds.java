package com.iestyn.randomOdds;

import java.util.Random;

public class RandomOdds {
    private final long id;
    private Random random;
    RandomOdds(long id){
        this.id = id;
        this.random = new Random();

    }

    public int randomNumber(int bound){
        return random.nextInt(bound);
    }

    public Boolean randomBoolean(int numerator,int denominator){
        if(numerator<0 || denominator<0){
            return false;
        }
        if(numerator>denominator){
            return true;
        }
        int odds = random.nextInt(denominator);
        if(odds<=numerator){
            return true;
        } else{
            return false;
        }
    }
}
