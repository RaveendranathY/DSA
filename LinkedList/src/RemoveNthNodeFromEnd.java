public class RemoveNthNodeFromEnd {
    public static void main(String[] args){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        LinkedListCustom.print(node1);
        System.out.println();
        LinkedListCustom.print(removeNthNodeFromEnd(node1,6));

    }

    public static ListNode removeNthNodeFromEnd(ListNode head, int n){

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode slow = dummy,fast = dummy;

        for(int i=1 ; i<=n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;

    }
}
