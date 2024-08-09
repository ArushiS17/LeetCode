import java.util.Stack;

class MinStack {
    Stack<Long> st; // Change to Long to handle overflow
    long mini; // Change to long to handle larger range of values

    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE; // Initialize with Long.MAX_VALUE
    }

    public void push(int val) {
        if (st.isEmpty()) {
            mini = val;
            st.push(0L); // Push 0L when the first element is added
        } else {
            st.push(val - mini); // Store the difference instead of modified value
            if (val < mini) {
                mini = val; // Update mini when a new minimum is encountered
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long diff = st.pop();
        if (diff < 0) {
            mini = mini - diff; // Restore the previous minimum
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long diff = st.peek();
        if (diff > 0) {
            return (int) (mini + diff);
        } else {
            return (int) mini; // Return mini if top element is modified
        }
    }

    public int getMin() {
        return (int) mini;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */