import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode reverseA = reverse(headA);
        //这一步就是预存
        ListNode pre = new ListNode();
        pre.next = reverseA;
        List<Integer> A = new ArrayList<>();
        while(reverseA != null){
            A.add(reverseA.val);
            reverseA = reverseA.next;
        }
        System.out.println("A = " + A);
        ListNode reverseA1 = reverse(pre.next);
        //因为上面已经变过了，所以这里乱了。
        ListNode reverseB = reverse(headB);
        List<Integer> B = new ArrayList<>();
        while(reverseB != null){
            B.add(reverseB.val);
            reverseB = reverseB.next;
        }
        System.out.println("B = " + B);
        int retVal = 0, retIdx = 0;
        for(int i = 0; i < Math.min(A.size(), B.size()); i++){
            if(A.get(i) == B.get(i)){
                continue;
            }
            else{
                retIdx = i;
                i = i - 1;
                retVal = A.get(i);
                break;
            }
        }
        System.out.println("测试： " + retVal + " idx: " + retIdx);

        System.out.println("测试：headA = " + pre.next.val);
        if(retVal == 0) return null;
        int count = 1;
        while(pre.next != null){
            if(pre.next.val == retVal && count == retIdx){
                return pre.next;
            }
            pre.next = pre.next.next;
            count++;
        }
        ListNode ret = null;
        return ret;
    }

    //没错
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

    public static void main(String[] args){
        IntersectionOfTwoLinkedLists i = new IntersectionOfTwoLinkedLists();
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
