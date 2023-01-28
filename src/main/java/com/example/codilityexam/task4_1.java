package com.example.codilityexam;

import java.util.HashSet;

public class task4_1 {

    public int solution(int X, int[] A) {

        HashSet set = new HashSet();

        int result = -1;
        for(int a = 0; a < A.length; a++){
            if(A[a] <= X){
                set.add(A[a]);
            }

            if(set.size() == A[a]){
                return a;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
