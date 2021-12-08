package com.zhou.day01;

/**
 * FileName: SearchInsert
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/8 2:14 下午
 * @Description
 */
public class SearchInsert {


    /*
        输入: nums = [1,3,5,6], target = 2
        输出: 1

        1. left 0 right 3 mid 1  nums[mid] = 3

        2. 3>2 left 0 right 0 mid 0 nums[mid] = 1

        3. left 1 right 0


     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,0));
    }


}
