public class LinkedListCustom {

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
    public static int length(ListNode head){

        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
