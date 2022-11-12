public class CopyList {

    public static void main(String[] args) {

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
        LinkedListCustom.print(deepCopy(node1));
    }

    public static ListNode deepCopy(ListNode head){

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode curr = head;

        while(curr != null){

            ListNode node = new ListNode(curr.val);
            temp.next = node;

            curr = curr.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}
