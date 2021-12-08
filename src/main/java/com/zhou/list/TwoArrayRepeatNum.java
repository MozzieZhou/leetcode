package com.zhou.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * FileName: TwoArrayRepeatNum
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/5/15 9:17 下午
 * @Description
 */
public class TwoArrayRepeatNum {
    public static void main(String[] args) {

        String[] a1 = {"1","a","C"};
        String[] a2 = {"b","c","2"};
        getRepeatStr(a1,a2);

    }

    public static void getRepeatStr(String[] a1, String[] a2) {

        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < a1.length; i++) {
            hashMap.put(a1[i], 1);
        }

        for (int i = 0; i < a2.length; i++) {
            Integer existNum = hashMap.get(a2[i]);
            if (existNum != null && existNum == 1) {
                hashMap.put(a2[i], existNum + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.getValue() > 1) {
                System.out.println(next.getKey());
            }
        }

    }

}
