package com.example.codilityexam;

public class task10_1 {

    public int solution(int N) {
        // Implement your solution here
        int count = 0;

        //16
        //1 2 4 8 16

        //72
        //1 2 3 4 6 8 9 12 18 24 36 72  // 12개
        //

        for(int a = 1; a <= Math.sqrt(N) ; a++){
            if(N%a == 0) {

                if (a * a == N) {
                    count += 1;
                } else {
                    count += 2;
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        task10_1 a = new task10_1();

        int solution = a.solution(5);

        System.out.println(solution);
    }

}
