import java.util.LinkedList;
import java.util.Stack;

public class ImpQueueUsingStacks1 {
    class MyQueue {
//这题有问题啊，放着吧。
        private Stack<Integer> sa;
        private Stack<Integer> sb;
        /** Initialize your data structure here. */
        public MyQueue() {
            sa = new Stack<Integer>();
            sb = new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if(sa.isEmpty()){
                if(!sb.isEmpty()){
                    sa.push(sb.pop());
                }
            }
            sa.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(sb.isEmpty()){
                if(!sa.isEmpty()){
                    sb.push(sa.pop());
                }
            }
            return sb.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(sb.isEmpty()){
                if(!sa.isEmpty()){
                    sb.push(sa.pop());
                }
            }
            return sb.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return sa.isEmpty() || sb.isEmpty();
        }
    }
}

