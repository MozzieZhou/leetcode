package com.zhou.list;

import java.util.Arrays;

/**
 * FileName: UnRepeatArray
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/5/15 10:01 下午
 * @Description
 */
public class UnRepeatArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < a.length; i++) {
            StringBuilder str = new StringBuilder();
            str.append(a[i]);
            if (i != a.length - 1) {
                for (int j = i + 1; j < a.length; j++) {
                    str.append(a[j]);
                    System.out.println(str);
                }
            }else {
                System.out.println(str);
            }
        }


    }

}
