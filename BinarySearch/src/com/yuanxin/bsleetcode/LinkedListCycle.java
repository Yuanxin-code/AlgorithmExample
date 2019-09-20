package com.yuanxin.bsleetcode;

/**
 * @author Yuanxin Zhang
 * @create 09/19/2019
 */
public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (slow != null) {
            if (fast.next == null) return false;
            if (fast.next.next == null) return false;

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) break;
        }
        return true;
    }
}
