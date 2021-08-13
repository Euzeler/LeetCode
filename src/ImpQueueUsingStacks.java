import java.util.LinkedList;
import java.util.Stack;

public class ImpQueueUsingStacks {
    class MyQueue {

        Stack<Integer> tmp = new Stack<Integer>();
        Stack<Integer> store = new Stack<Integer>();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            tmp.push(x);
            store.clear();
            for(int i = 0; i < tmp.size(); i++){
                store.push(tmp.pop());
            }
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return store.pop();
        }

        /** Get the front element. */
        public int peek() {
            return store.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return store.isEmpty();
        }
    }
}
