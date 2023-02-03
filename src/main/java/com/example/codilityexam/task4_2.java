package com.example.codilityexam;


import java.util.Arrays;

public class task4_2 {

    public int solution(int[] A) {

        Arrays.sort(A);

        if(A[0]!=1){
            return 0;
        }

        for(int a = 0; a < A.length - 1; a++){


            if(A[a+1] - A[a] != 1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
