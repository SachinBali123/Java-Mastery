package com.leetcode.array;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Enter the number up to which Fibonacci sequence is required:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Fibonacci sequence up to " + number + ":");
        printFibonacci(number);
        scanner.close();
    }

    private static void printFibonacci(int number){
        int first = 0,  second = 1;

        // Print the first Fibonacci number
        System.out.print(first);
        while (second <= number){
            System.out.print(", "+ second);
            int nextNumber = first + second;
            first = second;
            second = nextNumber;
        }
    }
}
