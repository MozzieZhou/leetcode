package com.zhou.day08;

import com.zhou.common.ListNode;

/**
 * FileName: ReverseKGroup
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/28 4:33 下午
 * @Description
 */
public class ReverseKGroup {


    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode end = dummy;

        while (end.next != null) {

            //  寻找end位置
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }

            if (end == null) {
                break;
            }

            // 记录next信息
            ListNode next = end.next;
            end.next = null;

            // 翻转
            ListNode start = prev.next;
            prev.next = reverse(start);
            start.next = next;

            prev = start;
            end = start;
        }

        return dummy.next;
    }


    public ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

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
