package com.example.codilityexam;

import java.util.Stack;

public class task7_1 {

    public int solution(String S) {
        // Implement your solution here
        Stack stack = new Stack<String>();

        for(int a = 0; a < S.length(); a++){

            if(S.charAt(a)=='[' || S.charAt(a)=='{' || S.charAt(a)=='(') {
                stack.add(S.charAt(a));
            }
            else {
                if(stack.size()==0)
                    return 0;

                if (S.charAt(a) == ']') {
                    char c = (char) stack.pop();
                    if (c != '[') {
                        return 0;
                    }
                } else if (S.charAt(a) == '}') {
                    char c = (char) stack.pop();
                    if (c != '{') {
                        return 0;
                    }
                } else if (S.charAt(a) == ')') {
                    char c = (char) stack.pop();
                    if (c != '(') {
                        return 0;
                    }
                }
            }
        }
        if(stack.size()!=0){
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        task7_1 a = new task7_1();
        String test = "]{[()()]}";

        System.out.println(a.solution(test));
    }

}
