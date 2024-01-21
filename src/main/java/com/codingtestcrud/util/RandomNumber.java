package com.codingtestcrud.util;

public class RandomNumber {
    public static Long random(int i ,int j){
        Long number = (long) (Math.random()*(j-i));
        return number;
    }
}
