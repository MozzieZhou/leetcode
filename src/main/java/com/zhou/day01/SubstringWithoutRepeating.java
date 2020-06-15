package com.zhou.day01;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class SubstringWithoutRepeating {

    /**
     * 循环查出全部字符串（暴力解法）
     *
     * @param s
     * @return
     */
    public static int solution1(String s) {
        int maxLength = 0;

        if (s == null) {
            return maxLength;
        }

        if (s.length() == 1) {
            maxLength++;
            return maxLength;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String subString = s.substring(i, j);

                int count = 0;

                if (subString.length() <= maxLength) {
                    continue;
                }

                /**
                 * 可以用hashSet判断是否重复
                 */
                char[] chars = subString.toCharArray();

                for (char aChar : chars) {
                    if (subString.indexOf(aChar) == subString.lastIndexOf(aChar)) {
                        count++;
                    }
                }

                if (count == subString.length()) {
                    maxLength = subString.length();
                }

            }
        }

        return maxLength;
    }

    /**
     * 滑动窗口
     * 以每个字符开始，往右开始遍历
     *
     * @param s
     * @return
     */
    public static int solution2(String s) {

        if( s == null || s.length() == 0){
            return 0;
        }

        // 存储子串长度
        Set<Character> characters = new HashSet<Character>();

        int length = s.length();

        int maxLength = 0;

        int rightKey = -1;

        for (int i = 0; i < length; i++) {

            // 左边窗口滑动
            if (i != 0) {
                characters.remove(s.charAt(i - 1));
            }

            // 从当前开始组装字符串，碰到重复的退出循环
            while (rightKey + 1 < length && !characters.contains(s.charAt(rightKey + 1))) {
                characters.add(s.charAt(rightKey + 1));
                rightKey++;
            }

            maxLength = Math.max(maxLength,characters.size());

        }

        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(solution2("213123213"));
    }

}
