package com.yuanxin.bsmodel;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Yuanxin Zhang
 * @create 09/19/2019
 */
public class BinarySearch {


    /**
     * 不使用递归的二分查找
     *
     * @param arr
     * @param key
     * @return 关键字位置
     */
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;            //定义middle

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] > key) {
                //比关键字大则关键字在左区域
                high = middle - 1;
            } else if (arr[middle] < key) {
                //比关键字小则关键字在右区域
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;        //最后仍然没有找到，则返回-1
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 11, 3, 22, 6, 91, 13, 35, 4};
        //对数组进行排序
        Arrays.sort(nums);

        int position = BinarySearch.search(nums, 5);

        if (position != -1) {
            System.out.println("Found in [" + position + "]");
        } else {
            System.out.println("Not found");
        }
    }

}
