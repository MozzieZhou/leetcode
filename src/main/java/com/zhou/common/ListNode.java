package com.zhou.common;

/**
 * FileName: ListNode
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/2/18 2:04 下午
 * @Description
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
