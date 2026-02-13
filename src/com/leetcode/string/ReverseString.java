package com.leetcode.string;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Reverse : ");
        String input = sc.nextLine();

        System.out.println("Original String : "+ input);

        System.out.println("Reversed String \n Using Inbuild methods: "+ doReverseUsingInbuildMethods(input));

        System.out.println("Reversed String \n Using Logic : "+ doReverseUsingLogic(input));

        System.out.println("Reversed String \n Using Logic : "+ doReverseOnlyWorlds(input));
    }

    private static String doReverseUsingInbuildMethods(String input){
        return new StringBuffer(input).reverse().toString();
    }

    private static String doReverseUsingLogic(String input){
        StringBuilder reverse = new StringBuilder();
        for(int i=input.length()-1 ; i>=0 ; i--){
            reverse.append(input.charAt(i));
        }
        return  reverse.toString();
    }

    private static String doReverseOnlyWorlds(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");

        for(int i = words.length-1 ; i>=0; i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
