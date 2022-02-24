package com.zhou.day06;

import com.zhou.common.ListNode;

/**
 * FileName: HasCycle
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/24 11:45 下午
 * @Description
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;

    }
}
