public class RemoveLinkedListEle1 {
    public ListNode removeElements(ListNode head, int val){
        ListNode ret = new ListNode(-1);
        ret.next = head;
        //核心，是new一个代理，然后返回的是更改之后的ret.next
        ListNode curr = head, pre = ret;
        while(curr != null){
            if(curr.val == val){
                pre.next = curr.next;
            }
            else{
                pre = pre.next;
            }
            curr = curr.next;
        }
        return ret.next;
    }

    public static void main(String[] args){
        RemoveLinkedListEle1 removeLinkedListEle = new RemoveLinkedListEle1();
        RemoveDuplicates1 re = new RemoveDuplicates1();
        ListNode senventh = new ListNode(6);
        ListNode sixth = new ListNode(5, senventh);
        ListNode fifth = new ListNode(4, sixth);
        ListNode forth = new ListNode(3, fifth);
        ListNode third = new ListNode(6, forth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        ListNode res = removeLinkedListEle.removeElements(head, 6);
        System.out.println(res.next.next.next.next.val);
    }
}
