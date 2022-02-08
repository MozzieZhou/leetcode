package com.zhou.day02;

import java.util.Arrays;

/**
 * FileName: Test
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/21 3:09 下午
 * @Description
 */
public class Test {

    // [0,1,0,3,12]
    // [1,0,0,3,12]
    // [1,3,0,0,12]
    // [1,3,12,0,0]
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];   // [1,1,0,3,12]
                if (i != j) {
                    nums[i] = 0;     // [1,0,0,3,12]
                }
                j++;                 // 1
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
