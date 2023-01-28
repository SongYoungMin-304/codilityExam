package com.example.codilityexam;

public class task1 {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int count = 0;
        int max = 0;

        for(int a = 0; a < binaryString.length(); a++){
            char i = binaryString.charAt(a);
            if(i == '1'){
                max = count > max ? count : max;
                count =0;
            }
            else if(i == '0'){
                count++;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        task1 t = new task1();
        System.out.println(t.solution(15));
    }
}

