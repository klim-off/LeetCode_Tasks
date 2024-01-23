package leetTasks._047_ImplementLifoQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    private Deque<Integer> dequeue;
    public MyStack() {
        this.dequeue = new ArrayDeque<>();
    }

    public void push(int x) {
        dequeue.offerFirst(x);
    }

    public int pop() {
        int popResult = dequeue.peek();
        dequeue.remove();
        return popResult;
    }

    public int top() {
      return dequeue.peek();
    }

    public boolean empty() {
       return dequeue.isEmpty();
    }


    public void   printQueue() {
        System.out.println(dequeue);
    }
}
