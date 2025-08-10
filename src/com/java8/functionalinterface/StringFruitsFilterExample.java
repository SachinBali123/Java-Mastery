package com.java8.functionalinterface;

import java.util.Arrays;

public class StringFruitsFilterExample {
    // Program to write with functional interface and use that while filtering the String
    // This Program asked on Barkley's Interview Round assessment test

    public static void main(String[] args) {
        String[] strings = {"Apple","Banana","mango","bamboo","bingoFruits"};
        System.out.println("Start with B : ");
        Arrays.stream(filterStrings(strings)).forEach(System.out::println);
    }

    public static String[] filterStrings(String[] strings){
        // call functional interface
        StringFruitsFilterExample.FilterString filterString = str -> str.startsWith("B") || str.startsWith("b");
        return Arrays.stream(strings)
                //.filter(str -> filterString.isFruitsStartWithB(str))
                .filter(filterString::isFruitsStartWithB)
                .toList().toArray(new String[0]);
    }

    // add functional interface
    interface FilterString{
        boolean isFruitsStartWithB(String str);
    }
}
