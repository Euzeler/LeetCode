public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head){
        //两个两个reverse，一个就不动，
        //和reverse有一点儿像
        //递归，结束条件
        //debug一下，就可以看见进递归，出递归，
        //要两个两个换，所以，递归终止的条件是这样的。
        if(head == null || head.next == null){
            return head;
        }
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

//    public ListNode reverse(ListNode head){
//        ListNode newHead = null;
//        while(head != null){
//            ListNode next = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = next;
//        }
//        return newHead;
//    }

    public static void main(String[] args){
        SwapNodesInPairs s = new SwapNodesInPairs();
        ListNode fifth = new ListNode(5, null);
        ListNode forth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, forth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        //ListNode ret = s.swapPairs(first);
        //System.out.println(ret.val);

        ListNode ret = s.swapPairs(first);
        System.out.println(ret.next.next.next.next.val);

    }
}
