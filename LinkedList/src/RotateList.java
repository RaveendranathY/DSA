import java.util.List;

public class RotateList {

    public static void main(String[] args){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListCustom.print(node1);
        System.out.println();
        ListNode head = rotate(node1,2);
        LinkedListCustom.print(head);

    }

    public static ListNode rotate(ListNode head, int k){

        if(k==0 || head == null || head.next == null)
            return head;

        int length = LinkedListCustom.length(head);
        k = k % length;

        ListNode curr = head;

        while(curr.next != null)
            curr = curr.next;

        curr.next = head;

        for(int i=0; i< (length-k); i++)
            curr = curr.next;

        head = curr.next;
        curr.next = null;
        return head;
    }

}
