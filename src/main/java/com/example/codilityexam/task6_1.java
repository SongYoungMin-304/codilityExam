package com.example.codilityexam;

import java.util.Arrays;
import java.util.HashSet;

public class task6_1 {

    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;

        HashSet set = new HashSet();

        for (int i : A) {
            if(!set.contains(i))
            {
                set.add(i);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int []arr = {1,2,3};

        task6_1 t = new task6_1();

        int solution = t.solution(arr);
        System.out.println(solution);
    }
}
