package com.example.codilityexam;

import java.util.LinkedList;
import java.util.Queue;

public class task2_1 {

    public int[] solution(int[] A, int K) {
        // Implement your solution here
        if(A == null){
            return null;
        }

        int result [] = new int[A.length];

        Queue<Integer> queue = new LinkedList<>();
        for(int b = 0; b < A.length; b++){
            queue.add(A[A.length - b - 1]);
        }

        for(int a = 0; a < K; a++){
            int poll = queue.poll();
            queue.add(poll);
        }

        int count = A.length - 1;

        while(queue.size()!=0){
            int t = queue.poll();
            result[count--] = t;
        }

        return result;
    }
    public static void main(String[] args) {
        task2_1 t = new task2_1();
        int []k = {1,2,3,4};
        int k2 = 1;
        int[] solution = t.solution(k, k2);

        for (int i : solution) {
            System.out.println(i);
        }
    }
}
