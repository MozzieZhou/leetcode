package com.zhou.day11;

/**
 * FileName: PlusOne
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/3/6 10:18 下午
 * @Description
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
