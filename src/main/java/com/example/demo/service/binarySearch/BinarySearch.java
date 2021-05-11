package com.example.demo.service.binarySearch;

public class BinarySearch {
    /*
       二分查找法：
       1、必须是一组有序的数，也就是从大到小，或从小到大
     */
    public static void main(String[] args) {
        int[] nums = {1, 6,25,37,59,99,100};
        int findValue = 99;
        int targerNum = binarySearch(nums,0, nums.length-1, findValue);
        System.out.println("第一次出现的索引是" + targerNum);
    }

    public static int binarySearch(int[] nums, int start, int end, int findValue){
        if(start <= end){
            int middle = (start + end) / 2;
            if(findValue == nums[middle]){
                return middle;
            } else if(findValue > nums[middle]){
                start = middle+1;
                return binarySearch(nums,start, end, findValue);
            } else {
                end = middle - 1;
                return binarySearch(nums,start, end, findValue);
            }
        }
        return -1 ;
    }
}
