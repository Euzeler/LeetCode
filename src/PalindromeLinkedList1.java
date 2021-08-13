public class PalindromeLinkedList1 {
    //上一个方法里面，reverse后，原来的链表也没了，所以需要方法来解决它。
    public boolean isPalindrome1(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){//如果是奇数个节点，就把右边的部分少一个，所以要slow右移一个
            //终于accepted了，这就是解决了同一个list里面改变一半，哈哈哈
            slow = slow.next;
        }
        ListNode slowReverse = reverse(slow);
        //少了一步，
        fast = head;
        while(slowReverse != null){
            if(slowReverse.val != fast.val){
                return false;
            }
            slowReverse = slowReverse.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args){
        PalindromeLinkedList1 palindromeLinkedList1 =
                new PalindromeLinkedList1();
        ListNode forth = new ListNode(1, null);
        ListNode third = new ListNode(2, forth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        boolean ret = palindromeLinkedList1.isPalindrome1(first);
        System.out.println(ret);
    }
}
