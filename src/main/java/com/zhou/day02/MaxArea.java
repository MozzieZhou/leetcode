package com.zhou.day02;

/**
 * FileName: MaxArea
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/8 5:35 下午
 * @Description
 */
public class MaxArea {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] > height[j] ? height[j--] : height[i++];
            maxArea = Math.max(maxArea, minHeight * (j - i + 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }
}
