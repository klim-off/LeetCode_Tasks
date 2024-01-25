package leetTasks._051_implementFifoQuue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedSet;

public class MyQueue {

    private Queue <Integer> q;
    public MyQueue() {
        this.q =  new LinkedList<>();
    }

    public void push(int x) {
      q.add(x);
    }

    public int pop() {
         int result = q.peek();
         q.remove();
         return result;
    }

    public int peek() {
      return q.peek();
    }

    public boolean empty() {
       return q.isEmpty();
    }
}
