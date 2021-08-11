public class RemoveLinkedListEle {
    public ListNode removeElements(ListNode head, int val){
        if(head == null){
            return null;
        }
        ListNode ret = new ListNode();
        //去头
        while(head.next != null){
            if(head.val == val){
                head = head.next;
            }
            else break;
        }
        ret = head;
        //去身子
        while(head.next.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }
            head = head.next;
        }
        //去尾巴
        System.out.println("测试" + head.val);
        if(head.next.val == val){
            head.next = null;
        }
        return ret;
        //分成三段呢，只能适配这一种testCase，
        //要用两个指针，把所有的阶段混成一种。
    }

    public static void main(String[] args){
        RemoveLinkedListEle removeLinkedListEle = new RemoveLinkedListEle();
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
