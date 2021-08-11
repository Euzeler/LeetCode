public class ReverseLinkedList1 {
    public ListNode reverseList(ListNode head){
        //可以迭代，可以递归，很多题目都是这样的，递归版本
        //递归其实就是迭代，版本不一样而已,
        //问题的关键在于记住这四句话，首先暂存，和取暂存，是第一句和第四句
        //然后，中间的就是先head.next = newHead（上一轮赋值的）, 然后
        //newHead = head;当然，newHead得是现在head走到的节点
        return reverseListInt(head, null);
    }

    public ListNode reverseListInt(ListNode head, ListNode newHead){
        if(head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
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
