public class LinkedListReversal {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        print(node1);

        System.out.println();

        print(reverse_recursion(node1));
    }

    static Node reverse_recursion(Node head){

        // what is the base case
            if(head == null || head.next == null)
                return head;

        // what is the smallest work I can do to contribute to the problem
          Node res = reverse_recursion(head.next);
          head.next.next = head;
          head.next = null;
        return res;
    }
    static Node reverse(Node head){

        Node curr = head,next = null,prev=null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    static void print(Node head){

        Node temp = head;
        while(temp != null)
        {
            if(temp.next == null)
                System.out.print(temp.data);
            else
                System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
    }
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
