package com.zhou.day01;

import java.util.Random;

/**
 * FileName: FirstBadVersio
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/8 1:56 下午
 * @Description
 */
public class FirstBadVersion {

    public static boolean isBadVersion(int version) {
        return version == 1;
    }

    public static int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = (right - left) / 2 + left;

            // 当前是坏的， 之前是好的
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                return mid;
                // 当前是坏的，之前的也是坏的
            } else if (isBadVersion(mid) && isBadVersion(mid - 1)){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }


}
