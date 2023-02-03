package com.example.codilityexam;

import java.util.Arrays;

public class task6_3 {

    // 1 2 3 4
    // 10 20 40 60 70

    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);

        if(A[0] == 0){
            return 0;
        }
        // 0 1 2
        // 1 3 3

        for(int k = 0; k < A.length-2; k++){
            if(A[k + 1] > A[k + 2] - A[k]){
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

    }
}
