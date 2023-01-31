package com.example.codilityexam.test;

public class task2 {

    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {

            // 이미 진행된게 K 보다 크면 FALSE 안해도 된다.
            if ( (A[i + 1] - A[i]) > 1 && A[i] < K){
                return false;
            }

        }
        if (A[0] != 1)
        {
            System.out.println("체크2");
            return false;
        }

        else
            return true;
    }

    public boolean solution2(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {

            // 이미 진행된게 K 보다 크면 FALSE 안해도 된다.
            if (A[i] + 1 < A[i+1]){
                return false;
            }

        }
        if (A[0] != 1 && A[n - 1]!=K)
        {
            System.out.println("체크2");
            return false;
        }

        else
            return true;
    }

    public static void main(String[] args) {
        task2 t = new task2();

        int A[] = {1,2,2,4,5};
        int K = 5;

        boolean solution = t.solution(A, K);
        boolean solution2 = t.solution2(A, K);
        System.out.println(solution);
        System.out.println(solution2);
    }
}
