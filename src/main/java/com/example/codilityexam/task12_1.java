package com.example.codilityexam;

import java.util.HashMap;
import java.util.HashSet;

public class task12_1 {
                       //    10      4
    public int solution(int N, int M) {
        // Implement your solution here
        /*HashSet set = new HashSet();
        int n = 0;
        int count = 0;

        while(true){
            n +=M;
            System.out.println("N"+n);
            System.out.println(n%N);
            if(!set.contains(n%N)){
                set.add(n%N);
                count++;
            }else{
                break;
            }
        }
        return count;*/

        int v = 최대공약수(N, M);
        System.out.println(v);

        return N/v;
    }

    public int 최대공약수(int n, int m){

        while(n%m!=0){
            int k = n%m;
            n = m;
            m  =k;
        }

        return m;
    }

    public static void main(String[] args) {
        int N = 10;
        int M = 4;

        task12_1 t = new task12_1();

        int solution = t.solution(N, M);

    }
}
