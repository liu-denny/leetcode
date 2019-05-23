package ListNode;

/**
 * @author yudong
 * @create 2019-05-23 16:15
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) { this.val = x; }

    public void display(ListNode node){
        while (node.next != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(node.val);
    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node3.next = node2;
        node2.next = node1;
        new ListNode(-1).display(node3);
    }

}
