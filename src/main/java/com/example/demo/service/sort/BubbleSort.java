package com.example.demo.service.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {11,1,81,71,91,101,61,1001,51,21};
        System.out.println("排序前：" + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("排序后：" +Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums){
        int temp = 0;
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < nums.length-i; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println("第" + (i+1) + "次排序：" +Arrays.toString(nums));
        }
    }
}
