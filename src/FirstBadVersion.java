public class FirstBadVersion {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        //Wow，great job! 随便加了一句话，击败100%选手，nice。
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

        if(carry == 1){
            ListNode last = new ListNode();
            last.val = 1;
            l1.next = last;
        }

        return pre.next;
    }

    public static void main(String[] args){
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        //ListNode forth = new ListNode(9, null);
        ListNode third = new ListNode(9, null);
        ListNode second = new ListNode(9, third);
        ListNode first = new ListNode(9, second);
        ListNode forth1 = new ListNode(9, null);
        ListNode third1 = new ListNode(9, forth1);
        ListNode second1 = new ListNode(9, third1);
        ListNode first1 = new ListNode(9, second1);
        ListNode ret = firstBadVersion.addTwoNumbers(first, first1);
        System.out.println(ret.next.next.next.next.val);
    }
}
