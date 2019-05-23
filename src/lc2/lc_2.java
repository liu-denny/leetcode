package lc2;

import ListNode.ListNode;

/**
 * @author yudong
 * @create 2019-05-23 16:06
 */
public class lc_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode denny = new ListNode(-1);
        ListNode node = denny;
        int s = 0;
        while (l1 != null || l2 != null){

            int d1 = l1 == null ? 0:l1.val;
            int d2 = l2 == null ? 0:l2.val;

            int sum = d1 + d2 + s;
            s = sum < 10 ? 0:1;
            node.next =new ListNode(sum%10);
            node = node.next;

            if(l1!= null) l1 = l1.next;
            if(l2!= null) l2 = l2.next;
        }
        if(s == 1){
            node.next = new ListNode(1);
        }
        return denny.next;
    }

    public static void main(String[] args) {
        ListNode denny = new ListNode(-1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(5);
        node6.next = node5;
        node5.next = node4;

        denny.display(node1);
        denny.display(node6);

        denny.display(new lc_2().addTwoNumbers(node1,node6));


    }
}
