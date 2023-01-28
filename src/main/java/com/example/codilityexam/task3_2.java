package com.example.codilityexam;

import java.util.Arrays;

public class task3_2 {
    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        Arrays.sort(A);

        for(int a = 0; a < A.length -1; a++){
            if(A[a+1] - A[a] > 1){
                return A[a] + 1;
            }
        }

        return A[A.length -1] + 1;
    }

    public static void main(String[] args) {

        int []arr = {7};
        task3_2 t = new task3_2();

        System.out.println(t.solution(arr));

    }
}
