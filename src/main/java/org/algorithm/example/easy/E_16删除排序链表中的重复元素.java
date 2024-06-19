package org.algorithm.example.easy;

public class E_16删除排序链表中的重复元素 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        deleteDuplicates(node1);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode listNode = new ListNode(Integer.MIN_VALUE);
        ListNode currNode = listNode;


        while (head != null) {
            //比较
            if (currNode.val < head.val) {
                currNode.next = head;
                currNode = currNode.next;

            }
            //继续循环
            head = head.next;
            if (head != null && head.val == currNode.val) {
                currNode.next = null;

            }

        }
        return listNode.next;

    }
}



