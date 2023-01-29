package com.example.codilityexam;

import java.util.Collections;

public class task9_1 {

    public int solution(int[] A) {
        // Implement your solution here
        int max = 0;

        if(A == null || A.length == 0){
            return 0;
        }

        int min = A[0];

        for(int a = 1; a < A.length; a++){

            int localProfit = A[a] - min;
            min = min < A[a] ? min : A[a];

            max = max > localProfit ? max : localProfit;
        }

        if(max <0){
            max = 0;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
