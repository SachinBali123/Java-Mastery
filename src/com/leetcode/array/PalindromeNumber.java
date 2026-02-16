package com.leetcode.array;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        System.out.println("Using While loop : The Given Number is Palindrome = " + isPalindromeNumber(x));
        System.out.println("=======================================================");
        System.out.println("Using StringBuilder.reverse : The Given Number is Palindrome = " + isPalindromeNumberUsingAPI(x));
    }
    private static boolean isPalindromeNumber(int x){
        int no = x;
        int reverse = 0;
        while (no > 0){
            int rem = no % 10;
            reverse = reverse * 10 + rem;
            no = no / 10;
        }
        return  reverse == x;
    }

    private static boolean isPalindromeNumberUsingAPI(int x){
     /*
         StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(Math.abs(x)));
        String reverse = sb.reverse().toString();
        return reverse.equals(String.valueOf(x)) ? true : false;
      */

        //Negative check
        if(x < 0) return false;
        // Reverse the number by converting to String using Math function.
        String reverseNumString = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
        int reverse = Integer.parseInt(reverseNumString);
        return reverse == x;
    }
}
