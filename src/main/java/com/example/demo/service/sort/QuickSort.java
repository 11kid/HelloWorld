package com.example.demo.service.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // 快速排序调用
        int[] quickNums = {18, 1, 6, 27, 15};
        System.out.println("排序前：" + Arrays.toString(quickNums));
        quickSort(quickNums, 0, quickNums.length - 1);
        System.out.println("排序后：" + Arrays.toString(quickNums));
    }
    /**
     * 快速排序
     */
    private static void quickSort(int[] nums, int left, int right) {
        int ltemp = left;
        int rtemp = right;
        int a,b;
        // 分界值
        a = nums[(left + right) / 2];
        while(ltemp < rtemp){
            while(nums[ltemp] < a){
                ++ltemp;
            }
            while(nums[rtemp] > a){
                --rtemp;
            }
            if(ltemp <= rtemp){
                b = nums[rtemp];
                nums[rtemp] = nums[ltemp];
                nums[ltemp] = b;
                ++ltemp;
                --rtemp;
            }
        }
        if(ltemp == rtemp){
            ltemp++;
        }
        if(left < rtemp){
            quickSort(nums,left,ltemp-1);
        }
        if(right > ltemp){
            quickSort(nums,rtemp+1,right);
        }
    }
}
