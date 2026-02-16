package com.leetcode.string;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any Number to Reverse : ");
        long number = sc.nextLong();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Reversed Number Using Math Logic     : " + reverseNumber(number));
        System.out.println("Reversed Number Using String methods : " + reverseNumberUsingString(number));
    }
    private static long reverseNumber(long number){
        long reverseNum = 0;
        while(number > 0){
            reverseNum = reverseNum * 10 + number % 10;
            number /= 10;
        }
        return reverseNum;
    }

    private static long reverseNumberUsingString(long number){
        String reversed = new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString();
        return Long.parseLong(reversed);
    }
}
