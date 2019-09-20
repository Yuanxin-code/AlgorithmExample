package com.yuanxin.bsleetcode;

/**
 * @author Yuanxin Zhang
 * @create 09/19/2019
 * Leetcode 35.Search Insert Position
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        if (high == 0) {
            if (target > nums[0]) return 1;
            else return 0;
        }
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] >= target) high = mid;
            else low = mid + 1;
        }

        if (nums[low] >= target) {
            return low;
        } else {
            return low + 1;
        }
    }
}
