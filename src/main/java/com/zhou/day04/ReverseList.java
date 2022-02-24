package com.zhou.day04;

import com.zhou.common.ListNode;

/**
 * FileName: ReverseList
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/18 10:56 上午
 * @Description
 */
public class ReverseList {

    public static ListNode reverseListSolution1(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;


    }

}
