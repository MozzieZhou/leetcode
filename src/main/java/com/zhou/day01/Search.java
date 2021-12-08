package com.zhou.day01;

/**
 * FileName: Search
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/8 10:24 上午
 * @Description
 */
public class Search {


    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int target = 9;

        int left = 0;

        int right = nums.length - 1;

        while (left <= right) {

            // (5-0)/2 + 0 = 2
            int mid = (right - left) / 2 + left;

            // 3 < 9
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                System.out.println(mid);
                return;
            }
        }

        System.out.println(-1);
    }


}
