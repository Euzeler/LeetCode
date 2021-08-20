import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedLists1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode p1 = headA, p2 = headB;
        int lenA = 0, lenB = 0;
        while(p1 != null){
            lenA += 1;
            p1 = p1.next;
        }
        while(p2 != null){
            lenB ++;
            p2 = p2.next;
        }
        p1 = headA;
        p2 = headB;
        if(lenA - lenB > 0){
            for(int i = 0; i < lenA - lenB; i++){
                p1 = p1.next;
            }
        }
        else if(lenB - lenA > 0){
            for(int i = 0; i < lenB - lenA; i++){
                p2 = p2.next;
            }
        }
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args){
        IntersectionOfTwoLinkedLists1 i = new IntersectionOfTwoLinkedLists1();
        //Example2
        ListNode fifth = new ListNode(4, null);
        ListNode forth = new ListNode(2, fifth);
        ListNode third = new ListNode(1, forth);
        ListNode second = new ListNode(9, third);
        ListNode first = new ListNode(1, second);
        ListNode first1 = new ListNode(3, forth);
        ListNode first0 = new ListNode(3, first1);
        ListNode ret = i.getIntersectionNode(first, first0);
        System.out.println("最终的结果： " + ret.val);

        System.out.println("测试：");

    }
}
