package com.zhou.day10;

import java.util.Arrays;

/**
 * FileName: Merge
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/3/3 10:33 上午
 * @Description
 */
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int len1 = m - 1;
        int len2 = n - 1;
        int len = nums1.length - 1;

        while (len1 >= 0 && len2 >= 0) {
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);


    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0, n = 1;
        int[] nums2 = {1};
        merge(nums1, m, nums2, n);
    }

}
