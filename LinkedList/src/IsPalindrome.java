public class IsPalindrome {

    public static void main(String[] args){


        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(isPalindrome(node1));

    }

    public static boolean isPalindrome(ListNode head){

        ListNode fast = head, slow = head,temp = head;

        if(head == null || head.next == null)
            return true;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);

        LinkedListCustom.print(head);
        System.out.println();
        LinkedListCustom.print(slow);
        System.out.println();

        while(temp != null && slow != null){
            if(temp.val != slow.val)
                return false;
            temp = temp.next;
            slow = slow.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode node){

        ListNode prev = null,next = null,curr = node;

        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
