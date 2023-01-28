package com.example.codilityexam;

public class task3_1 {

    public int solution(int X, int Y, int D) {
        // Implement your solution here
        return (Y - X)%D == 0 ? (Y - X)/D : (Y - X)/D + 1;
    }

    public static void main(String[] args) {

    }
}
