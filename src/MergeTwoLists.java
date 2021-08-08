public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null || l2 != null){
            if (l2 == null || (l1 != null && l1.val < l2.val)){
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        return head.next;
    }

    public class ListNode{
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
}





/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */