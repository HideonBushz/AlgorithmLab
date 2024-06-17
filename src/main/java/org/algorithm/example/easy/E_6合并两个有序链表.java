package org.algorithm.example.easy;

public class E_6合并两个有序链表 {
    public static void main(String[] args) {
        ListNode FisrtNode1 = new ListNode();
        ListNode FisrtNode2 = new ListNode();
        ListNode FisrtNode3 = new ListNode();
        FisrtNode1.val = 1;
        FisrtNode2.val = 2;
        FisrtNode3.val = 3;
        FisrtNode1.next = FisrtNode2;
        FisrtNode2.next = FisrtNode3;
        ListNode listNode = mergeTwoLists(FisrtNode1, FisrtNode2);
        ListNode currrntNode = new ListNode();
        currrntNode = listNode;
        while (listNode.next != null) {
            System.out.println(currrntNode.val);
            currrntNode = currrntNode.next;

        }


    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fistNode = new ListNode(-1);
        ListNode currrntNode = fistNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                //list1把第一条数据插入curr
                currrntNode.next = list1;
                list1 = list1.next;
            } else {
                //list2把第一条数据插入curr
                currrntNode.next = list2;
                list2 = list2.next;
            }
            currrntNode = currrntNode.next;


        }

        if (list1 == null) {
            //把list2的剩余数据插入current
            currrntNode.next = list2;

        }
        if (list2 == null) {
            //把list1的剩余数据插入current
            currrntNode.next = list1;

        }


        return fistNode.next;


    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

