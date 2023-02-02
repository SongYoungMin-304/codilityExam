package com.example.codilityexam.Basic;

public class 완전탐색 {

    public void perm(int []list, int depth){
        if(depth == list.length){
            for (int i : list) {
                System.out.print(i);
            }
            System.out.println();
        }
        for(int a = depth; a < list.length; a++){
            swap(list, a, depth);
            perm(list, depth+1);
            swap(list, depth, a);
        }
    }

    public void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3 };

        완전탐색 a = new 완전탐색();

        a.perm(list, 0);
    }
}
