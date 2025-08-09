package com.leetcode.array;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check it is Prime or Not:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = checkPrime(number);
        String status = flag ? "Prime Number" : "Not a Prime Number" ;
        System.out.println("Entered Number is " + status);
        scanner.close();
    }

    private static boolean checkPrime(int number){
        if(number <= 1){
            return false; // Numbers less than or equal to 1 are not prime
        }
        //for(int i = 2; i <= Math.sqrt(num); i++)
        for(int i = 2; i<= number/2 ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
