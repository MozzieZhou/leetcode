package com.zhou.day01;

/**
 * FileName: AddBinary
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/8 5:13 下午
 * @Description
 */
public class AddBinary {

    /**
     * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
     * <p>
     * 11   -> 3
     * 10   -> 2
     * 101  -> 5
     * <p>
     * 输入为 非空 字符串且只包含数字 1 和 0。
     *
     * @param a 字符串
     * @param b 字符串
     * @return
     */
    public static String addBinary(String a, String b) {
        int add = add(Integer.parseInt(a,2), Integer.parseInt(b,2));
        return Long.toBinaryString(add);
    }

    public static int add(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        return add(sum, carry);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
