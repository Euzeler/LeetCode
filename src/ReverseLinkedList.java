public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){
        //可以迭代，可以递归，很多题目都是这样的
        ListNode newHead = null;
        while(head != null){
            //暂存，放在第四句话用
            ListNode next = head.next;
            //上一轮的头节点，现在成了新的head的head.next
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args){
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode fifth = new ListNode(5);
        ListNode forth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, forth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        ListNode res = reverseLinkedList.reverseList(head);
        System.out.println(res.next.next.next.next.val);
    }
}
