package com.zhou.day10;

import com.zhou.common.ListNode;

/**
 * FileName: MergeTwoLists
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2022/3/3 11:20 上午
 * @Description
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2,l1.next);
            return l2;
        }



    }
}
