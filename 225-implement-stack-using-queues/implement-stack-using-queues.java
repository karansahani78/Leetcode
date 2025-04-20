import java.util.Stack;

class MyStack {
    private Stack<Integer> stack;

    public MyStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
