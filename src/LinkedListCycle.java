public class LinkedListCycle {
    public boolean hasCycle(ListNode1 head) {
        if(head == null){
            return false;
        }
        ListNode1 slow = head;
        ListNode1 fast = head;
        //为啥是fast和fast.next不等于null
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        LinkedListCycle linkedListCycle = new LinkedListCycle();


    }
}
