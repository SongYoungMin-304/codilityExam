package com.example.codilityexam;

public class task4_1 {

    public int solution(int X, int[] A) {
        int result = -1;
        for(int a = 0; a < A.length; a++){
            if(A[a] == X){
                result = a;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
