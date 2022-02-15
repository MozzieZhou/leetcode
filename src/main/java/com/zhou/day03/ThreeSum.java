package com.zhou.day03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FileName: ThreeSum
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/10 5:31 下午
 * @Description
 */
public class ThreeSum {

    // nums = [-1,0,1,2,-1,-4]
    // [-4,-1,-1,0,1,2]
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        // 数组元素不满足要求
        if (nums == null || nums.length < 3) {
            return list;
        }

        // 数组排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // 最小的大于0，直接返回
            if (nums[i] > 0) {
                break;
            }

            // 元素去重复
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {

                    list.add(Arrays.asList(nums[i] , nums[l] , nums[r]));
                    // 去重复
                    while (l < r && (nums[l] == nums[l + 1])) l++;
                    while (l < r && (nums[r] == nums[r - 1])) r--;
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

}
