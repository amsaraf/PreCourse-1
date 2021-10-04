// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Initialize your constructor

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        // Write your code here
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    Stack() {
        // Initialize your constructor
        top = 0;
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top == MAX) {
            System.out.println("Stack overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int popped = a[top];
            top = top - 1;
            return popped;
        }
    }

    int peek() {
        // Write your code here
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int popped = a[top];
            return popped;
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
