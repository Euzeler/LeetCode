import java.util.Stack;

public class MinStack {
    //改造一个栈，让它拥有getMin的功能，其实本身还是一个栈
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    public MinStack(){

    }

    public void push(int val){
        //<就是错的，<=就是对的，结合着第一次提交的错误输入案例来看，
        //就是当val = min时，pop的时候会触发if的条件，这样在getMin会出错，
        //所以，val = min的条件时，也需要push一下min，为了将来pop的时候用
        if(val <= min){
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop(){
        int a = stack.pop();
        if(a == min){
            min = stack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return min;
    }
}
