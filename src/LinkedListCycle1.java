public class LinkedListCycle1 {
    //这是一个比较好理解的方法，就是遍历，遍历过的节点的next指向自己，
    //然后，如果有循环的话，就会在跳转之后，到达一个遍历过了的节点，
    //那么根据条件，进入return true
    //用了递归
    public boolean hasCycle(ListNode1 head){
        if(head == null || head.next == null){
            return false;
        }
        if(head.next == head){
            return true;
        }
        ListNode1 nextNode = head.next;
        head.next = head;
        boolean isCycle = hasCycle(nextNode);
        return isCycle;
    }
}
