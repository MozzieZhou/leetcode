package com.zhou.day09;

/**
 * FileName: RemoveDuplicates
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/3/1 11:00 上午
 * @Description
 */
public class RemoveDuplicates {

    // [1,1,2,2,3,3]
    public int removeDuplicates(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }


}
