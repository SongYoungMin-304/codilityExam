package com.example.codilityexam;

import java.util.Arrays;

public class task3_2 {
    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        Arrays.sort(A);

        for(int a = 0; a < A.length; a++){
            if(a + 1 != A[a])
                return a + 1;
        }

        return A.length + 1;
    }

    public static void main(String[] args) {

        //int []arr = {2,3,1,5};
        int []arr = {1,7};
        task3_2 t = new task3_2();

        System.out.println(t.solution(arr));

    }
}
