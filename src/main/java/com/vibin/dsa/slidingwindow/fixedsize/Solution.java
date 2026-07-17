package com.vibin.dsa.slidingwindow.fixedsize;

import java.util.HashMap;
import java.util.Map;

/*
2461. Maximum Sum of Distinct Subarrays With Length K
You are given an integer array nums and an integer k.
Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.

eg:
Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15

Input: nums = [4,4,4], k = 3
Output: 0

*/
public class Solution {
    public static int sumOfDistinctSubarray(int[] arr, int k){

        int maxSum =0;
        int currentSum =0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int left=0,right=0; right<arr.length; right++){

            currentSum+=arr[right];
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);

            if(right-left+1 > k){
                currentSum-=arr[left];
                map.put(arr[left], map.get(arr[left]) - 1);

                if(map.get(arr[left]) == 0)
                    map.remove(arr[left]);

                left++;
            }

            if(right-left+1 == k && map.size()==k){
                maxSum = Math.max(currentSum, maxSum);
            }

        }
        return maxSum;

    }
    public static void main(String[] args) {

//        int[] arr = {1,5,4,2,9,9,9};
        int[] arr = {9,9,1,9,9};
        int k = 2;
        System.out.println(sumOfDistinctSubarray(arr, k));



    }
}
