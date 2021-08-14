public class DeleteNode {
    public void deleteNode(ListNode node){
//        ListNode pre = new ListNode();
//        pre.next = node;
//        pre.next = node.next;
        //题目给出链表是单向的，所以不能很方便地回溯到上一个去，
        //if和while啊，我去，
        //因为这是链表啊，当然不用循环处理，只需要改变其中的一个链接就可以了呢

        //判断给定的是非空，非尾巴的节点
        //哇，这么简单
        if(node != null && node.next != null){
            node.val = node.next.val;
            //这相当于跳了一个ListNode，
            node.next = node.next.next;
        }
    }

    public static void main(String[] args){
        ListNode forth = new ListNode(9, null);
        ListNode third = new ListNode(1, forth);
        ListNode second = new ListNode(5, third);
        ListNode first = new ListNode(4, second);
        DeleteNode deleteNode = new DeleteNode();
        deleteNode.deleteNode(second);
        //我的测试用例编写错误？
        System.out.println(first.next.val);
    }
}
