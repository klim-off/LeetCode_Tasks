package leetTasks._051_implementFifoQuue;

public class Solution {

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        int x = 0;
        obj.push(x);
        int y = 2;
        obj.push(y);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}
