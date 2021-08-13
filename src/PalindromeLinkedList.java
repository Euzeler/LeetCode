public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head){
        //倒过来是一样的，
        //这里赋值了之后，但是后边head变的时候，oldHead也会变啊，这可怎么办呢
        //卡住了就去看答案
        ListNode oldHead = head;
        ListNode newHead = null;
        //这就是一个reverse，
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        boolean ret = true;
        System.out.println(newHead.next.next.next.val);
        while(oldHead != null){
            if(oldHead.val == newHead.val){
                oldHead = oldHead.next;
                newHead = newHead.next;
            }
            else {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode forth = new ListNode(1, null);
        ListNode third = new ListNode(2, forth);
        ListNode second = new ListNode(1, third);
        ListNode first = new ListNode(1, second);
        boolean ret = palindromeLinkedList.isPalindrome(first);
        System.out.println(ret);
    }
}
