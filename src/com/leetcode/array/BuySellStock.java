package com.leetcode.array;

public class BuySellStock {
 /* You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    Example 1:

    Input: prices = [7,1,5,3,6,4]
    Output: 5

    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    */
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        //int[] prices = {2,4,1};
        //int[] prices = {3,3,5,0,0,3,1,4};
        int result = doTrading(prices);
        System.out.println("Profit is : " +result);
    }

    private static int doTrading(int[] prices){
        int buy = prices[0];
        int profit = 0;
        for(int day = 1 ; day < prices.length ; day ++){
            if(prices[day] < buy){
                buy = prices[day];
            }
            // This is the simplest way to get maximum profit
            profit = Math.max(profit, prices[day] - buy);
        }
        return profit;
    }
}
