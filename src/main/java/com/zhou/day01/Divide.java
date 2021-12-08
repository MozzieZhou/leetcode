package com.zhou.day01;

/**
 * FileName: Divide
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/12/8 2:46 下午
 * @Description
 */
public class Divide {

    /**
     * 给定两个整数 a 和 b ，利用位运算求和。
     * <p>13 + 9 = 22
     * <p>
     * 32 16 8 4 2 1
     * <p>
     * 0000 1101
     * 0000 1001
     * 0001 0110 -> 16 + 4 + 2  = 22
     * <p>
     * 0000 0100 4
     * 0000 1001  -> 位移一位   -> 0001 0010 -> 16 + 2 = 18
     *
     * @param num1 整数
     * @param num2 整数
     * @return a/b的商
     */
    public static int add(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        return add(sum, carry);
    }

    public static int substract(int num1, int num2) {
        // 将num2转换成负数
        int substractor = add(~num2, 1);
        return add(num1, substractor);
    }

    public static int multiplyVersion1(int num1, int num2) {
        // num1, num2取绝对值
        int multiplicand = num1 < 0 ? add(~num1, 1) : num1;
        int multiplier = num2 < 0 ? add(~num2, 1) : num2;

        // 绝对值乘积
        int product = 0;
        int count = 0;

        while (count < multiplier) {
            product = add(product, multiplicand);
            count = add(count, 1);
        }

        if ((num1 ^ num2) < 0) {
            product = add(~product, 1);
        }

        return product;
    }

    public static int multiplyVersion2(int num1, int num2) {

        // 乘数取绝对值
        int multiplicand = num1 < 0 ? add(~num1, 1) : num1;
        int multiplier = num2 < 0 ? add(~num2, 1) : num2;

        int product = 0;
        while (multiplier > 0) {

            // 取乘数最后一位
            if ((multiplier & 0x1) > 0) {
                product = add(product, multiplicand);
            }
            multiplicand = multiplicand << 1;
            multiplier = multiplier >> 1;
        }

        if ((num1 ^ num2) < 0) {
            product = add(~product, 1);
        }

        return product;
    }

    public static int divideVersion1(int num1, int num2) {

        // 取绝对值
        int dividend = num1 < 0 ? add(~num1, 1) : num1;
        int divisor = num2 < 0 ? add(~num2, 1) : num2;

        int quotient = 0;
        int reminder = 0;

        while (dividend >= divisor) {
            dividend = substract(dividend, divisor);
            quotient = add(quotient, 1);
        }

        if ((num1 ^ num2) < 0) {
            quotient = add(~quotient, 1);
        }

        reminder = num2 > 0 ? dividend : add(~dividend, 1);

        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(divideVersion1(12, 7));
    }


}
