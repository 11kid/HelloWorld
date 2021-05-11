package com.example.demo.service.sort;

import java.util.Arrays;

public class SearchSort {
    public static void main(String[] args) {
        int[] nums = {11,1,81,71,91,101,61,1001,51,21};
        System.out.println("排序前：" + Arrays.toString(nums));
        searchSort(nums);
        System.out.println("排序后：" +Arrays.toString(nums));
    }

    public static void searchSort(int[] nums){
        int temp = 0;
        int index;
        for(int i = 0; i < nums.length-1; i++){
            index = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[index]){
                    index = j;
                }
            }
            if(index != i){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            System.out.println("第" + (i+1) + "次排序：" +Arrays.toString(nums));
        }
    }

}
