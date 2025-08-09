package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthases {

   /*
        20. Valid Parentheses
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

    */

    public static void main(String[] args) {
        String str = "()[{}]{}{}[]";
       // System.out.println(isValidParentheses(str) ? "Valid " : "Not Valid");
        System.out.println(checkParamthysisIsValid(str) ? "Valid " : "Not Valid");

    }
    private static boolean isValidParentheses(String str){

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ; i < str.length() ; i++){
            if(!stack.isEmpty()  && (map.get(str.charAt(i)) == stack.peek())) {
                stack.pop();
            }
            else {
                stack.push(str.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }




private static boolean checkParamthysisIsValid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i< str.length(); i++){
            if(!stack.isEmpty() && str.charAt(i) == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(getPair(str.charAt(i)));
            }
        }
        return stack.isEmpty();
}

    private static char getPair(char ch){
        if(ch =='('){
            return ')';
        }
        else if(ch == '{'){
            return '}';
        }else if(ch == '['){
            return ']';
        }
        return 0;
    }



}
