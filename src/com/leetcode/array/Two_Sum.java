package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    /*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
         You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

   */

    public static void main(String[] args) {

       int[] numArray = {2,8,9,4,2,3};
       int target = 6;
       Integer[] result = performOperation(numArray, target);
       System.out.println("["+result[0] +" " + result[1] +"]");
    }

    private static Integer[] performOperation(int[] numArray, int target){
        // map to have key as array element and value as index
        Map<Integer, Integer> arrayMap = new HashMap<>();

        // iterate through for loop
        for(int counter = 0; counter <= numArray.length; counter ++){
            // calculate the complement number of the current number to match the result ( sum )
            int required = target - numArray[counter];

            // check map contains the key as required complement number to meet the target
            if(arrayMap.containsKey(required)){
                // return the indexes as a array for the match target found
                return new Integer[]{arrayMap.get(required), counter};
            }
            else{
                // add array number and its index as a key value
                arrayMap.put(numArray[counter], counter);
            }
        }
        // returns empty if there is no match
        return new Integer[]{};
    }
}
