package leetcode;

import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> A,B;

    public MinStack() {
      A=new Stack<>();
      B=new Stack<>();
    }

    public void push(int x) {
        A.add(x);
      if(B.isEmpty()||B.peek()>=x){
          B.add(x);
      }
    }

    public void pop() {

        if(A.pop().equals(B.peek())){
         B.pop();
      }
    }

    public int top() {

        return A.peek();
    }

    public int min() {

        return B.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(3);
        System.out.println(minStack.min());
    }
}
