package com.zhou.day02;

/**
 * FileName: SortedSquares
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/9 11:27 上午
 * @Description
 */
public class SortedSquares {


    // [-4,-1,0,3,10]
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
