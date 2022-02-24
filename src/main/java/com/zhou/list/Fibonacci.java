package com.zhou.list;

/**
 * FileName: Fibonacci
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/5/15 9:30 下午
 * @Description
 */
public class Fibonacci {

    private static final int[] arr = {0, 1, 1};

    public static void main(String[] args) {
        System.out.println(count1(46));
    }

    /**
     * f(n) = f(n-1)+f(n-2)
     * 0 1 1 2
     * a b b
     *
     * @param n
     * @return
     */
    public static int count1(int n) {
        if (n < 2) {
            return n;
        }

        if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 3; i <= n; i++) {
            c = (b + c) % 1000000007;
            a = b;
            b = (c - a) % 1000000007;
        }

        return  c;
    }

    public static int count2(int n) {
        if (n < 3) {
            return arr[n];
        }
        return count2(n - 1) + count2(n - 2);
    }
}
