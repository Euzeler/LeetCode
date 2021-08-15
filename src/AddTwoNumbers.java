public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode pre = new ListNode();
        pre.next = l1;

        while(l1 != null && l2 != null){
            if(l1.val + l2.val + carry < 10){
                l1.val = l1.val + l2.val + carry;
                carry = 0;
            }
            else{
                l1.val = l1.val + l2.val + carry - 10;
                carry = 1;
            }
            if(l1.next != null && l2.next != null) {
                l1 = l1.next;
                l2 = l2.next;
            }
            else break;
        }

        while(l1.next != null && l2.next == null){
            l1 = l1.next;
            if(l1.val + carry < 10){
                l1.val = l1.val + carry;
                carry = 0;
            }
            else{
                l1.val = l1.val + carry - 10;
                carry = 1;
            }
        }

        if(l1.next == null && l2.next != null){
            l1.next = l2.next;
        }
        while(l1.next != null && l2.next != null){
            l1 = l1.next;
            if(l1.val + carry < 10){
                l1.val = l1.val + carry;
                carry = 0;
            }
            else{
                l1.val = l1.val + carry - 10;
                carry = 1;
            }
        }

        if(carry == 1){
            ListNode last = new ListNode();
            last.val = 1;
            l1.next = last;
        }

        return pre.next;
    }
}
