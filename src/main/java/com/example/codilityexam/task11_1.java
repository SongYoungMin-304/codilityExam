package com.example.codilityexam;

import java.util.HashMap;
import java.util.HashSet;

public class task11_1 {

    // 1 3  2 6
    // 1 3 2 3 5

    public int[] solution(int[] A) {
        // Implement your solution here

        int []result = new int[A.length];

        HashMap<Integer, Integer> map = new HashMap();

        for(int a = 0; a < A.length; a++){
            if(map.containsKey(A[a])){
                map.put(A[a],map.get(A[a])+1);
            }else{
                map.put(A[a],1);
            }
        }

        for(int a = 0; a < A.length; a++){
            result[a] = extract(A[a], map, A.length);;
        }

        return result;
    }

    public int extract(int k, HashMap<Integer, Integer> map, int length){
        int n1 = 0;
        int n2 = 0;

        for(int b = 1; b <= Math.sqrt(k); b++){
            if(k%b == 0){
                n1 = b;
                n2 = k/b;
                if(n1 == n2){
                    if(map.containsKey(n1)){
                        length = length - map.get(n1);
                    }

                }else{
                    if(map.containsKey(n1)) {
                        length = length - map.get(n1);
                    }
                    if(map.containsKey(n2)) {
                        length = length - map.get(n2);
                    }
                }
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int []array = {2};
        task11_1 a = new task11_1();

        a.solution(array);
    }
}
