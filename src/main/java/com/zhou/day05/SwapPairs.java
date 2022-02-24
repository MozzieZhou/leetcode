package com.zhou.day05;

import com.zhou.common.ListNode;
import com.zhou.day04.ReverseList;

import java.util.List;
import java.util.Stack;

/**
 * FileName: SwapPairs
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/18 2:00 下午
 * @Description
 */
public class SwapPairs {


    public ListNode swapPairsSolution1(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        Stack<ListNode> stack = new Stack<>();

        ListNode p = new ListNode(-1);
        ListNode curr = head;

        head = p;
        while (curr != null && curr.next != null) {

            stack.add(curr);
            stack.add(curr.next);

            curr = curr.next.next;

            p.next = stack.pop();
            p = p.next;
            p.next = stack.pop();
            p = p.next;
        }

        if (curr != null) {
            p.next = curr;
        } else {
            p.next = null;
        }

        return head.next;
    }

    public ListNode swapPairsSolution2(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head.next;
        head.next = swapPairsSolution1(temp.next);
        temp.next = head;

        return temp;
    }

}
