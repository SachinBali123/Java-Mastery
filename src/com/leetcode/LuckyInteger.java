package com.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LuckyInteger {
    public static void main(String[] args) {
        int[] arr = {19,12,5,11,14,5,18,8,6,6,13,9,8,3,10,10,1,5,10,5,12,13,5,13,9};
        System.out.println("Lucky Number : " + findLucky(arr));
    }

    public static int findLucky(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
       /*  for(int i = 0 ; i < arr.length ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }*/
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        int res = map.values().stream().max(Comparator.naturalOrder()).orElse(0);
        for(int j= res ; j> 0 ; j--){
            if(map.containsKey(j) && Objects.equals(map.get(j), j)){
                return j;
            }
        }
        return  -1;
    }
}
