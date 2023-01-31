package com.example.codilityexam.test;

public class task1 {

    public int solution(int N) {
        // Implement your solution here

        int k = extracted(N);

        while(true){
            if(k == extracted(++N)){
                break;
            }
        }

        return N;
    }

    private int extracted(int N) {
        int sum = 0;

        while(N !=0){
            sum += N %10;
            //num을 10으로 나눈 값을 다시 num에 저장한다.
            N /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        task1 a = new task1();

        int N = 28;

        int solution = a.solution(N);

        System.out.println(solution);
    }
}
