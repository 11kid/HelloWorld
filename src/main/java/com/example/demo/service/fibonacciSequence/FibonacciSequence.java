package com.example.demo.service.fibonacciSequence;

public class FibonacciSequence {
    public static void main(String[] args) {
        int index = 12;
        long targetNum = fibonacci2(index);
        System.out.println(targetNum);
    }

    public static long fibonacci2(int index){
        long f1 = 0l;
        long f2 = 1l;
        long temp = 0l;
        for(int i = 0; i < index-2; i++){
            temp = f2;
            f2 += f1;
            f1 = temp;
        }
        return f2;
    }
}
