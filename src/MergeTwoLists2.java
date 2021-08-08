import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}

class MergeLists{
    Node head;

    public void addToTheLast(Node node){
        if(head == null){
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        llist1.addToTheLast(new Node(5));
        llist1.addToTheLast(new Node(9));
        llist1.addToTheLast(new Node(12));

        llist2.addToTheLast(new Node(5));
        llist2.addToTheLast(new Node(6));
        llist2.addToTheLast(new Node(8));

        Ggf g = new Ggf();
        g.sortedMerge(llist1.head, llist2.head);
        llist1.printList();
    }
}

class Ggf{
    Node sortedMerge(Node headA, Node headB){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;//虚节点
        while(true){
            if(headA == null){
                tail.next = headB;
                break;
            }
            if(headB == null){
                tail.next = headA;
                break;
            }
            if(headA.val <= headB.val){
                tail.next = headA;
                headA = headA.next;
            }
            else{
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}


