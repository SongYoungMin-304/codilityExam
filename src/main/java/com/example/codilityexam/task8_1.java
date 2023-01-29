package com.example.codilityexam;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class task8_1 {

    public int solution(int[] A) {
        // Implement your solution here

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < A.length; i++) {
            if(!map.containsKey(A[i])){
                map.put(A[i], 1);
            }else{
                map.put(A[i], map.get(A[i]) + 1);
            }


            if(map.get(A[i]) > A.length/2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2, 1, 1, 3};

        task8_1 t = new task8_1();

        int solution = t.solution(arr);
        System.out.println(solution);
    }

}
