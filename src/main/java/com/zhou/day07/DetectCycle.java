package com.zhou.day07;

import com.zhou.common.ListNode;

/**
 * FileName: DetectCycle
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/25 3:22 下午
 * @Description
 */
public class DetectCycle {


    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (true){

            if (fast == null || fast.next == null){
                return null;
            }

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                break;
            }

        }

        slow = head;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
}
