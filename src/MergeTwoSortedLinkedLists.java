public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(24);
        Node node5 = new Node(55);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // list2
        Node node1_1 = new Node(2);
        Node node2_2 = new Node(15);
        Node node3_3 = new Node(43);
        Node node4_4 = new Node(49);

        node1_1.next = node2_2;
        node2_2.next = node3_3;
        node3_3.next = node4_4;

        print(merge_recursion(node1,node1_1));
    }

    static Node merge_recursion(Node list1, Node list2){

        // what is the base case
            if(list1 == null)
                return list2;
            if(list2 == null)
                return list1;
        // what is the laziest work i can do to contribute to the problem
            if(list1.data <list2.data){
                list1.next = merge_recursion(list1.next,list2);
                return list1;
            }else {
                list2.next = merge_recursion(list1, list2.next);
                return list2;
            }


    }
    public static Node merge(Node list1,Node list2){

        Node dummy = new Node(0);
        Node temp = dummy;

        while(list1 != null && list2 != null){

            if(list1.data < list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        return dummy.next;
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
