package com.example.codilityexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3_3 {

    // 1 2 3 4 5
    public int solution(int[] A) {
        int min = 0;
        int total = 0;



        List sumList = new ArrayList();

        for (int i : A) {
            total+=i;
        }


        int left = 0;
        for(int a = 1; a < A.length; a++){
            left +=A[a];
            int right = total -left;
            sumList.add(Math.abs(right - left));
        }

        return (int) Collections.min(sumList);
    }

    public static void main(String[] args) {
        int []n = {-1000, 1000};

        task3_3 t = new task3_3();

        System.out.println(t.solution(n));
    }
}
