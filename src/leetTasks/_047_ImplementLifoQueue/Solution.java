package leetTasks._047_ImplementLifoQueue;

public class Solution {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.printQueue();
        System.out.println(myStack.top()); // return 2
        myStack.printQueue();
        System.out.println(myStack.pop()); // return 2
        myStack.printQueue();
        System.out.println(myStack.empty()); // return False

    }
}
