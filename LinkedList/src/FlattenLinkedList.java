public class FlattenLinkedList {

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
        int count = 0;

        while(node1 != null){
            count ++;
            node1 = node1.next;
        }
        System.out.println(count);
        //System.out.println(fun(node1).val);
    }

    public static ListNode fun(ListNode head){

        if(head == null || head.next == null)
            return head;

        head.next = fun(head.next);

        System.out.println(head.val + "------" + head.next.val);
        head.val = head.val + head.next.val;
        return head;
    }
}
