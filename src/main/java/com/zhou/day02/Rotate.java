package com.zhou.day02;

import java.util.Arrays;

/**
 * FileName: Rotate
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/9 2:14 下午
 * @Description
 */
public class Rotate {

    /**
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     *
     * @param nums 给定数组
     * @param k    反转个数
     */
    public static void rotate(int[] nums, int k) {

        if (nums.length == 1) {
            return;
        }

        k %= nums.length;

        // [1,2]

        // [2,1]
        reverse(nums, 0, nums.length - 1);

        // [5,6,7,4,3,2,1]
        reverse(nums, 0, k - 1);

        reverse(nums, k, nums.length - 1);


    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
