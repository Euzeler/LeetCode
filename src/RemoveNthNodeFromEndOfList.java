public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next == null){
            return null;
        }
        ListNode ret = reverse(head);
        deleteInOrder(ret, n);
        System.out.println("测试4：" + ret.val);
        //这个测试用例，reverse一下就出问题了，
        if(ret.next != null) {
            ret = reverse(ret);
        }
        return ret;
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

    //我的天呐，用void，天呐，晋级了呀！
    public void deleteInOrder(ListNode head, int n){
        int i = 1;
        if(head.next == null){
            head = null;
        }
        //两个节点，
        else if(head.next.next == null){
            if(n == 1){
                head.val = head.next.val;
                head.next = null;
            }
            else if(n == 2){
                System.out.println("测试1：" + head.val);
                System.out.println("测试2：" + head.next.val);

                head.next = null;
                System.out.println("测试3：" + head.val);
                //System.out.println("测试：" + head.next.val);
            }
        }
        else {
            boolean isDeleted = false;
            while (head.next.next != null) {
                if (i != n) {
                    head = head.next;
                    i++;
                } else {
                    head.val = head.next.val;
                    head.next = head.next.next;
                    isDeleted = true;
                    break;
                }
            }
            if (isDeleted != true) {

                if (i == n) {
                    head.val = head.next.val;
                    head.next = null;
                } else {
                    head.next = null;
                }
            }
        }
    }

    public static void main(String[] args){
//        ListNode fifth = new ListNode(5, null);
//        ListNode forth = new ListNode(4, fifth);
//        ListNode third = new ListNode(3, forth);
        ListNode second = new ListNode(2, null);
        ListNode head = new ListNode(1, second);

        //ListNode head = new ListNode(1, null);
        RemoveNthNodeFromEndOfList r = new RemoveNthNodeFromEndOfList();
        //ListNode ret = r.removeNthFromEnd(head, 1);

        ListNode ret = r.removeNthFromEnd(head, 2);
        System.out.println(ret.val);
    }
}
