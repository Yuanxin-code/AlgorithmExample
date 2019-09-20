package com.yuanxin.bsleetcode;

/**
 * @author Yuanxin Zhang
 * @create 09/19/2019
 * Leetcode 278. FirstBadVersion
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;  //Not mid = (low + high)/2
            // 因为low + high的值可能溢出超过2147483647 (int 类型的max value)
            if (true) {   //isBadVersion(mid)
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;

    }

}
