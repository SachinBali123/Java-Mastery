package com.leetcode.array;

public class BuySellStock_Lavel_II {
    /*
        122. Best Time to Buy and Sell Stock II
        You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
        Find and return the maximum profit you can achieve.

        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 7

        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        Total profit is 4 + 3 = 7.

     */

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        // int[] arr =  {1,2,3,4,5};
        // int[] arr = {7,6,4,3,1};
      int profit = doTrading(arr);
      System.out.println("Profit :- " + profit);
    }

    private static int doTrading(int[] prices){
        int profit = 0;
        for(int day = 1 ; day < prices.length ; day ++) {
            if(prices[day] > prices[day - 1]){
                profit += (prices[day] - prices[day - 1]);
            }
        }
        return profit;
    }
}
