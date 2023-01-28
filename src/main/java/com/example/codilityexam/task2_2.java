package com.example.codilityexam;

import java.util.HashMap;
import java.util.Map;

public class task2_2 {


    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        Map<Integer, Integer> map = new HashMap();

        for(int b = 0; b < A.length; b++){
            if(!map.containsKey(A[b])) {
                map.put(A[b],1);
            }else{
                map.remove(A[b]);
            }
        }

        for (Integer integer : map.keySet()) {
            if(map.get(integer) == 1){
                result = integer;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
