public class RemoveNthNodeFromEndOfList1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //学习，使用快慢指针
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for(int i = 1; i <= n + 1; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args){
        ListNode fifth = new ListNode(5, null);
        ListNode forth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, forth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        RemoveNthNodeFromEndOfList1 r = new RemoveNthNodeFromEndOfList1();
        ListNode ret = r.removeNthFromEnd(head, 3);
        System.out.println(ret.next.next.next.val);
    }
}
