package com.example.codilityexam;

public class task5_1 {

    public int solution(int[] A) {
        // Implement your solution here
        int sum = 0;
        int count = 0;
        int minus = 0;
        boolean check = false;
        boolean check2 = false;

        for(int b = 0; b < A.length; b++){
            if(A[b] == 0){
                check = true;
            }
            if(A[b] == 1 && check == true){
                count++;
            }
        }

        for(int a = 0; a < A.length; a++){
            if(A[a] == 0){
                check2 = true;
                count-=minus;
                minus = 0;
                sum += count;
                if(sum > 1000000000){
                    return -1;
                }
            }if(A[a] == 1 && check2 == true){
                minus++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 0, 1};

        task5_1 t = new task5_1();

        System.out.println(t.solution(arr));
    }
}
