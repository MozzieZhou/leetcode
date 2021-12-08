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

    private static final int[] arr = {0,1,1};

    public static void main(String[] args) {
        System.out.println(count1(45));
        System.out.println(count2(45));
    }

    /**
     * f(n) = f(n-1)+f(n-2)
     * 0 1 1 2
     * a b b
     * @param n
     * @return
     */
    public static int count1(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = a+b;
            a=b;
            b=sum;
        }
        return a;
    }

    public static int count2(int n){
        if(n<3){
            return arr[n];
        }
        return count2(n-1)+count2(n-2);
    }
}
