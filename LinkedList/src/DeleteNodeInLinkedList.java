public class DeleteNodeInLinkedList {

    public static void main(String[] arg){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        print(node1);

        deleteNodeInLinkedList(node3);
        System.out.println();
        print(node1);
    }

    public static void deleteNodeInLinkedList(ListNode node){

        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void print(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            if (temp.next == null) {
                System.out.print(temp.val);
            } else {
                System.out.print(temp.val + "-> ");
            }

            temp= temp.next;
        }
    }
}
