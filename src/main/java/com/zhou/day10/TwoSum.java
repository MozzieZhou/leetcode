package com.zhou.day10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileName: TwoSum
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/3/4 4:59 下午
 * @Description
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return null;

    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(3,3);
        map.put(3,1);
        System.out.println(map.get(3));
    }
}
