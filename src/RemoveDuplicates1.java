public class RemoveDuplicates1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        //输入为空的时候的判断
        if (tmp == null) {
            return null;
        }
        while (head.next != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
            }
            //写的时候少了一个else，
            else head = head.next;
            return tmp;
        }
        return tmp;
    }

        public static void main(String[] args){
            RemoveDuplicates1 re = new RemoveDuplicates1();
            ListNode fifth = new ListNode(3);
            ListNode forth = new ListNode(3, fifth);
            ListNode third = new ListNode(2, forth);
            ListNode second = new ListNode(1, third);
            ListNode head = new ListNode(1, second);
            ListNode res = re.deleteDuplicates(head);
            System.out.println(res.next.next.val);
//        System.out.println("测试" + third.next);
        }
    }

class ListNode{
    //当前节点的值
    int val;
    //下一个节点的引用值
    ListNode next;
    //无参的构造函数
    ListNode(){

    }
    //带参的构造函数，相当于完成setter的功能
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
