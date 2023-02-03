package com.example.codilityexam;

import java.util.Arrays;

public class task6_2 {

    //-100 -99   9 10
    //-2 -1  10
    //-2 -1  999 1000 10001
    // -3 1 2 -2 5 6
    // -3 -2 1 2 5 6

    //-1000 -999 -100 1 2 3 400  100000

    //- 100 -99 -1

    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);

        int k1 = A[0] * A[A.length - 2] * A[A.length - 1];

        int k2 = A[0] * A[1] * A[A.length - 1];

        int k3 = A[0] * A[1] * A[2];

        int k4 = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];


        int max = Math.max(Math.max(k1, k2), Math.max(k3, k4));


        return max;
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
